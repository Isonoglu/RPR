package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String kod) {
        this.naziv = "";
        this.cijena = 0;
        this.kod = kod;
    }

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artikl)) return false;
        Artikl artikl = (Artikl) o;
        return Objects.equals(this.getKod(), artikl.getKod());
    }
}
