package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Automobil", 10000, "100");
        assertEquals("Automobil", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Automobil", 10000, "100");
        assertEquals(10000, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Automobil", 10000, "100");
        assertEquals("100", a.getKod());
    }

    @Test
    void setNaziv() {
        Artikl a = new Artikl("Automobil", 10000, "100");
        a.setNaziv("Automobil VW");
        assertEquals("Automobil VW", a.getNaziv());
    }

    @Test
    void setCijena() {
        Artikl a = new Artikl("Automobil", 10000, "100");
        a.setCijena(20000);
        assertEquals(20000, a.getCijena());
    }
    @Test
    void setKod() {
        Artikl a = new Artikl("Automobil", 10000, "100");
        a.setKod("101");
        assertEquals("101", a.getKod());
    }
}