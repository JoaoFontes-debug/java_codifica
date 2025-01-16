package dependencia;

public class Dependencia {
	class Filtro {
		String tipo;
		
		Filtro(String tipo){
			this.tipo = tipo;
		}
	}
	
	
	class Relatorio {
		void gerar(Filtro filtro) {
			System.out.println("Relatorio gerado usando filtro " + filtro.tipo);
		}
	}
	
}
