import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuMedicamento {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuMedicamento window = new MenuMedicamento();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MenuMedicamento() {
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
