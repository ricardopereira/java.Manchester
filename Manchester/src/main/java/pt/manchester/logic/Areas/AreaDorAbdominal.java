package pt.manchester.logic.Areas;					

import java.util.ArrayList;					
					
public class AreaDorAbdominal extends Area { 					
					
	public AreaDorAbdominal() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}			
	
	@Override
	public String getRulesFile() {
		return "RulesDorAbdominal.drl";
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
					
		opcoes.add("Dor severa");			
		opcoes.add("Dor irradiando para a região dorsal");			
		opcoes.add("Hematemeses");
		opcoes.add("Hematoquésias, melenas ou rectorragias");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("Dor com irradiação ao ombro");			
		opcoes.add("Possível gravidez");			
		opcoes.add("Histórias de fezes pretas ou ensaguentadas");
		opcoes.add("Vómitos persistentes");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();								
		
		opcoes.add("Dor");			
		opcoes.add("Vómitos");
		opcoes.add("Problema recente");
		
		setOpcoesVerde(opcoes);			
	}				
}					