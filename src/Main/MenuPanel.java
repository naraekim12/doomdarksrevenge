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
		Icon background_img = new ImageIcon(getClass().getResource("/Resource/background/animated_2.gif"));
		JLabel background = new JLabel(background_img);
		background.setIcon(background_img);
		bgPanel.add(background);
		bgPanel.setOpaque(false);
	}

	// Setting the Button Panel and add btn into bthPanel
	private void setBtnPanel() {
		btnPanel.setBackground(new Color(0, 0, 0, 100));
		btnPanel.setBounds(280, 400, 250, 200);
		btnPanel.setOpaque(true);
		btnPanel.setLayout(new GridLayout(4, 0)); // GridLayout(int rows, int cols, int hgap, int vgap)
		btnPanel.add(setBtn_Local());
		btnPanel.add(setBtn_Online());
		btnPanel.add(setBtn_Setting());
	}

	// Button for Local Game
	private JButton setBtn_Local() {
		JButton btn_Local = new JButton(new ImageIcon(getClass().getResource("/Resource/background/btn_local.png")));
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

	// Button for Onlinie Game
	private JButton setBtn_Online() {
		JButton btn_online = new JButton(new ImageIcon(getClass().getResource("/Resource/background/btn_online.png")));
		btn_online.setFocusPainted(false);
		btn_online.setBorderPainted(false);
		btn_online.setContentAreaFilled(false);
		btn_online.setFont(new Font("Marker Felt", Font.BOLD, 40));
		// Action Listener
		btn_online.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf = (JFrame) getRootPane().getParent();
				jf.setContentPane(null); // jump to next panel
				jf.setVisible(true);
				JPanel imagePanel = (JPanel) jf.getContentPane();
				imagePanel.setOpaque(false);
			}
		});
		return btn_online;
	}

	// Button for Setting
	private JButton setBtn_Setting() {
		JButton btn_setting = new JButton(
				new ImageIcon(getClass().getResource("/Resource/background/btn_setting.png")));
		btn_setting.setFocusPainted(false);
		btn_setting.setBorderPainted(false);
		btn_setting.setContentAreaFilled(false);
		btn_setting.setFont(new Font("Marker Felt", Font.BOLD, 40));
		// Action Listener
		btn_setting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf = (JFrame) getRootPane().getParent();
				jf.setContentPane(null); // jump to next panel
				jf.setVisible(true);
				JPanel imagePanel = (JPanel) jf.getContentPane();
				imagePanel.setOpaque(false);
			}
		});
		return btn_setting;
	}

	private void setBtn_Exit() {
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}