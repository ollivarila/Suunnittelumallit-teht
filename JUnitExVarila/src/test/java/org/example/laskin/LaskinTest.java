package org.example.laskin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
/*
 * JUnit 5
 */

public class LaskinTest { // Luokan nimen loppu pitää olla Test

    // Fixture ("vakiokaluste"): kaikki testit käyttävät samaa laskinta,
    // joka nollataan ennen kutakin testiä.
    private laskin.Laskin laskin = new laskin.Laskin();
    private final double DELTA = 0.001;

    @BeforeEach
    public void clearCalculator() {
        laskin.nollaa();
    }

    // Testimetodin nimi voi olla mit� tahansa, edess� annotaatio @Test
    // @DisplayName-annotaatio tuottaa tuloksiin metodinimen sijasta k�ytt�j�n
    // haluaman merkkijonon.
    @Test
    @DisplayName("lisaa(): laskeeko yhteenlaskun oikein")
    public void testLisaa() {
        laskin.lisaa(1);
        laskin.lisaa(2);
        assertEquals(3, laskin.annaTulos(), DELTA, "Lukujen summa 1 ja 2 v��rin");
    }

    @Test
    @DisplayName("nollaa(): nollaako laskimen pyydett�ess�")
    public void testNollaa() {
        assertEquals(0, laskin.annaTulos(), DELTA, "laskimen nollaus v��rin");
    }

    @Test
    @DisplayName("vahenna(): laskeeko v�hennyslaskun oikein")
    public void testVahenna() {
        laskin.lisaa(10);
        laskin.vahenna(2);
        assertEquals(8, laskin.annaTulos(), DELTA, "Lukujen 10 ja 2 erotus v��rin");
    }

    @Test
    @DisplayName("jaa(): laskeeko jakolaskun oikein")
    public void testJaa() {
        laskin.lisaa(8);
        laskin.jaa(2);
        assertEquals(4, laskin.annaTulos(), DELTA, "Lukujen 8 ja 2 jakolasku v��rin");
    }

    // Testin oikea tulos on, ett� nollallajako heitt�� poikkeuksen,
    // kutsuja k�sittelee sen sitten haluamallaan tavalla
    @Test
    @DisplayName("jaa(): k�sitteleek� jakajan arvon 0 oikein")
    public void testJaaNollalla() {
        IllegalArgumentException poikkeus = assertThrows(IllegalArgumentException.class, () -> laskin.jaa(0),
                "Nolallajako ei tuottanut poikkeusta");
        assertEquals("Nollalla ei voi jakaa", poikkeus.getMessage(), "V��r� virheilmoitus");
    }

    @Test
    @DisplayName("kerro(): laskeeko kertolaskun oikein")
    public void testKerro() {
        laskin.lisaa(8.4);
        laskin.kerro(2.1);
        assertEquals(17.64, laskin.annaTulos(), DELTA, "Lukujen 8.4 ja 2.1 kertolasku v��rin");
    }
}
