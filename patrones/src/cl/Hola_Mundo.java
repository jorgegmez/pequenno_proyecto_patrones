/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

/**
 *
 * @author jorge
 */
public class Hola_Mundo {
    private String mensaje;
    
     public Hola_Mundo()
     {
         this.mensaje = "hola_mundo";
     }
 
     /**
      * @return the mensaje
      */
     public String getMensaje() {
         return mensaje;
     }
 
     @Override
     public String toString() {
         return "Hola_Mundo{" + "mensaje=" + mensaje + '}';
     }
}
