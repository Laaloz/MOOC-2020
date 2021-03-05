
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999) {
                break;
            }
 
            lista.add(luettu);
        }
 
        int pienin = lista.get(0);
        int i = 0;
        
        while (i<lista.size()) {
            
            int luku = lista.get(i);
            i++;
            if (luku <= pienin) {
                pienin = luku;
            }
        }
        
        System.out.println("Pienin luku on " + pienin);
        
        int ia = 0;
        while (ia<lista.size()) {
            
            if (lista.get(ia) == pienin) {
                System.out.println("Pienin luku löytyy indeksistä " + ia);
            }
            ia++;
        }
    }
}
        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        

