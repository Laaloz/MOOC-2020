
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laali
 */

public class Tekstikayttoliittyma {
    
    private Scanner lukija;
    private Sanakirja kirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja kirja){
        this.lukija = lukija;
        this.kirja = kirja;
    }
    public void kaynnista(){
        
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")){
                break;
            }
            if (komento.equals("lisaa")){
                System.out.print("Sana: ");
                String sana = lukija.nextLine();
                System.out.print("Käännös: "); 
                String kaannos = lukija.nextLine();
                kirja.lisaa(sana, kaannos);
            } 
            if (komento.equals("hae")){
                System.out.print("Haettava: ");
                String haettava = lukija.nextLine();
                if (kirja.kaanna(haettava).equals(null)){
                    System.out.println("Sanaa " + haettava + " ei löydy");
                } else {
                    System.out.println("Käännös: " + kirja.kaanna(haettava));
                }    
            } else {
                System.out.println("Tuntematon komento");
            }
        }
        System.out.println("Hei hei!");
    }
    
}
