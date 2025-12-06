package exercice2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhraseLength {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez une phrase : ");
        String p = br.readLine();
        int len = p.length();
        if (len < 20) System.out.println("phrase courte");
        else if (len < 50) System.out.println("phrase de longueur moyenne");
        else System.out.println("phrase longue");
    }
}
