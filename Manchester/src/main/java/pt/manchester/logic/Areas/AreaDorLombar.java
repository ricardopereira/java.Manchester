package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaDorLombar extends Area { 					
					
	public AreaDorLombar() { 				
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
		opcoes.add("Dor abdominal");			
		opcoes.add("Criança quente");			
		opcoes.add("Adulto muito quente");	
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("Novos sintomas e/ou sinais neurológicos");			
		opcoes.add("Traumatismo directo da região lombar");			
		opcoes.add("Incapacidade de andar");			
		opcoes.add("Quente");			
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					