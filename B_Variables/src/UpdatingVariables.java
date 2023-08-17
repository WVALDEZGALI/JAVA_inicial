
public class UpdatingVariables {

    public static void main(String[] args) {

        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println (salary);

        //descuento $50
        salary = salary - 50;
        System.out.println (salary);

        //Acrualizando cadenas de texto
        String employeeName = "Camilo Valdes";
        employeeName = employeeName + " Galindo";

        employeeName = "William " + employeeName;
        System.out.println (employeeName);
    }

}
