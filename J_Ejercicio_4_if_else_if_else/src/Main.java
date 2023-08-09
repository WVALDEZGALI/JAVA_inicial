/*Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la
* palabra salir.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingresa palabras, escribe 'salir' para terminar");
        Scanner palabraIng = new Scanner(System.in);
        String palabraSal = palabraIng.nextLine();

        while (!palabraSal.equalsIgnoreCase("salir")) {
            System.out.println("La palabra ingresada es: " + palabraSal);

            System.out.println("Ingresa otra palabra");
            palabraSal = palabraIng.nextLine();
        }
        System.out.println("Programa finalizado");
    }
}