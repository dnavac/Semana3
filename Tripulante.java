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
public class Tripulante extends persona {

    String nivel;

    public Tripulante(String nivel, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.nivel = nivel;
    }


    @Override
    public void actividades() {
        System.out.println("Nombre: " + nombre + "\nSexo: " + sexo + "\nEdad: " + edad + "\nActivdad Cursa "+nivel+"\n");

    }

}
