package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequio extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtImporteMinimoPagar;
	private JLabel lblImporteMinimoPagar;
	private JLabel lblObsequio;
	private JTextField txtObsequio;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequio dialog = new ConfigurarObsequio();
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
	public ConfigurarObsequio() {
		setTitle("Configurar obsequio");
		setBounds(100, 100, 450, 180);
		getContentPane().setLayout(null);
		
		txtImporteMinimoPagar = new JTextField();
		txtImporteMinimoPagar.setBounds(170, 29, 86, 20);
		getContentPane().add(txtImporteMinimoPagar);
		txtImporteMinimoPagar.setColumns(10);
		
		lblImporteMinimoPagar = new JLabel("Importe a pagar m\u00EDnimo");
		lblImporteMinimoPagar.setBounds(10, 32, 176, 14);
		getContentPane().add(lblImporteMinimoPagar);
		
		lblObsequio = new JLabel("Obsequio");
		lblObsequio.setBounds(10, 69, 139, 14);
		getContentPane().add(lblObsequio);
		
		txtObsequio = new JTextField();
		txtObsequio.setBounds(170, 66, 86, 20);
		getContentPane().add(txtObsequio);
		txtObsequio.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(312, 28, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(312, 65, 89, 23);
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
