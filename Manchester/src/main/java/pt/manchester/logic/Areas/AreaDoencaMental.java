package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaDoencaMental extends Area { 					
					
	public AreaDoencaMental() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}			
	
	@Override
	public String getRulesFile() {
		return "RulesDoencaMental.drl";
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
					
		opcoes.add("Alteração do estado de consciência");			
		opcoes.add("Alto risco de agressão a terceiros");			
		opcoes.add("Alto risco de auto-agressão");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Risco moderado de agressão a terceiros");			
		opcoes.add("Risco moderado de auto-agressão");			
		opcoes.add("História psiquiátrica significada");			
		opcoes.add("Comportamento disruptivo");
		opcoes.add("Angústia marcada");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();								
					
		setOpcoesVerde(opcoes);			
	}				
}					