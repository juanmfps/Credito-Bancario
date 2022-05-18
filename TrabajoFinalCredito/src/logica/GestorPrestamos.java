/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Prestamo;
import dto.Usuario;

/**
 *
 * @author acer
 */
public class GestorPrestamos {
    
    

     public Prestamo crearPrestamo(String nombre, String identificacion, String dinerop, 
            String meses){
       
       
            Usuario elUsuario = this.crearUsuario(nombre, identificacion);
            Prestamo c = new Prestamo(elUsuario, dinerop, meses);
            
            //c.modificaElPaciente(elPaciente);
            //c.modificaFecha(fecha);
            //c.modificaOpcion(opcion);
          
            return c;
            
           }
     public Usuario crearUsuario(String nombre, String identificacion){
       Usuario p = new Usuario();
      
        p.setNombre(nombre);
        p.setIdentifiacion(identificacion);
       
        return p;
    }

    
}
