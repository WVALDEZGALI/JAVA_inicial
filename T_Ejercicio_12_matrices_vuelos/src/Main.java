/*Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al medio
* dia y otro por la noche. Para administrar estos datos, utiliza una matriz, donde cada fila es un destino y en cada
* columna se guarda la cantidad de asientos disponibles
*
*                        0            1          2
*                     Mañana      Mediodia     Noche
* 0 Rio de Janeiro      120          15         30
* 1     Cancun           65           1          2
* 2     Madrid            4          52          7
* 3      Roma            46          32         16
* 4      Milan           64          23         11
* 5   Buenos Aires       61          12         91
*
* - Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.
*
* - El programa debe permitir a un usuario ingresar el numero de destino al que quiere dirigirse y el numero del
*   horario en el que quiere viajar, con la cantidad de pasajes que necesita.
*
* - A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad suficiente de asientos para la
*   cantidad de pasajes que se requieren. En caso de que asi sea debe mostrar un cartel por pantalla que diga "su reserva
*   fue realizada con exito" y se debe descontar del total de asientos disponibles. En caso de no haber mas asientos
*   disponibles se debe informar por pantalla "no hay asientos disponibles"
*
* en la compañia de vuelos no conocen cuantas reservas se hacen por dia. por lo que para finalizar las ventas se debe
* ingresar la palabra "final".
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int asientos [][] = new int [6][3];

        Scanner ingresoTecla = new Scanner(System.in);

        for (int f = 0; f < 6; f ++) {
            for (int c = 0; c < 3; c ++) {
                System.out.println("Ingrese los asientos disponibles para el destino: " + f + " en el horario: "+ c);
                asientos[f][c] = ingresoTecla.nextInt();
            }
        }



    }
}