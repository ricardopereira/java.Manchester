package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaDiabetes extends Area { 					
					
	public AreaDiabetes() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}
	
	@Override
	public String getRulesFile() {
		return "RulesDiabetes.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
								
		opcoes.add("Compromisso da via aérea");			
		opcoes.add("Respiração ineficaz");			
		opcoes.add("Criança não reactiva");			
		opcoes.add("Hipoglicémia");			
		opcoes.add("Choque");			
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Hiperglicemia com cetose");			
		opcoes.add("Alteração do estado de consciência");			
		opcoes.add("Criança quente");			
		opcoes.add("Adulto muito quente");		
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Hiperglicemia");			
		opcoes.add("Vómitos persistentes");			
		opcoes.add("Quente");		
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Sub-febril(Febrícula)");			
		opcoes.add("Vómitos");			
		opcoes.add("Problema recente");		
					
		setOpcoesVerde(opcoes);			
	}				
}					