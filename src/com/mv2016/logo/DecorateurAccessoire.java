package com.mv2016.logo;

/**
 * Created by Matthieu on 10/09/2016.
 */
public abstract class DecorateurAccessoire implements Logo {
    protected Logo logo;
    protected double prix;


    /**
     * Constructeur du décorateur.
     * @param l
     * @param p
     */
    public DecorateurAccessoire(Logo l, double p){
        this.logo = l;
        this.prix = p;
    }

    /**
     * @return cout du logo
     */
    public double combienCaCoute(){
        return this.prix + logo.combienCaCoute();
    }

    /**
     * Méthode qui affiche le message sur le logo
     */
    public void textOver(String message, int x, int y){
        logo.textOver(message, x, y);
    }
}
