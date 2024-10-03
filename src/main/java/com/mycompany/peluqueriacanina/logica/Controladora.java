
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;


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
    
    
    
}
