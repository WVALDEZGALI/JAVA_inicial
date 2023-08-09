import java.util.Scanner;

/*Realizar un programa que permita cargar 15 numeros en un vector. Una vez cargados, se necesita que el programa cuente
* e informe por pantalla cuantas veces se cargo el numero 3.*/

public class Main {

    public static void main(String[] args) {

        int vector [] = new int[15]; //Declaracion del vector

        Scanner teclado = new Scanner(System.in);

        for ( int i = 0; i < 15; i ++ ){ //Ingreso de datos mediante teclado
            System.out.println("Ingrese un valor para el vector " + i);
            vector[i] = teclado.nextInt();
        }

        //Recorrer y contar cuantas veces se carga el numero 3
        int contador = 0;

        for ( int i = 0; i < 15; i ++ ){
            if ( vector [i] == 3){
                contador ++;
            }
        }

        System.out.println("La cantidad de numeros 3 en el vector es: " + contador);

    }
}