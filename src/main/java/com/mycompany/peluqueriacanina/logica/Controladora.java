
package com.mycompany.peluqueriacanina.logica;


import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();  

    public void guardar(String nombreMasco, String raza, String color, String nombreDue, String celNombre, String observaciones, String alergico, String atencion) {
        
       Duenio duenio = new Duenio();
       
       duenio.setNombre(nombreDue); 
       duenio.setCelDuenio(celNombre); 
       
       Mascotas masco =  new Mascotas(); 
       
       masco.setNombre(nombreMasco);
       masco.setRaza(raza);
       masco.setColor(color);
       masco.setAlergico(alergico);
       masco.setAtecion_especial(atencion);
       masco.setObservaciones(observaciones);
       masco.setUnDuenio(duenio); 
       
       
       controlPersis.guardar(duenio, masco); 
    }

    public List<Mascotas> traerMascotas() {
        
       return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(int num_Cliente) {
        controlPersis.borrarMascota(num_Cliente);
    }

    public Mascotas traerMascota(int num_Cliente) {
         return controlPersis.traerMascota(num_Cliente);
        
    }

    public void modificarMascota(Mascotas masco, String nombreMasco, String raza, String color, String nombreDue, String celDuenio, String observaciones, 
            String alergico, String atencion) {
        
        masco.setNombre(nombreMasco); 
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtecion_especial(atencion);
        masco.setObservaciones(observaciones);
        
        //Modificar las mascotas 
        controlPersis.modificarMascota(masco); 
        
        //Seteo nuevos valores del dueño 
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio()); 
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDue);
        
        
        //Llamar al modificar dueño 
        this.modificarDuenio(dueno);    
   
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

    
    
    
    
}
