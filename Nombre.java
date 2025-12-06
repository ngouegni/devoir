public class Nombre {
    private int n;
    public Nombre(int n) { this.n = n; }

    public int nombreDiviseurs() {
        int c = 0;
        for (int i=1;i<=n;i++) if (n % i == 0) c++;
        return c;
    }

    public boolean estPremier() {
        if (n < 2) return false;
        for (int i=2;i*i<=n;i++) if (n % i == 0) return false;
        return true;
    }

    public boolean estParfait() {
        int[] premiersParfaits = {6,28,496,8128,33550336};
        for (int x : premiersParfaits) if (x == n) return true;
        return false;
    }

    public boolean estAmi(Nombre nb) {
        return sommeChiffres(this.n) == sommeChiffres(nb.n);
    }

    private int sommeChiffres(int v) {
        int s = 0;
        while (v != 0) { s += Math.abs(v % 10); v /= 10; }
        return s;
    }

    public String toString() { return "Nombre(" + n + ")"; }
}
