package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaHemorragiaVaginal extends Area { 					
					
	public AreaHemorragiaVaginal() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesHemorragiaVaginal.drl";
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
		opcoes.add("Hemorragia vaginal");			
		opcoes.add(">24 semanas de gestação");		
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("Traumatismo vaginal");
		opcoes.add("História inapropriada");
		opcoes.add("Possibilidade de gravidez");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
					
		opcoes.add("Dor");	
		opcoes.add("Menstruação normal");
					
		setOpcoesVerde(opcoes);			
	}				
}					