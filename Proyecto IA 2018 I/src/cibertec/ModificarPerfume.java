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
	private JComboBox<String> cboNombre;
	private JTextField txtPrecio;
	private JTextField txtContenido;
	private JTextField txtA�oLanzamiento;
	private JTextField txtCasa;
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

		cboNombre = new JComboBox<String>();
		cboNombre.addActionListener(this);
		cboNombre.setModel(
				new DefaultComboBoxModel<String>(new String[] { "ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA" }));
		cboNombre.setBounds(165, 20, 107, 20);
		getContentPane().add(cboNombre);

		txtPrecio = new JTextField(Proyecto.precio0 + "");
		txtPrecio.setBounds(165, 45, 107, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtContenido = new JTextField(Proyecto.contenido0 + "");
		txtContenido.setBounds(165, 70, 107, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);

		txtA�oLanzamiento = new JTextField(Proyecto.a�o0 + "");
		txtA�oLanzamiento.setBounds(165, 95, 107, 20);
		getContentPane().add(txtA�oLanzamiento);
		txtA�oLanzamiento.setColumns(10);

		txtCasa = new JTextField(Proyecto.casa0 + "");
		txtCasa.setBounds(165, 120, 107, 20);
		getContentPane().add(txtCasa);
		txtCasa.setColumns(10);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(303, 19, 89, 23);
		getContentPane().add(btnCerrar);

		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(303, 48, 89, 23);
		getContentPane().add(btnGrabar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == cboNombre) {
			actionPerformedComboBox(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedComboBox(ActionEvent e) {
		switch (cboNombre.getSelectedIndex()) {
			case 0:
				txtPrecio.setText(Proyecto.precio0 + "");
				txtContenido.setText(Proyecto.contenido0 + "");
				txtA�oLanzamiento.setText(Proyecto.a�o0 + "");
				txtCasa.setText(Proyecto.casa0 + "");
				break;
			case 1:
				txtPrecio.setText(Proyecto.precio1 + "");
				txtContenido.setText(Proyecto.contenido1 + "");
				txtA�oLanzamiento.setText(Proyecto.a�o1 + "");
				txtCasa.setText(Proyecto.casa1 + "");
				break;
			case 2:
				txtPrecio.setText(Proyecto.precio2 + "");
				txtContenido.setText(Proyecto.contenido2 + "");
				txtA�oLanzamiento.setText(Proyecto.a�o2 + "");
				txtCasa.setText(Proyecto.casa2 + "");
				break;
			case 3:
				txtPrecio.setText(Proyecto.precio3 + "");
				txtContenido.setText(Proyecto.contenido3 + "");
				txtA�oLanzamiento.setText(Proyecto.a�o3 + "");
				txtCasa.setText(Proyecto.casa3 + "");
				break;
			case 4:
				txtPrecio.setText(Proyecto.precio4 + "");
				txtContenido.setText(Proyecto.contenido4 + "");
				txtA�oLanzamiento.setText(Proyecto.a�o4 + "");
				txtCasa.setText(Proyecto.casa4 + "");
				break;

		}

	}

	protected void actionPerformedBtnGrabar(ActionEvent e) {
		if (cboNombre.getSelectedIndex() == 0) {
			Proyecto.precio0 = Double.parseDouble(txtPrecio.getText());
			Proyecto.contenido0 = Double.parseDouble(txtContenido.getText());
			Proyecto.a�o0 = Integer.parseInt(txtA�oLanzamiento.getText());
			Proyecto.casa0 = txtCasa.getText().toString();
		}
		else if (cboNombre.getSelectedIndex() == 1) {
			Proyecto.precio1 = Double.parseDouble(txtPrecio.getText());
			Proyecto.contenido1 = Double.parseDouble(txtContenido.getText());
			Proyecto.a�o1 = Integer.parseInt(txtA�oLanzamiento.getText());
			Proyecto.casa1 = txtCasa.getText().toString();
		}
		else if (cboNombre.getSelectedIndex() == 2) {
			Proyecto.precio2 = Double.parseDouble(txtPrecio.getText());
			Proyecto.contenido2 = Double.parseDouble(txtContenido.getText());
			Proyecto.a�o2 = Integer.parseInt(txtA�oLanzamiento.getText());
			Proyecto.casa2 = txtCasa.getText().toString();
		}
		else if (cboNombre.getSelectedIndex() == 3) {

			Proyecto.precio3 = Double.parseDouble(txtPrecio.getText());
			Proyecto.contenido3 = Double.parseDouble(txtContenido.getText());
			Proyecto.a�o3 = Integer.parseInt(txtA�oLanzamiento.getText());
			Proyecto.casa3 = txtCasa.getText().toString();
		}
		else if (cboNombre.getSelectedIndex()== 4){
			Proyecto.precio4=Double.parseDouble(txtPrecio.getText());
			Proyecto.contenido4=Double.parseDouble(txtContenido.getText());
			Proyecto.a�o4=Integer.parseInt(txtA�oLanzamiento.getText());
			Proyecto.casa4=txtCasa.getSelectedText().toString();
		}
		dispose();
	}
}
