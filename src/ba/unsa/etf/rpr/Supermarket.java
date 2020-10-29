package ba.unsa.etf.rpr;

public class Supermarket {
    private  Artikl[] artikli;
    private int broj_artikala;

    public Supermarket(){
        artikli = new Artikl[1000];
        broj_artikala = 0;
    }
    public void dodajArtikl(Artikl a) {
        //if(broj_artikala >= 1000) throw ;
        /*this.artikli[broj_artikala].setNaziv(a.getNaziv());
        this.artikli[broj_artikala].setCijena(a.getCijena());
        this.artikli[broj_artikala].setKod(a.getKod());*/
        artikli[broj_artikala] = a;
        broj_artikala++;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<broj_artikala; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl pom = artikli[i];
                artikli[i] = artikli[broj_artikala-1];
                broj_artikala--;
                return pom;
            }
        }
        return new Artikl(null, 0, null);
    }

    public Artikl[] getArtikli() {
        return artikli;
    }


}
