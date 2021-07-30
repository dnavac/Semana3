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
public class vehiculo {
    String marca, color;

    public vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
   
    public void avanzar()
    {
        System.out.println("Los vehiculos avanzan en cualquier sentido!");
    }
}
