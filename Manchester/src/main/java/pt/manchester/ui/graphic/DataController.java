package pt.manchester.ui.graphic;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import pt.manchester.logic.Triagem;

public class DataController extends Observable {
	
	private Triagem triagem;
	
	private List<String> historico = new ArrayList<>();

	public List<String> getHistorico() {
		return historico;
	}

	public DataController(Triagem triagem) {
		this.triagem = triagem;
	}
	
	protected void init() {
        reinit();
    }
    
    protected void reinit() {
        // Iniciar estado
        //triagem.
    	
    	// Dados de teste
    	historico.add("2014-06-12 - Mário Silva: Amarelo");
    	historico.add("2014-06-12 - G. Serrano: Verde");
    	historico.add("2014-06-12 - G. Serrano: Vermelho");
    	historico.add("2014-06-13 - Ricardo Pereira: Verde");
    	historico.add("2014-07-11 - Danilo. D: Verde");
    	
        // Novos dados
        setChanged();
    }
    
    public void update() {
        setChanged();
        notifyObservers();
    }
    
	public Triagem getTriagem() {
		return triagem;
	}
	
}