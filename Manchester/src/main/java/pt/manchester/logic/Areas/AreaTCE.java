package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaTCE extends Area { 					
					
	public AreaTCE() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesTCE.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Hemorragia exsanguinante");
		opcoes.add("Criança não reactiva");
		opcoes.add("Convulsão actual");
		opcoes.add("Hipoglicemia");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Dor severa");
		opcoes.add("Mecanismos de lesão");
		opcoes.add("Lesão por inalação");		
		opcoes.add("História significativa de incidente");
		opcoes.add("Grande hemorragia incontrolável");
		opcoes.add("Alteração do estado de consciência");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("História de perda de consciência");
		opcoes.add("História inapropriada");
		opcoes.add("Pequena hemorragia incontrolável");
		opcoes.add("Sinais neurológicos focais");
		opcoes.add("Novos sintomas e/ou sinais neurológicas");
		opcoes.add("Vómitos persistentes");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Cefaleia");
		opcoes.add("Hematoma do couro cabeludo");
		opcoes.add("Vómitos");
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					