import heranca.ContaCorrente;
import heranca.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca("mudei o valor ");
        ContaCorrente contaCorrente = new ContaCorrente("mudei aqui tambem");

        contaPoupanca.view();
        contaCorrente.view();

    }
}