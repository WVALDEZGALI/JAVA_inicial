public class ForLoop {
    static boolean turnOnTheLight = false;

    public static void main(String[] args) {

        turOnOffTheLight ();
        for (int i = 1; i <=10; i ++) {
            printSOS ();
        }
    }
    public static void printSOS(){
        System.out.println (". . . _ _ _ . . .");
    }
    public static void turOnOffTheLight (){
        turnOnTheLight = !turnOnTheLight;
    }
}
