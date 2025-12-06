package exercice1;
import java.util.Scanner;

public class Bonjour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine();

        System.out.println("Bonjour " + nom);
        sc.close();
    }
}