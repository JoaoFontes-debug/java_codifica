package classes_abstratas;

public class ContaCorrenta extends Conta{
    @Override
    int getFee() {
        return this.total * 2;
    }
}
