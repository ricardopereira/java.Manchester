package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaConvulsoes extends Area { 					
					
	public AreaConvulsoes() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}
	
	@Override
	public String getRulesFile() {
		return "RulesConvulsoes.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Compromisso da via aérea");			
		opcoes.add("Respiração ineficaz");			
		opcoes.add("Criança não reactiva");			
		opcoes.add("Convulsão actual");			
		opcoes.add("Choque");			
		opcoes.add("Hipoglicémia");			
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Alteração do estado de consciência");			
		opcoes.add("História de sobredosagem ou envenenamento");			
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
					
		opcoes.add("História de T.C.E.");			
		opcoes.add("História inapropriada");			
		opcoes.add("Sinais neurológicos focais");			
		opcoes.add("Novos sintomas e/ou sinais neurológicos");			
		opcoes.add("Quente");		
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor");			
		opcoes.add("Sub-febril(Febrícula)");			
		opcoes.add("Cefaleias");		
					
		setOpcoesVerde(opcoes);			
	}				
}					