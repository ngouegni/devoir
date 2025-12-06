public class Location {
    private char categorie; // E C L
    private int jours;
    private int kmEffectues;

    public Location(char categorie, int jours, int kmEffectues) {
        this.categorie = categorie;
        this.jours = jours;
        this.kmEffectues = kmEffectues;
    }

    public double montantJour() {
        switch (categorie) {
            case 'E': return 50;
            case 'C': return 80;
            case 'L': return 150;
            default: return 0;
        }
    }

    public double montantLocation() {
        return montantJour() * jours;
    }

    public int kmOfferts() {
        if (jours == 1) return 100;
        if (jours <= 30) {
            if (jours >= 30) return 5000;
            if (jours >= 7) return 1000 * (jours / 7);
            return 100 * jours;
        }
        return 5000;
    }

    public int kmSupplementaire() {
        int off = kmOfferts();
        return Math.max(0, kmEffectues - off);
    }

    public double pxKmSupplementaire() {
        return kmSupplementaire() * 0.5;
    }

    public double mtTotal() {
        return montantLocation() + pxKmSupplementaire();
    }
}
