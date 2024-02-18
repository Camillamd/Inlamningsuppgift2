package MorsePaket;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseTillBokstavKonverterare {


    private Map<String, String> morseTillBokstavMap;

    public MorseTillBokstavKonverterare() {
        morseTillBokstavMap = new HashMap<String, String>();
        morseTillBokstavMap.put(".-", "A");
        morseTillBokstavMap.put("-...", "B");
        morseTillBokstavMap.put("-.-.", "C");
        morseTillBokstavMap.put("-..", "D");
        morseTillBokstavMap.put(".", "E");
        morseTillBokstavMap.put("..-.", "F");
        morseTillBokstavMap.put("--.", "G");
        morseTillBokstavMap.put("....", "H");
        morseTillBokstavMap.put("..", "I");
        morseTillBokstavMap.put(".---", "J");
        morseTillBokstavMap.put("-.-", "K");
        morseTillBokstavMap.put(".-..", "L");
        morseTillBokstavMap.put("--", "M");
        morseTillBokstavMap.put("-.", "N");
        morseTillBokstavMap.put("---", "O");
        morseTillBokstavMap.put(".--.", "P");
        morseTillBokstavMap.put("--.-", "Q");
        morseTillBokstavMap.put(".-.", "R");
        morseTillBokstavMap.put("...", "S");
        morseTillBokstavMap.put("-", "T");
        morseTillBokstavMap.put("..-", "U");
        morseTillBokstavMap.put("...-", "V");
        morseTillBokstavMap.put(".--", "W");
        morseTillBokstavMap.put("-..-", "X");
        morseTillBokstavMap.put("-.--", "Y");
        morseTillBokstavMap.put("--..", "Z");
        morseTillBokstavMap.put(".-.-.-", ".");
        morseTillBokstavMap.put("--..--", ",");
        morseTillBokstavMap.put("..--..", "?");
        morseTillBokstavMap.put("-.-.--", "!");
        morseTillBokstavMap.put("/", " ");
    }


    public String hamtaMorseSomBokstav(String inMorse) {  // används i main
        String bokstav = morseTillBokstavMap.get(inMorse);
        if (bokstav == null) {
            throw new IllegalArgumentException();
        }

        return bokstav;

    }

}



