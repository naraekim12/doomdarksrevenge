package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

//import GameState.GameStateManager;

//make the menuPanel.
@SuppressWarnings("serial")
public class MenuPanel extends JLayeredPane implements Runnable {

	JFrame frame;

	// ALL Panel
	private JPanel btnPanel;
	// private JLayeredPane basePanel;
	private JPanel bgPanel;
	// private final JPanel MENUPANEL new JPanel();

	// dimensions
	public static final int WIDTH = 800; // background width
	public static final int HEIGHT = 600; // background height

	// game thread
	// private Thread thread;
	// private boolean running;
	// private int FPS = 60;
	// private long targetTime = 1000 / FPS;

	// game state manager
	// private GameStateManager gsm;//Command pattern : abstract class.

	// constructor for BasePanel
	public MenuPanel(JFrame frame) {
		super();
		btnPanel = new JPanel(); // instance for btn panel.
		bgPanel = new JPanel(); // instance for bg panel
		this.frame = frame; // get the main frame
		setLayout(new BorderLayout()); // root panel layout
		setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));// root panel dimension
		setFocusable(true);
		requestFocus();

		init();
		setVisible(true);
		// gsm = new GameStateManager();
	}
	
	// build the base panel component.
	private void init() {
		// running = true;
		setBackground();// set Background Panel
		setBtnPanel(); // set Button Panel
		add(btnPanel); // add Button Panel to BasePanel
		add(bgPanel); // add Background Panel to BasePanel
	}

	// Setting Background panel and add the background image.
	private void setBackground() {
		bgPanel.setBounds(0, 0, WIDTH, HEIGHT);
		Icon background_img = new ImageIcon(getClass().getResource("/Resource/background/bg.gif"));
		JLabel background = new JLabel(background_img);
		background.setIcon(background_img);
		bgPanel.add(background);
		bgPanel.setOpaque(false);
	}

	// Setting the Button Panel and add btn into bthPanel
	private void setBtnPanel() {
		btnPanel.setBackground(new Color(0, 0, 0, 0));
		btnPanel.setBounds(280, 400, 250, 200);
		btnPanel.setOpaque(true);
		btnPanel.setLayout(new GridLayout(4, 0)); // GridLayout(int rows, int cols, int hgap, int vgap)
		btnPanel.add(new Button("/Resource/background/btn_local_2.png", null));	//button image path and panel that will display
		btnPanel.add(new Button("/Resource/background/btn_online_2.png", null));
		btnPanel.add(new Button("/Resource/background/btn_setting_2.png", null));
		btnPanel.add(new Button("/Resource/background/btn_exit_2.png", null));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}