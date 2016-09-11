package com.mv2016.logo;

/**
 * Created by Matthieu on 10/09/2016.
 */
public class CanneSucre extends DecorateurAccessoire {
    /**
     * Constructeur
     *
     *  @param logo à décorer
     */
    public CanneSucre(Logo logo) {
        super(logo, 0.23d);
    }

    public MyImage getLogo() {
        MyImage mi = logo.getLogo();
        mi.paintOver("img/Candy.png", 441, 202);
        return mi;
    }
}
