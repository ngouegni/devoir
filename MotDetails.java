package exercice3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MotDetails {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez un mot : ");
        String m = br.readLine();
        System.out.println("Première lettre: " + m.charAt(0));
        System.out.println("Dernière lettre: " + m.charAt(m.length()-1));
        System.out.println("Nombre de lettres: " + m.length());
    }
}
