package pt.manchester.logic.Areas;

import java.util.ArrayList;

import pt.manchester.logic.Opcoes.Opcao;

public abstract class Area {
	
	private ArrayList<Opcao> opcoesVermelhas = new ArrayList<>();
	private ArrayList<Opcao> opcoesLaranja = new ArrayList<>();
	private ArrayList<Opcao> opcoesAmarelo = new ArrayList<>();
	private ArrayList<Opcao> opcoesVerde = new ArrayList<>();
	
	public enum EscalaTriagem {
		etSemEscala,
        etVermelho, //Emergente
        etLaranja, //Muito urgente
        etAmarelo, //Urgente
        etVerde //Pouco urgente
    }
	
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

	public ArrayList<Opcao> getOpcoesVermelhas() {
		return opcoesVermelhas;
	}

	public void setOpcoesVermelhas(ArrayList<Opcao> opcoesVermelhas) {
		this.opcoesVermelhas = opcoesVermelhas;
	}

	public ArrayList<Opcao> getOpcoesLaranja() {
		return opcoesLaranja;
	}

	public void setOpcoesLaranja(ArrayList<Opcao> opcoesLaranja) {
		this.opcoesLaranja = opcoesLaranja;
	}

	public ArrayList<Opcao> getOpcoesAmarelo() {
		return opcoesAmarelo;
	}

	public void setOpcoesAmarelo(ArrayList<Opcao> opcoesAmarelo) {
		this.opcoesAmarelo = opcoesAmarelo;
	}

	public ArrayList<Opcao> getOpcoesVerde() {
		return opcoesVerde;
	}

	public void setOpcoesVerde(ArrayList<Opcao> opcoesVerde) {
		this.opcoesVerde = opcoesVerde;
	}

}
