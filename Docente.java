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
public class Docente extends HerenciaInterfaces implements curso {
    
    private int[] cursos = new int[3];
    private double salario, salarioN;

    public Docente() {
    }

    public int[] getCursos() {
        return cursos;
    }

    public void setCursos(int[] cursos) {
        this.cursos = cursos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
 
    public double salarioNeto()
    {
        return salarioN = salario - (salario * 0.06);
    }

   
    public void registrar() {
       //Código propio para esta clase
        
    }

   
    public void retirar() {
        salario = salario * constante;
         //Código propio para esta clase
    }
 
    
}
