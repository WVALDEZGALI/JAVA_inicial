public class Arrays {

    public static void main(String[] args) {

        String androidVersions [] = new String [20]; //One-dimensional array
        String daysOfTheWeek [] = new String [7];

        String cities [][] = new String [4][2]; //Two-dimensional array 4 * 2 = 8 capacity

        int numbers [][][] = new int [2][2][2];
        int numbersCollection [][][][] = new int [2][2][2][2];

        androidVersions [0] = "Apple pie";     //Manual assignment
        androidVersions [1] = "Banana bread";
        androidVersions [2] = "Cupcake";
        androidVersions [3] = "Donut";

        System.out.println (androidVersions [0]);
        System.out.println (androidVersions [1]);
        System.out.println (androidVersions [2]);
        System.out.println (androidVersions [3]);

        System.out.println ("-----------------");

        cities [0][0] = "Cali";
        cities [0][1] = "Bogota";
        cities [1][0] = "Barranquilla";
        cities [1][1] = "Medellin";
        cities [2][0] = "Buenos Aires";
        cities [2][1] = "Cordoba";
        cities [3][0] = "Mendoza";
        cities [3][1] = "Rosario";

        System.out.println (cities [0][0]);
        System.out.println (cities [0][1]);
        System.out.println (cities [1][0]);
        System.out.println (cities [1][1]);
        System.out.println (cities [2][0]);
        System.out.println (cities [2][1]);
        System.out.println (cities [3][0]);
        System.out.println (cities [3][1]);



    }
}
