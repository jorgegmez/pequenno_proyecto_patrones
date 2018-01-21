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
public class Ciao_Mondo {
    private String messaggio;
    
    public Ciao_Mondo()
    {
        this.messaggio = "ciao_mondo";
    }

    /**
     * @return the messaggio
     */
    public String getMessaggio() {
        return messaggio;
    }

    @Override
    public String toString() {
        return "Ciao_Mondo{" + "messaggio=" + messaggio + '}';
    }
    
    
}
