import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion
        int matriz [][] = new int[3][3];

        Scanner teclado = new Scanner(System.in);

        //Asignacion manual
        /*matriz [0][0] = 5;
        matriz [0][1] = 15;
        matriz [0][2] = 25;
        matriz [1][0] = 35;
        matriz [1][1] = 45;
        matriz [1][2] = 55;
        matriz [2][0] = 65;
        matriz [2][1] = 75;
        matriz [2][2] = 85;*/

        //Asignacion por teclado

        for ( int f = 0; f < 3; f ++ ) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese valor de la posicion f: " + f + " c: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
        //Recorrido
        
        for ( int f = 0; f < 3; f ++ ){
            for ( int c = 0; c < 3; c ++ ){
                System.out.println("El valor de la posicion f: " + f + " c: " + c);
                System.out.println("es de: " + matriz [f][c]);
            }
        }
    }
}