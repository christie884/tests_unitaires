public class ConseillerVetements {

    // Dépendance vers le service météo
    private MeteoService meteoService;

    // Constructeur
    public ConseillerVetements(MeteoService meteoService) {
        this.meteoService = meteoService;
    }

    public String conseiller(String ville) {

        // On récupère la température depuis le service
        double temperature = meteoService.getTemperature(ville);
        if (temperature < 10) {
            return "Porter un manteau";
        } else {
            return "Tenue legere";
        }
    }
}
