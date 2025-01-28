package relacionamento_entre_classes;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String nome;

    private List<Contato> contatos;

    public Agenda(String nome){
        this.contatos = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.getNome());
    }

    public void removerContato(String nome){
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
        System.out.println("Contato removido: " + nome);
    }

    public void listarContatos(){
        if(contatos.isEmpty()){
            System.out.println("Nenhum contato na agenda");
        }else{
            System.out.println("Lista de contatos: ");
            for (Contato contato : contatos){
                System.out.println(" \nNome: " + contato.getNome() +
                                   " \nTelefone: " + contato.getTelefone() +
                                   " \nEmail: " + contato.getEmail() );
            }
        }

    }


}
