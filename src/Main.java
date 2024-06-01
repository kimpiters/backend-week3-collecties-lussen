import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Create numeric array
        int[] numericNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numericNumbers[i] = i;
        }

        // Create alphabetic array
        String[] alphabeticNumbers = {"nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};

        // Create translator object
        Translator translator = new Translator(numericNumbers, alphabeticNumbers);

        // Prompt user for beginning of program
        promptStart();

        // Prompt user for number and save in key
        Integer key = promptNumber();

        // Run the translate method and print result
        System.out.println("De vertaling van " + key + " is: " + translator.translate(key));
    }




    // Prompt user for input and keep repeating when not int or when not between 0 and 9
    // Save input in key
    public static Integer promptNumber() {
        Scanner myScanner = new Scanner(System.in);
        Integer key;
        while (true) {
            System.out.println("Typ een cijfer van 0 t/m 9:");
            try {
                key = Integer.parseInt(myScanner.next());
                if (key >= 0 && key <= 9) {
                    System.out.println();
                    return key;
                }
                else {
                    System.out.println("Ongeldig");
                    System.out.println();
                    continue;
                }
            } catch (NumberFormatException ignore) {
                System.out.println("Ongeldig");
                System.out.println();
                continue;
            }
        }
    }




    // Prompt user for start of program or close
    public static void promptStart() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Typ x om te stoppen");
            System.out.println("Typ v om te vertalen");
            String input = myScanner.nextLine();
            if (input.equalsIgnoreCase("v")) {
                break;
            }
            else if (input.equalsIgnoreCase("x")) {
                System.exit(0);;
            }
            else {
                System.out.println("Ongeldig");
                System.out.println();
                continue;
            }
        }
    }
}
