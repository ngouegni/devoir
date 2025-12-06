import java.util.*;

public class ArrayListPays {
    public static void main(String[] args) {
        List<String> pays = Arrays.asList("France","Allemagne","Russie","USA","Chine");
        List<Integer> pop = Arrays.asList(62,82,288,200,1290);
        int minIdx = 0;
        for (int i=1;i<pop.size();i++) if (pop.get(i) < pop.get(minIdx)) minIdx = i;
        System.out.println("Plus petite population: " + pays.get(minIdx) + " : " + pop.get(minIdx) + " millions");
        System.out.println("Pays > 200M:");
        for (int i=0;i<pays.size();i++) if (pop.get(i) > 200) System.out.println(pays.get(i));
    }
}
