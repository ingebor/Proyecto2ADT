import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;

@SuppressWarnings("unused")
public class MenuMedicamento {

	private JFrame frame;
	private JButton btnAceptar;
	private JButton btnRegresar;
	private JTextArea txtaMostrarMed;


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
	@SuppressWarnings({ "unchecked", "rawtypes" , "static-access"})
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel pnlSelecMed = new JPanel();
		pnlSelecMed.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Consultar Medicamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSelecMed.setBackground(new Color(224, 255, 255));
		pnlSelecMed.setBounds(12, 13, 408, 396);
		panel.add(pnlSelecMed);
		pnlSelecMed.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione el medicamento:\r\n");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 25, 198, 16);
		pnlSelecMed.add(lblNewLabel);
		
		JComboBox cmbMedicamento = new JComboBox();
		cmbMedicamento.setModel(new DefaultComboBoxModel(new String[] {"Tabcin", "Acetaminofen", "Aspirina forte"}));
		cmbMedicamento.setBounds(22, 56, 91, 22);
		pnlSelecMed.add(cmbMedicamento);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Consolas", Font.PLAIN, 13));
		btnAceptar.setBounds(265, 57, 97, 25);
		pnlSelecMed.add(btnAceptar);
		miListener oyente = new miListener();
		btnAceptar.addActionListener(oyente);
		
		JLabel lblLasEspecificacionesSon = new JLabel("Las especificaciones son: ");
		lblLasEspecificacionesSon.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblLasEspecificacionesSon.setBounds(12, 105, 182, 16);
		pnlSelecMed.add(lblLasEspecificacionesSon);
		
		txtaMostrarMed = new JTextArea();
		txtaMostrarMed.setBounds(12, 134, 384, 196);
		pnlSelecMed.add(txtaMostrarMed);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Consolas", Font.PLAIN, 13));
		btnRegresar.setBounds(12, 355, 97, 25);
		pnlSelecMed.add(btnRegresar);
		btnRegresar.addActionListener(new ActionListener() {
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
			if(e.getSource()==btnAceptar) {
				txtaMostrarMed.setText("Alivia sintomas de las siguientes enfermedades: \nTos\nGripe\n\nLos sintomas que alivia son: \nFiebre\nDolor de cabeza\nCongestion nasal\nEstornudos\nDolor de garganta");
			}
		}
	}
}
