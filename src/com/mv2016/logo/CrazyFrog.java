package com.mv2016.logo;

/**
 * Created by Matthieu on 10/09/2016.
 */
public class CrazyFrog implements Logo {
    /**
     * Chemin d'acces au fichier
     * contenant l'image de fond du logo
     */
    private String nomIm;

    /**
     * Prix du logo
     */
    private double prix;

    /**
     * Constructeur
     */
    public CrazyFrog() {
        nomIm = "img/CrazyFrog.jpg";
        prix = 4.6d;
    }

    /**
     * @return l'objet de MyImage correspondant a nomIm
     */
    public MyImage getLogo(){
        return new MyImage(nomIm);
    }

    /**
     * @return le prix du logo
     */
    public double combienCaCoute(){
        return prix;
    }

    /**
     * Méthode qui affiche me message sur le logo
     */
    public void textOver(String message, int x, int y){ }
}
