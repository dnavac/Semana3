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
public class asesor extends empleado {

    double comision, ventas;

    public asesor(double ventas, String nombre, double salario) {
        super(nombre, salario);
        this.ventas = ventas;
    }

    public void calcularComision() {
        comision = ventas * indComision;
    }

    @Override
    public void calcularNeto() {
        calcularComision();
        calcularSalud();
        calcularPension();
        calcularARL();
        neto = (salario - (salud + pension + arl)) + comision;
        System.out.println("El Neto a pagar al empleado " + nombre + " es: " + neto);
    }

}
