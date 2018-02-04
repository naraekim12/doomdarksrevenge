package Main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
}