package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaQueda extends Area { 					
					
	public AreaQueda() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesQueda.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Convulsão actual");
		opcoes.add("Hipoglicemia");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Dor severa");
		opcoes.add("Mecanismo de lesão");
		opcoes.add("História significativa de incidente");
		opcoes.add("Pulso anormal");
		opcoes.add("Grande hemorragia incontrolável");
		opcoes.add("Alteração de estado de consciência");
		opcoes.add("Hipotermia");
		opcoes.add("Compromisso vascular");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("História inapropriada");		
		opcoes.add("Pequena hemorragia incontrolável");
		opcoes.add("História de perda de consciência");
		opcoes.add("Sinais neurológicos focais");
		opcoes.add("Novos sintomas e/ou sinais neurológicos");	
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
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					