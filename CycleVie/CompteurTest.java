// Import de l'annotation @BeforeEach.
// Cette méthode sera exécutée avant chaque test.
import org.junit.jupiter.api.BeforeEach;

// Import de l'annotation @AfterEach.
// Cette méthode sera exécutée après chaque test.
import org.junit.jupiter.api.AfterEach;

// Import de l'annotation @Test.
// Elle permet de définir une méthode comme étant un test.
import org.junit.jupiter.api.Test;

// Import des méthodes d'affirmation comme assertEquals().
import static org.junit.jupiter.api.Assertions.*;

public class CompteurTest {

    // Déclaration d'un objet Compteur.
    // On ne le crée pas encore ici.
    private Compteur compteur;

    // @BeforeEach signifie que cette méthode sera exécutée
    // automatiquement AVANT chacun des tests.
    @BeforeEach
    void debutTest() {

        // Création d'un nouveau compteur avant chaque test.
        // Comme le constructeur initialise valeur à 0,
        // chaque test commence avec un compteur à 0.
        compteur = new Compteur();

        // Affichage d'un message dans la console.
        System.out.println("Debut du test");
    }

    // @AfterEach signifie que cette méthode sera exécutée
    // automatiquement APRÈS chacun des tests.
    @AfterEach
    void finTest() {

        // Affichage d'un message dans la console.
        System.out.println("Fin du test");
    }

    // Premier test :
    // on vérifie que la valeur initiale est bien 0.
    @Test
    void valeurInitialeEstZero() {

        // assertEquals vérifie que les deux valeurs sont égales.
        // 0 = valeur attendue
        // compteur.getValeur() = valeur obtenue
        assertEquals(0, compteur.getValeur());
    }

    // Deuxième test :
    // on vérifie qu'après un increment, la valeur est 1.
    @Test
    void incrementerUneFoisDonneUn() {

        // On augmente le compteur de 1.
        compteur.incrementer();

        // On vérifie que la nouvelle valeur est bien 1.
        assertEquals(1, compteur.getValeur());
    }

    // Troisième test :
    // on augmente le compteur 3 fois,
    // puis on le remet à zéro.
    @Test
    void incrementerTroisFoisPuisReinitialiserDonneZero() {

        // Premier increment : 0 -> 1
        compteur.incrementer();

        // Deuxième increment : 1 -> 2
        compteur.incrementer();

        // Troisième increment : 2 -> 3
        compteur.incrementer();

        // On remet le compteur à 0.
        compteur.reinitialiser();

        // On vérifie que la valeur est bien revenue à 0.
        assertEquals(0, compteur.getValeur());
    }
}