
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String sana = lukija.nextLine();
        while (!(sana.equals(""))) {
            String[] palat = sana.split(" ");
 
            for (int i = 0; i < 1; i++) {
                    System.out.println(palat[i]);
                }
            sana = lukija.nextLine();
        }    
    }
}
