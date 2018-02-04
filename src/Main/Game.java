//package Main;
//
//public class Game {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
package Main;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game {
	
	public static void main(String[] args) {
		//setting JFrame
		JFrame window = new JFrame("Survival Jungle"); //set the frame title
		window.setContentPane(new MenuPanel(window)); //add panel
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set close button
		window.setResizable(false); //restrict the frame size
		window.pack();
		window.setVisible(true);
		
	}
	
}
