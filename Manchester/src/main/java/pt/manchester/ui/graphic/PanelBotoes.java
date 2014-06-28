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
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setBackground(new Color(198,131,171));
        this.setPreferredSize(new Dimension(300,38));
        this.setMinimumSize(new Dimension(300,38));
        this.setMaximumSize(new Dimension(300,38));
        
        add(new JButton("< anterior"));
        add(new JButton("seguinte >"));
    }
    
    @Override
    public void update(Observable o, Object arg) {
        clear();
    }

}
