package pt.manchester.ui.graphic;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;

import pt.manchester.logic.*;

public class PanelBase extends JPanel {
	
    final private DataController ctrl;
    private PanelBase owner;
    
    public PanelBase(PanelBase owner, DataController ctrl) {
        this.ctrl = ctrl;
        this.owner = owner;
    }

    public DataController getController() {
        return ctrl;
    }
    
    public PanelBase getOwner() {
        return owner;
    }
    
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        for (Component component : getComponents())
            component.setEnabled(enabled);
    }
    
    public void showThis(PanelBase panel) {
        panel.setBackground(this.getBackground());
        add(panel, BorderLayout.CENTER);
        validate();
    }
    
    public void clear() {
        removeAll();
        validate();
        repaint();
    }
    
	public Triagem getTriagem() {
		return ctrl.getTriagem();
	}

}
