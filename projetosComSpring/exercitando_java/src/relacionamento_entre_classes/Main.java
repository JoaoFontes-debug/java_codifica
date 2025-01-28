package relacionamento_entre_classes;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Debora de Oliveira Silva","7199999-9999","del@gmail.com");
        System.out.println(contato.getNome());

        Agenda agenda = new Agenda("favoritos");
        agenda.adicionarContato(contato);
        agenda.listarContatos();
    }


}
