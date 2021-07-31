/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.javaintro.utils;

import edu.upb.javaintro.classes.Person;

/**
 *
 * @author Carlos
 */

/* Util no es una clase para crear objetos, es una clase para usar ciertos metodos que ofrece para poderlos trabajar por eso es
   una clase de utilidad*/
public class Util {
    
    // Cuando un metodo es estatico puede ser utilizado sin necesidad de instanciar ese objeto(Util), un objeto de esta clase
    // Util u= new Util(); u.changeName();
    // Para que voy a crear el objeto de una clase que no la tengo para crear eso en el Main principal
    public static void changeName(Person p){ // Coga la persona, recibe una persona p de la clase Person
        // A esa persona le pone super saiyan y el valor que tenia antes y eso se lo asigna al nombre y no hace nada mas
        p.setName("super saiyan "+p.getName()); // Esa persona va aser super saiyan y el nombre que tenia antes del cambio    
        
    }
}
