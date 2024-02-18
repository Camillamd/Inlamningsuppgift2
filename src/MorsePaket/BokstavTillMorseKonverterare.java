package MorsePaket;

import java.util.HashMap;

public class BokstavTillMorseKonverterare {


    private HashMap<String, String> morseMap;


    public BokstavTillMorseKonverterare() {
        morseMap = new HashMap<String, String>();
        morseMap.put("A", ".-");
        morseMap.put("B", "-...");
        morseMap.put("C", "-.-.");
        morseMap.put("D", "-..");
        morseMap.put("E", ".");
        morseMap.put("F", "..-.");
        morseMap.put("G", "--.");
        morseMap.put("H", "....");
        morseMap.put("I", "..");
        morseMap.put("J", ".---");
        morseMap.put("K", "-.-");
        morseMap.put("L", ".-..");
        morseMap.put("M", "--");
        morseMap.put("N", "-.");
        morseMap.put("O", "---");
        morseMap.put("P", ".--.");
        morseMap.put("Q", "--.-");
        morseMap.put("R", ".-.");
        morseMap.put("S", "...");
        morseMap.put("T", "-");
        morseMap.put("U", "..-");
        morseMap.put("V", "...-");
        morseMap.put("W", ".--");
        morseMap.put("X", "-..-");
        morseMap.put("Y", "-.--");
        morseMap.put("Z", "--..");
        morseMap.put(".", ".-.-.-");
        morseMap.put(",", "--..--");
        morseMap.put("?", "..--..");
        morseMap.put("!", "-.-.--");
        morseMap.put(" ", "/");
    }

    public String hamtaBokstavSomMorse(String bokstav) {

        String storBokstav = bokstav.toUpperCase();
        String morse = morseMap.get(storBokstav);
        if (morse == null) {
            throw new IllegalArgumentException();
        }
        return morse;
    }

}







