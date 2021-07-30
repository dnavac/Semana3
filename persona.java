/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class persona {

    String nombre;
    String sexo;
    int edad;

    public persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public void actividades()
    {
        System.out.println("Nombre: "+nombre+"\nSexo: "+sexo+"\nEdad: "+edad+"\nLAS PERSONAS REALIZAN ACTIVIDADES!\n");
    }

}
