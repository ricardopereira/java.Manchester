package pt.manchester.ui.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;

public class PanelBotoes extends PanelBase implements Observer {
	
    public PanelBotoes(PanelBase owner, DataController ctrl) {
        super(owner,ctrl);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setBackground(new Color(219,219,219));
        this.setPreferredSize(new Dimension(300,200));
        this.setMinimumSize(new Dimension(300,200));
        this.setMaximumSize(new Dimension(300,200));
        
        add(new JButton("<"));
        add(new JButton(">"));
    }
    
    @Override
    public void update(Observable o, Object arg) {
        clear();
    }

}
