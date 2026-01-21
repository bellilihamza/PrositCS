public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier() { super(); }

    public Caissier(int id, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() { return numeroDeCaisse; }
    public void setNumeroDeCaisse(int numeroDeCaisse) { this.numeroDeCaisse = numeroDeCaisse; }

    @Override
    public double calculerSalaire() {
        double taux = 5.0; 
        int heures = getNbr_heures();
        if (heures <= 180) {
            return heures * taux;
        } else {
            int sup = heures - 180;
            return 180 * taux + sup * (taux * 1.15);
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", numeroDeCaisse=" + numeroDeCaisse + '}');
    }
}
