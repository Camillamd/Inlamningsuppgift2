package MorsePaket;

import java.util.Scanner;

public class LasInSkrivUtMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        BokstavTillMorseKonverterare konverterareTillMorse = new BokstavTillMorseKonverterare();
        MorseTillBokstavKonverterare konverterareTillBokstav = new MorseTillBokstavKonverterare();

        System.out.println("Välj om du vill skriva in vanlig text eller en morsekod?(Text/Morse)");
        String val = scan.nextLine();
        String valEtt = "Text";
        String valTva = "Morse";
        boolean detBlevFel = false;

        // från bokstav till morse

        if (val.equalsIgnoreCase(valEtt)) {
            System.out.println("Skriv in din text!");
            String inMatning = scan.nextLine();

            int rakna = 0;
            int bokstavsNummer = 0;
            int antalBokstaver = inMatning.length();
            char tecken;
            String helaMorse = "";
            try {   // om man skriver in något ogiltigt tecken = som inte finns i hashmap

                while (rakna < antalBokstaver) {
                    tecken = inMatning.charAt(bokstavsNummer);
                    String teckenSomString = String.valueOf(tecken);


                    String kod = konverterareTillMorse.hamtaBokstavSomMorse(teckenSomString);
                    helaMorse = helaMorse + kod + " ";
                    rakna = rakna + 1;
                    bokstavsNummer = bokstavsNummer + 1;

                }
                System.out.println(helaMorse);
            } catch (IllegalArgumentException e) {
                System.out.println("Felaktig inmatning. Använd endast bokstäver (Aa-Zz).");


            }

            // morse till bokstav


        } else if (val.equalsIgnoreCase(valTva)) {

            System.out.println("Skriv in din kod!");
            String inMatning = scan.nextLine();

            int raknare = 0;
            int morseNummer = 0;
            String helaOrden = "";

            // Dela upp morsekoden i separata koder baserat på mellanslag
            String[] morsePlats = inMatning.split("\\s+");

            while (raknare < morsePlats.length) {
                String morseTecken = morsePlats[morseNummer];

                try {

                    String bokstav = konverterareTillBokstav.hamtaMorseSomBokstav(morseTecken);
                    raknare = raknare + 1;
                    morseNummer = morseNummer + 1;
                    helaOrden = helaOrden + bokstav;
                } catch (IllegalArgumentException error) {

                    detBlevFel = true;
                    break;

                }

            }
            if (detBlevFel) {
                System.out.println("Skriv in giltig morsekod!");
            } else {
                System.out.println(helaOrden);
            }


        }

    }
}
















