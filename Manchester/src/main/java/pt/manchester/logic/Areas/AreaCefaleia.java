package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaCefaleia extends Area { 					
					
	public AreaCefaleia() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}
	
	@Override
	public String getRulesFile() {
		return "RulesCefaleia.drl";
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
		opcoes.add("Início repentino");			
		opcoes.add("Alteração do estado de consciência");			
		opcoes.add("Perda súbita de visão");			
		opcoes.add("Sinais de meningismo");			
		opcoes.add("Erupção cutânea desconhecida");	
		opcoes.add("Púrpura");			
		opcoes.add("Criança quente");
		opcoes.add("Adulto muito quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("História inapropriada");			
		opcoes.add("História de perda de consciência");			
		opcoes.add("Sinais neurológicos focais");			
		opcoes.add("Novos sintomas e/ou sinais neurológicos");			
		opcoes.add("Acuidade visual reduzida");
		opcoes.add("Couro cabeludo doloroso");
		opcoes.add("Quente");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor");			
		opcoes.add("Sub-febril(Febrícula)");			
					
		setOpcoesVerde(opcoes);			
	}				
}					