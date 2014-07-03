package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaBebeChora extends Area { 					
					
	public AreaBebeChora() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesBebeChora.drl";
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
		opcoes.add("Só responde à voz e à dor ");
		opcoes.add("Erupção cutânea desconhecida");
		opcoes.add("Prostrado");
		opcoes.add("Púrpura");
		opcoes.add("Criança quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");		
		opcoes.add("História de perda de consciência");
		opcoes.add("História inapropriada");
		opcoes.add("Inconsolável pelos pais");
		opcoes.add("Choro ininterrupto e prolongado");
		opcoes.add("Incapaz de se alimentar");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Comportamento estranho");
		opcoes.add("Sub-Febril(Febrícula)");
		opcoes.add("Problema recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					