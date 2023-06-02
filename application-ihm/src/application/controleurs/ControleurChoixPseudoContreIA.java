/*
 * ControleurChoixPseudosContreJoueur .java                      				            25 mai 2023
 * IUT de Rodez, pas de copyright ni de "copyleft"
 */
package application.controleurs;

import application.vues.GestionVues;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

import java.util.Optional;


/**
 * Contrôle via FXML les interactions avec la vue : les pages FXML.
 * 
 * @author Tom DOUAUD
 * @author Loïc FAUGIERES
 * @author Simon GUIRAUD
 */
public class ControleurChoixPseudoContreIA extends ControleurPrincipal {
	
	
	private final String REGLES_PSEUDO 
	= "Veuillez entrer un nom contenant 2 à 16 caractères.";
	
	@FXML
	private TextField pseudoJoueur1;
	
	@FXML
	private ImageView cocheJoueur;
	
	@FXML
	private ImageView croixJoueur;

	@FXML
	private void gererClicRetourNiveauOrdinateur() {		
		// échanger la vue courante avec celle des paramètres
		GestionVues.activerNiveauOrdinateur(); 
	}
	
	@FXML
	private void gererMiseAJourNomJoueur1() {
		
		String nomJoueur1 = pseudoJoueur1.getText();
		
		if (nomJoueur1.isEmpty()) {
			croixJoueur.setVisible(false);
			cocheJoueur.setVisible(false);
		} else if (nomJoueur1.length() > 1 && nomJoueur1.length() <= 16) {
			croixJoueur.setVisible(false);
			cocheJoueur.setVisible(true);
			modelePrincipal.setNomJoueur(nomJoueur1);
		} else {
			cocheJoueur.setVisible(false);
			croixJoueur.setVisible(true);
			
		}
		
		if(nomJoueur1.length() > 1 && nomJoueur1.length() <= 16) {
			modelePrincipal.setNomJoueur1(nomJoueur1);
		} else {
			Alert boitePseudoIncompatible = new Alert(Alert.AlertType.ERROR,
											      REGLES_PSEUDO);
		}
	}
	
	
	@FXML
	private void gererClicJouer() {	
//		final String REGLES_PSEUDO 
//	    = "Veuillez entrer un pseudonyme contenant 2 à 16 caractères.";
//			
//		Alert boitePseudoIncompatible = new Alert(Alert.AlertType.ERROR);
//		
//		Stage stage = (Stage) boitePseudoIncompatible.getDialogPane().getScene().getWindow();
//		stage.getIcons().add(new Image("application/vues/images/Annulation.png"));
//		
//		boitePseudoIncompatible.setTitle("Othello - Pseudonyme invalide");
//		boitePseudoIncompatible.setHeaderText(REGLES_PSEUDO);
//		boitePseudoIncompatible.showAndWait();
		GestionVues.activerJeu();
	}
}