package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaComportamentoEstranho extends Area { 					
					
	public AreaComportamentoEstranho() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesComportamentoEstranho.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Hipoglicémia");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Alteração do estado de consciência");
		opcoes.add("História de sobredosagem ou envenenamento");
		opcoes.add("Alto risco de agressão a terceiros");
		opcoes.add("Alto risco de auto-agressão ");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("T.C.E.");		
		opcoes.add("Risco moderado de agressão a terceiros");
		opcoes.add("Risco moderado de auto-agressão");
		opcoes.add("História de perda de consciência");
		opcoes.add("Novos sinais e/ou sinais neurológicos");
		opcoes.add("Sinais neurológicos focais");
		opcoes.add("História psiquiátrica significa");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
							
					
		setOpcoesVerde(opcoes);			
	}				
}					