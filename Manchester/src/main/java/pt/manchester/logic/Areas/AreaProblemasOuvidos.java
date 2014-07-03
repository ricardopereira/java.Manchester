package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaProblemasOuvidos extends Area { 					
					
	public AreaProblemasOuvidos() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesProblemasOuvidos.drl";
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
		opcoes.add("Alteração do estado de consciência");
		opcoes.add("Criança quente");
		opcoes.add("Adulto muito quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("História de T.C.E.");		
		opcoes.add("História inapropriada");
		opcoes.add("Pequena hemorragia incontrolável");
		opcoes.add("Hematoma auricular");
		opcoes.add("Vertigens");
		opcoes.add("Quente");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Sub-Febril(Febrícula)");
		opcoes.add("Perda aguda de audição");
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					