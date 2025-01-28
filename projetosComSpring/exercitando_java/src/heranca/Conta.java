package heranca;

public class Conta {

    private String valor;

    public Conta (String valor){
        this.valor = valor;
    }

    public void view(){
        System.out.println(this.valor);
    }
}
