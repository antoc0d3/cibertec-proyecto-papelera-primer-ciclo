package Indice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Configuracion.ClassConfigDescuentos;
import Configuracion.ClassConfigMaxCantRamasVend;
import Configuracion.ClassConfigObsequio;
import Configuracion.ClassConfigPreSorpresa;
import Matenimiento.ClassConsultarPapel;
import Matenimiento.ClassListarPapeles;
import Matenimiento.ClassModificarPapel;
import Ventas.ClassGenerarReportes;
import Ventas.ClassVender;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
@SuppressWarnings("unused")

public class ClassJFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivos;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsPapel;
	private JMenuItem mntmModPapel;
	private JMenuItem mntmListarPapel;
	private JMenuItem mntmVenderPro;
	private JMenuItem mntmGeneReportes;
	private JMenuItem mntmConfigDesc;
	private JMenuItem mntmConfigObsquio;
	private JMenuItem mntmConfigCantOpt;
	private JMenuItem mntmConfigPreSorpresa;
	private JMenuItem mntmAyuda;
	private JLabel lblFondoIcon;
	private JButton accesVender;
	private JButton accesModPapel;
	private JButton accesReportes;
	private JButton accesDescuentos;
	private JButton accesConfiguracion;
	private JLabel lblAccesoRapido;
	private JLabel label;
	private JLabel lblAccessoRapido;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassJFrame frame = new ClassJFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClassJFrame() {
		setTitle("PANASA  S.A - Software Aplication Desktop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 418);
		
		this.menuBar = new JMenuBar();
		this.menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(this.menuBar);
		
		this.mnArchivos = new JMenu("Archivos");
		this.mnArchivos.setForeground(new Color(154, 205, 50));
		this.menuBar.add(this.mnArchivos);
		
		this.mntmSalir = new JMenuItem("Salir");
		this.mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		this.mntmSalir.setBackground(new Color(240, 248, 255));
		this.mntmSalir.setForeground(new Color(85, 107, 47));
		this.mntmSalir.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/cerrar-ico.png")));
		this.mntmSalir.addActionListener(this);
		this.mnArchivos.add(this.mntmSalir);
		
		this.mnMantenimiento = new JMenu("Mantenimiento");
		this.mnMantenimiento.setForeground(new Color(154, 205, 50));
		this.menuBar.add(this.mnMantenimiento);
		
		this.mntmConsPapel = new JMenuItem("Consultar papel");
		this.mntmConsPapel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		this.mntmConsPapel.setForeground(new Color(85, 107, 47));
		this.mntmConsPapel.setBackground(new Color(240, 255, 255));
		this.mntmConsPapel.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/mantenimiento-consultar-ico.png")));
		this.mntmConsPapel.addActionListener(this);
		this.mnMantenimiento.add(this.mntmConsPapel);
		
		this.mntmModPapel = new JMenuItem("Modificar papel");
		this.mntmModPapel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK));
		this.mntmModPapel.setForeground(new Color(85, 107, 47));
		this.mntmModPapel.setBackground(new Color(240, 255, 255));
		this.mntmModPapel.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/mantenimiento-modificar-papel-ico.png")));
		this.mntmModPapel.addActionListener(this);
		this.mnMantenimiento.add(this.mntmModPapel);
		
		this.mntmListarPapel = new JMenuItem("Listar papeles");
		this.mntmListarPapel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		this.mntmListarPapel.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/mantenimiento-listar-ico.png")));
		this.mntmListarPapel.setForeground(new Color(85, 107, 47));
		this.mntmListarPapel.setBackground(new Color(240, 255, 255));
		this.mntmListarPapel.addActionListener(this);
		this.mnMantenimiento.add(this.mntmListarPapel);
		
		this.mnVentas = new JMenu("Ventas");
		this.mnVentas.setForeground(new Color(154, 205, 50));
		this.menuBar.add(this.mnVentas);
		
		this.mntmVenderPro = new JMenuItem("Vender");
		this.mntmVenderPro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		this.mntmVenderPro.setBackground(new Color(240, 255, 255));
		this.mntmVenderPro.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/ventas-vender-ico.png")));
		this.mntmVenderPro.setForeground(new Color(85, 107, 47));
		this.mntmVenderPro.addActionListener(this);
		this.mnVentas.add(this.mntmVenderPro);
		
		this.mntmGeneReportes = new JMenuItem("Generar reportes");
		this.mntmGeneReportes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		this.mntmGeneReportes.setBackground(new Color(240, 255, 255));
		this.mntmGeneReportes.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/ventas-generar-reportes-ico.png")));
		this.mntmGeneReportes.setForeground(new Color(85, 107, 47));
		this.mntmGeneReportes.addActionListener(this);
		this.mnVentas.add(this.mntmGeneReportes);
		
		this.mnConfiguracion = new JMenu("Configuracion");
		this.mnConfiguracion.setForeground(new Color(154, 205, 50));
		this.menuBar.add(this.mnConfiguracion);
		
		this.mntmConfigDesc = new JMenuItem("Configurar descuentos");
		this.mntmConfigDesc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		this.mntmConfigDesc.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/config-descuentos-ico.png")));
		this.mntmConfigDesc.setBackground(new Color(240, 255, 255));
		this.mntmConfigDesc.setForeground(new Color(85, 107, 47));
		this.mntmConfigDesc.addActionListener(this);
		this.mnConfiguracion.add(this.mntmConfigDesc);
		
		this.mntmConfigObsquio = new JMenuItem("Configurar obsequio");
		this.mntmConfigObsquio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		this.mntmConfigObsquio.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/config-obsequio-ico.png")));
		this.mntmConfigObsquio.setBackground(new Color(240, 255, 255));
		this.mntmConfigObsquio.setForeground(new Color(85, 107, 47));
		this.mntmConfigObsquio.addActionListener(this);
		this.mnConfiguracion.add(this.mntmConfigObsquio);
		
		this.mntmConfigCantOpt = new JMenuItem("Configurar cantidad \u00F3ptima de resmas vendidas");
		this.mntmConfigCantOpt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		this.mntmConfigCantOpt.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/config-cant-optima-ico.png")));
		this.mntmConfigCantOpt.setBackground(new Color(240, 255, 255));
		this.mntmConfigCantOpt.setForeground(new Color(85, 107, 47));
		this.mntmConfigCantOpt.addActionListener(this);
		this.mnConfiguracion.add(this.mntmConfigCantOpt);
		
		this.mntmConfigPreSorpresa = new JMenuItem("Configurar premio sorpresa");
		this.mntmConfigPreSorpresa.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		this.mntmConfigPreSorpresa.setBackground(new Color(240, 255, 255));
		this.mntmConfigPreSorpresa.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/config-sorpresa-ico.png")));
		this.mntmConfigPreSorpresa.setForeground(new Color(85, 107, 47));
		this.mntmConfigPreSorpresa.addActionListener(this);
		this.mnConfiguracion.add(this.mntmConfigPreSorpresa);
		
		this.mnAyuda = new JMenu("Ayuda");
		this.mnAyuda.setForeground(new Color(154, 205, 50));
		this.menuBar.add(this.mnAyuda);
		
		this.mntmAyuda = new JMenuItem("Acerca de Tienda");
		this.mntmAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		this.mntmAyuda.setBackground(new Color(240, 255, 255));
		this.mntmAyuda.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/ayuda-ico.png")));
		this.mntmAyuda.setForeground(new Color(85, 107, 47));
		this.mntmAyuda.addActionListener(this);
		this.mnAyuda.add(this.mntmAyuda);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(new Color(153, 204, 153));
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		this.accesVender = new JButton("");
		this.accesVender.addActionListener(this);
		this.accesVender.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/Jframe-icon-vender-papel.png")));
		accesVender.setBorder(new LineBorder(new Color(220, 220, 220), 0));
		this.accesVender.setBounds(20, 277, 71, 77);
		this.contentPane.add(this.accesVender);
		
		this.accesModPapel = new JButton("");
		this.accesModPapel.addActionListener(this);
		this.accesModPapel.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/Jframe-icon-modificar-papel.png")));
		this.accesModPapel.setBorder(new LineBorder(new Color(220, 220, 220), 0));
		this.accesModPapel.setBounds(120, 271, 85, 84);
		this.contentPane.add(this.accesModPapel);
		
		this.accesReportes = new JButton("");
		this.accesReportes.addActionListener(this);
		this.accesReportes.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/Jframe-icon-reportes-papel.png")));
		this.accesReportes.setBorder(new LineBorder(new Color(220, 220, 220), 0));
		this.accesReportes.setBounds(230, 274, 85, 83);
		this.contentPane.add(this.accesReportes);
		
		this.accesDescuentos = new JButton("");
		this.accesDescuentos.addActionListener(this);
		this.accesDescuentos.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/jframe-ico-config-descuento.png")));
		this.accesDescuentos.setBorder(new LineBorder(new Color(220, 220, 220), 0));
		this.accesDescuentos.setBounds(333, 270, 96, 87);
		this.contentPane.add(this.accesDescuentos);
		
		this.accesConfiguracion = new JButton("");
		this.accesConfiguracion.addActionListener(this);
		this.accesConfiguracion.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/Jframe-icon-configuracion-papel.png")));
		this.accesConfiguracion.setBorder(new LineBorder(new Color(220, 220, 220), 0));
		this.accesConfiguracion.setBounds(447, 269, 85, 86);
		this.contentPane.add(this.accesConfiguracion);
		
		this.lblAccesoRapido = new JLabel("");
		this.lblAccesoRapido.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/Logo-empresa.png")));
		this.lblAccesoRapido.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		this.lblAccesoRapido.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblAccesoRapido.setForeground(new Color(255, 255, 255));
		this.lblAccesoRapido.setBounds(149, 11, 280, 117);
		this.contentPane.add(this.lblAccesoRapido);
		
		this.label = new JLabel("");
		this.label.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/border-radius.png")));
		this.label.setBounds(177, 176, 217, 84);
		this.contentPane.add(this.label);
		
		this.lblAccessoRapido = new JLabel("ACCESSO RAPIDO");
		this.lblAccessoRapido.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		this.lblAccessoRapido.setForeground(new Color(255, 255, 255));
		this.lblAccessoRapido.setBounds(218, 200, 170, 52);
		this.contentPane.add(this.lblAccessoRapido);
		
		this.lblFondoIcon = new JLabel("");
		this.lblFondoIcon.setIcon(new ImageIcon(ClassJFrame.class.getResource("/paquete/imagenes/fondo-jframe.png")));
		this.lblFondoIcon.setForeground(new Color(255, 51, 51));
		this.lblFondoIcon.setBounds(0, -1, 550, 355);
		this.contentPane.add(this.lblFondoIcon);
		

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.accesConfiguracion) {
			actionPerformedConfiguracion(arg0);
		}
		if (arg0.getSource() == this.accesDescuentos) {
			actionPerformedDescuento(arg0);
		}
		if (arg0.getSource() == this.accesReportes) {
			actionPerformedReportes(arg0);
		}
		if (arg0.getSource() == this.accesModPapel) {
			actionPerformedAccesModPapel(arg0);
		}
		if (arg0.getSource() == this.accesVender) {
			actionPerformedVender(arg0);
		}
		
		if (arg0.getSource() == this.mntmAyuda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == this.mntmConfigPreSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == this.mntmConfigCantOpt) {
			actionPerformedMntmConfigurarCantidadptima(arg0);
		}
		if (arg0.getSource() == this.mntmConfigObsquio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == this.mntmConfigDesc) {
			actionPerformedMntmConfigDesc(arg0);
		}
		if (arg0.getSource() == this.mntmGeneReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == this.mntmVenderPro) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == this.mntmListarPapel) {
			actionPerformedMntmListarPape1(arg0);
		}
		if (arg0.getSource() == this.mntmModPapel) {
			actionPerformedMntmModPapel(arg0);
		}
		if (arg0.getSource() == this.mntmConsPapel) {
			actionPerformedMntmConsultar(arg0);
		}
		if (arg0.getSource() == this.mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		System.exit(0);
	}
	protected void actionPerformedMntmConsultar(ActionEvent arg0) {
		ClassConsultarPapel ConsPapel = new ClassConsultarPapel();
		ConsPapel.setLocationRelativeTo(this);
		ConsPapel.setVisible(true);
		ConsPapel.getinfomarca0();
	}
	protected void actionPerformedMntmModPapel(ActionEvent arg0) {
		ClassModificarPapel ModPapel = new ClassModificarPapel();
		ModPapel.setLocationRelativeTo(this);
		ModPapel.setVisible(true);
		ModPapel.getinfomarca0();
	}
	protected void actionPerformedMntmListarPape1(ActionEvent arg0) {
		ClassListarPapeles ListPapel = new ClassListarPapeles();
		ListPapel.setLocationRelativeTo(this);
		ListPapel.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		ClassVender Vender = new ClassVender();
		Vender.setLocationRelativeTo(this);
		Vender.setVisible(true);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		ClassGenerarReportes GenrReportes = new ClassGenerarReportes();
		GenrReportes.setLocationRelativeTo(this);
		GenrReportes.setVisible(true);
	}
	protected void actionPerformedMntmConfigDesc(ActionEvent arg0) {
		ClassConfigDescuentos JConfigDesc = new ClassConfigDescuentos();
		JConfigDesc.setLocationRelativeTo(this);
		JConfigDesc.setVisible(true);
		JConfigDesc.runer();
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		ClassConfigObsequio JConfigObsq = new ClassConfigObsequio();
		JConfigObsq.setLocationRelativeTo(this);
		JConfigObsq.setVisible(true);
		JConfigObsq.runner();
	}
	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent arg0) {
		ClassConfigMaxCantRamasVend JConfigMaxCantidad = new ClassConfigMaxCantRamasVend();
		JConfigMaxCantidad.setLocationRelativeTo(this);
		JConfigMaxCantidad.setVisible(true);
		JConfigMaxCantidad.runner();
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		ClassConfigPreSorpresa JConfigPremioSor = new ClassConfigPreSorpresa();
		JConfigPremioSor.setLocationRelativeTo(this);
		JConfigPremioSor.setVisible(true);
		JConfigPremioSor.runner();
	}
	
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		ClassAyuda JAyuda = new ClassAyuda();
		JAyuda.setLocationRelativeTo(this);
		JAyuda.setVisible(true);
	}

	protected void actionPerformedVender(ActionEvent arg0) {
		ClassVender Vender = new ClassVender();
		Vender.setLocationRelativeTo(this);
		Vender.setVisible(true);
	}
	protected void actionPerformedAccesModPapel(ActionEvent arg0) {
		ClassModificarPapel ConsPapel = new ClassModificarPapel();
		ConsPapel.setLocationRelativeTo(this);
		ConsPapel.setVisible(true);
		ConsPapel.getinfomarca0();
	}
	protected void actionPerformedReportes(ActionEvent arg0) {
		ClassGenerarReportes GenrReportes = new ClassGenerarReportes();
		GenrReportes.setLocationRelativeTo(this);
		GenrReportes.setVisible(true);
		
	}
	protected void actionPerformedDescuento(ActionEvent arg0) {
		ClassConfigObsequio JConfigObsq = new ClassConfigObsequio();
		JConfigObsq.setLocationRelativeTo(this);
		JConfigObsq.setVisible(true);
		JConfigObsq.runner();				
	}
	
	protected void actionPerformedConfiguracion(ActionEvent arg0) {
	   ClassConfigMaxCantRamasVend JConfigMaxCantidad = new ClassConfigMaxCantRamasVend();
	   JConfigMaxCantidad.setLocationRelativeTo(this);
	   JConfigMaxCantidad.setVisible(true);
	   JConfigMaxCantidad.runner();		
	}
}
