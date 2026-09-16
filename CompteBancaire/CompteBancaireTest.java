import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompteBancaireTest {

    @Test
    void retraitNominal() throws SoldeInsuffisantException {
        CompteBancaire compte = new CompteBancaire(100);
        compte.retirer(40);
        assertEquals(60, compte.getSolde());
    }

    @Test
    void retraitAvecSoldeInsuffisant() {
        CompteBancaire compte = new CompteBancaire(50);
        assertThrows(SoldeInsuffisantException.class, () -> {
            compte.retirer(80);
        });
    }
}
