package exercice4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NomPrenom {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez nom et prénom : ");
        String line = br.readLine().trim();
        String[] parts = line.split("\\s+", 2);
        String nom = parts[0];
        String prenom = parts.length > 1 ? parts[1] : "";
        System.out.println(nom.toUpperCase() + " (" + nom.replaceAll("[^A-Za-z-]","").length() + ")");
        if (!prenom.isEmpty()) {
            String pr = prenom.toLowerCase();
            pr = Character.toUpperCase(pr.charAt(0)) + pr.substring(1);
            System.out.println(pr + " (" + prenom.replaceAll("[^A-Za-z-]","").length() + ")");
        }
    }
}
