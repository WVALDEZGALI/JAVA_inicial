
/*Realizar un programa que permita el intercambio de valores entre dos variables. Una vez realizado el cambio
* mostrar el resultado por pantalla.*/
public class Main {
    public static void main(String[] args) {

        int num1 = 35;
        int num2 = 20;
        int aux;

            System.out.println("------- Antes -------");
            System.out.println("Numero 1 es: " + num1);
            System.out.println("Numero 2 es: " + num2);

            aux = num2; // aux tiene valor 20
            num2 = num1; // num2 tiene valor 35
            num1 = aux; // num1 tiene valor 20

        System.out.println("------- Despues -------");
        System.out.println("Numero 1 es: " + num1);
        System.out.println("Numero 2 es: " + num2);
        
    }
}