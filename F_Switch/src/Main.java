
public class Main {

    public static void main(String[] args) {

        int dia = 1;
        String nombreDia;

        switch (dia) {

            case 1: nombreDia = "El dia elegido es Lunes";
                break;
            case 2: nombreDia = "El dia elegido es Martes";
                break;
            case 3: nombreDia = "El dia elegido es Miercoles";
                break;
            case 4: nombreDia = "El dia elegido es Jueves";
                break;
            case 5: nombreDia = "El dia elegido es Viernes";
                break;
            case 6: nombreDia = "El dia elegido es Sabado";
                break;
            case 7: nombreDia = "El dia elegido es Domingo";
                break;
            default: nombreDia = "Numero de dia invalido";
                break;
        }

        System.out.println(nombreDia);

    }

}