package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Korpa {
    List<Artikl> artikli = new ArrayList<Artikl>(1000);


    public boolean dodajArtikl(Artikl a) {
        if(artikli.size() >= 50) return false;
        if(artikli.contains(a)) return false;
        artikli.add(a);
        return  true;
    }

    public List<Artikl> getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl vrati = null;
        Artikl pomocniArtikal = new Artikl(kod);
        if(artikli.contains(pomocniArtikal)){
            vrati = artikli.get(artikli.indexOf(pomocniArtikal));
            artikli.remove(pomocniArtikal);
        }
        return vrati;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(Artikl a: artikli){
            suma = suma + a.getCijena();
        }
        return suma;
    }
}
