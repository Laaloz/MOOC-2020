
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {

        int suurin = luku1;

        if (luku1 > luku2 && luku1 > luku3) {
            suurin = luku1;
        }
        if (luku2 > luku1 && luku2 > luku3) {
            suurin = luku2;
        }
        if (luku3 > luku1 && luku3 > luku2) {
            suurin = luku3;
        }
        return suurin;
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
