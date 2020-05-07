import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MenuInicial {

	private static MenuInicial window;
	private JFrame frame;
	private JButton btnIngSin;
	private JButton btnConMed;
	private JButton btnConEnf;

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
		
		JLabel pnlDeseoEnfermedad = new JLabel("Deseo consultar los sintomas de cierta enfermedad");
		pnlDeseoEnfermedad.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		pnlDeseoEnfermedad.setBounds(34, 32, 386, 16);
		pnlEnfermedades.add(pnlDeseoEnfermedad);
		
		btnConEnf = new JButton("Consultar enfermedades");
		btnConEnf.setFont(new Font("Consolas", Font.PLAIN, 14));
		btnConEnf.setBounds(105, 79, 224, 33);
		pnlEnfermedades.add(btnConEnf);
		btnConEnf.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				MenuEnfermedad nuevo = new MenuEnfermedad();
				nuevo.newScreen();
				frame.dispose();
			}
		});
		
		JPanel pnlMedicamentos = new JPanel();
		pnlMedicamentos.setBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(255, 160, 122)));
		pnlMedicamentos.setBackground(new Color(255, 250, 205));
		pnlMedicamentos.setBounds(0, 222, 432, 151);
		panel.add(pnlMedicamentos);
		pnlMedicamentos.setLayout(null);
		
		JLabel lblMed1 = new JLabel("Deseo conocer las especificaciones de un ");
		lblMed1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblMed1.setBounds(57, 23, 319, 16);
		pnlMedicamentos.add(lblMed1);
		
		JLabel lblMed2 = new JLabel("medicamento");
		lblMed2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblMed2.setBounds(165, 47, 133, 16);
		pnlMedicamentos.add(lblMed2);
		
		btnConMed = new JButton("Consultar medicamentos");
		btnConMed.setFont(new Font("Consolas", Font.PLAIN, 14));
		btnConMed.setBounds(104, 88, 217, 35);
		pnlMedicamentos.add(btnConMed);
		
		JPanel pnlSintomas = new JPanel();
		pnlSintomas.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(255, 160, 122)));
		pnlSintomas.setBackground(new Color(255, 250, 205));
		pnlSintomas.setBounds(0, 373, 432, 132);
		panel.add(pnlSintomas);
		pnlSintomas.setLayout(null);
		
		JLabel lblSin = new JLabel("Cuento con sintomas y desconozco la razon");
		lblSin.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblSin.setBounds(53, 25, 323, 16);
		pnlSintomas.add(lblSin);
		
		btnIngSin = new JButton("Ingresar sintomas");
		btnIngSin.setFont(new Font("Consolas", Font.PLAIN, 14));
		btnIngSin.setBounds(117, 67, 190, 35);
		pnlSintomas.add(btnIngSin);
		btnIngSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuSintomas sintomas = new MenuSintomas();
				sintomas.newScreen();
				frame.dispose();
			}
		});
	}
	
	/*private class miListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}*/
}
