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
public class Hallo_Welt {
    private String nachricht;
     
     public Hallo_Welt()
     {
         this.nachricht = "hallo_welt";
     }
 
     /**
      * @return the nachricht
      */
     public String getNachricht() {
         return nachricht;
     }
 
     @Override
     public String toString() {
         return "Hallo_Welt{" + "nachricht=" + nachricht + '}';
     }
}
