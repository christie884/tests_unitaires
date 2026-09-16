// Import de l'annotation permettant de créer des tests
import org.junit.jupiter.api.Test;

// Import des assertions (assertEquals)
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    // Création d'un objet FizzBuzz utilisé dans tous les tests
    FizzBuzz fb = new FizzBuzz();

    // RED → GREEN : premier test
    // Vérifie que 1 renvoie "1"
    @Test
    void convertir1Retourne1() {
        assertEquals("1", fb.convertir(1));
    }

    // Teste un multiple de 3
    @Test
    void convertir3RetourneFizz() {
        assertEquals("Fizz", fb.convertir(3));
    }

    // Teste un multiple de 5
    @Test
    void convertir5RetourneBuzz() {
        assertEquals("Buzz", fb.convertir(5));
    }

    // Teste un multiple de 3 et de 5
    @Test
    void convertir15RetourneFizzBuzz() {
        assertEquals("FizzBuzz", fb.convertir(15));
    }
}