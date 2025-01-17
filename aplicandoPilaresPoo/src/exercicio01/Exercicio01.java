package src.exercicio01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercicio01 {
    public static class Produto {
        String nome;
        double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public double calcularPrecoFinal() {
            return preco;
        }

        @Override
        public String toString() {
            return nome + " - Preço Final: R$ " + calcularPrecoFinal();

        }
    }

    class ProdutoPerecivel extends Produto {
        LocalDate dataValidade;

        public ProdutoPerecivel(String nome, double preco, LocalDate dataValidade) {
            super(nome, preco);
            this.dataValidade = dataValidade;

        }

        @Override
        public double calcularPrecoFinal() {
            LocalDate hoje = LocalDate.now();
            long diasParaVencer = ChronoUnit.DAYS.between(hoje, dataValidade);
            if (diasParaVencer <= 5) {
                return preco * 0.9;
            }

            return preco;
        }

        @java.lang.Override
        public String toString() {
            return super.toString() + "(Produto Perecivel, Vence em: " + dataValidade + ")";
        }
    }


}
