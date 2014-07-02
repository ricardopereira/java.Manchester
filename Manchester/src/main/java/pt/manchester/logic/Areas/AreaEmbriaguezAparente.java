package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaEmbriaguezAparente extends Area { 					
					
	public AreaEmbriaguezAparente() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesEmbriaguezAparente.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");			
		opcoes.add("Respiração ineficaz");	
		opcoes.add("Criança não reactiva");
		opcoes.add("Convulsão actual");
		opcoes.add("Hipoglicémia");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Alteração do estado de consciência não completamente atribuível ao álcool");			
		opcoes.add("História inadequada");			
		opcoes.add("Hipotermia");			
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Alteração do estado de consciência totalmente atribuível ao álcool");
		opcoes.add("História de perda de consciência");
		opcoes.add("História inapropriada");
		opcoes.add("T.C.E.");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor");
		opcoes.add("Traumatismo recente");	
					
		setOpcoesVerde(opcoes);			
	}				
}					