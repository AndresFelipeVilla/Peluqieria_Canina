
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascotas;

public class ControladoraPersistencia {
        
    DuenioJpaController jpaDuenio = new DuenioJpaController(); 
    MascotasJpaController jpaMascota = new MascotasJpaController(); 

    public void guardar(Duenio duenio, Mascotas masco) {
        
        //Crear en la BD el Dueño 
        jpaDuenio.create(duenio); 
        
        //Crear en la BD la Mascota 
        jpaMascota.create(masco); 
        
        
    }
    
    
    
}
