import java.util.*;

public class Bonus {

    public static void main(String[] args) {


        // Onderstaande code is uitgecommentarieerd. Haal de code uit de comment (delete /* en */) om aan de slag te gaan met de bonus
        // In de code staan op verschillende plekken comments tussen "/*...*/" als hint wat je moet doen


        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);

//        System.out.println(stringnumber);
        feedback(stringnumber);

    }

    public static HashSet<Integer> randomnumbergenerator(){
        // Maak een nieuwe variabele van type Random. (Tip: Zoek op internet hoe je Random kunt gebruiken)
        Random randN = new Random();
        // Maak een nieuwe variabele van type HashSet.
        Set<Integer> randomSet = new HashSet<>();

        // Schrijf een while-loop om 4 random nummers aan de hashset toe te voegen
        while (randomSet.size() < 4) {
            randomSet.add(randN.nextInt(10));
        }

        // - return de hashset
        return new HashSet(randomSet);
    }

    public static String setToStringConverter(HashSet<Integer> secretnumber) {
        // - Maak als eerst een String variabele met als waarde een lege String. (of gebruik een StringBuilder)
        String stringNumber = "a";
        // - Schrijf vervolgens een for-loop om de items in de hashset een voor een aan de String variabele toe te voegen.
        for (Integer i : secretnumber) {
            if (stringNumber.equals("a")) {
                stringNumber = Integer.toString(i);
            }
            else {
                stringNumber += Integer.toString(i);
            }
        }
        // - Return de (gevulde) String variabele
        return stringNumber;
    }



    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        Boolean Guessed = false;
        while (!Guessed) {
            feedback = new StringBuilder();
            String guess = scanner.nextLine();
            if (Objects.equals(guess, stringnumber)) {
                Guessed = true;
                System.out.println("gefeliciteerd je hebt het goed");
            } else {
                for (int i = 0; i < 4; i++) {
                    if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                        feedback.append("+");
                    } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                        feedback.append("0");
                    } else {
                        feedback.append("X");
                    }
                }
            }
            System.out.println(feedback.toString());
        }
    }
}

// Een hashset was geen goede keuze voor deze opdracht aangezien elk getal maar één keer kan voorkomen in de set.