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
public class highschool {
    
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantida de Estudiantes a Registrar: ");
        int cantidad = leer.nextInt();
        Asignatura G79 = new Asignatura();
        String nombre;
        float nota1, nota2;
        
        for(int i = 1; i <= cantidad; i++)
        {
            System.out.println("Digite el nombre del Estudiante: ");
            nombre = leer.next();
            
            System.out.println("Digite la nota del Primer parcial del Estudiante "+nombre+": ");
            nota1 = leer.nextFloat();
            
            System.out.println("Digite la nota del Segundo parcial del Estudiante "+nombre+": ");
            nota2 = leer.nextFloat();
            
            G79.registrarEstudiantes(new estudiante(nombre, nota1, nota2));
        }
        
        System.out.println("\nLos estudiantes registrados en la asigantura es: ");
        G79.datosEstudiantes();
        
    }
    
}
