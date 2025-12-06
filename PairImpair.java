package exercice7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PairImpair {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez un entier : ");
        int n = Integer.parseInt(br.readLine());
        if (n % 2 == 0) System.out.println(n + " est pair");
        else System.out.println(n + " est impair");
        System.out.println("Les 10 suivants :");
        int count = 0;
        int num = n + 1;
        while (count < 10) {
            if (num % 2 == (n % 2)) { // same parity
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}
