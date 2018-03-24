package com.company.domZad5Ksiazki;

public class Ksiazka extends Produkt{
    String autor;
    int liczbaStron;
    boolean czyTwardaOprawka;

    public Ksiazka(double cena, String autor, int liczbaStron, boolean czyTwardaOprawka) {
        super(cena);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.czyTwardaOprawka = czyTwardaOprawka;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "autor='" + autor + '\'' +
                ", liczbaStron=" + liczbaStron +
                ( czyTwardaOprawka? ", twarda okładka": ", miekka okladka") +
                ", cena=" + cena +
                '}';
    }
}
