class Przewoznik extends Statek {

    private String ilosc;

    public Przewoznik(double pozycjaXY, double wektorRuchu, int pułap, double predkosc, String ilosc) {

        super(pozycjaXY, wektorRuchu, pułap, predkosc);
        this.ilosc = ilosc;


    }

    public String toString() {
        return super.toString() + "," + this.ilosc;
    }

}