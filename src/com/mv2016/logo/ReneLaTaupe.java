package com.mv2016.logo;

public class ReneLaTaupe implements Logo{
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
    public ReneLaTaupe() {
        nomIm = "img/Taupe.jpg";
        prix=3.65d;
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
