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
public class empleado implements proBanco {

    protected String nombre;
    protected double salario, salud, pension, arl, neto;

    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void calcularSalud() {
        salud = salario * 0.08;
    }

    public void calcularPension() {
        pension = salario * 0.09;
    }

    public void calcularARL() {
        arl = salario * 0.02;
    }

    public void calcularNeto() {
        calcularSalud();
        calcularPension();
        calcularARL();
        neto = salario - (salud + pension + arl);
        System.out.println("El Neto a pagar al empleado " + nombre + " es: " + neto);
    }
}
