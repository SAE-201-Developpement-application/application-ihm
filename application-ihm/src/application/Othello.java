/*
 * Main.java                      				                     25 mai 2023
 * IUT de Rodez, pas de copyright ni de "copyleft"
 */
package application;
	
import java.io.IOException;

import application.vues.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


/**
 * Classe principale de l'application permettant d'afficher des fenêtres au contenu
 * différent (ce sont les vues qui changent)
 * 
 * @author Tom Douaud
 * @author Loïc Faugières
 * @author Simon Guiraud
 */
public class Othello extends Application {
	
	/** Scène principale de l'application, celle qui contient les 2 boutons */
	private static Scene scenePrincipale;
	
	/** Scène permettant de gérer les paramètres */
	private static Scene sceneParametres;
	
	/** Scène permettant de gérer le niveau de l'ordinateur */
	private static Scene sceneNiveauOrdinateur;
	
	/**
	 * Fenêtre principale de l'application
	 * La scène qui lui est associée sera modifiée en fonction
	 * des clics de l'utilisateur
	 */
	private static Stage fenetrePrincipale;
	
	/**
	 * Permet de modifier la scène de la fenêtre principale
	 * pour qu'elle devienne celle des paramètres
	 */
	public static void activerParametres() {
		fenetrePrincipale.setScene(sceneParametres);
		fenetrePrincipale.setTitle("Othello - Paramètres");
	}
	
	/**
	 * Permet de modifier la scène de la fenêtre principale
	 * pour qu'elle devienne celle du niveau de l'ordinateur
	 */
	public static void activerNiveauOrdinateur() {
		fenetrePrincipale.setScene(sceneNiveauOrdinateur);
		fenetrePrincipale.setTitle("Othello - Niveau des ordinateurs");
	}
	
	/**
	 * Permet de modifier la scène de la fenêtre principale
	 * pour qu'elle devienne celle du menu principal
	 */
	public static void activerMenuPrincipal() {
		fenetrePrincipale.setScene(scenePrincipale);
		fenetrePrincipale.setTitle("Othello - Menu principal");
	}
	
	@Override
 	public void start(Stage primaryStage) {
		try {
			/*
			 * chargement de la vue de la scène principale dans le conteneur
			 * de type Parent
			 */
			FXMLLoader chargeurFXML = new FXMLLoader();
			chargeurFXML.setLocation(EnsembleDesVues.class.getResource("VueMenuPrincipal.fxml"));
			Parent conteneur = chargeurFXML.load();
			
			/*
			 * Création de la scène principale
			 */
			scenePrincipale = new Scene(conteneur, 975, 579);
			
			/*
			 * Chargement de la vue des paramètres et
			 * création de la scène associée à cette vue
			 */
			FXMLLoader chargeurFXMLParametres = new FXMLLoader();
			chargeurFXMLParametres.setLocation(EnsembleDesVues.class.getResource("VueParametres.fxml"));
			conteneur = chargeurFXMLParametres.load();
			sceneParametres = new Scene(conteneur, 975, 579);
			
			/*
			 * Chargement de la vue du niveau de l'ordinateur et
			 * création de la scène associée à cette vue
			 */
			FXMLLoader chargeurFXMLNiveauOrdinateur = new FXMLLoader();
			chargeurFXMLNiveauOrdinateur.setLocation(EnsembleDesVues.class.getResource("VueNiveauOrdinateur.fxml"));
			conteneur = chargeurFXMLNiveauOrdinateur.load();
			sceneNiveauOrdinateur = new Scene(conteneur, 975, 579);
			
			// on définit le titre, la hauteur et la largeur de la fenêtre principale
			primaryStage.setTitle("Othello - Menu principal");
			primaryStage.setHeight(579);
			primaryStage.setWidth(975);

			/*
			 * on associe la scène principale à la fenêtre principale
			 * Cette dernière est stockée en tant qu'attribut afin d'être accessible
			 * dans les méthodes activer... Celles qui permettent de rendre active
			 * l'une des 3 scènes
			 */
			primaryStage.setScene(scenePrincipale);
			fenetrePrincipale = primaryStage;
			primaryStage.show();

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Programme principal
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		launch(args);
	}
}