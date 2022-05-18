/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author acer
 */
public class Prestamo {
    private String fechaPrestamo;
    private Usuario elUsuario;
    private String dinerop;

 
   public Prestamo(Usuario elUsuario, String fechaPrestamo, String dinerop){
        this.elUsuario = elUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.dinerop = dinerop;
   }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
     public String getDinerop() {
        return dinerop;
    }

    public void setDinerop(String dinerop) {
        this.dinerop = dinerop;
    }
    
   @Override
    public String toString() {
        return "nombre del usuario: "+" "+elUsuario.getNombre()+", "+"con numero de identificacion: "+" "+elUsuario.getIdentifiacion()+", "+"con el valor del prestamo: "+ this.dinerop+" "+"$ pesos,  "+ "adquirido a"+" "+this.fechaPrestamo+ " meses con una tasa de interes al 1.5,2,4 o 5 %"; 
                
    }
    
    
}
