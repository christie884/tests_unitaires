import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ConseillerVetementsTest {

    @Test
    void conseillerManteauQuandIlFaitFroid() {

        // Création du mock
        MeteoService meteo = mock(MeteoService.class);

        // Simulation : Paris = 5°C
        when(meteo.getTemperature("Paris")).thenReturn(5.0);

        ConseillerVetements conseiller = new ConseillerVetements(meteo);

        assertEquals("Porter un manteau",
                conseiller.conseiller("Paris"));
    }

    @Test
    void conseillerTenueLegereQuandIlFaitChaud() {

        MeteoService meteo = mock(MeteoService.class);

        // Simulation : Nice = 22°C
        when(meteo.getTemperature("Nice")).thenReturn(22.0);

        ConseillerVetements conseiller = new ConseillerVetements(meteo);

        assertEquals("Tenue legere",
                conseiller.conseiller("Nice"));
    }
}
