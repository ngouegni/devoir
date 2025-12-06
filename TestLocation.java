public class TestLocation {
    public static void main(String[] args) {
        Location loc = new Location('C', 10, 1200);
        System.out.println("Montant journalier: " + loc.montantJour());
        System.out.println("Montant total: " + loc.mtTotal());
    }
}
