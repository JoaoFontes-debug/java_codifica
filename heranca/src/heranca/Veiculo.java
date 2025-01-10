package heranca;

//SUPER CLASSE DA CLASSE CARRO
class Veiculo {
	String marca;
	
	void buzinar() {
		System.out.println("Buzinando");
	}
}

//CLASSE EXEMPLO DE HERANÇA
class Carro extends Veiculo {
	int numeroDePortas;
	
	void mostrarDetalhes() {
		System.out.println("Marca " + marca);
		System.out.println("Numero de Portas " + numeroDePortas);
	}
	
	//EXEMPLO DE POLIMORFISMO NO METODO
	@Override 
	void buzinar () {
		System.out.println("Carro buzinando!!");
	}
	
}

class Main {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.marca = "Nissan";
		carro.numeroDePortas = 4;
		
		carro.buzinar();
		carro.mostrarDetalhes();
		
		
	}
}

