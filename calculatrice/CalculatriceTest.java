import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void additionDeDeuxEntiersPositifs() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.addition(2, 3);
        assertEquals(5, resultat);
    }

    @Test
    void soustractionDeDeuxEntiersPositifs() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.soustraction(5, 2);
        assertEquals(3, resultat);
    }

    @Test
    void multiplicationDeDeuxEntiers() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.multiplication(4, 3);
        assertEquals(12, resultat);
    }
    @Test
    void divisionDeDeuxEntiers() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.division(10, 2);
        assertEquals(5, resultat);
    }
    @Test
    void divisionParZeroLeveUneException() {
        Calculatrice calc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> {
            calc.division(10, 0);
        });
    }
}