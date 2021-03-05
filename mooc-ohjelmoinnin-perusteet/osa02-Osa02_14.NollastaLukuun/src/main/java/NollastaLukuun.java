
import java.util.Scanner;

public class NollastaLukuun {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int alku = 0;
        int loppu = Integer.valueOf(lukija.nextLine());
           
        while (alku < loppu ) {
            System.out.println( alku );
            alku++;
        }
        System.out.println( loppu );
    }
}
