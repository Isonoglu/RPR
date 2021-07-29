package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertEquals(korpa.getArtikli().size(),1);
    }

    @Test
    void izbaciArtiklSaKodom() {
    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }
}