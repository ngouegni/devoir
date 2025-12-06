package exercice1;
import java.util.Scanner;

public class OperationsScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le premier entier : ");
        int nombre1 = scanner.nextInt();
        
        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = scanner.nextInt();
        
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;
        double quotient = (double) nombre1 / nombre2;
        
        System.out.println("Somme : " + somme);
        System.out.println("Différence : " + difference);
        System.out.println("Produit : " + produit);
        System.out.println("Quotient : " + quotient);
        
        scanner.close();
    }
}