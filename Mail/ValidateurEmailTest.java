
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateurEmailTest {

    @Test
    void emailValide() {
        ValidateurEmail v = new ValidateurEmail();
        assertTrue(v.estValide("test@gmail.com"));
    }

    @Test
    void emailSansArobase() {
        ValidateurEmail v = new ValidateurEmail();
        assertFalse(v.estValide("test.gmail.com"));
    }

    @Test
    void emailNull() {
        ValidateurEmail v = new ValidateurEmail();
        assertFalse(v.estValide(null));
    }

    @Test
    void chaineVide() {
        ValidateurEmail v = new ValidateurEmail();
        assertFalse(v.estValide(""));
    }
}