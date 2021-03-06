package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCantPerfumes extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCantidadptima;
	private JTextField textField;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCantPerfumes dialog = new ConfigurarCantPerfumes();
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
	public ConfigurarCantPerfumes() {
		setTitle("Configurar cantidad \u00F3ptima de perfumes vendidos");
		setBounds(100, 100, 600, 230);
		getContentPane().setLayout(null);
		
		lblCantidadptima = new JLabel("Cantidad \u00F3ptima de perfumes vendidos");
		lblCantidadptima.setBounds(22, 51, 260, 16);
		getContentPane().add(lblCantidadptima);
		
		textField = new JTextField();
		textField.setBounds(259, 48, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(433, 47, 97, 25);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(433, 99, 97, 25);
		getContentPane().add(btnCancelar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
