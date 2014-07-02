package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaIndisposicaoAdulto extends Area { 					
					
	public AreaIndisposicaoAdulto() { 				
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
		opcoes.add("Convulsão actual");
		opcoes.add("Choque");
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");			
		opcoes.add("Instalação súbita");			
		opcoes.add("História de risco especial de infecção");
		opcoes.add("Alteração do estado de consciência");
		opcoes.add("Sinais de meningismo");
		opcoes.add("Erupção cutânea desconhecida");
		opcoes.add("Púrpura");
		opcoes.add("Muito quente");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor moderada");
		opcoes.add("Instalação súbito");
		opcoes.add("História de viagem a estrangeiro");
		opcoes.add("Exantema eritematoso ou bulhoso");
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