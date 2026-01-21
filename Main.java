import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6");

     
        Caissier c1 = new Caissier(101, "Ali", "Tunis", 170, 1);
        Caissier c2 = new Caissier(102, "Sana", "Ariana", 182, 2);
        Vendeur v1 = new Vendeur(201, "Mehdi", "Menzah", 150, 25.0); // 25%
        Responsable r1 = new Responsable(301, "Rached", "Centre", 165, 200.0);

        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(c2);
        m1.ajouterEmploye(v1);
        m1.ajouterEmploye(r1);

        Caissier c3 = new Caissier(103, "Leila", "Sfax", 160, 3);
        Vendeur v2 = new Vendeur(202, "Omar", "Menzah", 140, 30.0);
        Vendeur v3 = new Vendeur(203, "Nora", "Carthage", 120, 40.0);
        Vendeur v4 = new Vendeur(204, "Samir", "La Marsa", 130, 10.0);
        Responsable r2 = new Responsable(302, "Hana", "Menzah", 155, 150.0);

        m2.ajouterEmploye(c3);
        m2.ajouterEmploye(v2);
        m2.ajouterEmploye(v3);
        m2.ajouterEmploye(v4);
        m2.ajouterEmploye(r2);

        System.out.println("Caracteristiques des employés crees:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(v1);
 

        m1.ajouterProduit(new Produit(1021, "Lait", "Delice", 0.700));
        m1.ajouterProduit(new Produit(2510, "Yaourt", "Vitalait", 0.500));
        m1.ajouterProduit(new Produit(4001, "Pain", "Boulangerie", 0.300));

        m2.ajouterProduit(new Produit(3250, "Tomate", "Sicam", 1.200));
        m2.ajouterProduit(new Produit(5002, "Olive", "Naturel", 2.500));
        m2.ajouterProduit(new Produit(1021, "Lait", "Delice", 0.700));

        System.out.println("\n--- Details Magasins ---");
        m1.afficherDetails();
       

        System.out.println();
        m1.afficherSalaries();
        

        System.out.println();
        System.out.println("Employes dans " + m1.getNom() + ":");
        for (Employe e : m1.getEmployes()) System.out.println(" - " + e);
        System.out.println("Employes dans " + m2.getNom() + ":");
        for (Employe e : m2.getEmployes()) System.out.println(" - " + e);

        System.out.println();
        System.out.println("Salaires détaillés pour " + m1.getNom() + ":");
        for (Employe e : m1.getEmployes()) System.out.println(e.getNom() + ": " + e.calculerSalaire() + " DT");

        System.out.println();
        m1.afficherPrimesResponsables();
        m2.afficherPrimesResponsables();

      
    }
}