import java.util.HashMap;
import java.util.Map;
//
public class Translator {
    private Map<Integer, String> hashNumbers = new HashMap<>();

    public Translator(int[] numericNumbers, String[] alphabeticNumbers) {
        for (int number : numericNumbers)
        {
            hashNumbers.put(numericNumbers[number], alphabeticNumbers[number]);
        }
    }

    public String translate(Integer key) {
            return (String) hashNumbers.get(key);
    }
}