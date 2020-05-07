import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

@SuppressWarnings("unused")
public class MenuSintomas {

	private JFrame frame;
	private JButton btnAceptar;
	private JButton btnRegresar;
	private JTextArea txtaMostrarResul;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
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
		frame.setBounds(100, 100, 450, 659);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Consultar Sintomas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(12, 13, 408, 586);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione los sintomas con los que cuenta: \r\n");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 30, 347, 16);
		panel_1.add(lblNewLabel);
		
		JCheckBox chckbxDolorCab = new JCheckBox("Dolor de cabeza");
		chckbxDolorCab.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		chckbxDolorCab.setBounds(29, 66, 151, 25);
		panel_1.add(chckbxDolorCab);
		
		JCheckBox chckbxDolorEst = new JCheckBox("Dolor de estomago");
		chckbxDolorEst.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		chckbxDolorEst.setBounds(29, 106, 151, 25);
		panel_1.add(chckbxDolorEst);
		
		JCheckBox chckbxVomitos = new JCheckBox("Vomitos");
		chckbxVomitos.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		chckbxVomitos.setBounds(29, 146, 113, 25);
		panel_1.add(chckbxVomitos);
		
		JCheckBox chckbxEstornudos = new JCheckBox("Estornudos");
		chckbxEstornudos.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		chckbxEstornudos.setBounds(29, 189, 113, 25);
		panel_1.add(chckbxEstornudos);
		
		JCheckBox chckbxTos = new JCheckBox("Tos");
		chckbxTos.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		chckbxTos.setBounds(29, 233, 113, 25);
		panel_1.add(chckbxTos);
		
		JCheckBox chckbxFatiga = new JCheckBox("Fatiga");
		chckbxFatiga.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		chckbxFatiga.setBounds(29, 276, 113, 25);
		panel_1.add(chckbxFatiga);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Consolas", Font.PLAIN, 13));
		btnAceptar.setBounds(282, 277, 97, 25);
		panel_1.add(btnAceptar);
		miListener oyente = new miListener();
		btnAceptar.addActionListener(oyente);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblResultado.setBounds(12, 327, 84, 16);
		panel_1.add(lblResultado);
		
		txtaMostrarResul = new JTextArea();
		txtaMostrarResul.setLineWrap(true);
		txtaMostrarResul.setBounds(12, 356, 384, 170);
		panel_1.add(txtaMostrarResul);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Consolas", Font.PLAIN, 13));
		btnRegresar.setBounds(12, 548, 97, 25);
		panel_1.add(btnRegresar);
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
				txtaMostrarResul.setText("Tiene una probabilidad de: \n58% \nDe tener la siguiente enfermedad: \nGripe");
			}
		}
	}
}
