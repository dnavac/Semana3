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
public class moto extends vehiculo {
    
    String cilindraje;

    public moto(String cilindraje, String marca, String color) {
        super(marca, color);
        this.cilindraje = cilindraje;
    }
    
    @Override
    public void avanzar()
    {
        System.out.println("La moto "+marca+" de color "+color+" cilindraje "+cilindraje+"Solo avanza hacia adelante");
    }
    
}
