package pt.manchester.logic.Areas;

import java.util.ArrayList;

import pt.manchester.logic.EscalaTriagem;

public abstract class Area {
	
	private ArrayList<String> opcoesVermelhas = new ArrayList<>();
	private ArrayList<String> opcoesLaranja = new ArrayList<>();
	private ArrayList<String> opcoesAmarelo = new ArrayList<>();
	private ArrayList<String> opcoesVerde = new ArrayList<>();
	
	EscalaTriagem escalaActual;

	public Area() {
		escalaActual = EscalaTriagem.etSemEscala;
	}
	
	public EscalaTriagem getEscalaActual() {
		return escalaActual;
	}

	public void setEscalaActual(EscalaTriagem escalaActual) {
		this.escalaActual = escalaActual;
	}
	
	protected abstract void preencheVermelho();
	protected abstract void preencheLaranja();
	protected abstract void preencheAmarelo();
	protected abstract void preencheVerde();

	public ArrayList<String> getOpcoesVermelhas() {
		return opcoesVermelhas;
	}

	public void setOpcoesVermelhas(ArrayList<String> opcoesVermelhas) {
		this.opcoesVermelhas = opcoesVermelhas;
	}

	public ArrayList<String> getOpcoesLaranja() {
		return opcoesLaranja;
	}

	public void setOpcoesLaranja(ArrayList<String> opcoesLaranja) {
		this.opcoesLaranja = opcoesLaranja;
	}

	public ArrayList<String> getOpcoesAmarelo() {
		return opcoesAmarelo;
	}

	public void setOpcoesAmarelo(ArrayList<String> opcoesAmarelo) {
		this.opcoesAmarelo = opcoesAmarelo;
	}

	public ArrayList<String> getOpcoesVerde() {
		return opcoesVerde;
	}

	public void setOpcoesVerde(ArrayList<String> opcoesVerde) {
		this.opcoesVerde = opcoesVerde;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+": "+getEscalaActual().toString();
	}

}
