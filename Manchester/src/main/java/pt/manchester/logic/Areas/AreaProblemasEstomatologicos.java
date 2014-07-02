package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaProblemasEstomatologicos extends Area { 					
					
	public AreaProblemasEstomatologicos() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesProblemasEstomatologicos.drl";
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
		opcoes.add("Grande hemorragia incontrolável");
		opcoes.add("Criança quente");
		opcoes.add("Muito quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("Pequena hemorragia incontrolável");
		opcoes.add("Quente");
		opcoes.add("Avulsão dentária recente");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Sub-Febril(Febrícula)");
		opcoes.add("Edema da face");
		opcoes.add("Problema Recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					