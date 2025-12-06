package exercice8;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiples {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nombre de base : ");
        int base = Integer.parseInt(br.readLine());
        System.out.print("Valeur max : ");
        int max = Integer.parseInt(br.readLine());
        for (int i = base; i <= max; i += base) {
            System.out.println(i);
        }
    }
}
