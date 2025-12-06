package exercice9;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Devinette {
    public static void main(String[] args) throws Exception {
        int nbAleatoire = 1 + (int)(Math.random() * 10);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int essais = 0;
        int saisie = -1;
        while (saisie != nbAleatoire) {
            System.out.print("Devinez le nombre (1-10) : ");
            saisie = Integer.parseInt(br.readLine());
            essais++;
            if (saisie < nbAleatoire) System.out.println("Trop petit");
            else if (saisie > nbAleatoire) System.out.println("Trop grand");
        }
        System.out.println("Bravo ! Trouvé en " + essais + " essais.");
    }
}
