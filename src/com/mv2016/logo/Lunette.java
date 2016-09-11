package com.mv2016.logo;

/**
 * Created by Matthieu on 10/09/2016.
 */
public class Lunette extends DecorateurAccessoire {
    /**
     * Constructeur
     *
     *  @param logo à décorer
     */
    public Lunette(Logo logo) {
        super(logo, 0.77d);
    }

    public MyImage getLogo() {
        MyImage mi = logo.getLogo();
        mi.paintOver("img/Sunglasses.png", 255, 76);
        return mi;
    }
}
