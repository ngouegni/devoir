import java.util.GregorianCalendar;
// import java.util.Calendar;

public class DVD {
    private String titre;
    private char couleur; // R V
    private GregorianCalendar dateSortie;

    public DVD(String titre, char couleur, GregorianCalendar dateSortie) {
        this.titre = titre;
        this.couleur = couleur;
        this.dateSortie = dateSortie;
    }

    public double prixDVD() {
        if (couleur == 'R') return 3.0;
        if (couleur == 'V') return 2.0;
        return 0.0;
    }

    public boolean isNouveaute() {
        GregorianCalendar aujourd = new GregorianCalendar();
        long diff = aujourd.getTimeInMillis() - dateSortie.getTimeInMillis();
        long jours = diff / (24L*3600*1000);
        return jours <= 90;
    }

    public String toString() {
        return titre + " (" + couleur + ")";
    }
}
