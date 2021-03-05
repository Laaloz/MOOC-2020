
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int i,fact = 1;

        System.out.println("Anna luku: ");
        int alku = Integer.valueOf(lukija.nextLine());

        for (i=1;i<=alku;i++) {
            fact=fact*i;
        }
        System.out.println("Kertoma on " + fact);        
    }
}
