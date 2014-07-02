package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaCriancaDifLoc extends Area { 					
					
	public AreaCriancaDifLoc() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}
	
	@Override
	public String getRulesFile() {
		return "RulesCriancaDifLoc.drl";
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
		opcoes.add("Compromisso vascular");			
		opcoes.add("Erupção cutânea desconhecida");			
		opcoes.add("Púrpura");			
		opcoes.add("Criança quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("Dor nas articulações em movimento");			
		opcoes.add("Incapacidade de suportar peso");			
		opcoes.add("História inapropriada");			
		opcoes.add("Articulação quente");	
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor");			
		opcoes.add("Sub-febril(Febrícula)");			
		opcoes.add("Problema recente");		
					
		setOpcoesVerde(opcoes);			
	}				
}					