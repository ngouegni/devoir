package exerice8;

import java.util.Scanner;
public class nombreami {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entrez un nombre:");
        String nombre1=sc.nextLine();
        Scanner scanner= new Scanner(System.in);
        System.out.println("entrez un nombre:");
        String nombre2=scanner.nextLine();


        int sommea =0;
        int sommeb =0;
        for (int i=0; i<nombre1.length();i++){
                char chiffre1=nombre1.charAt(i);
                int chiffre=Character.getNumericValue(chiffre1);
                sommea += chiffre;
                System.out.println("laa somme des chiffres de"+nombre1+ "est:"+  sommea);

            }
        for(int j=0; j<nombre2.length();j++){
            char chiffrec=nombre1.charAt(j);
                int chiffreb=Character.getNumericValue(chiffrec);
                sommea += chiffreb;
                System.out.println("laa somme des chiffres de"+nombre2+ "est:"+  sommeb);
        }
        if (sommea==sommeb){
            System.out.println("ces deux nombres sont amis");
            
        }
        sc.close();
        scanner.close();
        

        // JOptionPane.showMessageDialog(null, resultat);
    }
}


    

