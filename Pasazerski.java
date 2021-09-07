class Pasazerski extends Przewoznik {

    private int iloscPrzesiadek;

    public Pasazerski(double pozycjaXY, double wektorRuchu, int pułap, double predkosc, String ilosc, int iloscPrzesiadek) {

        super(pozycjaXY, wektorRuchu, pułap, predkosc, ilosc);
        this.iloscPrzesiadek = iloscPrzesiadek;

    }

    public String toString() {

        return super.toString() + "," + this.iloscPrzesiadek ;

    }
}