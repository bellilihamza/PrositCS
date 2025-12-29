import java.util.Date;

public class Main {
    public static void main(String[] args) {
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
}