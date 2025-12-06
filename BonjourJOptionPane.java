package exercice1;
import javax.swing.JOptionPane;

public class BonjourJOptionPane {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog("Veuillez saisir votre nom :");
        
        JOptionPane.showMessageDialog(null, "Bonjour " + nom);
    }
}


