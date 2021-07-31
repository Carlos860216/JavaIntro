/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.javaintro;

import edu.upb.javaintro.classes.Person;
import edu.upb.javaintro.utils.Util;

/**
 *
 * @author Carlos
 */
public class Main {
    
    public static void main(String[] args) {
        
        Person a= new Person();
        a.setName("Charlie");
        
        Person b= a; // Tanto a como b representan el mismo objeto porque apuntan a la mima posicion de memoria donde esta almacenado ese objeto
        b.setName("Maria Fernanda"); // En otras palabras a y b son como si fueran un alias de esta posicion de memoria
        
        Person c= new Person();
        c.setName("Johan");
        
        System.out.println("Person a: "+a.getName()); // Ctrl+Shift+down Duplica la linea
        System.out.println("Person b: "+b.getName());
        
        // Lo importante es entender la posicion de memoria, la referencia de un objeto a tener el objeto como tal
        
        System.out.println("Person a: "+a); // Imprime el objeto mostrando un unico identificador
        System.out.println("Person b: "+b);
        System.out.println("Person c: "+c);
        
        // En esta parte del codigo yo no cambio el oiobjeto
        Util.changeName(a); // Le estoy pasando una referencia a. Yo le pase a changeName una referencia a mi objeto y me cambio Le nombre de la persona p que recibio que fue lo unico que mande a hacer
        System.out.println("Person a "+a.getName()); // Y esa persona p es la mismo Person a=new Person(); Se le esta pasando una referncia de la posicion de memoria, pero nunca le pasa los datos de a
        // Modifique la persona a pasandole la referencia a un metodo changeName de otra clase que lo modifico cuando lo imprimi
        // Porque estoy mandando el objeto a otra funcion de otra clase y modifica el original porque lo estoy pasando por referencia
        
        
        // Math es una clase que tiene una serie de metodos y atributo cuanto es la definicion de PI de E Cuantos son grados en Radianes etc...
        // Y una serie de metodos que sirven para hacer calculos
        //Math.sqrt(0); // Sirve para hallar la raiz cuadrada de un numero. la libreria Math todos sus metodos y atributos son estaticos
        // Porque la idea de esta clase no es instanciar ese objeto, no necesito crear un objeto de la clase Math lo que necesitoes decirle Math.PI y me trae el valor de PI
    }
}
