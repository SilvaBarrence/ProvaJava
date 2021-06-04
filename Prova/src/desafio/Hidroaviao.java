package desafio;

public class Hidroaviao extends Transporte implements Aviao, Barco {

	private Boolean voando;
	private Boolean navegando;
	private Boolean ancorarHidro;

	public Hidroaviao() {
		this.navegando = false;
		this.voando = false;
		this.ancorarHidro = false;
	}

	@Override
	public void ligar() {
		if (this.getLigado()) {
			System.out.println("O motor j� est� ligado!");
		} else {
			this.setLigado(true);
			System.out.println("Ligando motor.");
		}
	}

	@Override
	public void desligar() {
		if (this.getVoando()) {
			System.out.println("Hidroavi�o em voo, para maior seguran�a pouse para desligar!");
		} else if (!this.getLigado()) {
			System.out.println("Motores j� est�o desligados.");
		} else {
			this.setLigado(false);
			System.out.println("Motores sendo desligado...");
		}
	}

	@Override
	public void navegar() {
		if (!this.getLigado() || this.getVoando()) {
			System.out.println("Verifique se o motor est� ligado e/ou o Hidroavi�o est� na �gua para navegar");
		} else {
			this.setNavegando(true);
		}
	}

	@Override
	public void ancorar() {
		if (!this.getVoando() || !this.getLigado() || this.getAncorarHidro()) {
			System.out.println("Hidroavi�o j� est� ancorado.");
		} else {
			System.out.println("Ancorando...");
			this.setVoando(true);
			desligar();
		}
	}

	@Override
	public void pousar() {
		if (!this.getVoando() || !this.getLigado()) {
			System.out.println("Hidroavi�o j� pousou.");
		} else {
			System.out.println("Pousando...");
			this.setVoando(false);
			desligar();
		}
	}

	@Override
	public void levantarVoo() {
		if (this.getVoando()) {
			System.out.println("Hidroavi�o j� decolou.");
		} else if (!this.getLigado()) {
			System.out.println("Hidroavi�o est� desligado.");
		} else {
			this.setVoando(true);
			System.out.println("Levantando voo!");
		}
	}

	public Boolean getVoando() {
		return voando;
	}

	public void setVoando(Boolean voando) {
		this.voando = voando;
	}

	public Boolean getNavegando() {
		return navegando;
	}

	public void setNavegando(Boolean navegando) {
		this.navegando = navegando;
	}

	public Boolean getAncorarHidro() {
		return ancorarHidro;
	}

	public void setAncorarHidro(Boolean ancorarHidro) {
		this.ancorarHidro = ancorarHidro;
	}
}
