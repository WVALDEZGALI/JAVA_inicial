import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        int response;

        do {
            System.out.println ("Please choice an option:");
            System.out.println ("1. Movies");
            System.out.println ("2. Series");
            System.out.println ("3. Anime");
            System.out.println ("0. Quit");

            Scanner keyBoard = new Scanner (System.in);
            response = keyBoard.nextInt ();

            switch (response) {
                case 0-> System.out.println ("Good bye");
                case 1-> System.out.println ("You have a chosen Movies");
                case 2-> System.out.println ("You have a chosen Series");
                case 3-> System.out.println ("You have a chosen Anime");
                default-> System.out.println ("please select a valid option");
            }
        } while (response != 0);
        System.out.println ("Finish");
    }
}
