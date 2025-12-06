package exercice2;
import javax.swing.JOptionPane;

public class TarifReduitJOption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Quel est votre âge ?");
        int age = Integer.parseInt(input);
        
        String message;
        if (age < 26 || age > 65) {
            message = "Vous avez droit au tarif réduit !";
        } else {
            message = "Vous n'avez pas droit au tarif réduit.";
        }
        
        JOptionPane.showMessageDialog(null, message);
    }
}

