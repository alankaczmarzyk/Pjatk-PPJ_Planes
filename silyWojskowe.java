class silyWojskowe extends Uzytkownik {

    private boolean czySmiglowiec;

    public silyWojskowe(double pozycjaXY, double wektorRuchu, int pułap, double predkosc, double waga, boolean czySmiglowce) {

        super(pozycjaXY, wektorRuchu, pułap, predkosc, waga);
        this.czySmiglowiec = czySmiglowce;

    }

    public String toString() {
        if(czySmiglowiec==true) {
            return super.toString() + "," + "śmigłowiec";

        }else{
            return super.toString() + "," + "bezzałogowy";

        }
    }
}