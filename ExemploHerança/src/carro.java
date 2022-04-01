
public class carro  extends veiculo{


	private boolean quatroPortas;
	
	public boolean isQuatroPortas() {
		
		return quatroPortas;
		
	}
	
	public void setQuatroPortas(boolean quatroPortas) {
		
		this.quatroPortas = quatroPortas;
		
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		
		System.out.println("Quatro Portas: " + quatroPortas);
		
	}
	
}
