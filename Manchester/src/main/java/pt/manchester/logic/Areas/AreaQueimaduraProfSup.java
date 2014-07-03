package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaQueimaduraProfSup extends Area { 					
					
	public AreaQueimaduraProfSup() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesQueimaduraProfSup.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Criança não reactiva");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Dor severa");
		opcoes.add("Dispneia aguda");
		opcoes.add("Lesão por inalação");		
		opcoes.add("Alteração de estado de consciência");
		opcoes.add("História significativa de incidente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("Inalação de fumos");		
		opcoes.add("Lesão eléctrica");
		opcoes.add("Queimadura química");
		opcoes.add("História inapropriada");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Inflamação local");
		opcoes.add("Infecção local");
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					