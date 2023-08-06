/*En la ciudad se va a realizar una maraton. El evento cuenta con un dia de inscripciones el dia anteriora la carrera,
* por lo que se desconoce la cantidad exacta de participantes, para realizar la inscripcion se solicitan los siguientes
* datos: DNI, Nombre y Edad. Segun los datos que se ingresen hay estas posibles categorias:
*
* - Menores 1 (de 6 a 10 años)
* - Menores 2 (de 11 a 17 años)
* - Juvenil (de 18 a 30 años)
* - Adultos (de 31 a 50 años)
* - Adultos mayores (mayores de 50 años)
*
* Se necesita un programa que, a partir del ingreso de los datos de cada participante, muestre por pantalla a que
* categoria debe ser inscripto. Para poner fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre
* con la palabra "fin".*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese numero de DNI");
        Scanner dniIng = new Scanner(System.in);
        int dni = dniIng.nextInt();

        System.out.println("Ingrese su Nombre");
        Scanner nombreIng = new Scanner(System.in);
        String nombre = nombreIng.nextLine();

        System.out.println("Ingrese su Edad");
        Scanner edadIng = new Scanner(System.in);
        int edad = edadIng.nextInt();

        while (  dni != 0 && !nombre.equalsIgnoreCase("fin") ){

            System.out.println("El dni es: "+ dni + " El nombre es: "+ nombre + " y la edad es: "+ edad);

            if (edad >= 6 && edad <= 10) {
                System.out.println("La categoria correspondiente es: Menores 1 (de 6 a 10 años)");
            } else if (edad >= 11 && edad <= 17) {
                System.out.println("La categoria correspondiente es: Menores 2 (de 11 a 17 años)");
            } else if (edad >= 18 && edad <= 30) {
                System.out.println("La categoria correspondiente es: Juvenil (de 18 a 30 años)");
            } else if (edad >= 31 && edad <= 50) {
                System.out.println("La categoria correspondiente es: Adultos (de 31 a 50 años)");
            } else if (edad > 50) {
                System.out.println("La categoria correspondiente es: Adultos mayores (mayores de 50 años)");
            } else {
                System.out.println("No cumples con la edad minima para poder participar");
            }

            System.out.println("Ingrese su DNI");
            dni = dniIng.nextInt();

            System.out.println("Ingrese su Nombre");
            nombre = nombreIng.nextLine();

            System.out.println("Ingrese su Edad");
            edad = edadIng.nextInt();

        }

        System.out.println("Finalizo la inscripcion de participantes.");
    }


}