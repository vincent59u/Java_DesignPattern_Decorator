package com.mv2016.logo;

/**
 * Created by Matthieu on 11/09/2016.
 */
public class Message extends DecorateurAccessoire {
    private String message;
    private int x, y;

    /**
     * Constructeur
     *
     *  @param logo à décorer
     *  @param m (message à afficher)
     *  @param x coordonnée de la place du message
     *  @param y coordonnée de la place du message
     */
    public Message(Logo logo, String m, int x, int y) {
        super(logo, 0.65d);
        this.message = m;
        this.x = x;
        this.y = y;
    }

    public MyImage getLogo(){
        MyImage mi = logo.getLogo();
        // Appel de la méthode qui affiche le texte.
        mi.textOver(message, x, y);
        return mi;
    }

    /**
     * Méthode qui construit le message.
     * @param message
     * @param x
     * @param y
     */
    public void textOver(String message, int x, int y) {
        logo.textOver(message, x, y);
    }
}
