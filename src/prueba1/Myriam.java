/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author commodore
 */
public class Myriam {
      //EScribir un metodo que pida tu nombre, lo guarde en una variable y lo muestre por pantalla
    public void pedirNombre () {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un nombre");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }
    
}
