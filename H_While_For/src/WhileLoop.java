public class WhileLoop {

    static boolean turnOnTheLight = false;

    public static void main(String[] args) {

        turOnOffTheLight ();

        int i = 1;
        while (turnOnTheLight && i <= 10) {
            printSOS ();
            i ++;
        }
    }
    public static void printSOS(){
        System.out.println (". . . _ _ _ . . .");
    }
    public static boolean turOnOffTheLight (){
        turnOnTheLight = (turnOnTheLight)?false:true;
        return turnOnTheLight;
    }
}
