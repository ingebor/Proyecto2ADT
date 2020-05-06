import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuSintomas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuSintomas window = new MenuSintomas();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MenuSintomas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
