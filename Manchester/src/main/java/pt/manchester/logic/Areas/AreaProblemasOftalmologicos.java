package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaProblemasOftalmologicos extends Area { 					
					
	public AreaProblemasOftalmologicos() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesProblemasOftalmologicos.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Lesão ocular química");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Dor severa");			
		opcoes.add("Traumatismo ocular penetrante");
		opcoes.add("Perda total súbita de visão");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("Acuidade visual reduzida");		
		opcoes.add("História inapropriada");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Olho vermelho");
		opcoes.add("Problema Recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					