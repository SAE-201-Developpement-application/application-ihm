/*
 * TestModeleJeu.java                                                3 juin 2023
 * IUT de Rodez, pas de copyright ni de "copyleft".
 */
package application.modeles.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

import application.modeles.ModeleJeu;

/**
 * Tests unitaires JUnit de la classe ModeleJeu.
 * 
 * @author Tom DOUAUD
 * @author Loïc FAUGIERES
 * @author Simon GUIRAUD
 */
class TestModeleJeu {
	
	private ModeleJeu jeuTestInitial = new ModeleJeu();
	
	/**
	 * Réinitilisation du jeu de test initial (plateau initial au début
	 * de la partie).
	 */
	@BeforeEach
	public void reinitialiserJeuTest() {
		jeuTestInitial = new ModeleJeu();
	}
	
	
	/**
     * Méthode de test de {@link application.modeles.ModeleJeu#getPlateau()}.
     */
    @Test
    void testGetPlateau() {
        int[][] plateauTest = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1}
        };
        
        jeuTestInitial.setPlateau(plateauTest);
        
        assertArrayEquals(plateauTest, jeuTestInitial.getPlateau());
	}
	
	/*
	 * -----------------
	 * METHODES A TESTER
	 * -----------------
	 *
	 * -- GETTERS
	 * Faits
	 * -- SETTERS
	 * clicCase(int x, int y)
	 */
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#clicCase()}.
     */
    @Test
    void testClicCase() {
		
    	int[][] plateauTest1 = {
    		      /* 0  1  2  3  4  5  6  7 */
    		/* 0 */ {0, 0, 0, 0, 0, 0, 0, 0},
    		/* 1 */ {0, 0, 0, 0, 0, 0, 0, 0},
    		/* 2 */ {0, 0, 0, 0, 0, 0, 0, 0},
    		/* 3 */ {0, 0, 0, 2, 1, 0, 0, 0},
    		/* 4 */ {0, 0, 0, 1, 2, 0, 0, 0},
    		/* 5 */ {0, 0, 0, 0, 0, 0, 0, 0},
			/* 6 */ {0, 0, 0, 0, 0, 0, 0, 0},
    		/* 7 */ {0, 0, 0, 0, 0, 0, 0, 0}
        };
    		
    	int[][] plateauTest2 = {
    		      /* 0  1  2  3  4  5  6  7 */
    	    /* 0 */ {0, 0, 0, 0, 0, 0, 0, 0},
    		/* 1 */ {0, 0, 0, 0, 0, 0, 0, 0},
    		/* 2 */ {0, 0, 0, 0, 0, 1, 0, 2},
			/* 3 */ {0, 0, 1, 1, 1, 1, 2, 0},
    		/* 4 */ {0, 0, 0, 1, 1, 2, 2, 1},
    		/* 5 */ {0, 0, 0, 0, 2, 1, 0, 0},
    		/* 6 */ {0, 0, 0, 0, 0, 0, 0, 0},
    		/* 7 */ {0, 0, 0, 0, 0, 0, 0, 0}
        };
    		
    	int[][] listeCoordonnees1 = {{4, 4}};
    	int[][] listeCoordonnees2 = {{4, 3}};
    	int[][] listeCoordonnees3 = {{5, 3}, {4, 3}};
    	int[][] listeCoordonnees4 = {{5, 3}, {4, 3}};
    	int[][] listeCoordonnees5 = {{6, 3}};
    	int[][] listeCoordonnees6 = {{4, 4}};
    	int[][] listeCoordonnees7 = {{3, 3}, {4, 3}, {5, 3}};
    	int[][] listeCoordonnees8 = {{5, 4}};
    	int[][] listeCoordonnees9 = {{5, 4}, {4, 4}};
    	int[][] listeCoordonnees10 = {{6, 3}, {5, 4}};
    	int[][] listeTest;
    	jeuTestInitial.setPlateau(plateauTest1);
    	
        listeTest = jeuTestInitial.clicCase(5, 4);
        assertArrayEquals(listeTest, listeCoordonnees1);
        
        jeuTestInitial.setTourJoueur1(false);
        listeTest = jeuTestInitial.clicCase(5, 3);
        assertArrayEquals(listeTest, listeCoordonnees2);
        
        jeuTestInitial.setTourJoueur1(true);
        listeTest = jeuTestInitial.clicCase(5, 2);
        assertArrayEquals(listeTest, listeCoordonnees3);
        
        jeuTestInitial.setTourJoueur1(false);
        listeTest = jeuTestInitial.clicCase(6, 3);
        assertArrayEquals(listeTest, listeCoordonnees4);
        
        jeuTestInitial.setTourJoueur1(true);
        listeTest = jeuTestInitial.clicCase(7, 4);
        assertArrayEquals(listeTest, listeCoordonnees5);
        
        jeuTestInitial.setTourJoueur1(false);
        listeTest = jeuTestInitial.clicCase(4, 5);
        assertArrayEquals(listeTest, listeCoordonnees6);
        
        jeuTestInitial.setTourJoueur1(true);
        listeTest = jeuTestInitial.clicCase(2, 3);
        assertArrayEquals(listeTest, listeCoordonnees7);
        
        jeuTestInitial.setTourJoueur1(false);
        listeTest = jeuTestInitial.clicCase(6, 4);
        assertArrayEquals(listeTest, listeCoordonnees8);
        
        jeuTestInitial.setTourJoueur1(true);
        listeTest = jeuTestInitial.clicCase(5, 5);
        assertArrayEquals(listeTest, listeCoordonnees9);
        
        jeuTestInitial.setTourJoueur1(false);
        listeTest = jeuTestInitial.clicCase(7, 2);
        assertArrayEquals(listeTest, listeCoordonnees10);
        
        
        jeuTestInitial.clicCase(5, 4);
        jeuTestInitial.clicCase(5, 3);
        jeuTestInitial.clicCase(5, 2);
        jeuTestInitial.clicCase(6, 3);
        jeuTestInitial.clicCase(7, 4);
        jeuTestInitial.clicCase(4, 5);
        jeuTestInitial.clicCase(2, 3);
        jeuTestInitial.clicCase(6, 4);
        jeuTestInitial.clicCase(5, 5);
        jeuTestInitial.clicCase(7, 2);
        assertArrayEquals(plateauTest1, plateauTest2);
    
	}
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#ajouterErreurPlacementJoueur2()}.
     */
    @Test
    void testAjouterErreurPlacementJoueur2() {
        		
		assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur2(), 0);
		
		jeuTestInitial.ajouterErreurPlacementJoueur2();
        assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur2(), 1);
        
        jeuTestInitial.ajouterErreurPlacementJoueur2();
        jeuTestInitial.ajouterErreurPlacementJoueur2();
        assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur2(), 3); 
	}
    
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#ajouterErreurPlacementJoueur1()}.
     */
    @Test
    void testAjouterErreurPlacementJoueur1() {
      		
		assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur1(), 0);
		
		jeuTestInitial.ajouterErreurPlacementJoueur1();
        assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur1(), 1);
        
        jeuTestInitial.ajouterErreurPlacementJoueur1();
        jeuTestInitial.ajouterErreurPlacementJoueur1();
        assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur1(), 3); 
	}
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#reinitialiserTourPasses()}.
     */
    @Test
    void testReinitialiserTourPasses() {
        
    	jeuTestInitial.passerTour();
        assertEquals(jeuTestInitial.getToursPasses(), 1);
        
        jeuTestInitial.reinitialiserTourPasses();
        assertEquals(jeuTestInitial.getToursPasses(), 0);
        
        jeuTestInitial.passerTour();
        jeuTestInitial.passerTour();
        assertEquals(jeuTestInitial.getToursPasses(), 2);
        
        jeuTestInitial.passerTour();
        jeuTestInitial.passerTour();
        jeuTestInitial.passerTour();
        jeuTestInitial.reinitialiserTourPasses();
        assertEquals(jeuTestInitial.getToursPasses(), 0);
 
	}
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#passerTour()}.
     */
    @Test
    void testpasserTour() {
        
    	jeuTestInitial.passerTour();
        assertEquals(jeuTestInitial.getToursPasses(), 1);
        
        jeuTestInitial.passerTour();
        assertEquals(jeuTestInitial.getToursPasses(), 2);
        
        jeuTestInitial.passerTour();
        assertEquals(jeuTestInitial.getToursPasses(), 3);
        
        jeuTestInitial.passerTour();
        jeuTestInitial.passerTour();
        jeuTestInitial.passerTour();
        assertEquals(jeuTestInitial.getToursPasses(), 6);
 
	}
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#setScoreJoueur2()}.
     */
    @Test
    void testSetScoreJoueur2() {
        
    	jeuTestInitial.setScoreJoueur2(20);
        assertEquals(jeuTestInitial.getScoreJoueur2(), 20);
        
        jeuTestInitial.setScoreJoueur2(65);
        assertEquals(jeuTestInitial.getScoreJoueur2(), 65);  
        
        jeuTestInitial.setScoreJoueur2(0);
        assertEquals(jeuTestInitial.getScoreJoueur2(), 0);   
	}
	
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#setScoreJoueur1()}.
     */
    @Test
    void testSetScoreJoueur1() {
        
    	jeuTestInitial.setScoreJoueur1(20);
        assertEquals(jeuTestInitial.getScoreJoueur1(), 20);
        
        jeuTestInitial.setScoreJoueur1(65);
        assertEquals(jeuTestInitial.getScoreJoueur1(), 65);  
        
        jeuTestInitial.setScoreJoueur1(0);
        assertEquals(jeuTestInitial.getScoreJoueur1(), 0);   
	}
    
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#setOrdinateurFacile()}.
     */
    @Test
    void testSetTourJoueur1() {
        
    	jeuTestInitial.setTourJoueur1(false);
        assertEquals(jeuTestInitial.isTourJoueur1(), false);
        
        jeuTestInitial.setTourJoueur1(true);
        assertEquals(jeuTestInitial.isTourJoueur1(), true);        
	}
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#setOrdinateurFacile()}.
     */
    @Test
    void testSetOrdinateurFacile() {
        
    	jeuTestInitial.setOrdinateurFacile(false);
        assertEquals(jeuTestInitial.isOrdinateurFacile(), false);
        
        jeuTestInitial.setOrdinateurFacile(true);
        assertEquals(jeuTestInitial.isOrdinateurFacile(), true);        
	}
    
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#setPartieOrdinateur()}.
     */
    @Test
    void testSetPartieOrdinateur() {
        
    	jeuTestInitial.setPartieOrdinateur(false);
        assertEquals(jeuTestInitial.isPartieOrdinateur(), false);
        
        jeuTestInitial.setPartieOrdinateur(true);
        assertEquals(jeuTestInitial.isPartieOrdinateur(), true);        
	}
    
	/**
     * Méthode de test de {@link application.modeles.ModeleJeu#setPlateau()}.
     */
    @Test
    void testSetPlateau() {
    	
    	int[][] plateauTest1 = {
    		      /* 0  1  2  3  4  5  6  7 */
    	    /* 0 */ {0, 0, 0, 0, 0, 0, 0, 0},
    	    /* 1 */ {0, 2, 0, 0, 0, 0, 2, 0},
    	    /* 2 */ {0, 0, 0, 0, 0, 0, 0, 0},
    	    /* 3 */ {0, 0, 0, 2, 1, 0, 0, 0},
    	    /* 4 */ {0, 0, 0, 1, 2, 0, 0, 0},
    	    /* 5 */ {0, 0, 0, 0, 0, 0, 0, 0},
    	    /* 6 */ {0, 1, 0, 0, 0, 0, 1, 0},
    	    /* 7 */ {0, 0, 0, 0, 0, 0, 0, 0}
    		};
    	
    	int[][] plateauTest2 = {
  		      /* 0  1  2  3  4  5  6  7 */
  	    /* 0 */ {0, 0, 0, 0, 0, 0, 0, 0},
  	    /* 1 */ {0, 1, 0, 0, 0, 0, 1, 0},
  	    /* 2 */ {0, 0, 0, 0, 0, 0, 0, 0},
  	    /* 3 */ {0, 0, 0, 2, 1, 0, 0, 0},
  	    /* 4 */ {0, 0, 0, 1, 2, 0, 0, 0},
  	    /* 5 */ {0, 0, 0, 0, 0, 0, 0, 0},
  	    /* 6 */ {0, 2, 0, 0, 0, 0, 2, 0},
  	    /* 7 */ {0, 0, 0, 0, 0, 0, 0, 0}
  		};
    	
		ModeleJeu jeu = new ModeleJeu();
		jeu.setPlateau(plateauTest1);
		jeu.setPlateau(plateauTest2);
		
        assertArrayEquals(plateauTest2, jeu.getPlateau());
	}
    
	/**
     * Méthode de test de {@link application.modeles.ModeleJeu#isPartieOrdinateur()}.
     */
    @Test
	void testIsPartieOrdinateur() {
		 
		jeuTestInitial.setPartieOrdinateur(true);
		
		assertTrue(jeuTestInitial.isPartieOrdinateur());
		
		jeuTestInitial.setPartieOrdinateur(false);
		
		assertFalse(jeuTestInitial.isPartieOrdinateur());
	}
	 
	/**
     * Méthode de test de {@link application.modeles.ModeleJeu#isOrdinateurFacile()}.
     */
    @Test
	void testIsOrdinateurFacile() {
			 
		jeuTestInitial.setOrdinateurFacile(true);
		
		assertTrue(jeuTestInitial.isOrdinateurFacile());
		
		jeuTestInitial.setOrdinateurFacile(false);
		
		assertFalse(jeuTestInitial.isOrdinateurFacile());
	}

    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#isTourJoueur1()}.
     */
	@Test
	void testIsTourJoueur1() {
		 
		jeuTestInitial.setTourJoueur1(true);
		 
		assertTrue(jeuTestInitial.isTourJoueur1());
		 
		jeuTestInitial.setTourJoueur1(false);
		 
		assertFalse(jeuTestInitial.isTourJoueur1());
	}
	
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#getScoreJoueur1()}.
     */
	@Test
	void testGetScoreJoueur1() {
		
		jeuTestInitial.setScoreJoueur1(5);
		
		assertEquals(jeuTestInitial.getScoreJoueur1(), 5);
	}
	
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#getScoreJoueur2()}.
     */
    @Test
	void testGetScoreJoueur2() {
		jeuTestInitial.setScoreJoueur2(5);
		
		assertEquals(jeuTestInitial.getScoreJoueur2(), 5);
	}
	
    /**
     * Méthode de test de {@link application.modeles.ModeleJeu#getToursPasses()}.
     */
    @Test
	void testGetToursPasses() {
		jeuTestInitial.passerTour();
		assertEquals(jeuTestInitial.getToursPasses(), 1);
		
		jeuTestInitial.passerTour();
		assertEquals(jeuTestInitial.getToursPasses(), 2);
	}
	
    /**
     * Méthode de test de
     * {@link application.modeles.ModeleJeu#getNombreErreursPlacementJoueur1()}.
     */
    @Test
	void testGetNombreErreursPlacementJoueur1() {
		
		jeuTestInitial.ajouterErreurPlacementJoueur1();
		assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur1(), 1);
		
		jeuTestInitial.ajouterErreurPlacementJoueur1();
		assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur1(), 2);
	}
	
	/**
     * Méthode de test de
     * {@link application.modeles.ModeleJeu#getNombreErreursPlacementJoueur2()}.
     */
	void testGetNombreErreursPlacementJoueur2() {
		
		jeuTestInitial.ajouterErreurPlacementJoueur2();
		assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur2(), 1);
		
		jeuTestInitial.ajouterErreurPlacementJoueur2();
		assertEquals(jeuTestInitial.getNombreErreursPlacementJoueur2(), 2);
	}
	
	/**
	 * Méthode de test de
	 * {@link application.modeles.ModeleJeu#placementPossible()}.
	 */
	@Test
	void testPlacementPossible() {
		
		ModeleJeu jeu = new ModeleJeu();
		
		jeu.setTourJoueur1(true);
		
		int[][] plateauTest1 = {
	      /* 0  1  2  3  4  5  6  7 */
    /* 0 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 1 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 2 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 3 */ {0, 0, 0, 2, 1, 0, 0, 0},
    /* 4 */ {0, 0, 0, 1, 2, 0, 0, 0},
    /* 5 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 6 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 7 */ {0, 0, 0, 0, 0, 0, 0, 0}
        };
        
		
		int[][] coordonneesInvalidesJoueur1 = {
			// Lignes de gauche 
			{0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7},
			{1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7},
			// Lignes de droite
			{6, 0}, {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5}, {6, 6}, {6, 7},
            {7, 0}, {7, 1}, {7, 2}, {7, 3}, {7, 4}, {7, 5}, {7, 6}, {7, 7},
			
			// Lignes du haut
			{2, 0}, {3, 0}, {4, 0}, {5, 0},
			{2, 1}, {3, 1}, {4, 1}, {5, 1}, 
			// Lignes du bas
			{2, 6}, {3, 6}, {4, 6}, {5, 6}, 
			{2, 7}, {3, 7}, {4, 7}, {5, 7},
			
			// Centre
			{2, 2}, {2, 4}, {2, 5},
			{3, 5},
			{4, 2},
			{5, 2}, {5, 3}, {5, 5}
		};
		
		int[][] coordonneesInvalidesJoueur2 = {
			// Lignes de gauche 
			{0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7},
			{1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7},
			// Lignes de droite
			{6, 0}, {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5}, {6, 6}, {6, 7},
            {7, 0}, {7, 1}, {7, 2}, {7, 3}, {7, 4}, {7, 5}, {7, 6}, {7, 7},
			
			// Lignes du haut
			{2, 0}, {3, 0}, {4, 0}, {5, 0},
			{2, 1}, {3, 1}, {4, 1}, {5, 1}, 
			// Lignes du bas
			{2, 6}, {3, 6}, {4, 6}, {5, 6}, 
			{2, 7}, {3, 7}, {4, 7}, {5, 7},
			
			// Centre
			{2, 2}, {2, 3}, {2, 5},
			{3, 2},
			{4, 5},
			{5, 2}, {5, 4}, {5, 5}
		};
		
		int[][] coordonneesValidesJoueur1 = {
			{3, 2}, {4, 5}, {2, 3}, {5, 4}/*,
			{3, 5}, {4, 5}, {2, 4}, {2, 3},
			/*{5, 0}, {4, 0}, {3, 0}, {6, 1}*/
		};
		
		int[][] coordonneesValidesJoueur2 = {
			
			{3, 5}, {4, 2}, {5, 3}, {2, 4}
			// {2, 4} passe pas ce n'est pas normal
		};
		
		jeu.setPlateau(plateauTest1);
		
		/* Parcours de toutes les coordonnées invalides correspondantes au
		   joueur 1 afin de s'assurer que le résultat d'exécution soit faux. */
		for (int[] coordonneesCourantes : coordonneesInvalidesJoueur1) {
			assertFalse(jeu.placementPossible(
				coordonneesCourantes[0], 
				coordonneesCourantes[1]
			));
		}
		
		/* Parcours de toutes les coordonnées valides correspondantes au
           joueur 1 afin de s'assurer que le résultat d'exécution soit vrai. */
		for (int[] coordonneesCourantes : coordonneesValidesJoueur1) {
			assertTrue(jeu.placementPossible(
				coordonneesCourantes[0], 
				coordonneesCourantes[1]
			));
		}
		
		//jeu.setPlateau(plateauTest2);
		jeu.setTourJoueur1(false);
		
		
        /* Parcours de toutes les coordonnées valides correspondantes au
           joueur 2 afin de s'assurer que le résultat d'exécution soit vrai. */
		for (int[] coordonneesCourantes : coordonneesValidesJoueur2) {
			assertTrue(jeu.placementPossible(
				coordonneesCourantes[0], 
				coordonneesCourantes[1]
			));
		}
	}
	
	@Test
	void testPoserPion() {
		ModeleJeu jeu = new ModeleJeu();
		
		jeu.setTourJoueur1(true);
		
		int[][] plateauTest = {
	      /* 0  1  2  3  4  5  6  7 */
    /* 0 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 1 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 2 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 3 */ {0, 0, 0, 1, 1, 0, 0, 0},
    /* 4 */ {0, 0, 0, 1, 1, 0, 0, 0},
    /* 5 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 6 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 7 */ {0, 0, 0, 0, 0, 0, 0, 0}
        };
        
        int[][] plateauRempli = {
	      /* 0  1  2  3  4  5  6  7 */
    /* 0 */ {1, 1, 1, 1, 1, 1, 1, 1},
    /* 1 */ {1, 1, 1, 1, 1, 1, 1, 1},
    /* 2 */ {1, 1, 1, 1, 1, 1, 1, 1},
    /* 3 */ {1, 1, 1, 1, 1, 1, 1, 1},
    /* 4 */ {1, 1, 1, 1, 1, 1, 1, 1},
    /* 5 */ {1, 1, 1, 1, 1, 1, 1, 1},
    /* 6 */ {1, 1, 1, 1, 1, 1, 1, 1},
    /* 7 */ {1, 1, 1, 1, 1, 1, 1, 1}
        };
        
        int[][] coordonneesCasesVides = {
			// Lignes de gauche 
			{0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7},
			{1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7},
			// Lignes de droite
			{6, 0}, {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5}, {6, 6}, {6, 7},
            {7, 0}, {7, 1}, {7, 2}, {7, 3}, {7, 4}, {7, 5}, {7, 6}, {7, 7},
			
			// Lignes du haut
			{2, 0}, {3, 0}, {4, 0}, {5, 0},
			{2, 1}, {3, 1}, {4, 1}, {5, 1}, 
			// Lignes du bas
			{2, 6}, {3, 6}, {4, 6}, {5, 6}, 
			{2, 7}, {3, 7}, {4, 7}, {5, 7},
			
			// Centre
			{2, 2}, {2, 3}, {2, 4}, {2, 5},
			{3, 2}, {3, 5},
			{4, 2}, {4, 5},
			{5, 2}, {5, 3}, {5, 4}, {5, 5}
		};
		
		jeu.setPlateau(plateauTest);
		
		for (int[] coordonneesCourantes : coordonneesCasesVides) {
			jeu.poserPion(coordonneesCourantes[0], coordonneesCourantes[1]);
		}
		
		assertArrayEquals(plateauTest, plateauRempli);
		
	}
	
	@Test
	void testCaseVide() {
		ModeleJeu jeu = new ModeleJeu();
		
		jeu.setTourJoueur1(true);
		
		int[][] plateauTest1 = {
	      /* 0  1  2  3  4  5  6  7 */
    /* 0 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 1 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 2 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 3 */ {0, 0, 0, 2, 1, 0, 0, 0},
    /* 4 */ {0, 0, 0, 1, 2, 0, 0, 0},
    /* 5 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 6 */ {0, 0, 0, 0, 0, 0, 0, 0},
    /* 7 */ {0, 0, 0, 0, 0, 0, 0, 0}
        };
        
        int[][] coordonneesCasesVides = {
			// Lignes de gauche 
			{0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7},
			{1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7},
			// Lignes de droite
			{6, 0}, {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5}, {6, 6}, {6, 7},
            {7, 0}, {7, 1}, {7, 2}, {7, 3}, {7, 4}, {7, 5}, {7, 6}, {7, 7},
			
			// Lignes du haut
			{2, 0}, {3, 0}, {4, 0}, {5, 0},
			{2, 1}, {3, 1}, {4, 1}, {5, 1}, 
			// Lignes du bas
			{2, 6}, {3, 6}, {4, 6}, {5, 6}, 
			{2, 7}, {3, 7}, {4, 7}, {5, 7},
			
			// Centre
			{2, 2}, {2, 4}, {2, 5},
			{3, 2}, {3, 5},
			{4, 2}, {4, 5},
			{5, 2}, {5, 3}, {5, 4}, {5, 5}
		};
        
		jeu.setPlateau(plateauTest1);
		
		/* Parcours de toutes les coordonnées invalides correspondantes au
		   joueur 1 afin de s'assurer que le résultat d'exécution soit faux. */
		for (int[] coordonneesCourantes : coordonneesCasesVides) {
			assertTrue(jeu.caseVide(
				coordonneesCourantes[0], 
				coordonneesCourantes[1]
			));
		}
         
	}

}
