package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaDoencaHematologica extends Area { 					
					
	public AreaDoencaHematologica() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();			
	}			
	
	@Override
	public String getRulesFile() {
		return "RulesDoencaHematologica.drl";
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
		opcoes.add("História hematológica significativa");			
		opcoes.add("Grande hemorragia incontrolável");			
		opcoes.add("Alteração do estado de consciência");			
		opcoes.add("Adulto muito quente");			
		opcoes.add("Criança quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("Pequena hemorragia incontrolável");			
		opcoes.add("Imunosupressão conhecida");			
		opcoes.add("Quente");	
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Sub-Febril(Febrícula)");			
		opcoes.add("Dor");
		
		setOpcoesVerde(opcoes);			
	}				
}					