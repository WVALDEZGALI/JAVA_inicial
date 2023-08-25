public class LogicOperations {

    public static void main(String[] args) {

        int a = 8;
        int b = 10;

        // assignment operators
        System.out.println (" is a equal to b? " + (a == b));
        System.out.println (" is a different to b? " + (a != b));

        // relational operators
        System.out.println (" is a greater than b " + (a > b));
        System.out.println (" is a less to b? " + (a < b));
        System.out.println (" is a greater than or equal to b? " + (a >= b));
        System.out.println (" is a less or equal to b? " + (a <= b));

        if (a == b) {
            System.out.println (" a is equal to b ");
        } else if (a > b) {
            System.out.println (" a is greater than b ");
        } else {
            System.out.println (" a is less to b ");
        }

    }

}
