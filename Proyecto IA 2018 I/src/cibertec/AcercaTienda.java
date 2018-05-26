package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class AcercaTienda extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTienda;
	private JLabel lblAutores;
	private JButton btnCerrar;
	private JLabel lblSammia;
	private JLabel lblMichelle;
	private JLabel lblBrandon;
	private JLabel lblDiego;
	private JLabel lblMijael;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaTienda dialog = new AcercaTienda();
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
	public AcercaTienda() {
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 330);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("TIENDA 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTienda.setBounds(149, 13, 127, 37);
		getContentPane().add(lblTienda);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAutores.setBounds(164, 69, 86, 22);
		getContentPane().add(lblAutores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(161, 247, 89, 23);
		getContentPane().add(btnCerrar);
		
		lblSammia = new JLabel("Sammia Zubizarreta Arimuya");
		lblSammia.setBounds(124, 134, 185, 14);
		getContentPane().add(lblSammia);
		
		lblMichelle = new JLabel("Valery Seguil Vilchez");
		lblMichelle.setBounds(124, 109, 137, 14);
		getContentPane().add(lblMichelle);
		
		lblBrandon = new JLabel("Brando Garcia Sanchez");
		lblBrandon.setBounds(124, 159, 151, 14);
		getContentPane().add(lblBrandon);
		
		lblDiego = new JLabel("Diego Soria Soto");
		lblDiego.setBounds(124, 184, 137, 14);
		getContentPane().add(lblDiego);
		
		lblMijael = new JLabel("Mijael De la Cruz Puquio");
		lblMijael.setBounds(124, 209, 163, 14);
		getContentPane().add(lblMijael);
		
		separator = new JSeparator();
		separator.setBounds(26, 53, 372, 2);
		getContentPane().add(separator);

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
