package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Vender extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNombre;
	private JComboBox <String> cboNombre;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender dialog = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 330);
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 77, 14);
		getContentPane().add(lblNombre);
		
		cboNombre = new JComboBox <String>();
		cboNombre.addActionListener(this);
		cboNombre.setModel(new DefaultComboBoxModel <String>(new String[] {"ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA"}));
		cboNombre.setBounds(99, 7, 107, 22);
		getContentPane().add(cboNombre);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 46, 77, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField(Proyecto.precio0 + "");
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(99, 42, 107, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 79, 77, 14);
		getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(99, 75, 107, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(279, 13, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(279, 59, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 106, 410, 164);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
		if (arg0.getSource() == cboNombre) {
			actionPerformedCboNombre(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
		
	}
	protected void actionPerformedCboNombre(ActionEvent arg0) {
		switch(cboNombre.getSelectedIndex()){
			case 0:
				txtPrecio.setText(Proyecto.precio0 +"");
				break;
			case 1:
				txtPrecio.setText(Proyecto.precio1 +"");
				break;
			case 2:
				txtPrecio.setText(Proyecto.precio2 +"");
				break;
			case 3:
				txtPrecio.setText(Proyecto.precio3 +"");
				break;
			case 4:
				txtPrecio.setText(Proyecto.precio4 +"");
				break;
		}
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		int cantidad;
		double descuento, precio, importeCompra, aPagar;
		String nombrePerfume;
		cantidad = Integer.parseInt(txtCantidad.getText());
		precio = Double.parseDouble(txtPrecio.getText());
		nombrePerfume = cboNombre.getSelectedItem()+ "";
		
		importeCompra = precio * cantidad;
		
		if( cantidad < 5){
			descuento = importeCompra * 0.01;
		}
		else if (cantidad < 10){
			descuento = importeCompra * 0.02;
		}
		else if (cantidad < 15){
			descuento = importeCompra * 0.03;
		}
		else{
			descuento = importeCompra * 0.04;
		}
		aPagar = importeCompra - descuento;
		
		txtS.setText("Boleta de pago" + "\n\n");
		txtS.append("Nombre del perfume: " + nombrePerfume + "\n");
		txtS.append("Precio Unitario: " + precio + "\n");
		txtS.append("Cantidad de unidades adquiridas: " + cantidad + "\n");
		txtS.append("Importe de compra: " + importeCompra + "\n");
		txtS.append("Importe de descuento: " + descuento + "\n");
		txtS.append("Importe de compra: " + aPagar + "\n");
		txtS.append("Obsequio: " + "\n");
		txtS.append("Premio sorpresa: " + "\n");
		
	}
}
