package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaPaisPreocupados extends Area { 					
					
	public AreaPaisPreocupados() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesPaisPreocupados.drl";
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
					
		opcoes.add("Prostrado");			
		opcoes.add("Dor severa");			
		opcoes.add("Só responde à voz ou à dor");
		opcoes.add("Sem resposta aos estímulos dos pais");
		opcoes.add("História de sobredosagem ou envenamento");
		opcoes.add("Erupção cutânea desconhecida");
		opcoes.add("Púrpura");
		opcoes.add("Criança quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("Choro prolongado ininterrupto");
		opcoes.add("Inconsolável pelos pais");
		opcoes.add("História inapropriada");
		opcoes.add("Não urina");
		opcoes.add("Não se alimenta");
					
		setOpcoesAmarelo(opcoes);
	}				
					
	@Override				
	protected void preencheVerde() {
		ArrayList<String> opcoes = new ArrayList<>();
								
		opcoes.add("Dor");
		opcoes.add("Sub-Febril(Febrícula)");
		opcoes.add("Comportamento estranho");
		opcoes.add("Problema Recente");
					
		setOpcoesVerde(opcoes);			
	}				
}					