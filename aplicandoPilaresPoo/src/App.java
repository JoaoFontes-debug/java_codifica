package src;

import src.exercicio01.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Exercicio01.Produto> produtoList = new ArrayList<>();

        produtoList.add(new Exercicio01.Produto("Desinfetante", 5.00));
    }
}
