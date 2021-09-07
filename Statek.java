import static java.lang.StrictMath.sqrt;

class Statek {

    private double pozycjaXY;
    private double wektorRuchu;
    private int pułap;
    private double predkosc;

    public Statek(double pozycjaXY, double wektorRuchu, int pułap, double predkosc) {

        this.pozycjaXY = pozycjaXY;
        this.pułap = pułap;
        this.wektorRuchu = wektorRuchu;
        this.predkosc = predkosc;

    }


    public double odleglosc(){

        return sqrt((int)pozycjaXY*(int)pozycjaXY+(pozycjaXY-(int)(pozycjaXY))*(pozycjaXY-(int)(pozycjaXY))+pułap*pułap);
    }

    public String toString() {

        return pozycjaXY + "," + pułap + "," + wektorRuchu + "," + predkosc;
    }

}