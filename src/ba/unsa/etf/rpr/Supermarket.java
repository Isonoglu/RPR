package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    List<Artikl> artikli = new ArrayList<Artikl>(1000);

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

    public void dodajArtikl(Artikl a) {
        artikli.add(a);
    }
}
