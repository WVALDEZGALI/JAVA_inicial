/*Llevar a cabo un programa que incluya un vector que almacene 8 nombres al azar y que posteriormente muestre estos
* nombres por pantalla.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String vector [] = new String [8]; //Declaracion del vector

        Scanner teclado = new Scanner(System.in);

        for ( int i = 0; i < 8; i ++ ){ //Ingreso de nombres mediante teclado
            System.out.println("Ingrese 8 nombres al azar " + i);
            vector[i] = teclado.nextLine();
        }

        for ( int i = 0; i < 8; i ++ ){ //Recorrer y mostrar los nombres ingresados
            System.out.println("Los nombres ingresados " + i + " " + vector[i]);
        }


    }
}