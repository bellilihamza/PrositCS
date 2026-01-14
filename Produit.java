import java.util.Date;

public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void afficher() {
        System.out.println("Produit {" +"id=" + id +", libelle='" + libelle + '\'' +", marque='" + marque + '\'' +
         ", prix=" + prix +", dateExpiration=" + dateExpiration +'}');
    }

    @Override
    public String toString() {
        return "Produit {" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }

    public boolean comparer(Produit autreProduit) {
        return this.id == autreProduit.id &&
               this.libelle.equals(autreProduit.libelle) &&
               this.prix == autreProduit.prix;
    }

    public static boolean comparer(Produit produit1, Produit produit2) {
        return produit1.id == produit2.id &&
               produit1.libelle.equals(produit2.libelle) &&
               produit1.prix == produit2.prix;
    }

    public static boolean chercherProduit(Produit[] magasin, Produit produitRecherche) {
        for (Produit produit : magasin) {
            if (produit != null && produit.comparer(produitRecherche)) {
                return true;
            }
        }
        return false;
    }
}