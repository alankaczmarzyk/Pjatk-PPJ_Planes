class Uzytkownik extends Statek {

    private double waga;

    public Uzytkownik(double pozycjaXY, double wektorRuchu, int pułap, double predkosc, double waga) {

        super(pozycjaXY, wektorRuchu, pułap, predkosc);
        this.waga = waga;


    }

    public String toString() {

        return super.toString() + "," + this.waga;
    }
}