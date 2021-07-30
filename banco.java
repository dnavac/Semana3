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
public class banco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op = "", nom = "";
        int tipo = 0;
        double sal = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("indique el tipo de empleado 1. Cajero, 2. Asesor: ");
            tipo = leer.nextInt();

            System.out.println("Digite el nombre del Empleado: ");
            nom = leer.next();
            System.out.println("Digite el Salario del Empleado: ");
            sal = leer.nextDouble();
            switch (tipo) {
                case 1: {
                    empleado objCajero = new cajero(nom, sal);
                    objCajero.calcularNeto();
                    break;
                }
                case 2: {
                    System.out.println("Digite las ventas realizadas por el Empleado: ");
                    double ven = leer.nextDouble();
                    empleado objAsesor = new asesor(ven, nom, sal);
                    objAsesor.calcularNeto();
                    break;

                }

            }

            System.out.println("Desea continuar? 1. Si, Cualquier tecla. No: ");
            op = leer.nextLine();
            if (op != "1") {
                continuar = false;
            }
        }

    }

}
