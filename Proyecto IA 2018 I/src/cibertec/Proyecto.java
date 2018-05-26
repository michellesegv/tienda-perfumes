package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Proyecto extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarPerfume;
	private JMenuItem mntmModificarPerfume;
	private JMenuItem mntmListarPerfume;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnConfiguracin;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	
	//variables globales
		// Datos mínimos del primer perfume
		public static String nombre0 = "ALCAZAR";
		public static double precio0 = 135.0;
		public static double contenido0 = 100;
		public static int año0 = 2014;
		public static String casa0 = "Ted Lapidus";
		// Datos mínimos del segundo perfume
		public static String nombre1 = "ALLURE";
		public static double precio1 = 390.0;
		public static double contenido1 = 50.0;
		public static int año1 = 1998;
		public static String casa1 = "Chanel";
		// Datos mínimos del tercer perfume
		public static String nombre2 = "AQUA RUSH";
		public static double precio2 = 62.0;
		public static double contenido2 = 90.0;
		public static int año2 = 2012;
		public static String casa2 = "Nautica";
		// Datos mínimos del cuarto perfume
		public static String nombre3 = "ENVY";
		public static double precio3 = 510.0;
		public static double contenido3 = 7.5;
		public static int año3 = 1997;
		public static String casa3 = "Gucci";
		// Datos mínimos del quinto perfume
		public static String nombre4 = "ALAIA";
		public static double precio4 = 210.0;
		public static double contenido4 = 30.0;
		public static int año4 = 2015;
		public static String casa4 = "Azzedine";
		// Porcentajes de descuento
		public static double porcentaje1 = 4.0;
		public static double porcentaje2 = 5.5;
		public static double porcentaje3 = 7.0;
		public static double porcentaje4 = 8.5;
		// Cantidad óptima de perfumes vendidos
		public static int cantidadOptima = 40;
		// Importe a pagar mínimo para obtener el obsequio
		public static int importeMinimoObsequiable = 750;
		// Obsequio por importe mínimo
		public static String obsequio = "Billetera";
		// Número de cliente que recibe el premio sorpresa
		public static int numeroClienteSorpresa = 5;
		// Premio sorpresa
		public static String premioSorpresa = "Un polo";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarPerfume = new JMenuItem("Consultar Perfume");
		mntmConsultarPerfume.addActionListener(this);
		mnMantenimiento.add(mntmConsultarPerfume);
		
		mntmModificarPerfume = new JMenuItem("Modificar Perfume");
		mntmModificarPerfume.addActionListener(this);
		mnMantenimiento.add(mntmModificarPerfume);
		
		mntmListarPerfume = new JMenuItem("Listar Perfume");
		mntmListarPerfume.addActionListener(this);
		mnMantenimiento.add(mntmListarPerfume);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de perfumes vendidos");
		mntmConfigurarCantidadptima.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadptima) {
			actionPerformedMntmConfigurarCantidadptima(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListarPerfume) {
			actionPerformedMntmListarPerfume(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == mntmModificarPerfume) {
			actionPerformedMntmModificarPerfume(arg0);
		}
		if (arg0.getSource() == mntmConsultarPerfume) {
			actionPerformedMntmConsultarPerfume(arg0);
		}
	}
	protected void actionPerformedMntmConsultarPerfume(ActionEvent arg0) {
		
		ConsultarPerfume cp = new ConsultarPerfume();
		cp.setLocationRelativeTo(this);
		cp.setVisible(true);
		
	}
	protected void actionPerformedMntmModificarPerfume(ActionEvent arg0) {
		
		ModificarPerfume m=new ModificarPerfume();
		m.setLocationRelativeTo(this);
		m.setVisible(true);
		
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		AcercaTienda at=new AcercaTienda();
		at.setLocationRelativeTo(this);
		at.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		ConfigurarDescuento cd=new ConfigurarDescuento();
		cd.setLocationRelativeTo(this);
		cd.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		ConfigurarObsequio co=new ConfigurarObsequio();
		co.setLocationRelativeTo(this);
		co.setVisible(true);
	}
	protected void actionPerformedMntmListarPerfume(ActionEvent arg0) {
		ListarPerfume lp=new ListarPerfume();
		lp.setLocationRelativeTo(this);
		lp.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		Vender v=new Vender();
		v.setLocationRelativeTo(this);
		v.setVisible(true);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		GenerarReporte gr=new GenerarReporte();
		gr.setLocationRelativeTo(this);
		gr.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent arg0) {
		ConfigurarCantPerfumes ccp=new ConfigurarCantPerfumes();
		ccp.setLocationRelativeTo(this);
		ccp.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		ConfigurarPremioSorpresa cps=new ConfigurarPremioSorpresa();
		cps.setLocationRelativeTo(this);
		cps.setVisible(true);
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		System.exit(0);
	}
}
