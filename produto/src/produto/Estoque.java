package produto;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Estoque {

    private static final Logger logger = Logger.getLogger(Estoque.class.getName());
    
    ArrayList<Produto> produtos;

    public Estoque(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public Produto buscarProduto(String nome){
        for(Produto produto : produtos){
            if(produto.getNome().equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }

    public void removerProduto(String nome){
        Produto produto = buscarProduto(nome);
        if(produto != null){
            logger.warning("Produto não encontrado!");
        }else{
            System.out.println("Produto não encontrado!");
        }
    }

    public void listarProdutos() {
        if(produtos.isEmpty()){
            logger.info("Estoque vazio!");
            System.out.println("Estoque vazio!");
        }else{
            for(Produto produto : produtos){
                System.out.println(produto);
            }
        }
    }
}
