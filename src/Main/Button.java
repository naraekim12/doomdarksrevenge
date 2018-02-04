package Main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Button extends JButton{
	public Button (String imgPath, JPanel panel) {
		setIcon(new ImageIcon(getClass().getResource(imgPath)));
		setFocusPainted(false);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setFont(new Font("Marker Felt", Font.BOLD, 40));
		// Action Listener
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf = (JFrame) getRootPane().getParent();
				jf.setContentPane(panel); // jump to next panel
				jf.setVisible(true);
				JPanel imagePanel = (JPanel) jf.getContentPane();
				imagePanel.setOpaque(false);
			}
		});
	}
	
	public Button (String imgPath) {
		setIcon(new ImageIcon(getClass().getResource(imgPath)));
		setFocusPainted(false);
		setBorderPainted(false);
		setContentAreaFilled(false);
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the game?", "Confirm exit", JOptionPane.YES_NO_OPTION);
				if (i == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}