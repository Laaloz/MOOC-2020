
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
       
        int tulos = 0;

        System.out.println("Ensimmäinen: ");
        int alku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Viimeinen: ");
        int loppu = Integer.valueOf(lukija.nextLine());
        
        while (alku <= loppu) {            
            tulos += alku;
            alku++;
        }
        
        System.out.println("Summa on " + tulos);
    }  
}