import java.util.ArrayList;

public class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private final int capaciteEmployes = 20;
    // product array with capacity 2 as requested
    private Produit[] produits = new Produit[2];
    private int nbProduits = 0;
    private ArrayList<Employe> employes = new ArrayList<>();

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public int getCapaciteEmployes() { return capaciteEmployes; }

    public boolean ajouterEmploye(Employe e) {
        if (employes.size() >= capaciteEmployes) return false;
        for (Employe ex : employes) {
            if (ex.equals(e)) return false; 
        }
        employes.add(e);
        return true;
    }

    public void ajouterProduit(Produit p) throws MagasinPleinException {
        // check duplicate
        for (int i = 0; i < nbProduits; i++) {
            Produit prod = produits[i];
            if (prod != null && prod.comparer(p)) return;
        }
        // if full, throw exception
        if (nbProduits >= produits.length) {
            throw new MagasinPleinException("Magasin '" + nom + "' est plein (capacité=" + produits.length + ")");
        }
        produits[nbProduits++] = p;
    }

    public void afficherDetails() {
        System.out.println("Magasin {id=" + id + ", nom='" + nom + "', adresse='" + adresse + "', capaciteEmployes=" + capaciteEmployes + "}");
        System.out.println("Produits :");
        for (int i = 0; i < nbProduits; i++) System.out.println(" - " + produits[i]);
        System.out.println("Employes :");
        for (Employe e : employes) System.out.println(" - " + e);
    }

    public void afficherSalaries() {
        System.out.println("Salaires pour le magasin '" + nom + "':");
        for (Employe e : employes) {
            System.out.println(e.getNom() + " (" + e.getClass().getSimpleName() + ") : " + e.calculerSalaire() + " DT");
        }
    }

    public void afficherPrimesResponsables() {
        System.out.println("Primes des responsables dans '" + nom + "':");
        for (Employe e : employes) {
            if (e instanceof Responsable) {
                Responsable r = (Responsable) e;
                System.out.println(r.getNom() + " prime = " + r.getPrime() + " DT");
            }
        }
    }

    public void afficherNombreParType() {
        int caissiers=0, vendeurs=0, responsables=0;
        for (Employe e : employes) {
            if (e instanceof Caissier) caissiers++;
            else if (e instanceof Vendeur) vendeurs++;
            else if (e instanceof Responsable) responsables++;
        }
        System.out.println("Nombre par type dans '" + nom + "' : Caissiers=" + caissiers + ", Vendeurs=" + vendeurs + ", Responsables=" + responsables);
    }

    public ArrayList<Employe> getEmployes() { return employes; }
    public Produit[] getProduits() { return produits; }
}
