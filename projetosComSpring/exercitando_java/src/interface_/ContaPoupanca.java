package interface_;

public class ContaPoupanca implements ContaInterface {
    private Integer saldo;

    @Override
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public Integer getSaldo() {
        return this.saldo;
    }

    @Override
    public Integer getRendimento() {
        return this.saldo * 5;
    }
}
