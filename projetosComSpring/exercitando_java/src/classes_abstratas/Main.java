package classes_abstratas;

public class Main {
    public static void main(String[] args) {
        Conta c;
        c = new ContaCorrenta();
        c.viewValue();
        System.out.println(c.getFee());

        c = new ContaPoupança();
        c.viewValue();
        System.out.println(c.getFee());
    }
}
