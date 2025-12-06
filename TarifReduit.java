package exercice2;
import java.util.Scanner;

public class TarifReduit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quel est votre âge ? ");
        int age = scanner.nextInt();
        
        // Version 1 : moins de 26 ans
        if (age < 26) {
            System.out.println("Vous avez droit au tarif réduit !");
        } else {
            System.out.println("Vous n'avez pas droit au tarif réduit.");
        }
        
        scanner.close();
    }
}

