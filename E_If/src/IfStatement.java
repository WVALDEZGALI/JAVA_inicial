
public class IfStatement {

    public static void main(String[] args) {

        int fileSended = 0;
        boolean isBluetoothEneabled = false;

        if (isBluetoothEneabled) {
            //Send file
            fileSended++;
            System.out.println ("The file was sent " + fileSended);
        } else {
            System.out.println ("Please turn on bluetooth, to start transfer " + fileSended );
        }
    }
    
}