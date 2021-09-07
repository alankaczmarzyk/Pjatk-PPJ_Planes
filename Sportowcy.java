class Sportowcy extends Uzytkownik {

    String rodzajNapedu;

    public Sportowcy(double pozycjaXY, double wektorRuchu, int pułap, double predkosc, double waga, String rodzajNapedu) {

        super(pozycjaXY, wektorRuchu, pułap, predkosc, waga);
        this.rodzajNapedu = rodzajNapedu;

    }

    public String toString() {

        return super.toString() + "," + this.rodzajNapedu;
    }
}
