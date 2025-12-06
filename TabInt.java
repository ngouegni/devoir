import java.util.Random;

public class TabInt {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) tab[i] = r.nextInt(101);
        int sum = 0, min = tab[0], max = tab[0];
        for (int v : tab) {
            sum += v;
            if (v < min) min = v;
            if (v > max) max = v;
        }
        System.out.println("Somme=" + sum + " Min=" + min + " Max=" + max);
    }
}
