public class Casting {

    public static void main(String[] args) {

        double d = 86.45;
        int i = (int) d; // Cast de el numero dicimal, estimacion, es dicir se elimina la parte dicimal
        System.out.println (i);

        double dogs = 30.0 / 12.0;
        System.out.println (dogs);

        int estimatedDogs = (int) dogs; //Estimacion.
        System.out.println (estimatedDogs);

        int a = 30;
        int b = 12;
        System.out.println (a / b);
        System.out.println ((double) a / b); //Exactitud.

        double c = a / b;
        System.out.println (c); //Cast automatico.

        char n = '1';
        int nI = n;
        System.out.println (nI); //Cast a entero. 49 equivale a '1' en la tabla ASCII.

        short nS = (short) n;
        System.out.println (nS);



    }
}
