package pt.manchester.logic.Areas;		
		
import java.util.ArrayList;		
		
public class AreaAgressao extends Area { 		
		
	public AreaAgressao() { 	
		super();
		
		preencheVermelho();
		preencheLaranja();
		preencheAmarelo();
		preencheVerde();
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
		opcoes.add("Mecanismo de lesão");
		opcoes.add("Dispneia aguda");
		opcoes.add("Grande Hemorragia incontrolável");
		opcoes.add("Alteração do estado de consciência");
		
		setOpcoesLaranja(opcoes);
	}	
		
	@Override	
	protected void preencheAmarelo() {	
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Dor moderada");
		opcoes.add("Pequena hemorragia incontrolável");
		opcoes.add("História de perda de consciência");
		opcoes.add("Novos sinais e/ou sinais neurológicos ");

		setOpcoesAmarelo(opcoes);
	}	
		
	@Override	
	protected void preencheVerde() {	
		ArrayList<String> opcoes = new ArrayList<>();
		
		opcoes.add("Dor");
		opcoes.add("Edema");
		opcoes.add("Deformação");

		setOpcoesVerde(opcoes);
	}	
}		