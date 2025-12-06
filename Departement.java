package exercice3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Departement {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Entrez un numéro de département : ");
        int dep = Integer.parseInt(br.readLine());

        if (dep < 1 || dep > 99) {
            System.out.println("Code invalide. Il doit être entre 1 et 99.");
        } else {
            if (dep == 75 || dep == 77 || dep == 78 || dep == 91 ||
                dep == 92 || dep == 93 || dep == 94) {
                System.out.println("Ce département est en Île-de-France.");
            } else {
                System.out.println("Ce département n'est PAS en Île-de-France.");
            }
        }
    }
}
