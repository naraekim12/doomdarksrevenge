package Command;

import javax.swing.JPanel;

public class Exit extends Command {

	@Override
	public JPanel execute() {
		// TODO Auto-generated method stub
		System.exit(0);
		return null;
	}

}
