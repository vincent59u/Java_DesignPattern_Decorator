package com.mv2016.cafe;

/**
 * Classe correspondant a une boisson Colombia
 * 
 */
public class Expresso extends Boisson {
	
	public Expresso() {
		description = " Expresso";
	}

	/**
	 * @return prix de la boisson
	 */
	public double cout() {
		return 1.95d;
	}
	
}
