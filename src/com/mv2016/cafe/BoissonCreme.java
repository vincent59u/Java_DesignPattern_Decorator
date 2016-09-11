package com.mv2016.cafe;

/**
 * Created by Matthieu on 10/09/2016.
 */
public class BoissonCreme extends DecorateurIngredient {

    /**
     * Constructeur
     *
     *  @param boisson à décorer
     */
    public BoissonCreme(Boisson boisson) {
        super(0.55d, " Crème", boisson); //prix = 0.55 description="Creme"
    }
}
