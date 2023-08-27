
public class Functions {

    public static void main(String[] args) {
        System.out.println ("Mexican peso to dollars: " + convertToDollar (200, "MXN"));
        System.out.println ("Colombian peso to dollars: " + convertToDollar (200, "COP"));
        System.out.println ("Argentine peso to dollars: " + convertToDollar (200, "ARS"));
    }
    /**
     * Description: Function that specifying the currency returns its equivalence in dollars.
     * @param quantity quantity of money.
     * @param currency currency type. Only works whit MXN, COP and ARS.
     * @return quantity returns the equivalence in dollars.
     * */
    public static double convertToDollar (double quantity, String currency){
        switch (currency){
            case "MXN"-> quantity = quantity * 0.060;
            case "COP"-> quantity = quantity * 0.00024;
            default -> quantity = quantity * 0.0029;
        }
        return quantity;
    }
}