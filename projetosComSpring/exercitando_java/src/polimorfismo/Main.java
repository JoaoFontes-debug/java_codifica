package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Conta c;
        c = new ContaCorrente();
        c.saldo();

        Conta d;
        d = new ContaPoupanca();
        d.saldo();
    }
}
