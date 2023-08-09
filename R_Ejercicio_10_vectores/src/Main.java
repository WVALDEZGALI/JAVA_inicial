/*En tres vectores diferentes se guardan los nombres, temperaturas minimas y maximas de 5 ciudades. En el primer vector
* se guardan los nombres de la ciudades, en el segundo las temperaturas minimas alcanzadas y en el tercero las
* temperaturas maximas. Se necesita un programa que permita la carga de las ciudades y sus temperaturas, adicionalmente
* debera poder informar por pantalla cual fue la ciudad con la temperatura mas baja y cual con la temeperatura mas
* alta.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declaramos los tres vectores
        String ciudades [] = new String[5];
        double tempMin [] = new double[5];
        double tempMax [] = new double[5];

        Scanner tecladoCiudades = new Scanner(System.in); //Ingresar datos por teclado, creamos dos Scanner para no
        Scanner tecladoTemperaturas = new Scanner(System.in);//mezclar los tipos de datos.

        for ( int i = 0; i < 5; i ++ ) { //Ingreso datos mediante teclado.
            System.out.println("Ingrese la ciudad " + i);
            ciudades[i] = tecladoCiudades.nextLine();

            System.out.println("Ingrese temperatura minima " + i);
            tempMin[i] = tecladoTemperaturas.nextDouble();

            System.out.println("Ingrese temperatura maxima " + i);
            tempMax[i] = tecladoTemperaturas.nextDouble();
        }

        // Variables auxiliares
        double tempMinima = 999;
        double tempMaxima = -999;
        String ciudadTempMin = "cero";
        String ciudadTempMax = "cero";

        // Recorro los vectores y detemino cual el la temperatura mas alta, la mas baja y a que ciudades corresponden.
        for ( int i = 0; i < 5; i ++ ) {
            if (tempMin[i] < tempMinima) {
                tempMinima = tempMin[i];
                ciudadTempMin = ciudades[i];
            } else if (tempMax[i] > tempMaxima) {
                tempMaxima = tempMax[i];
                ciudadTempMax = ciudades[i];
            }
        }
        // Muestro resultados por pantalla.
        System.out.println("La temperatura mas baja es: " + tempMinima + " " + ciudadTempMin);
        System.out.println("La temperatura mas alta es: " + tempMaxima + " " + ciudadTempMax);
    }
}