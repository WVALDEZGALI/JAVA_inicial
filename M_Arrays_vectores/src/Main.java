import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Declaracion
        int vector [] = new  int [4];

    // Asignacion (manual)
        /*vector[0]=2;
        vector[1]=12;
        vector[2]=22;
        vector[3]=48;*/

        Scanner teclado = new Scanner(System.in);

        for ( int i = 0; i < vector.length; i ++ ){

            System.out.println("Ingrese el valor para el indice " + i);
            vector[i] = teclado.nextInt();
        }

    // Recorrido

        for ( int i = 0; i < vector.length; i ++ ){

            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("---------------------");

        }

    }
}