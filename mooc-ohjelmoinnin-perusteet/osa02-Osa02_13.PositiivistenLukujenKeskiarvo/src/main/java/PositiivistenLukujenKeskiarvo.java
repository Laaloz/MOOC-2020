
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double lukumaara = 0;
        double summa = 0;

        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku == 0) {
                double keskiarvo = summa / lukumaara;

                if (keskiarvo > 0) {
                    System.out.println("Lukujen keskiarvo " + keskiarvo);
                } else {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                } 
                break;
            
            } else if (luku > 0) {
                lukumaara = lukumaara + 1;
                summa = summa + luku;
            }
        }
    }
}
