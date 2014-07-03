package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaProblemasMembros extends Area { 					
					
	public AreaProblemasMembros() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesProblemasMembros.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Hemorragia exsanguinante");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Dor severa");			
		opcoes.add("Compromisso vascular");
		opcoes.add("Grande hemorragia incontrolável");
		opcoes.add("Pele crítica");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("História inapropriada");		
		opcoes.add("Pequena hemorragia incontrolável");		
		opcoes.add("Deformação grosseira");
		opcoes.add("Fractura exposta");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Deformação");
		opcoes.add("Edema");
		opcoes.add("Lesão Recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					