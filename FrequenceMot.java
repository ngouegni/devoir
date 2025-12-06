import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class FrequenceMot {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrez une phrase (sans ponctuation) :");
        String line = br.readLine().trim();
        String[] words = line.split("\\s+");
        Map<Integer,Integer> freq = new TreeMap<>();
        for (String w : words) {
            int l = w.length();
            freq.put(l, freq.getOrDefault(l,0)+1);
        }
        for (Map.Entry<Integer,Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
