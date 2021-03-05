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

public class Kayttoliittyma {
    private Tehtavalista lista = new Tehtavalista();
    private Scanner lukija = new Scanner(System.in);
    
    
    public Kayttoliittyma(Tehtavalista debutlista, Scanner lukijadebut){
        this.lista = debutlista;
        this.lukija = lukijadebut;
    }
    
    public void kaynnista(){
        while(true){
            System.out.print("Komento: ");
            String commande = lukija.nextLine();
            if (commande.equals("lopeta")){
                break;
            }
            if (commande.equals("lisaa")){
                System.out.print("Lisätävä: ");
                String lisatava =lukija.nextLine();
                this.lista.lisaa(lisatava);
            }
            if (commande.equals("listaa")){
                lista.tulosta();
            }
            if (commande.equals("poista")){
                System.out.print("Mikä poistetaan? ");
                int indeksi = Integer.valueOf(lukija.nextLine());
                this.lista.poista(indeksi);
            }
    }
}
}