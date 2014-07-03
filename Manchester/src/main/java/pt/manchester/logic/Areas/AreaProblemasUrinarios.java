package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaProblemasUrinarios extends Area { 					
					
	public AreaProblemasUrinarios() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesProblemasUrinarios.drl";
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
		opcoes.add("Priapismo");
		opcoes.add("Adulto muito quente");
		opcoes.add("Criança quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("Cólica");		
		opcoes.add("Hematúria franca");
		opcoes.add("Retenção urinária");
		opcoes.add("Vómitos persistentes");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Vómitos");
		opcoes.add("Edema");
		opcoes.add("Disúria");
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					