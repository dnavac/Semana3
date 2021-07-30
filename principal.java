/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class principal {
    
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        Docente objDocente = new Docente();
      
        //objDocente.  // Podemos observar como Heredó los atributos y métodos de la Superclase y adicional tiene sus propios elementos.
        
        System.out.println("Digite el Nombre del Formador: ");
        objDocente.setNombre(leer.next());
        
        System.out.println("Digite el año de Nacimiento del Formador: ");
        objDocente.setAnoNac(leer.nextInt());
        
        objDocente.calcularEdad();
        
        System.out.println("la Edad del docente "+objDocente.getNombre()+" es: ");
        objDocente.imprimirEdad();
    }
    
}
