/*Llevar a cabo un programa que permite cargar completamente con numeros 5 una matriz de 4x5 (4 filas, 5 columnas)*/


public class Main {

    public static void main(String[] args) {

        //Declarar matriz
        int matriz [][] = new int[4][5];

        //Asignamos el valor 5 en la matriz
        for (int f = 0; f < 4; f ++) {
            for (int c = 0; c < 5; c ++) {
                matriz[f][c] = 5;
            }
        }

        // mostras por pantalla
        for (int f = 0; f < 4; f ++) {
            System.out.println(" ");
            for (int c = 0; c < 5; c ++) {
                System.out.print(matriz[f][c]);
            }
        }
        System.out.println(" ");
    }
}
