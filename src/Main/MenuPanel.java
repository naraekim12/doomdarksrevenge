package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//import GameState.GameStateManager;

//make the menuPanel.
public class MenuPanel extends JPanel implements Runnable{ 
	
	JFrame frame;
	
	//Panel for btn
	private JPanel btnPanel;
	//private final JPanel MENUPANEL new JPanel();
	
	// dimensions
	public static final int WIDTH = 800; //background width
	public static final int HEIGHT = 600; //background height

	
	// game thread
	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime = 1000 / FPS;
	
	// game state manager
//	private GameStateManager gsm;//Command pattern : abstract class.
	
	//constructor
	public MenuPanel(JFrame frame) {
		super();
		setLayout(new GridBagLayout()); // root panel layout
		setSize(WIDTH, HEIGHT); // root panel dimension
		
		btnPanel = new JPanel(); // instance for btn panel.
		setBtnPanel(); //set Button Panel
		add(btnPanel); // add the Button Panel into Main Panel.
		
		
		setFocusable(true);
		requestFocus();
		this.frame = frame;
		init();
		//gsm = new GameStateManager();
	}
	

	
	private void init() {
			
		running = true;
		setBackground();
		
	}
	private void setBackground() {
		ImageIcon background = new ImageIcon("/Resource/background/animated_2.gif");
		JLabel label = new JLabel(new ImageIcon(background.getImage()));
		//label.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		frame.setVisible(true);
		Insets a = frame.getInsets();
	}
	
	private void setBtnPanel() {
		btnPanel.setLayout(new GridLayout(4,0)); // GridLayout(int rows, int cols, int hgap, int vgap)
		btnPanel.setSize(WIDTH/3,HEIGHT/3);
		btnPanel.setBackground(new Color(0,0,0,100));// transparent color
		//btnPanel.setBorder(new EmptyBorder(50,50,50,50)); //set the gap between btn and panel.
		btnPanel.add(setBtn_Local());
	}
	private JButton setBtn_Local() {
		JButton btn_Local = new JButton(new ImageIcon("/Resource/background/button(3).png"));
		btn_Local.setFocusPainted(false);
		btn_Local.setBorderPainted(false);
		btn_Local.setContentAreaFilled(false);
		btn_Local.setFont(new Font("Marker Felt", Font.BOLD, 40));
		// Action Listener
		btn_Local.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf = (JFrame) getRootPane().getParent();
				jf.setContentPane(null); // jump to next panel
				jf.setVisible(true);
				JPanel imagePanel = (JPanel) jf.getContentPane();
				imagePanel.setOpaque(false);
			}
		});
		return btn_Local;
	}
	
	private void setBtn_Online() {}
	
	private void setBtn_Setting() {}
	
	private void setBtn_Exit() {}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}