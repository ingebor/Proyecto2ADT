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
import javax.swing.border.BevelBorder;

@SuppressWarnings("unused")
public class MenuEnfermedad {

	private JFrame frame;
	private static MenuEnfermedad window;
	private JButton btnRegEnf;
	private JButton btnListo;
	private JTextArea txtaMostrarSin;

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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 376, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Consultar Enfermedad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(16, 13, 330, 424);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtaMostrarSin = new JTextArea();
		txtaMostrarSin.setBounds(12, 133, 306, 240);
		panel_1.add(txtaMostrarSin);
		
		btnRegEnf = new JButton("Regresar");
		btnRegEnf.setBounds(12, 386, 107, 25);
		panel_1.add(btnRegEnf);
		btnRegEnf.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		JLabel lblLosSntomasSon = new JLabel("Los s\u00EDntomas son los siguientes: ");
		lblLosSntomasSon.setBounds(12, 99, 221, 21);
		panel_1.add(lblLosSntomasSon);
		lblLosSntomasSon.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		btnListo = new JButton("Listo");
		btnListo.setBounds(229, 65, 89, 25);
		panel_1.add(btnListo);
		btnListo.setFont(new Font("Consolas", Font.PLAIN, 13));
		miListener oyente = new miListener();
		btnListo.addActionListener(oyente);
		
		JComboBox cmbSelecEnf = new JComboBox();
		cmbSelecEnf.setBounds(22, 64, 76, 22);
		panel_1.add(cmbSelecEnf);
		cmbSelecEnf.setForeground(new Color(0, 0, 0));
		cmbSelecEnf.setBackground(new Color(255, 255, 255));
		cmbSelecEnf.setModel(new DefaultComboBoxModel(new String[] {"Gripe", "Tos", "Migrania"}));
		
		JLabel lblSeleccioneUnaEnfermedad = new JLabel("Seleccione una enfermedad");
		lblSeleccioneUnaEnfermedad.setBounds(12, 30, 184, 21);
		panel_1.add(lblSeleccioneUnaEnfermedad);
		lblSeleccioneUnaEnfermedad.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnRegEnf.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				MenuInicial volver = new MenuInicial();
				volver.main(null);
				frame.dispose();
			}
		});
		
	}
	
	private class miListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnListo) {
				txtaMostrarSin.setText("Los sintomas de la gripe son:\nDolor de cabeza\n\nRecomendacion de medicamento: \nAcetaminofen\nTe de jengibre con miel");
			}
		}
	}
}
