package pt.manchester.ui.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class PanelInformacao extends PanelBase implements Observer {
	
    public PanelInformacao(PanelBase owner, DataController ctrl) {
        super(owner,ctrl);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setBackground(new Color(219,219,219));
        this.setPreferredSize(new Dimension(300,500));
        this.setMinimumSize(new Dimension(300,500));
        this.setMaximumSize(new Dimension(300,500));
    }
    
    @Override
    public void update(Observable o, Object arg) {
        clear();
        
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        if (getTriagem().getEstadoActual() == null) {
        	// Mostra histórico
        	for (int i = 0; i < getController().getHistorico().size(); i++) {
        		this.add(new JLabel(getController().getHistorico().get(i)));
			}
        	validate();
            return;
        }
        
        this.add(new JLabel(getTriagem().getEstadoActual().getClass().getSimpleName()));
        validate();
    }

}
