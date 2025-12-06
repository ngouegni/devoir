package exercice1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VerbeGroupe {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez un verbe : ");
        String v = br.readLine().toLowerCase().trim();
        if (v.endsWith("er")) System.out.println("1er groupe");
        else if (v.endsWith("ir")) System.out.println("2ème groupe");
        else if (v.endsWith("oir") || v.endsWith("oire")) System.out.println("3ème groupe");
        else System.out.println("Groupe inconnu");
    }
}
