package produto;

import produto.Estoque;
import produto.Produto;


public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto01 = new Produto("Arroz", 10.0, 100); 
        Produto produto02 = new Produto("Feijão", 8.0, 50);
        Produto produto03 = new Produto("Macarrão", 5.0,80);    

        estoque.listarProdutos();

        estoque.adicionarProduto(produto01);
        estoque.adicionarProduto(produto02);
        estoque.adicionarProduto(produto03);

        estoque.listarProdutos();

    }
}