package pt.manchester.logic.Areas;

import java.util.ArrayList;

public class AreaDorGarganta extends Area {
	
	public AreaDorGarganta(){
		super();
		
		preencheVermelho();
		preencheLaranja();
		preencheAmarelo();
		preencheVerde();
	}

	@Override
	protected void preencheVermelho() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Baba-se");
		opcoes.add("Estridor");
		opcoes.add("Choque");
		
		setOpcoesVermelhas(opcoes);
	}

	@Override
	protected void preencheLaranja() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Dor severa");
		opcoes.add("Alteração do estado de consciência");
		opcoes.add("Adulto muito quente");
		opcoes.add("Criança quente");
		
		setOpcoesLaranja(opcoes);
	}

	@Override
	protected void preencheAmarelo() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Dor moderada");
		opcoes.add("Adulto quente");
		opcoes.add("História de viagens ao estrangeiro");
		opcoes.add("Instalação súbita");
		
		setOpcoesAmarelo(opcoes);
	}

	@Override
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Dor");
		opcoes.add("Sub-febril(Febrícula)");
		
		setOpcoesVerde(opcoes);
	}

}
