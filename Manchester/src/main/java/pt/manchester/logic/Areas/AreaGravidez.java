package pt.manchester.logic.Areas;					
					
import java.util.ArrayList;					
					
public class AreaGravidez extends Area { 					
					
	public AreaGravidez() { 				
		super();			
					
		preencheVermelho();			
		preencheLaranja();			
		preencheAmarelo();			
		preencheVerde();
	}
	
	@Override
	public String getRulesFile() {
		return "RulesGravidez.drl";
	}
					
	@Override				
	protected void preencheVermelho() {				
		ArrayList<String> opcoes = new ArrayList<>();			
							
		opcoes.add("Compromisso da via aérea");			
		opcoes.add("Respiração ineficaz");
		opcoes.add("Hemorragia exsanguinante");
		opcoes.add("Apresentação de segmentos fetais");
		opcoes.add("Prolapso do cordão umbilical");
		opcoes.add("Convulsão actual");
		opcoes.add("Choque");		
					
		setOpcoesVermelhas(opcoes);			
	}				
					
	@Override				
	protected void preencheLaranja() {				
		ArrayList<String> opcoes = new ArrayList<>();			
					
		opcoes.add("Dor severa");			
		opcoes.add("História de convulsão");
		opcoes.add("Parto em curso");			
		opcoes.add("Hemorragia vaginal intensa");
		opcoes.add("Perda sanguínea em gestaão > 24 semanas");
		opcoes.add("Alteração do estado de consciência");
					
		setOpcoesLaranja(opcoes);			
	}				
					
	@Override				
	protected void preencheAmarelo() {				
		ArrayList<String> opcoes = new ArrayList<>();
					
		opcoes.add("Dor moderada");
		opcoes.add("Dor que irradia para o ombro");
		opcoes.add("História inapropriada");
		opcoes.add("História de traumatismo");
		opcoes.add("Pressão arterial elevada");
		opcoes.add("Hemorragia vaginal");
					
		setOpcoesAmarelo(opcoes);			
	}				
					
	@Override				
	protected void preencheVerde() {				
		ArrayList<String> opcoes = new ArrayList<>();
					
		opcoes.add("Dor");
		opcoes.add("Sub-febril (Febrícula)");	
					
		setOpcoesVerde(opcoes);			
	}				
}					