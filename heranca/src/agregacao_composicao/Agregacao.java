package agregacao_composicao;

import java.util.ArrayList;
import java.util.List;

//EXEMPLO DE AGREGAÇÂO - relação 1 para N, porem fraca.
public class Agregacao {
	
	class Estudante{
		String nome;
		
		Estudante (String nome){
			this.nome = nome;
		}
	}
	
	
	class Curso {
		String nomeCurso;
		List<Estudante> estudantes;
		
		Curso(String nomeCurso){
			this.nomeCurso = nomeCurso;
			this.estudantes = new ArrayList<>();
			
		}
		
		void adicionarEstudante(Estudante estudante){
			estudantes.add(estudante);
		}
		
		void listarEstudantes() {
			for(Estudante estudante: estudantes) {
				System.out.println(estudante.nome);
			}
		}
	}
	
		
}
