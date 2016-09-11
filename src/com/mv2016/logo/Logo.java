package com.mv2016.logo;

/**
 * Created by Matthieu on 10/09/2016.
 */
public interface Logo {
    /**
     * @return cout du logo
     */
    double combienCaCoute();

    /**
     * @return MyImage logo
     */
    MyImage getLogo();

    /**
     * Méthode qui affiche le message personnalisé sur le logo
     */
    void textOver(String message, int x, int y);
}
