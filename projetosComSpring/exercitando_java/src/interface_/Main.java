package interface_;



public class Main {
    public static void main(String[] args) {

        //duas formas de instanciar
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaInterface contaPoupanca = new ContaPoupanca();

        contaPoupanca.setSaldo(10);
        contaCorrente.setSaldo(15);

        print(contaPoupanca);
        print(contaCorrente);
    }

    private static void print(ContaInterface conta) {
        System.out.println(conta.getSaldo());
        System.out.println(conta.getRendimento());
    }





}
