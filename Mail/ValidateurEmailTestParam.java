import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateurEmailTestParam {

    // @ParameterizedTest permet d'exécuter plusieurs fois
    // la même méthode de test avec différentes valeurs.
    @ParameterizedTest

    // @CsvSource permet de fournir plusieurs valeurs
    // sous la forme : "email, résultat attendu"
    @CsvSource({
            "test@gmail.com, true",
            "jean.dupont@yahoo.fr, true",
            "abc@hotmail.com, true",
            "testgmail.com, false",
            "test@gmailcom, false",
            "bonjour, false",
            "'', false"
    })
    void testerEmails(String email, boolean resultatAttendu) {

        // Création d'un objet ValidateurEmail
        ValidateurEmail validateur = new ValidateurEmail();

        // On vérifie que le résultat obtenu correspond
        // au résultat attendu.
        assertEquals(resultatAttendu, validateur.estValide(email));
    }
}