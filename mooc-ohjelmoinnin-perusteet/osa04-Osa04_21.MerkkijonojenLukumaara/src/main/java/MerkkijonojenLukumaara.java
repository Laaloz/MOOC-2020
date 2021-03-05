
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int syotteet = 0;
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
                break;
            }else syotteet = syotteet + 1;
        }
        System.out.println(syotteet);
    }
}
