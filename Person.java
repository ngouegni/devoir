public class Person {
    private String nom;
    private int age;
    private double taille; // m
    private double poids; // kg

    public Person(String nom, int age, double taille, double poids) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
    }

    public double determineIMC() {
        return poids / (taille * taille);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String significationIMC() {
        double imc = determineIMC();
        if (imc < 18.5) return "Maigreur";
        if (imc <= 24.9) return "Poids normale";
        if (imc <= 29.9) return "Surpoids";
        if (imc <= 34.9) return "Obésité modérée";
        return "Obésité sévère";
    }

    public String toString() {
        return nom + " (" + age + " ans) taille=" + taille + " poids=" + poids;
    }
}
