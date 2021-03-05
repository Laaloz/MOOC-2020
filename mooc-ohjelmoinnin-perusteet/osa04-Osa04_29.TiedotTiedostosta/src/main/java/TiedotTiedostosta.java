
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        
        try {
            Scanner lue = new Scanner(Paths.get(tiedosto));
            while (lue.hasNextLine()) {
                String data = lue.nextLine();
                
                String palat[] = data.split(",");
                if (Integer.valueOf(palat[1]) == 1) {
                    System.out.println(palat[0] + " ikä: " + palat[1]+ " vuosi");
                } else {
                    System.out.println(palat[0] + " ikä: "+ palat[1] +" vuotta");
                }
            }
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

    }
}
