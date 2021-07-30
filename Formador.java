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
public class Formador extends persona {

    protected String especialidad;

    public Formador(String especialidad, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.especialidad = especialidad;
    }


   
    @Override
    public void actividades() {
        System.out.println("Nombre: " + nombre + "\nSexo: " + sexo + "\nEdad: " + edad + "\nActividad: Orienta formación en "+especialidad+"\n");
    }

}
