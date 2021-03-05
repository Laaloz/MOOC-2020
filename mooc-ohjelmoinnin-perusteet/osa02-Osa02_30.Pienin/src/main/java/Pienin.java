
public class Pienin {

    public static int pienin(int luku1, int luku2) {
        // kirjoita koodia tähän
        // älä tulosta metodin sisällä mitään
        // lopussa oltava komento return

        int i = luku1;

        if (luku1 < luku2) {
            i = luku1;
        } else if (luku1 >= luku2) {
            i = luku2;
        }
        return i;
    }

    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
