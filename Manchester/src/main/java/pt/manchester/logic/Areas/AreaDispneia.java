package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaDispneia extends Area { 					
					
	public AreaDispneia() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}			
	
	@Override
	public String getRulesFile() {
		return "RulesDispneia.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();	
					
		opcoes.add("Compromisso da via aérea");			
		opcoes.add("Respiração ineficaz");			
		opcoes.add("Choque");		
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor pré-cordial");			
		opcoes.add("Início agudo pós-traumático");			
		opcoes.add("Incapidade de articular frases completas");			
		opcoes.add("PEFR muito baixo");			
		opcoes.add("SAO2 muito baixo");			
		opcoes.add("Pulso anormal");
		opcoes.add("Alteração do estado de consciência");			
		opcoes.add("Exaustão");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor pleurítica");			
		opcoes.add("História significativa de asma");			
		opcoes.add("PEFR baixo");			
		opcoes.add("SAO2 baixo");	
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor");			
		opcoes.add("Broncopasmo");			
		opcoes.add("Provável infecção respiratória");			
		opcoes.add("Traumatismo torácico");	
					
		setOpcoesVerde(opcoes);			
	}				
}					