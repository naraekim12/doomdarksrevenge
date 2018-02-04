package Main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

//import GameState.GameStateManager;

//make the menuPanel.
public class MenuPanel extends JPanel implements Runnable{ 
	
	JFrame frame;
	
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
//	private GameStateManager gsm;//Command pattern : abstract class.
	
	//constructor
	public MenuPanel() {
		super();
		//setLayout(new GridBagLayout());
		//this.layout =
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
		frame = (JFrame) SwingUtilities.getWindowAncestor(this);
		//init();
		//gsm = new GameStateManager();
	}
	

	
	private void init() {
			
		running = true;
		setBackground();
		
	}
	private void setBackground() {
		ImageIcon background = new ImageIcon(MenuPanel.class.getResource("/Resource/background/animated_2.gif"));
		JLabel label = new JLabel(new ImageIcon(background.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_DEFAULT)));
//		label.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		frame.setVisible(true);
		Insets a = frame.getInsets();
	}
	
	private void setBtn_Local() {}
	
	private void setBtn_Online() {}
	
	private void setBtn_Setting() {}
	
	private void setBtn_Exit() {}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}