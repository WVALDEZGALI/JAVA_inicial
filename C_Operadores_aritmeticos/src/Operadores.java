public class Operadores {
    public static void main(String[] args) {

        int sum1, sum2, resultadoSum;
        int res1, res2, resultadoRes;
        int mult1, mult2, resultadoMult;
        double div1, div2, resultadoDiv;

        sum1 = 6;
        sum2 = 8;
        res1 = 6;
        res2 = 8;
        mult1 = 6;
        mult2 = 8;
        div1 = 6;
        div2 = 8;

        resultadoSum = sum1 + sum2;
        resultadoRes = res1 - res2;
        resultadoMult = mult1 * mult2;
        resultadoDiv = div1 / div2;

        System.out.println("El resultado de la suma es de " + resultadoSum);
        System.out.println("El resultado de la resta es de " + resultadoRes);
        System.out.println("El resultado de la multiplicacion es de " + resultadoMult);
        System.out.println("El resultado de la division es de " + resultadoDiv);

    }
}