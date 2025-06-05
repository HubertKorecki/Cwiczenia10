class Kontener {
    int masaLadunku;
    int wysokosc;
    int wagaWlasna;
    int glebokosc;
    int maksLadownosc;
    public int numerSeryjny;
    String typKontenera;



    public Kontener(int masaLadunku, int wysokosc, int wagaWlasna, int glebokosc, int maksLadownosc, String typKontenera) {
        this.masaLadunku = masaLadunku;
        this.wysokosc = wysokosc;
        this.wagaWlasna = wagaWlasna;
        this.glebokosc = glebokosc;
        this.maksLadownosc = maksLadownosc;
        this.typKontenera = typKontenera;
        }

    public void assignNumerSeryjny(int i){
            this.numerSeryjny = i+1;
    }

    public String getNumerSeryjny(){
        return "KON_" + this.typKontenera+"_" + this.numerSeryjny;
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
