import exercicio02.Departamento;
import exercicio02.Disciplina;
import exercicio02.Professor;
import exercicio02.Universidade;

public class Main {
    public static void main(String[] args) {
        Disciplina quimica = new Disciplina(" Quimica ");
        Professor professor = new Professor(" Ana ");
        professor.adicionarDisciplinas(quimica);

        Departamento exatas = new Departamento(" Departamento de Ciencias Exatas ");
        exatas.adicionarProfessor(professor);

        Universidade maisPraTi = new Universidade("Universidade Federal Rural do Rio de Janeiro ");
        maisPraTi.adicionarDepartamentos(exatas);
        System.out.println(maisPraTi);


    }
}