
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // Kokeile sovelluksen osien yhteistoimintaa täällä
        //Tehtavalista lista = new Tehtavalista();
        //Scanner lukija = new Scanner(System.in);
 
        //Kayttoliittyma liittyma = new Kayttoliittyma(lista, lukija);
        //liittyma.kaynnista();
        Tehtavalista lista = new Tehtavalista();
        lista.lisaa("lue kurssimateriaalia");
        lista.lisaa("katso uusin fool us");
        lista.lisaa("ota rennosti");
        lista.tulosta();
        lista.poista(2);
        lista.tulosta();
        lista.lisaa("osta rusinoita");
        lista.tulosta();
lista.poista(1);
lista.poista(1);
lista.tulosta();
    }
}