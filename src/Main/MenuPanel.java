package Main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

import GameState.GameStateManager;

//make the menuPanel.
public class MenuPanel extends JPanel implements Runnable{  
	
	//Panel for menu
	//private final JPanel MENUPANEL new JPanel();
	
	// dimensions
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final int SCALE = 2;
	
	// game thread
	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime = 1000 / FPS;
	
	// game state manager
	private GameStateManager gsm;//Command pattern : abstract class.
	
	//constructor
	public MenuPanel() {
		super();
		//setLayout(new GridBagLayout());
		//this.layout =
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
		//init();
		//gsm = new GameStateManager();
	}
	

	
	private void init() {

		running = true;
		
		
	}
	private void setBackground() {}
	private void setBtn_Local() {}
	private void setBtn_Online() {}
	private void setBtn_Setting() {}
	private void setBtn_Exit() {}
	
}