/*
 * Controlleur.java                      				            25 mai 2023
 * IUT de Rodez, pas de copyright ni de "copyleft"
 */
package application.controlleurs;

import application.Othello;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * Contrôle via FXML les interactions avec la vue : les pages FXML
 * 
 * @author Tom Douaud
 * @author Loïc Faugières
 * @author Simon Guiraud
 */
public class ControlleurMenuPrincipal {

	@FXML
	private Text menuPrincipalInfosPartie;
	
	@FXML
	private void gererClicParametres() {		
		// échanger la vue courante avec celle des paramètres
		Othello.activerParametres(); 
	}
	
	@FXML
	private void gererClicPartieOrdinateur() {
		// échanger la vue courante avec celle du niveau de l'ordinateur
		Othello.activerNiveauOrdinateur(); 
	}
	
	@FXML
	private void gererClicPartieJoueur() {
		menuPrincipalInfosPartie.setText("Pour valider le captcha, crie Porc Nogué");
	}
	
	@FXML
	private void generer() {
		
	}

}