package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket sp = new Supermarket();
        Artikl a = new Artikl("Automobil", 15000, "077");
        sp.dodajArtikl(a);
        //assertEquals()
    }

    @Test
    void izbaciArtiklSaKodom() {
    }
}