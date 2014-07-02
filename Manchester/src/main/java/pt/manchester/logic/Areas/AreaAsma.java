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
	public String getRulesFile() {
		return "RulesAsma.drl";
	}

	@Override
	protected void preencheVermelho() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Criança não reactiva");
		opcoes.add("Choque");
		
		setOpcoesVermelhas(opcoes);
	}

	@Override
	protected void preencheLaranja() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Incapacidade de articular frases completas");
		opcoes.add("Taquicardia acentuada");
		opcoes.add("PEFR muito baixo");
		opcoes.add("SAO2 muito baixo");
		opcoes.add("Alteração do estado de consciência");
		
		setOpcoesLaranja(opcoes);
	}

	@Override
	protected void preencheAmarelo() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("PEFR baixo");
		opcoes.add("SAO2 baixo");
		opcoes.add("História significativa de asma");
		opcoes.add("Asma sem melhoria com o seu tratamento habitual");
		
		setOpcoesAmarelo(opcoes);
	}

	@Override
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Broncospasmo");
		opcoes.add("Provável infecção respiratória");
		
		setOpcoesVerde(opcoes);
	}

}
