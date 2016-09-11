package com.mv2016.logo;

/**
 * Created by Matthieu on 10/09/2016.
 */
public class Chapeau extends DecorateurAccessoire {
    /**
     * Constructeur
     *
     *  @param logo à décorer
     */
    public Chapeau(Logo logo) {
        super(logo, 0.5d);
    }

    public MyImage getLogo() {
        MyImage mi = logo.getLogo();
        mi.paintOver("img/Chapeau.png", 280, 42);
        return mi;
    }

}
