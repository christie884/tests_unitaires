public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant");
        }
        solde -= montant;
    }

}



