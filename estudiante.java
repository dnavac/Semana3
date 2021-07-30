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
public class estudiante {

    private String nombre;
    private float nota1, nota2, definitiva;

    public estudiante() {
    }

    public estudiante(String nombre, float nota1, float nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public float getDefinitiva() {
        return definitiva;
    }

    public void calcularDefinitiva() {
        definitiva = nota1 + nota2;
    }

    public String mensaje() {
        if (definitiva >= 3) {
            return "APROBADO";

        } else {
            return "REPROBADO";
        }
    }

}
