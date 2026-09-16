import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    //seul test qui verifie a la fois l'aire ET le perimetre
    // pour un meme rectangle en utilisant assertAll().
    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(5,3);
        assertAll(
                // Vérification de l'aire :
                // 5 × 3 = 15
                () -> assertEquals(15, rectangle.aire()),

                // Vérification du périmètre :
                // 2 × (5 + 3) = 16
                () -> assertEquals(16, rectangle.perimetre())
        );
    }
}
