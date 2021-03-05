
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int maara = 0;
        int summa = 0;
        String pisin = "";
        
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] rivi = luettu.split(",");
            
            if (pisin.length() < rivi[0].length()) {
                pisin = rivi[0];
            }    
            summa = summa + Integer.valueOf(rivi[1]);
            maara++;
        }
        System.out.println("Pisin nimi: " + pisin);
        System.out.println("Syntymävuosien keskiarvo: " + (1.0 * summa / maara));
    }
}