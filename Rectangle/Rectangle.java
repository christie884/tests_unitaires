public class Rectangle {
    private double largeur;
    private double hauteur;
    // constructeur
     Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    //Methode aire
    double aire(){
        return largeur*hauteur;
    }
    double perimetre(){
        return 2*(largeur+hauteur);
    }
}
