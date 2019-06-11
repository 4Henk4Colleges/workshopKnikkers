/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author H.M
 */
public class OO_Teller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Knikker knikkers[] = new Knikker[50];
        
        Teller blauweTeller = new Teller();
        Teller witteTeller = new Teller();        
        Teller rodeTeller = new Teller();
        
        // maken van de knikkers
        for (int i = 0 ; i < knikkers.length ; i++){
            int kleur = (int) (Math.random() * 3) + 1;
            switch (kleur){
                case 1: knikkers[i]= new Knikker(Knikker.Kleuren.ROOD);
                        knikkers[i].teller = rodeTeller;break;
                case 2: knikkers[i]= new Knikker(Knikker.Kleuren.WIT);
                        knikkers[i].teller = witteTeller;break;
                case 3: knikkers[i]= new Knikker(Knikker.Kleuren.BLAUW);
                        knikkers[i].teller = blauweTeller;break;                
            }
        }
        
        for (Knikker knikker : knikkers){
            knikker.teller.counter++;                          
        }   
        System.out.println(blauweTeller.counter + ", " +
                            witteTeller.counter + ", " +
                            rodeTeller.counter +".");
        System.out.println("Totaal: " + (blauweTeller.counter +
                                            witteTeller.counter +
                                            rodeTeller.counter));    
    }
    
}
