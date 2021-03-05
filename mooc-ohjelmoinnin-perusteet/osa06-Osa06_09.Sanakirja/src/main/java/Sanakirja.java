
import java.util.HashMap;

public class Sanakirja {

    private HashMap<String, String> sanat;

    public Sanakirja() {
        this.sanat = new HashMap<>();
    }

    public String kaanna(String sana) {
        return this.sanat.get(sana);
    }

    public void lisaa(String sana, String sanat) {
        this.sanat.put(sana, sanat);
    }
}