
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascotas;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
        
    DuenioJpaController jpaDuenio = new DuenioJpaController(); 
    MascotasJpaController jpaMascota = new MascotasJpaController(); 

    public void guardar(Duenio duenio, Mascotas masco) {
        
        //Crear en la BD el Dueño 
        jpaDuenio.create(duenio); 
        
        //Crear en la BD la Mascota 
        jpaMascota.create(masco); 
        
        
    }

    public List<Mascotas> traerMascotas() {
        
        return jpaMascota.findMascotasEntities();
                
    }

    public void borrarMascota(int num_Cliente) {
        try { 
            jpaMascota.destroy(num_Cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascotas traerMascota(int num_Cliente) {
        return jpaMascota.findMascotas(num_Cliente);
    }

    public void modificarMascota(Mascotas masco) {
        try {
            jpaMascota.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return jpaDuenio.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try { 
            jpaDuenio.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
}
