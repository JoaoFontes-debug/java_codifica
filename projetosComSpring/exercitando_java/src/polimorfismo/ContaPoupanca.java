package polimorfismo;

public class ContaPoupanca extends Conta {

   @Override
   public void saldo(){
       System.out.println("overrinde em ContaPoupança");
   }
}
