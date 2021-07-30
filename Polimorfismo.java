/*
POLIMORFISMO

En la Herencia la Superclase puede almacenar un objeto de cualquiera de sus subclases.  Esto significa que la clase padre es compatible
con los tipos que derivan de ella, pero no al réves.  Con el polimorfismo se puede aplicar un mismo objeto en diferentes formas.

Poli = Múltiple,  Morfismo = forma -> Múltiples formas

Ejemplo:

***********************
SUPERCLASE persona
***********************
- Nombre String
- Sexo String
- Edad int
_______________________
+ actividades()
***********************


***********************
SUBCLASE Formador (extends persona)
***********************
- especialidad String
_______________________
+ actividades()
***********************


***********************
SUBCLASE Tripulante (extends persona)
***********************
- nivel String
***********************
+ actividades()
***********************

 */
package Semana3;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class Polimorfismo {

    public static void main(String[] args) {
        persona unab = new persona("Mateo", "Masculino", 2);
        persona yop = new Formador("Software","Miguel", "Masculino", 40);
        persona trip = new Tripulante("Ciclo 2", "Ana", "Femenino",30);

        unab.actividades();
        yop.actividades();
        trip.actividades();
    }
}
