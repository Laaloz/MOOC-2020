
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int tulos = 0;
        
        System.out.println("Mihin asti? ");
        
        int loppu = Integer.valueOf(lukija.nextLine());
        
        int alku = 0;
        
        while (alku < loppu) {
            alku++;
            tulos += alku;
        }
        
        System.out.println("Summa on " + tulos);
    }  
}
