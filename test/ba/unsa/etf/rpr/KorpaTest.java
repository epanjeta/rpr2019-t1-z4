package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikal(){
        Artikl a1 = new Artikl("a1", 100, "1");
        Artikl a2 = new Artikl("a2", 200, "2");
        Artikl a3 = new Artikl("a3", 300, "3");
        Artikl[] niz = new Artikl[50];
        niz[0] = a1; niz[1] = a2; niz[2] = a3;
        Korpa k = new Korpa();
        k.dodajArtikl(a1); k.dodajArtikl(a2); k.dodajArtikl(a3);
        assertArrayEquals(niz, k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a1 = new Artikl("a1", 100, "1");
        Artikl a2 = new Artikl("a2", 200, "2");
        Artikl a3 = new Artikl("a3", 300, "3");
        Korpa k = new Korpa();
        k.dodajArtikl(a1); k.dodajArtikl(a2); k.dodajArtikl(a3);
        k.izbaciArtiklSaKodom("3");
        Artikl[] niz = new Artikl[50];
        niz[0] = a1; niz[1] = a2;
        assertArrayEquals(niz, k.getArtikli());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl a1 = new Artikl("a1", 100, "1");
        Artikl a2 = new Artikl("a2", 200, "2");
        Artikl a3 = new Artikl("a3", 300, "3");
        Korpa k = new Korpa();
        k.dodajArtikl(a1); k.dodajArtikl(a2); k.dodajArtikl(a3);
        assertEquals(600, k.dajUkupnuCijenuArtikala());
    }
}