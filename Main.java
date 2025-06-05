import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList numerySeryjne = new ArrayList<Kontener>();

        Kontener kontener1 = new Kontener(52, 5, 2, 4 ,1, "C");
        numerySeryjne.add(kontener1);
        kontener1.assignNumerSeryjny(numerySeryjne.indexOf(kontener1));

        Kontener kontener2 = new Kontener(123, 200, 200, 600 ,2, "L");
        numerySeryjne.add(kontener2);
        kontener2.assignNumerSeryjny(numerySeryjne.indexOf(kontener2));

        //System.out.println(kontener2.getNumerSeryjny());



    }



}
