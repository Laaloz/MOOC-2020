
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        int i = 0;
        
        while (i < taulukko.length){
            int tahti = 1;
            while (taulukko[i] > 0 && tahti <= taulukko[i]) {
                System.out.print("*");
                tahti++;
            }
            System.out.println("");
            i++;
        }
    }
}