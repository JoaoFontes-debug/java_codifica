package dependencia;

import dependencia.Dependencia.Filtro;
import dependencia.Dependencia.Relatorio;

public class Main {

	public static void main(String[] args) {
		Dependencia dependencia = new Dependencia();
		
		Filtro filtro = dependencia.new Filtro("Data");
		Relatorio relatorio = dependencia.new Relatorio();
		
		relatorio.gerar(filtro);

	}

}
