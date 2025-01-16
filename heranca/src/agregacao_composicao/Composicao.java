package agregacao_composicao;

import java.util.ArrayList;
import java.util.List;

//EXEMPLO DE COMPOSIÇÂO
public class Composicao {
	
	class Sala{
		String nome;
		
		public Sala(String nome) {
			this.nome = nome;
		}
	}
	
	
	class Casa {
		String endereco;
		List<Sala> salas;
		
		
		public Casa(String endereco) {
			this.endereco = endereco;
			this.salas = new ArrayList<>();
			
		}
		
		void adicionarSala(String nomeSala) {
			Sala sala = new Sala(nomeSala);
			salas.add(sala);
		}
		
		void listarSalas() {
			for(Sala sala : salas) {
				System.out.println(sala.nome);
			}
		}
	}
}
