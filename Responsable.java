public class Responsable extends Employe {
    private double prime;

    public Responsable() { super(); }

    public Responsable(int id, String nom, String adresse, int nbr_heures, double prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public double getPrime() { return prime; }
    public void setPrime(double prime) { this.prime = prime; }

    @Override
    public double calculerSalaire() {
        double taux = 10.0; 
        int heures = getNbr_heures();
        if (heures <= 160) {
            return heures * taux + prime;
        } else {
            int sup = heures - 160;
            return 160 * taux + sup * (taux * 1.2) + prime;
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", prime=" + prime + '}');
    }
}
