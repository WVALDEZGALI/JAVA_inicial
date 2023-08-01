/*Una pequeña despensa desea calcular los sueldos de sus empleados. Los cargos pueden tener 3 categorias:
* 1-Repositor, 2-Cajero y 3-Supervisor.
* 1- Los repositores cobran $15.890+ un bono del 10%.
* 2- Los cajeros cobran $25.630,89 fijos.
* 3- Los supervisores cobran $35.560,20 en bruto al cual se le descuentan un 11% de jubilacion.
* Se necesita un programa que, dependiendo del tipo de empleado calcule y muestre en pantalla el valor correspondiente.*/
public class Main {

    public static void main(String[] args) {

        double calculoSalario = 0;
        int categoria = 3;

        if (categoria == 1) {
            calculoSalario = 15890 + (15890 * 0.1);
        }
        else if (categoria == 2) {
            calculoSalario = 25630.89;
            }
        else if (categoria == 3) {
            calculoSalario = 35560.20 - (35560.20 * 0.11);
        }
        else {
            System.out.println("ingrese una categoria valida. 1-repositor 2-cajero 3-supervisor");
        }
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("La categoria es " + categoria + " y el salario es $" + calculoSalario);
        }
    }
}