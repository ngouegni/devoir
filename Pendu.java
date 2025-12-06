import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pendu {
    public static void main(String[] args) throws Exception {
        String mot = "baaoobbaabb"; // exemple
        char[] masque = new char[mot.length()];
        Arrays.fill(masque, '#');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println(masque);
            System.out.print("Entrez une lettre : ");
            String s = br.readLine();
            if (s.isEmpty()) continue;
            char c = s.charAt(0);
            boolean trouve = false;
            for (int i=0;i<mot.length();i++) {
                if (mot.charAt(i) == c) { masque[i] = c; trouve = true; }
            }
            if (!trouve) System.out.println("Lettre non présente");
            if (new String(masque).equals(mot)) { System.out.println("Mot trouvé : " + mot); break; }
        }
    }
}
