public class Variables {

    public static void main(String[] args) {

        // Tipos de datos

        // Enteros - Integer
        byte bite = 123; // Numero entero rango -128 a 127  1 byte de memoria
        short corto = 12354; // Numero entero rango -32,768 a 32767  2 bytes de memoria
        int numero = 1234567890; // Numero entero rango -2,147,483,648 a 2,147,483,647  4 bytes de memoria
        long largo = 1234567890987654321L; // Numero entero rango -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
                                           // para identificar como long debemos colocar "L" al final. 8 bytes de memoria
        // Decimales
        float note = 3.12F; // Numero decimal rango 1.40129846432481707e-45 a 3.40282346638528860e+38 "F" al final 4 bytes
        double temperatura = 38.5; //Numero decimal rango 4.94065645841246544e-324d a 1.79769313486231570e+308d 8 bytes


        // Texto
        char letra = 'l'; // Rango unicode(un solo caracter) 2 bytes de momoria comilla simple
        String nombre = "Camilo";

        // Logicos
        boolean siONo = false; // Rango falso o verdadero 2 bytes

        // a partir de Java 10 podemos declarar variables sin especificar el tipo de dato utilizando la palabra reservada
        // var y java reconocera el tipo de dato

        var salary = 100; // tipo int
        var pension = salary * 0.08; // tipo double
        var totalSalary = salary - pension;
        var employeeName = "Camilo Valdes";

        System.out.println (salary);
        System.out.println (pension);
        System.out.println (totalSalary);
        System.out.println ("Employee: " + employeeName + " Salary: " + totalSalary);




        
    }
}