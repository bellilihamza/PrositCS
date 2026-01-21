public abstract class Employe {
    private int id;
    private String nom;
    private String adresse;
    private int nbr_heures; 

    public Employe() {}

    public Employe(int id, String nom, String adresse, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public int getNbr_heures() { return nbr_heures; }
    public void setNbr_heures(int nbr_heures) { this.nbr_heures = nbr_heures; }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        if (id != employe.id) return false;
        if (nbr_heures != employe.nbr_heures) return false;
        if (nom != null ? !nom.equals(employe.nom) : employe.nom != null) return false;
        return adresse != null ? adresse.equals(employe.adresse) : employe.adresse == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + nbr_heures;
        return result;
    }
}
