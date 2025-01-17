package exercicio02;

public class Disciplina {
    String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
