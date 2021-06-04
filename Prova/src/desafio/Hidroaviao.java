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
			System.out.println("O motor já está ligado!");
		} else {
			this.setLigado(true);
			System.out.println("Ligando motor.");
		}
	}

	@Override
	public void desligar() {
		if (this.getVoando()) {
			System.out.println("Hidroavião em voo, para maior segurança pouse para desligar!");
		} else if (!this.getLigado()) {
			System.out.println("Motores já estão desligados.");
		} else {
			this.setLigado(false);
			System.out.println("Motores sendo desligado...");
		}
	}

	@Override
	public void navegar() {
		if (!this.getLigado() || this.getVoando()) {
			System.out.println("Verifique se o motor está ligado e/ou o Hidroavião está na água para navegar");
		} else {
			this.setNavegando(true);
		}
	}

	@Override
	public void ancorar() {
		if (!this.getVoando() || !this.getLigado() || this.getAncorarHidro()) {
			System.out.println("Hidroavião já está ancorado.");
		} else {
			System.out.println("Ancorando...");
			this.setVoando(true);
			desligar();
		}
	}

	@Override
	public void pousar() {
		if (!this.getVoando() || !this.getLigado()) {
			System.out.println("Hidroavião já pousou.");
		} else {
			System.out.println("Pousando...");
			this.setVoando(false);
			desligar();
		}
	}

	@Override
	public void levantarVoo() {
		if (this.getVoando()) {
			System.out.println("Hidroavião já decolou.");
		} else if (!this.getLigado()) {
			System.out.println("Hidroavião está desligado.");
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
