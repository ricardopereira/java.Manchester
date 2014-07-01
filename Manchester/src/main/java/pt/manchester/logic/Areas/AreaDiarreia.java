package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaDiarreia extends Area { 					
					
	public AreaDiarreia() { 				
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
		opcoes.add("Hematemeses");			
		opcoes.add("Hematoquésias, melenas ou rectorragias");			
		opcoes.add("Alteração do estado de consciência");	
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("História significativa de diarreira");			
		opcoes.add("História de fezes pretas ou ensaguentadas");			
		opcoes.add("História de hematemeses");			
		opcoes.add("Sinais de desidratação");			
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