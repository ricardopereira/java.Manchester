package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaProblemasNasais extends Area { 					
					
	public AreaProblemasNasais() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesProblemasNasais.drl";
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
		opcoes.add("Grande hemorragia incontrolável");
		opcoes.add("Alteração do estado de consciência");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("História significativa");
		opcoes.add("História inapropriada");
		opcoes.add("Pequena hemorragia incontrolável");		
		opcoes.add("Deformação grosseira");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Deformação");
		opcoes.add("Distúrbio hemorrágico");
		opcoes.add("Problema Recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					