import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class MenuEnfermedad {

	private JFrame frame;
	private static MenuEnfermedad window;
	private JButton btnRegEnf;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		window = new MenuEnfermedad();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MenuEnfermedad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 376, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new TitledBorder(null, "Consultar enfermedades", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSeleccioneUnaEnfermedad = new JLabel("Seleccione una enfermedad");
		lblSeleccioneUnaEnfermedad.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblSeleccioneUnaEnfermedad.setBounds(12, 23, 212, 16);
		panel.add(lblSeleccioneUnaEnfermedad);
		
		JComboBox cmbSelecEnf = new JComboBox();
		cmbSelecEnf.setForeground(new Color(0, 0, 0));
		cmbSelecEnf.setBackground(new Color(255, 255, 255));
		cmbSelecEnf.setModel(new DefaultComboBoxModel(new String[] {"Gripe", "Tos", "Migrania"}));
		cmbSelecEnf.setBounds(50, 56, 106, 22);
		panel.add(cmbSelecEnf);
		
		JButton btnListo = new JButton("Listo");
		btnListo.setFont(new Font("Consolas", Font.PLAIN, 13));
		btnListo.setBounds(238, 57, 97, 25);
		panel.add(btnListo);
		
		JLabel lblLosSntomasSon = new JLabel("Los s\u00EDntomas son los siguientes: ");
		lblLosSntomasSon.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblLosSntomasSon.setBounds(12, 112, 260, 16);
		panel.add(lblLosSntomasSon);
		
		btnRegEnf = new JButton("Regresar");
		btnRegEnf.setFont(new Font("Consolas", Font.PLAIN, 13));
		btnRegEnf.setBounds(12, 412, 97, 25);
		panel.add(btnRegEnf);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 141, 301, 258);
		panel.add(textArea);
		btnRegEnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicial volver = new MenuInicial();
				volver.main(null);
				frame.dispose();
			}
		});
	}
	
	private class miListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
