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
public class Hello_World {
    private String message;
    
    public Hello_World()
    {
        this.message = "hello_world";
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Hello_World{" + "message=" + message + '}';
    }
    
    
}
