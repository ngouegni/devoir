package exercice1;
import javax.swing.JOptionPane;

public class Calculjoption{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Premier entier : "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Deuxième entier : "));

        String resultat = "";
        resultat += "Somme = " + (a + b) + "\n";
        resultat += "Différence = " + (a - b) + "\n";
        resultat += "Produit = " + (a * b) + "\n";

        if (b != 0) {
            resultat += "Quotient = " + (a / b) + "\n";
        } else {
            resultat += "Quotient : impossible (division par zéro)\n";
        }

        JOptionPane.showMessageDialog(null, resultat);
    }
}
