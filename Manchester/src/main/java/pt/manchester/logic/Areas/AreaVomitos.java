package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaVomitos extends Area { 					
					
	public AreaVomitos() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesVomitos.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Criança não reactiva");
		opcoes.add("Convulsão actual");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Dor severa");
		opcoes.add("Hematemeses");
		opcoes.add("Hematoquesias, melenas ou rectorragias");
		opcoes.add("Alteração do estado de consciência");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("História de hematemeses");
		opcoes.add("Sinais de desidratação");
		opcoes.add("Vómitos persistentes");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					