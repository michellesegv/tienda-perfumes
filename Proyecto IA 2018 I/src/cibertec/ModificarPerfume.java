package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarPerfume extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNombre;
	private JLabel lblPrecios;
	private JLabel lblContenidoml;
	private JLabel lblAoDeLanzamiento;
	private JLabel lblCasa;
	private JComboBox <String>comboBox;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarPerfume dialog = new ModificarPerfume();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ModificarPerfume() {
		setTitle("Modificar Perfume");
		setBounds(100, 100, 450, 230);
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(35, 23, 46, 14);
		getContentPane().add(lblNombre);
		
		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setBounds(35, 48, 101, 14);
		getContentPane().add(lblPrecios);
		
		lblContenidoml = new JLabel("Contenido (ml)");
		lblContenidoml.setBounds(35, 73, 101, 14);
		getContentPane().add(lblContenidoml);
		
		lblAoDeLanzamiento = new JLabel("A\u00F1o de lanzamiento");
		lblAoDeLanzamiento.setBounds(35, 98, 120, 14);
		getContentPane().add(lblAoDeLanzamiento);
		
		lblCasa = new JLabel("Casa");
		lblCasa.setBounds(35, 123, 46, 14);
		getContentPane().add(lblCasa);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA"}));
		comboBox.setBounds(165, 20, 107, 20);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(165, 45, 107, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 70, 107, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 95, 107, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(165, 120, 107, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(303, 19, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(303, 48, 89, 23);
		getContentPane().add(btnGrabar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
