
class Ladunkowy extends Przewoznik {

    private String coPrzewozi;

    public Ladunkowy(double pozycjaXY, double wektorRuchu, int pułap, double predkosc, String ilosc, String coPrzewozi) {

        super(pozycjaXY, wektorRuchu, pułap, predkosc, ilosc);
        this.coPrzewozi = coPrzewozi;

    }

    public String toString() {

        return super.toString() + "," + this.coPrzewozi;
    }
}