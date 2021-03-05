
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int alku = Integer.valueOf(lukija.next());
            
        int loppu = 100;
            
        while (alku < loppu) {
            System.out.println(alku);
            alku++;
        }
        System.out.println(loppu);
    }
}
