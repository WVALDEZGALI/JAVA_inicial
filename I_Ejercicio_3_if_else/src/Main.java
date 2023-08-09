import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese el numero hasta el que quiere contar");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();

        if ( limite <= 0) {
            System.out.println("El numero ingresado debe ser mayor a 0");
        }else {
            for (int contador = 1; contador <= limite; contador ++) {
                System.out.println(contador);
            }
        }
    }
}