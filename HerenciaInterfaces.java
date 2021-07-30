/*
HERENCIA

Es la capacidad de crear clases que adquieren automáticamente los atributos y métodos de otras clases existentes, pudiéndose añadir sus 
propios elementos (Atributos y Métodos).   En JAVA la herencia se puede aplicar a través de la palabra clave extends.  entre las ventaja de aplicar
la herencia en los Algoritmos esta:

- Reutilización de código-> La herencia evita la reescritura del mismo código en clases diferentes.
- Mantenimiento de aplicaciones existente-> Si tenemos una clase con determinada funcionalidad y tenemos la necesidad de ampliar dicha
funcionalidad no necesitamos modificar la clase existente, sino que podemos crear una clase que herede a la primera.



INTERFACES

Una interface en Java es una coleccion de métodos y propiedades constantes.  Especifican que debe hacerse en las clases pero no su 
implementación.  A través de las interfaces se describen la lógica del comportamiento de los métodos.

Ventajas:

- Organiza la programación
- Permite declarar constantes para las clases en las que se debe implementar.
- Obliga a las clases usar los mismos métodos (Nombre y parametros a usar).

En java se aplica el uso de interfaces mediante la palabra reservada implements.

 */
package Semana3;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class HerenciaInterfaces { // Clase Persona. SUPERCLASE.
    
    private String nombre;
    private int anoNac, edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoNac() {
        return anoNac;
    }

    public void setAnoNac(int anoNac) {
        this.anoNac = anoNac;
    }
    
    
    
    public void calcularEdad()
    {
         edad = 2021 - anoNac;
    }
    
    public void imprimirEdad()
    {
        System.out.println(edad);
    }
    
}
