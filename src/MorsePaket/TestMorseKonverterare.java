package MorsePaket;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;



public class TestMorseKonverterare {

    @Test
    public void bokstavTillMorse(){

        String inBokstav = "K";
        BokstavTillMorseKonverterare konverterareTillMorse = new BokstavTillMorseKonverterare();
        String expected = "-.-";

        String actual = konverterareTillMorse.hamtaBokstavSomMorse(inBokstav);
        assertEquals(expected,actual);
    }


    @Test
    public void morseTillBokstav() {

        String inMorseKod = "..-.";
        MorseTillBokstavKonverterare konverterareTillBokstav = new MorseTillBokstavKonverterare();
        String expected = "F";

        String actual = konverterareTillBokstav.hamtaMorseSomBokstav(inMorseKod);

        assertEquals(expected, actual);
    }

    @Test

    public void testSmaBokstaver() {

        String inLitenBokstav = "g";
        BokstavTillMorseKonverterare konverterareTillMorse = new BokstavTillMorseKonverterare();
        String expected = "--.";

        String actual = konverterareTillMorse.hamtaBokstavSomMorse(inLitenBokstav);


        assertEquals(expected, actual);


    }


}






