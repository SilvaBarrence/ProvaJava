package desafio;

public abstract class Transporte {

	private Boolean ligado;

	public Transporte() {
		this.ligado = false;
		
	}

	public abstract void ligar();
	
	public abstract void desligar();


	public Boolean getLigado() {
		return ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

}
