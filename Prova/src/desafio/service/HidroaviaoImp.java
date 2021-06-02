package desafio.service;

import desafio.repository.HidroaviaoRepository;

public abstract class HidroaviaoImp implements HidroaviaoRepository {

	private Boolean ligado;
	private Boolean voando;

	public HidroaviaoImp() {
		this.ligado = false;
		this.voando = false;
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
	public void pousar() {
		if (!this.getVoando() || !this.getLigado()) {
			System.out.println("Hidroavião já pousou.");
		} else {
			System.out.println("Pousando...");
			this.setVoando(false);
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
