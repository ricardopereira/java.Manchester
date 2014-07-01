package pt.manchester.logic.Areas;

import java.util.ArrayList;

public class AreaAsma extends Area {
	
	public AreaAsma(){
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
		setOpcoesVermelhas(opcoes);
	}

	@Override
	protected void preencheLaranja() {
	}

	@Override
	protected void preencheAmarelo() {
	}

	@Override
	protected void preencheVerde() {
	}

}
