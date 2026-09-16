public class Compteur {

    // Attribut qui contient la valeur du compteur.
    // Il est initialisé à 0.
    private int valeur = 0;

    // Méthode qui augmente la valeur du compteur de 1.
    public void incrementer() {
        valeur++;
    }

    // Méthode qui remet le compteur à 0.
    public void reinitialiser() {
        valeur = 0;
    }

    // Getter qui permet de récupérer la valeur actuelle du compteur.
    public int getValeur() {
        return valeur;
    }
}