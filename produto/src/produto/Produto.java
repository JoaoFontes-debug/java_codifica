package produto;

public class Produto {
    String nome;
    double preco;
    int QTD;

    public Produto(String nome, double preco, int QTD){
        this.nome = nome;
        this.preco = preco;
        this.QTD = QTD;
    }

    public void adicionarEstoque(int QTD){
        this.QTD += QTD;
    }

    public void removerEstoque(int QTD){
        if(this.QTD >= QTD){
            this.QTD -= QTD;
        }else{
            System.out.println("Quantidade insuficiente!");
        }

    }
    
    public int consultarEstoque (){
        return this.QTD;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQTD(){
        return this.QTD;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade: " + this.QTD;
    }

}
