package herancaComInterface;

//INTERFACES TEM APENAS METODOS
interface Motor {
	void ligarMotor();
}

interface Freio{
	void aplicarFreio();
}

class Veiculo {
	private String nrChassi;
}

//IMPLENTAÇAO MAIS COMUM DE FAZER HERANÇA MULTIPLA NO JAVA
class Carro implements Motor, Freio {
	@Override
	public void aplicarFreio() {
		System.out.println("Freiandooo!!!");
	}
	
	@Override
	public void ligarMotor() {
		System.out.println("Motor Ligandooo!!!!");
	}
}
