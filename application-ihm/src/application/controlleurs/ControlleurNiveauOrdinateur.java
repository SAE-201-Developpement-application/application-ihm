/*
 * Controlleur.java                      				            25 mai 2023
 * IUT de Rodez, pas de copyright ni de "copyleft"
 */
package application.controlleurs;

import application.Othello;

import javafx.fxml.FXML;

/**
 * Contrôle via FXML les interactions avec la vue : les pages FXML
 * 
 * @author Tom Douaud
 * @author Loïc Faugières
 * @author Simon Guiraud
 */
public class ControlleurNiveauOrdinateur {
	
	@FXML
	private void gererClicRetourMenuPrincipal() {		
		// échanger la vue courante avec celle des paramètres
		Othello.activerMenuPrincipal(); 
	}

}