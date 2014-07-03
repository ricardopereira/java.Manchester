package pt.manchester.logic.Areas;					

import java.util.ArrayList;					
					
public class AreaSobredosagemEnvenenamento extends Area { 					
					
	public AreaSobredosagemEnvenenamento() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesSobredosagemEnvenenamento.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Criança não reactiva");
		opcoes.add("Convulsão actual");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
										
		opcoes.add("Alteração de estado de consciência");
		opcoes.add("Alta mortalidade");
		opcoes.add("Alto risco de nova auto-agressão");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Mortalidade moderada");		
		opcoes.add("Risco moderado de auto agressão");		
		opcoes.add("História inapropriada");
		opcoes.add("Angústia inapropriada");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();							
					
		setOpcoesVerde(opcoes);			
	}				
}					