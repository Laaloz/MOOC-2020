
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
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
