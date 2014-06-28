package pt.manchester.ui.graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends PanelBase implements Observer {
	
	private JPanel pnlMain;
	private PanelBotoes pnlButtons;
	
    public PanelPrincipal(PanelBase owner, DataController ctrl) {
        super(owner,ctrl);
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        
        pnlMain = new JPanel();
        pnlMain.setBackground(this.getBackground());
        add(pnlMain,BorderLayout.CENTER);
        
        // Teste
        pnlMain.add(new JLabel("Bem-vindo"));
        
        pnlButtons = new PanelBotoes(this,getController());
        add(pnlButtons,BorderLayout.SOUTH);
    }
    
    @Override
    public void clear() {
    	pnlMain.removeAll();
    	pnlMain.validate();
        repaint();
        
    	// Teste
    	//super.clear();
    }
    
    @Override
    public void update(Observable o, Object arg) {
        //clear();
        
        
        validate();
    }

}
