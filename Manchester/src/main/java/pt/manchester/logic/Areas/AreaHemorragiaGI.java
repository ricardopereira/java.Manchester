package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaHemorragiaGI extends Area { 					
					
	public AreaHemorragiaGI() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesHemorragiaGI.drl";
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
		opcoes.add("Hematemeses");			
		opcoes.add("Hemtoquésias, melenas ou rectorragias");		
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("História de fezes pretas ou ensanguentadas");
		opcoes.add("História de hematemeses");
		opcoes.add("Vómitos persistentes");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
					
		opcoes.add("Dor");	
		opcoes.add("Vómitos");
					
		setOpcoesVerde(opcoes);			
	}				
}					