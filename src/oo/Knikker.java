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
public class Knikker {

    enum Kleuren { ROOD, WIT, BLAUW}
    private Kleuren kleur;
    public Teller teller; // teller is nu een verwijzing naar Teller (geen int)

    public Knikker(Kleuren kleur){
        this.kleur = kleur;
    }

    public boolean isKleurWit(){
        return kleur == Kleuren.WIT;
    }
    
    public boolean isKleurBlauw(){
        return this.kleur == Kleuren.BLAUW;
    }
    
    public boolean isKleurRood(){
        return this.kleur == Kleuren.ROOD;
    }
}
