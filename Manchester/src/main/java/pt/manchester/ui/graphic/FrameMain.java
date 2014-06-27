package pt.manchester.ui.graphic;

import java.awt.BorderLayout;
import java.awt.Container;
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

    private DataController controller;
    private Container mainContainer;
    
    // Componentes
    private JMenuBar mainMenuBar;
    private JMenu menuAjuda;
    private JMenuItem menuItemSobre;
    
    // Paineis
    private JPanel panelPrincipal;
    
    private static Font typo = new Font("Verdana", Font.PLAIN, 12);
    
    public FrameMain(DataController controller)
    {
        this(controller, 150, 0, 900, 650);
    }
    
    public FrameMain(DataController controller, int x, int y, int width, int height)
    {
    	// Cabeçalho
        super("Triagem de Manchester");
        this.controller = controller;
        
        mainContainer = getContentPane();
        
        init();
        validate();
        
        setLocation(x,y);
        setSize(width, height);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // READY
        controller.notifyObservers();
    }
    
    protected void init()
    {
        controller.init();
        
        // Zonas

        
        // Observers
        //controller.addObserver(panel);

        
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
    }
    
    protected void registerListeners()
    {
        
    }
    
    @Override
    public void update(Observable t, Object o) {

    }
	
}