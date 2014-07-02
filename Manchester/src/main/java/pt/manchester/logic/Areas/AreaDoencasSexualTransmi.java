package pt.manchester.logic.Areas;					

import java.util.ArrayList;					
					
public class AreaDoencasSexualTransmi extends Area { 					
					
	public AreaDoencasSexualTransmi() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}			
	
	@Override
	public String getRulesFile() {
		return "RulesDoencasSexualTransmi.drl";
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
		opcoes.add("Alteração do estado de consciência");			
		opcoes.add("Erupção cutânea desconhecida");
		opcoes.add("Púrpura");
		opcoes.add("Muito quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("Dor testicular");			
		opcoes.add("Imunosupressão conhecida");			
		opcoes.add("Exantema eritematoso ou bulhoso");
		opcoes.add("Quente");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();								
		
		opcoes.add("Dor");			
		opcoes.add("Sub-febril(Febrículo)");
		
		setOpcoesVerde(opcoes);			
	}				
}					