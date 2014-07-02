package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaMordedurasPicadas extends Area { 					
					
	public AreaMordedurasPicadas() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesAreaMordedurasPicadas.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Hemorragia exsanguinante");
		opcoes.add("Estridor");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor severa");			
		opcoes.add("História significativa de alergia");			
		opcoes.add("Dispneia aguda");
		opcoes.add("Broncospasmo");
		opcoes.add("Grande hemorragia incontrolável");
		opcoes.add("Edema da lingua");
		opcoes.add("Edema da face");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("Pequena hemorragia incontrolável");
		opcoes.add("Exantema eritematoso ou bulhoso");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Inflamação local");
		opcoes.add("Infecção local");
		opcoes.add("Problema Recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					