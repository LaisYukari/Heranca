
public class main {
	
	public static void main(String[] args) {
		
		carro carro1 = new carro();
		
		carro1.ano = 2014;
		carro1.setMarca("Volkswagen");
		carro1.setModelo("Polo");
		carro1.setQuatroPortas(true);
		carro1.imprimirDados();
		carro1.buzinar();
		
		System.out.println();
		System.out.println();
		
		
		moto moto1 = new moto();
		
		moto1.setAno(2022);
		moto1.setMarca("Yamaha");
		moto1.setModelo("Fazer 250");
		
		moto1.imprimirDados();
		moto1.empinar();
		moto1.buzinar();
		
		System.out.println();
		System.out.println();
		
		
		caminhao caminhao1 = new caminhao();
		
		caminhao1.setAno(2018);
		caminhao1.setMarca("Scania");
		caminhao1.setModelo("R450");
		
		caminhao1.imprimirDados();
		caminhao1.buzinar();
		
	}
	
}
