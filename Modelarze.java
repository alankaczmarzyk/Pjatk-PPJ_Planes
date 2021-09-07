class Modelarze extends Uzytkownik {

    int pojemnoscAkumulatora;

    public Modelarze(double pozycjaXY, double wektorRuchu, int pułap, double predkosc, double waga, int pojemnoscAkumulatora) {

        super(pozycjaXY, wektorRuchu, pułap, predkosc, waga);
        this.pojemnoscAkumulatora = pojemnoscAkumulatora;

    }

    public String toString() {

        return super.toString() + "," + this.pojemnoscAkumulatora;

    }
}