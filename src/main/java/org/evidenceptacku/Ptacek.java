package org.evidenceptacku;

public class Ptacek {

    private String jmeno;
    private String druh;
    private int pocetSeminek; // kolik sni seminek za den
    private int pocetNavstev; //kolikkrat byl na krmitku

    public String getJmeno() {   // ta metoda ukaze mi jmeno ptacka
        return jmeno;
    }

    public void setJmeno(String jmeno) {   // ta metoda ulozi v pameti moje jmeno ptacka
        this.jmeno = jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public int getPocetSeminek() {
        return pocetSeminek;
    }

    public void setPocetSeminek(int pocetSeminek) {
        this.pocetSeminek = pocetSeminek;
    }

    public int getPocetNavstev() {
        return pocetNavstev;
    }

    public void setPocetNavstev(int pocetNavstev) {
        this.pocetNavstev = pocetNavstev;
    }
}
