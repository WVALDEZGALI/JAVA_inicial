/*En una tabla de 4 filas y 4 columnas se guardan las notas de cuatro alumnos de secundaria. Cada fila corresponde a las
* notas y al promedio de cada alumno. Se necesita un programa que permita a un profesor cargar en las 3 posiciones
* (columnas) de cada fila, las notas del alumno y que en la ultima columna se calculen los promedios. Una vez realizados
* los calculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double matriz [][] = new double [4][4];
        double suma = 0.0;

        Scanner teclado = new Scanner(System.in);

        // for para cargar, acumular y calcular el promedio de las notas por cada alumno.
        for (int f = 0; f < 4; f ++) {
            for (int c = 0; c < 3; c ++) {
                System.out.println("Ingrese las notas del alumno " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz [f][c];
            }
            matriz [f][3] = suma / 3;
            suma = 0.0;
        }

        // for para recorrer e informar el promedo de cada alumno.
        for (int f = 0; f < 4; f ++) {
            System.out.println("Las notas del alumno " + f + " son: ");
            for (int c = 0; c < 3; c ++) {
                System.out.println("Nota " + c + " " + matriz [f][c]);
            }
            System.out.println("El promedio de las notas es: " + matriz [f][3]);
        }
    }
}