public class SwitchStatement {
    public static void main(String[] args) {

        String colorMode = "Light";

        switch (colorMode) {
            case "Light" -> System.out.println (" You selected light mode ");
            case "Dark" -> System.out.println (" You selected dark mode ");
            case "Blue" -> System.out.println (" You selected blue mode ");
            default -> System.out.println (" Please select a valid mode ");
        }
    }
}
