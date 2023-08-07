
public class Main {

    public static void main(String[] args) {

        //declarar la altura del arbol
        int altura = 9;

        //bucle para recorrer las filas del arbol
        for (int fila = 0; fila < altura; fila ++) {

            //bucle para los espacios
            for (int espacio = 0; espacio <(altura - fila - 1); espacio ++) {
                System.out.print(" ");
            }
            //bucle para los asteriscos
            for (int asterisco = 0; asterisco <(fila * 2)+1; asterisco ++) {
                System.out.print("*");
            }

            System.out.println("");

        }

        //tronco del arbol
        int largoTronco = 2;
        for (int base = 0; base<largoTronco; base ++) {

            //espacios en blanco
            for (int espacioBlanco = 0; espacioBlanco <(altura - 2); espacioBlanco ++) {
                System.out.print(" ");
            }
            //barras del tronco
            for (int barras = 0; barras < 3; barras ++) {
                System.out.print("|");
            }

            System.out.println("");

        }
    }
}