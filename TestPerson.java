public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Jean", 30, 1.75, 70);
        System.out.println(p);
        System.out.println("IMC=" + p.determineIMC());
        System.out.println(p.significationIMC());
    }
}
