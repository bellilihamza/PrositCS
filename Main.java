import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produit> magasin1 = new ArrayList<>();
        ArrayList<Produit> magasin2 = new ArrayList<>();

        ajouterProduit(magasin1, new Produit(1021, "Lait", "Delice", 0.700));
        ajouterProduit(magasin1, new Produit(2510, "Yaourt", "Vitalait", 0.500));
        ajouterProduit(magasin2, new Produit(3250, "Tomate", "Sicam", 1.200));
        ajouterProduit(magasin2, new Produit(1021, "Lait", "Delice", 0.700)); // Duplicate, won't be added

        System.out.println("Total products in all stores: " + totalProduits(magasin1, magasin2));

        Produit p1 = new Produit(1021, "Lait", "Delice", 0.700);
        Produit p2 = new Produit(1021, "Lait", "Delice", 0.700);
        System.out.println("Products are identical: " + Produit.comparer(p1, p2));

        System.out.println("Product found in store: " + Produit.chercherProduit(magasin1.toArray(new Produit[0]), p1));

        System.out.println("Store with more products: " + (magasin1.size() > magasin2.size() ? "Magasin 1" : "Magasin 2"));

        Produit produitVide = new Produit();

        Produit lait = new Produit(1021, "Lait", "Delice", 0);
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait", 0);
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1.200);

        lait.afficher();
        yaourt.afficher();
        tomate.afficher();

        lait.setPrix(0.700);
        lait.afficher();

        lait.setPrix(0.700);
        yaourt.setPrix(0.500);
        tomate.setPrix(1.200);

        lait.afficher();
        yaourt.afficher();
        tomate.afficher();

        System.out.println(lait);
        System.out.println(yaourt);
        System.out.println(tomate);

        lait.setDateExpiration(new Date(2026 - 1900, 0, 1)); 
        yaourt.setDateExpiration(new Date(2026 - 1900, 1, 15)); 
        tomate.setDateExpiration(new Date(2026 - 1900, 5, 30));

        lait.afficher();
        yaourt.afficher();
        tomate.afficher();
    }

    // Method to add a product to a store
    public static void ajouterProduit(ArrayList<Produit> magasin, Produit produit) {
        for (Produit p : magasin) {
            if (p.comparer(produit)) {
                System.out.println("Product already exists in the store.");
                return;
            }
        }
        magasin.add(produit);
    }

    // Method to calculate total products in all stores
    public static int totalProduits(ArrayList<Produit>... magasins) {
        int total = 0;
        for (ArrayList<Produit> magasin : magasins) {
            total += magasin.size();
        }
        return total;
    }
}