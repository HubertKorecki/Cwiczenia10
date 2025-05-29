class Kontener {
    int masaLadunku;
    int wysokosc;
    int wagaWlasna;
    int glebokosc;
    int maksLadownosc;
    String numerSeryjny;

    public Kontener(int masaLadunku, int wysokosc, int wagaWlasna, int glebokosc, String numerSeryjny, int maksLadownosc) {
        this.masaLadunku = masaLadunku;
        this.wysokosc = wysokosc;
        this.wagaWlasna = wagaWlasna;
        this.glebokosc = glebokosc;
        this.maksLadownosc = maksLadownosc;
        this.numerSeryjny = numerSeryjny;
    }



    public class OverfillException extends RuntimeException {
        public OverfillException() {
            super();
        }
    }
    public void oproznienieLadunku() {
        System.out.println("Ładunek kontenera " + this.numerSeryjny + " został opróżniony. Masa opróżnionego ładunku to: " + this.masaLadunku);
        this.masaLadunku = 0;
    }
    public void zaladowanieLadunku(int masaLadunku) {
        if(this.masaLadunku+masaLadunku <= this.maksLadownosc) {
            this.masaLadunku += masaLadunku;
        }else {
            throw new OverfillException();
        }
    }



}
