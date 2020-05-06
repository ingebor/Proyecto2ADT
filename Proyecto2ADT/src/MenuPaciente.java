import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuPaciente {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuPaciente window = new MenuPaciente();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MenuPaciente() {
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
