package classes_abstratas;

public class ContaPoupança extends Conta {
    @Override
    public int getFee() {
        return this.total * 3;
    }
}
