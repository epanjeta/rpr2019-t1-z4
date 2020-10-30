package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private int broj_artikala;

    public Korpa(){
        artikli = new Artikl[50];
        broj_artikala = 0;
    }

    public boolean dodajArtikl(Artikl a) {
        if(broj_artikala < 50){
            artikli[broj_artikala] = a;
            broj_artikala++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i=0; i<broj_artikala; i++){
            if(artikli[i].getKod().equals(kod) ){
                Artikl pom = artikli[i];
                artikli[i] = artikli[broj_artikala-1];
                return pom;
            }
        }
        return new Artikl(null, 0, null);
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i=0; i<broj_artikala; i++){
            //System.out.println(artikli[i].getCijena());
            suma = suma + artikli[i].getCijena();
        }
        return suma;
    }
}
