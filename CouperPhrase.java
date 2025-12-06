package exercice5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CouperPhrase {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez une phrase : ");
        String p = br.readLine();
        if (p.length() > 10) p = p.substring(0, 10) + "...";
        System.out.println(p);
    }
}
