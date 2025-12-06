package exercice4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SigneProduit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Premier nombre : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Second nombre : ");
        int b = Integer.parseInt(br.readLine());

        if (a == 0 || b == 0) System.out.println("Produit = 0");
        else if ((a > 0 && b > 0) || (a < 0 && b < 0)) System.out.println("Produit positif");
        else System.out.println("Produit négatif");
    }
}
