package desafio;

public abstract class HidroaviaoImp implements Hidroaviao {

	private Boolean ligado;
	private Boolean voando;

	public HidroaviaoImp() {
		this.ligado = false;
		this.voando = false;
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
	public void pousar() {
		if (!this.getVoando() || !this.getLigado()) {
			System.out.println("Hidroavi�o j� pousou.");
		} else {
			System.out.println("Pousando...");
			this.setVoando(false);
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
	

	public Boolean getLigado() {
		return ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public Boolean getVoando() {
		return voando;
	}

	public void setVoando(Boolean voando) {
		this.voando = voando;
	}

}
