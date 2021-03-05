
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        tulostaLukuunAsti(5); 
        
    }
    
    public static void tulostaLukuunAsti (int luku) {
        int i = 1;
        while (luku >= i) {
            System.out.println(i);
            i++;
        }
    }
}
