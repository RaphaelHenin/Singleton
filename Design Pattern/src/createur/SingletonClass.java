/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createur;

/**
 *
 * @author Raphaël
 */
public class SingletonClass {
    private static Singleton singleton = new Singleton();
    
    /**
     * 
     * @return toujours le même objet (car singleton est déclaré en static) 
     */
    public static Singleton getSingleton() {
        return singleton;
    }
}

