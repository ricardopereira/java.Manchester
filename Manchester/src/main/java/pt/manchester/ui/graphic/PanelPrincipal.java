package pt.manchester.ui.graphic;

import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class PanelPrincipal extends PanelBase implements Observer {
	
    public PanelPrincipal(PanelBase owner, DataController ctrl) {
        super(owner,ctrl);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        clear();
        
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        this.add(new JLabel("Bem-vindo"));
        validate();
    }

}
