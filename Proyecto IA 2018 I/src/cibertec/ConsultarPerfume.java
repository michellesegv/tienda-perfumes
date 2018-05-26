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

public class ConsultarPerfume extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNombre;
	private JLabel lblPrecioS;
	private JLabel lblContenidoml;
	private JLabel lblAoDeLanzamiento;
	private JLabel lblCasa;
	private JComboBox <String> cbxNombre;
	private JTextField txtPrecio;
	private JTextField txtContenido;
	private JTextField txtAnioLanzamiento;
	private JTextField txtCasa;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarPerfume dialog = new ConsultarPerfume();
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
	public ConsultarPerfume() {
		setTitle("Consultar Perfume");
		setBounds(100, 100, 450, 230);
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(32, 27, 46, 14);
		getContentPane().add(lblNombre);
		
		lblPrecioS = new JLabel("Precio (S/)");
		lblPrecioS.setBounds(32, 54, 94, 14);
		getContentPane().add(lblPrecioS);
		
		lblContenidoml = new JLabel("Contenido (ml)");
		lblContenidoml.setBounds(32, 79, 94, 14);
		getContentPane().add(lblContenidoml);
		
		lblAoDeLanzamiento = new JLabel("A\u00F1o de lanzamiento");
		lblAoDeLanzamiento.setBounds(32, 104, 123, 14);
		getContentPane().add(lblAoDeLanzamiento);
		
		lblCasa = new JLabel("Casa");
		lblCasa.setBounds(32, 129, 46, 14);
		getContentPane().add(lblCasa);
		
		cbxNombre = new JComboBox<String>();
		cbxNombre.addActionListener(this);
		cbxNombre.setModel(new DefaultComboBoxModel<String>(new String[] {"ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA"}));
		cbxNombre.setBounds(153, 24, 133, 20);
		getContentPane().add(cbxNombre);
		
		
		
		txtPrecio = new JTextField(Proyecto.precio0 + "");
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(152, 51, 134, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtContenido = new JTextField(Proyecto.contenido0 + "");
		txtContenido.setEditable(false);
		txtContenido.setBounds(152, 76, 133, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		txtAnioLanzamiento = new JTextField(Proyecto.a�o0 + "");
		txtAnioLanzamiento.setEditable(false);
		txtAnioLanzamiento.setBounds(152, 101, 134, 20);
		getContentPane().add(txtAnioLanzamiento);
		txtAnioLanzamiento.setColumns(10);
		
		txtCasa = new JTextField(Proyecto.casa0 + "");
		txtCasa.setEditable(false);
		txtCasa.setBounds(152, 126, 135, 20);
		getContentPane().add(txtCasa);
		txtCasa.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(320, 23, 89, 23);
		getContentPane().add(btnCerrar);
		
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbxNombre) {
			actionPerformedCbxNombre(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}	
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedCbxNombre(ActionEvent e) {
		
		switch(cbxNombre.getSelectedIndex()){
			case 0:
				txtPrecio.setText(Proyecto.precio0 +"");
				txtContenido.setText(Proyecto.contenido0 + "");
				txtAnioLanzamiento.setText(Proyecto.a�o0 + "");
				txtCasa.setText(Proyecto.casa0 + "");
				break;
			case 1:
				txtPrecio.setText(Proyecto.precio1 +"");
				txtContenido.setText(Proyecto.contenido1 + "");
				txtAnioLanzamiento.setText(Proyecto.a�o1 + "");
				txtCasa.setText(Proyecto.casa1 + "");
				break;
			case 2:
				txtPrecio.setText(Proyecto.precio2 +"");
				txtContenido.setText(Proyecto.contenido2 + "");
				txtAnioLanzamiento.setText(Proyecto.a�o2 + "");
				txtCasa.setText(Proyecto.casa2 + "");
				break;
			case 3:
				txtPrecio.setText(Proyecto.precio3 +"");
				txtContenido.setText(Proyecto.contenido3 + "");
				txtAnioLanzamiento.setText(Proyecto.a�o3 + "");
				txtCasa.setText(Proyecto.casa3 + "");
				break;
			case 4:
				txtPrecio.setText(Proyecto.precio4 +"");
				txtContenido.setText(Proyecto.contenido4 + "");
				txtAnioLanzamiento.setText(Proyecto.a�o4 + "");
				txtCasa.setText(Proyecto.casa4 + "");
				break;
		}
	}
}
