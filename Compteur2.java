package exercice6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Compteur2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Compter jusqu’à quel nombre ? ");
        int max = Integer.parseInt(br.readLine());

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }
}
