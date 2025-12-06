package exercice5;

import java.util.Scanner;

public class TarifDegressif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la quantité : ");
        int qte = sc.nextInt();

        int prix;

        if (qte <= 10) {
            prix = 150;
        } else if (qte <= 49) {
            prix = 135;
        } else {
            prix = 110;
        }

        int total = prix * qte;

        System.out.println("Prix unitaire : " + prix + " €");
        System.out.println("Montant total : " + total + " €");
        sc.close();
    }
    
}

