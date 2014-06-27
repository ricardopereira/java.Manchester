package pt.manchester.ui.graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FrameMain extends JFrame implements Observer {

    private DataController ctrl;
    private Container mainContainer;
    
    // Componentes
    private JMenuBar mainMenuBar;
    private JMenu menuAjuda;
    private JMenuItem menuItemSobre;
    
    // Paineis
    private PanelPrincipal panelPrincipal;
    private PanelInformacao panelInformacao;
    
    private static Font typo = new Font("Verdana", Font.PLAIN, 12);
    
    public FrameMain(DataController ctrl)
    {
        this(ctrl, 150, 0, 900, 650);
    }
    
    public FrameMain(DataController ctrl, int x, int y, int width, int height)
    {
    	// Cabeçalho
        super("Triagem de Manchester");
        this.ctrl = ctrl;
        
        mainContainer = getContentPane();
        
        init();
        validate();
        
        setLocation(x,y);
        setSize(width, height);
        setVisible(true);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // READY
        ctrl.notifyObservers();
    }
    
    protected void init()
    {
        ctrl.init();
        
        // Zonas
        panelPrincipal = new PanelPrincipal(null,ctrl);
        panelInformacao = new PanelInformacao(null,ctrl);
        
        // Observers
        ctrl.addObserver(panelPrincipal);
        ctrl.addObserver(panelInformacao);
        
        // Layout
        createLayout();
        // Listeners
        registerListeners();
    }
    
    protected void createLayout()
    {
        mainMenuBar = new JMenuBar();
        
        menuAjuda = new JMenu("Ajuda");
        menuAjuda.setFont(typo);
        menuAjuda.setMnemonic(KeyEvent.VK_F);

        menuItemSobre = new JMenuItem("Sobre", KeyEvent.VK_G);
        menuItemSobre.setFont(typo);
        menuItemSobre.setMnemonic(KeyEvent.VK_L);
        
        setJMenuBar(mainMenuBar);
        mainMenuBar.add(menuAjuda);
        menuAjuda.add(menuItemSobre);
        
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        
        // Zonas
        cp.add(panelPrincipal,BorderLayout.CENTER);
        cp.add(panelInformacao,BorderLayout.EAST);
    }
    
    protected void registerListeners()
    {
        
    }
    
    @Override
    public void update(Observable t, Object o) {

    }
	
}