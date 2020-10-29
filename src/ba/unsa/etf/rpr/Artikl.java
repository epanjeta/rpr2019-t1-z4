package ba.unsa.etf.rpr;

public class Artikl {
    private String Naziv;
    private int Cijena;
    private String Kod;

    public Artikl(String naz, int cij, String sif) {
        Naziv = naz;
        Cijena = cij;
        Kod = sif;
    }

    public String getNaziv() {
        return Naziv;
    }

    public int getCijena() {
        return Cijena;
    }

    public String getKod() {
        return Kod;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    public void setCijena(int cijena) {
        Cijena = cijena;
    }

    public void setKod(String kod) {
        Kod = kod;
    }
}
