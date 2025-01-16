package agregacao_composicao;

import agregacao_composicao.Agregacao.Curso;
import agregacao_composicao.Agregacao.Estudante;
import agregacao_composicao.Composicao.Casa;

public class Main {

	public static void main(String[] args) {
			//Tive que criar esta intancia pois ela obtem as outras classes
			Agregacao agregacao = new Agregacao();
			
			Estudante estudante2 = agregacao.new Estudante("kings");
			Estudante estudante3 = agregacao.new Estudante("henry");
			
			Curso curso = agregacao.new Curso("ADS");
			
			curso.adicionarEstudante(estudante3);
			curso.adicionarEstudante(estudante2);
			
			curso.listarEstudantes();
	//--------------------------------------------------------------
			
			
			Composicao composicao = new Composicao();
			
			Casa casa = composicao.new Casa("Gonçalo de Carvalho");
			casa.adicionarSala("Sala de estar");
			casa.adicionarSala("Sala de jantar");
			
			casa.listarSalas();
	}

}
