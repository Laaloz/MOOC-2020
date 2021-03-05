import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laali
 */

public class Tehtavalista {
    private ArrayList<String> tehtavalista;
    // en ymmärä miksi testi 06-10-01 ei mene lapi
    // koska saan sama tulos kun esimerkkitulostus
    
    
    public Tehtavalista(){
        this.tehtavalista = new ArrayList<>();
    }
    
    public void lisaa(String tehtava){
        this.tehtavalista.add(tehtava);
    }
    
    public void tulosta(){
        int numero = 1;
        int i = 0;
        for (String afaire:  tehtavalista){
            System.out.println(numero + ": " + afaire);
            i++;
            numero++;
        }
    }
    
    public void poista(int numero){
        this.tehtavalista.remove(numero-1);
        
        
    }
}