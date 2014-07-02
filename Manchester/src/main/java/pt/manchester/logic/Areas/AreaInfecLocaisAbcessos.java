package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaInfecLocaisAbcessos extends Area { 					
					
	public AreaInfecLocaisAbcessos() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesAreaIndisposicaoAdulto.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");
		opcoes.add("Respiração ineficaz");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor severa");			
		opcoes.add("Enfisema subcutâneo");			
		opcoes.add("Compromisso vascular");
		opcoes.add("Criança quente");
		opcoes.add("Adulto muito quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("Dor nas articulações em movimento");
		opcoes.add("Articulação quente");
		opcoes.add("Quente");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
					
		opcoes.add("Sub-Febril(Febrícula)");	
		opcoes.add("Dor");
		opcoes.add("Problema Recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					