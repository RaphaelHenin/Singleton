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
public class Main {
    public static void main(String[] args) {   
        //Appeler une méthode statique sans new en passant par la class.
        Singleton singleton = SingletonClass.getSingleton();
        int i = singleton.getI();
        System.out.println(singleton.hashCode());
        
        singleton = SingletonClass.getSingleton();
        System.out.println(singleton.hashCode());   
    }
}
