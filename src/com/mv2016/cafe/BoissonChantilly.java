package com.mv2016.cafe;

/**
 * Classe permettant l'ajout de chantilly à une boisson 
 */
public class BoissonChantilly extends DecorateurIngredient {
	
	/**
	 * Constructeur
	 * 
	 *  @param boisson à décorer
	 */
	public BoissonChantilly(Boisson boisson) {
		super(0.5d, " Chantilly", boisson); //prix = 0.5 description="Chantilly"
	}
	
	
}
