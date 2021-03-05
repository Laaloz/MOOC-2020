import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laali
 */
public class Vitsipankki {
    private  ArrayList<String> lista;
            
    public Vitsipankki() {
        lista = new ArrayList<>();
    }
    
    public void lisaaVitsi(String vitsi) {
        lista.add(vitsi);
    }
    
    public String arvoVitsi() {
        Random r = new Random();
        
       
        if (lista.isEmpty()) {
            
            return "Vitsit vähissä.";
        }

        String luku = lista.get(r.nextInt(lista.size())); 
        return luku;
    }
    
    public void tulostaVitsit() {
        
        if (!lista.isEmpty()) {
            for (String vitsit : lista) {
            System.out.println(vitsit);
            }
        } 
    }    
}
