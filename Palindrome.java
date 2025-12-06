package exerice7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez un mot : ");
        String m = br.readLine().replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(m).reverse().toString();
        System.out.println(m.equals(rev) ? "Palindrome" : "Pas palindrome");
    }
}
