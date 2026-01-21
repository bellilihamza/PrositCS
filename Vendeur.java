public class Vendeur extends Employe {
    private double tauxDeVente; 

    public Vendeur() { super(); }

    public Vendeur(int id, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() { return tauxDeVente; }
    public void setTauxDeVente(double tauxDeVente) { this.tauxDeVente = tauxDeVente; }

    @Override
    public double calculerSalaire() {
        return 450.0 * (tauxDeVente / 100.0);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", tauxDeVente=" + tauxDeVente + '%'+'}');
    }
}
