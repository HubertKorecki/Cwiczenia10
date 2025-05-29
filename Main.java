

public class Main {

    public static void main(String[] args) {

        Kontener kontener1 = new Kontener(52, 5, 2, 4 ,"KON_C_1", 100);
        Kontener kontener2 = new Kontener(123, 200, 200, 600 ,"KON_L_2", 500);

        //kontener1.oproznienieLadunku();
        //System.out.println(kontener1.masaLadunku);


        kontener1.zaladowanieLadunku(39);
        System.out.println(kontener1.masaLadunku);


    }

}
