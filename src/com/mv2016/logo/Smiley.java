package com.mv2016.logo;

/**
 * Created by Matthieu on 10/09/2016.
 */
public class Smiley extends DecorateurAccessoire {
    /**
     * Constructeur
     *
     *  @param logo à décorer
     */
    public Smiley(Logo logo) {
        super(logo, 3.68d);
    }

    public MyImage getLogo() {
        MyImage mi = logo.getLogo();
        mi.paintOver("img/Smiley.png", 260, 210);
        return mi;
    }
}
