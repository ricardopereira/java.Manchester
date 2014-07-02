package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaFeridas extends Area { 					
					
	public AreaFeridas() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesDorToracica.drl";
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
		opcoes.add("Dispneia aguda");			
		opcoes.add("Dor pré-cordial");			
		opcoes.add("Pulso anormal");			
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("Dor pleurítica");
		opcoes.add("Vómitos persistentes");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Vómitos");
		opcoes.add("Problema recente");	
					
		setOpcoesVerde(opcoes);			
	}				
}					