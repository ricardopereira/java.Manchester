package pt.manchester.logic.Areas;

import java.util.ArrayList;

import pt.manchester.logic.Opcoes.*;

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
		ArrayList<Opcao> opcoes = new ArrayList<>();
		
		opcoes.add(new OpcaoCompViaAerea());
		opcoes.add(new OpcaoRespIneficaz());
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
