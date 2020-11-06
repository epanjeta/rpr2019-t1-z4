package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket sp = new Supermarket();
        Artikl a1 = new Artikl("Automobil", 15000, "077");
        Artikl a2 = new Artikl("Automobil2", 20000, "078");
        sp.dodajArtikl(a1); sp.dodajArtikl(a2);
        Artikl[] niz = new Artikl[1000];
        niz[0] = a1; niz[1] = a2;
        assertArrayEquals(niz, sp.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket sp = new Supermarket();
        Artikl a1 = new Artikl("Automobil", 15000, "077");
        Artikl a2 = new Artikl("Automobil2", 20000, "078");
        sp.dodajArtikl(a1); sp.dodajArtikl(a2);
        Artikl[] niz = new Artikl[1000];
        niz[0] = a1;
        sp.izbaciArtiklSaKodom("078");
        assertArrayEquals(niz, sp.getArtikli());
    }
}