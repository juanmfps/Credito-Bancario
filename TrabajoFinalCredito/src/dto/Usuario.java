/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author acer
 */
public class Usuario {

    
   private String nombre;
      private String identifiacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
    }

    @Override
    public String toString() {
        return "nombre del usuario: "+" "+this.nombre+" "+"con numero de identificacion: "+" "+this.identifiacion+" "+"a "+" "+"meses. "; 
                
                
     }
   
  
   
}
