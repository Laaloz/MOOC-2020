
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        kolmellaJaollisetValilta(3, 6);  
        
        int alku = 3;
        int loppu = 6;
        
    }
    
    public static void kolmellaJaollisetValilta(int alku, int loppu) {   
        
        int i = alku;
        int jakojaannos;
        
        while (i >= alku && i <= loppu) {
            jakojaannos = i % 3;
            if (jakojaannos == 0) {
                System.out.println(i);
            }
                i++;            
        }
    }    
}
