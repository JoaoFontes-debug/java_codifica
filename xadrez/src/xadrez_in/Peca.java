package xadrez_in;

public abstract class Peca {
    String cor;
    int linha;
    int coluna;

    public Peca(String cor, int linha, int coluna){
        this.cor = cor;
        this.linha = linha;
        this.coluna= coluna;
    }

    public abstract boolean mover(int novaLinha, int novaColuna);
}
