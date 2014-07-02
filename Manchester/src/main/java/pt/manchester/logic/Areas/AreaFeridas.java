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
		return "RulesFeridas.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");			
		opcoes.add("Respiração ineficaz");
		opcoes.add("Hemorragia exsanguinante");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor severa");			
		opcoes.add("Grande hemorragia incontrolável");			
		opcoes.add("Compromisso vascular distral");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("História inapropriada");
		opcoes.add("Pequena hemorragia incontrolável");
		opcoes.add("Novos sintomas e/ou sinais neurológicos");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor");
		opcoes.add("Inflamação local");
		opcoes.add("Infecção local");
					
		setOpcoesVerde(opcoes);			
	}				
}					