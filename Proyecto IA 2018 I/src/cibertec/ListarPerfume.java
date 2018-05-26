package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ListarPerfume extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarPerfume dialog = new ListarPerfume();
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
	public ListarPerfume() {
		setTitle("Listar perfumes");
		setBounds(100, 100, 500, 400);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 458, 289);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(125, 315, 97, 25);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(254, 315, 97, 25);
		getContentPane().add(btnListar);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		txtS.setText("LISTADO DE PERFUMES \n\n");
		txtS.append("Nombre             : " + Proyecto.nombre0 + "\n");
		txtS.append("Precio             : " + Proyecto.precio0 + "\n");
		txtS.append("Contenido          : " + Proyecto.contenido0 + "\n");
		txtS.append("Año de lanzamiento : " + Proyecto.año0 + "\n");
		txtS.append("Casa               : " + Proyecto.casa0 + "\n\n");
		
		txtS.append("Nombre             : " + Proyecto.nombre1 + "\n");
		txtS.append("Precio             : " + Proyecto.precio1 + "\n");
		txtS.append("Contenido          : " + Proyecto.contenido1 + "\n");
		txtS.append("Año de lanzamiento : " + Proyecto.año1 + "\n");
		txtS.append("Casa               : " + Proyecto.casa1 + "\n\n");
		
		txtS.append("Nombre             : " + Proyecto.nombre2 + "\n");
		txtS.append("Precio             : " + Proyecto.precio2 + "\n");
		txtS.append("Contenido          : " + Proyecto.contenido2 + "\n");
		txtS.append("Año de lanzamiento : " + Proyecto.año2 + "\n");
		txtS.append("Casa               : " + Proyecto.casa2 + "\n\n");
		
		txtS.append("Nombre             : " + Proyecto.nombre3 + "\n");
		txtS.append("Precio             : " + Proyecto.precio3 + "\n");
		txtS.append("Contenido          : " + Proyecto.contenido3 + "\n");
		txtS.append("Año de lanzamiento : " + Proyecto.año3 + "\n");
		txtS.append("Casa               : " + Proyecto.casa3 + "\n\n");
		
		txtS.append("Nombre             : " + Proyecto.nombre4 + "\n");
		txtS.append("Precio             : " + Proyecto.precio4 + "\n");
		txtS.append("Contenido          : " + Proyecto.contenido4 + "\n");
		txtS.append("Año de lanzamiento : " + Proyecto.año4 + "\n");
		txtS.append("Casa               : " + Proyecto.casa4 + "\n\n");
		
		txtS.append("Nombre             : " + Proyecto.nombre0 + "\n");
		txtS.append("Precio             : " + Proyecto.precio0 + "\n");
		txtS.append("Contenido          : " + Proyecto.contenido0 + "\n");
		txtS.append("Año de lanzamiento : " + Proyecto.año0 + "\n");
		txtS.append("Casa               : " + Proyecto.casa0);

		
	}
}
