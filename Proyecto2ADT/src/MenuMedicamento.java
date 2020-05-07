import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class MenuMedicamento {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
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
		frame.setBounds(100, 100, 450, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(24, 24, 381, 546);
		panel.add(panel_1);
	}

}
