import java.util.GregorianCalendar;

public class TestDVD {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar(2006, GregorianCalendar.FEBRUARY, 5);
        DVD dvd = new DVD("La porte", 'R', d);
        System.out.println(dvd);
        System.out.println("Prix: " + dvd.prixDVD());
        System.out.println("Nouveauté? " + dvd.isNouveaute());
    }
}
