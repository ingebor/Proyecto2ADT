import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class MenuInicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuInicial window = new MenuInicial();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MenuInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel pnlBienvenida = new JPanel();
		pnlBienvenida.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 160, 122)));
		pnlBienvenida.setBackground(new Color(255, 250, 205));
		pnlBienvenida.setBounds(0, 0, 432, 85);
		panel.add(pnlBienvenida);
		pnlBienvenida.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido!");
		lblBienvenido.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 27));
		lblBienvenido.setBounds(141, 13, 163, 30);
		pnlBienvenida.add(lblBienvenido);
		
		JLabel lblPregunta = new JLabel("\u00BFQue desea realizar a continuacion?");
		lblPregunta.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblPregunta.setBounds(78, 56, 276, 16);
		pnlBienvenida.add(lblPregunta);
		
		JPanel pnlEnfermedades = new JPanel();
		pnlEnfermedades.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(255, 160, 122)));
		pnlEnfermedades.setBackground(new Color(255, 250, 205));
		pnlEnfermedades.setBounds(0, 85, 432, 137);
		panel.add(pnlEnfermedades);
		pnlEnfermedades.setLayout(null);
		
		JPanel pnlMedicamentos = new JPanel();
		pnlMedicamentos.setBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(255, 160, 122)));
		pnlMedicamentos.setBackground(new Color(255, 250, 205));
		pnlMedicamentos.setBounds(0, 222, 432, 151);
		panel.add(pnlMedicamentos);
		pnlMedicamentos.setLayout(null);
		
		JPanel pnlSintomas = new JPanel();
		pnlSintomas.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(255, 160, 122)));
		pnlSintomas.setBackground(new Color(255, 250, 205));
		pnlSintomas.setBounds(0, 373, 432, 132);
		panel.add(pnlSintomas);
		pnlSintomas.setLayout(null);
	}
}
