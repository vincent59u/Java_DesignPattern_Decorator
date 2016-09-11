package com.mv2016.cafe;

/**
 * Classe abstraite representant une boisson 
 * 
 */
public abstract class Boisson {
	
	/**
	 * Description de la  boisson 
	 * 
	 */
	protected String description = "Boisson inconnue";
	
	
	/**
	 * @return la description de la boisson  
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * Classe abstraite 
	 * @return cout de la boisson
	 */
	public abstract double cout();

	/*
	* Méthode toString qui retourne les information d'une boisson ainsi que son cout.
	* @return String str.
	*/
	public String toString(){
		return "Description de la boisson : " + getDescription() + ". Cette boisson coûte : " + cout() + " €.";
	}
}
