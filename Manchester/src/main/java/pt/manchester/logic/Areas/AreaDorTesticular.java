package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaDorTesticular extends Area { 					
					
	public AreaDorTesticular() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
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
		opcoes.add("Criança quente");			
		opcoes.add("Adulto muito quente");			
		opcoes.add("Idade < 25 anos");	
		opcoes.add("Gangrena escrotal");	
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("Cólica");			
		opcoes.add("Quente");
		opcoes.add("Celulite escrotal");
		opcoes.add("Vómitos persistentes");			
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Vómitos");
		opcoes.add("Traumatismo escrotal");
		opcoes.add("Problema recente");
			
		setOpcoesVerde(opcoes);			
	}				
}					