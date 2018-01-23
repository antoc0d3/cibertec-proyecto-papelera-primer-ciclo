package Indice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;


import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("unused")
public class ClassAyuda extends JDialog implements MouseListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblPapelesSac;
	private JLabel lbVersion;
	private JLabel lblJacintoBlasJerson;
	private JLabel lblDesarroladores;
	private JLabel lblDiseGraficos;
	private JLabel lblNombre;
	private JLabel lblNombre_1;
	private JLabel lblNombre_2;
	private JPanel fondodevelopers;
	private JLabel lblWebsitehelp;
	private JLabel lblSoporteMail;
	private JLabel labelSoporteTelef;
	private JLabel label;
	private JLabel lblPapeleraNacionalSa;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassAyuda dialog = new ClassAyuda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ClassAyuda() {
		setTitle("Software - Papeles S.A  - Ayuda");
		setBounds(100, 100, 434, 521);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.fondodevelopers = new JPanel();
		this.fondodevelopers.setBounds(0, 0, 439, 0);
		contentPanel.add(this.fondodevelopers);
		this.fondodevelopers.setLayout(new BorderLayout(0, 0));
		
		this.lblPapelesSac = new JLabel("Papeles S.A.C");
		this.lblPapelesSac.setIcon(new ImageIcon(ClassAyuda.class.getResource("/paquete/imagenes/logo.png")));
		this.lblPapelesSac.setForeground(new Color(255, 250, 250));
		this.lblPapelesSac.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPapelesSac.setFont(new Font("Yu Gothic Light", Font.PLAIN, 21));
		this.lblPapelesSac.setBounds(104, 11, 233, 72);
		contentPanel.add(this.lblPapelesSac);
		
		this.lbVersion = new JLabel("AIO Papeleras Soft - Version 1.0.0");
		this.lbVersion.setForeground(new Color(255, 255, 255));
		this.lbVersion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.lbVersion.setBounds(104, 107, 233, 31);
		contentPanel.add(this.lbVersion);
		
		this.lblJacintoBlasJerson = new JLabel(" JACINTO BLAS JERSON ");
		this.lblJacintoBlasJerson.setForeground(new Color(255, 250, 250));
		this.lblJacintoBlasJerson.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblJacintoBlasJerson.setBounds(120, 160, 187, 37);
		contentPanel.add(this.lblJacintoBlasJerson);
		
		this.lblDesarroladores = new JLabel("Desarrolladores");
		this.lblDesarroladores.setForeground(new Color(102, 205, 170));
		this.lblDesarroladores.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.lblDesarroladores.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblDesarroladores.setBounds(151, 125, 121, 43);
		contentPanel.add(this.lblDesarroladores);
		
		this.lblDiseGraficos = new JLabel(" Dise\u00F1adores Graficos & GUI");
		this.lblDiseGraficos.setForeground(new Color(102, 205, 170));
		this.lblDiseGraficos.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.lblDiseGraficos.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblDiseGraficos.setBounds(104, 234, 217, 31);
		contentPanel.add(this.lblDiseGraficos);
		
		this.lblNombre = new JLabel("  CAPCHA LOAYZA EDER");
		this.lblNombre.setForeground(new Color(255, 250, 250));
		this.lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNombre.setBounds(120, 197, 187, 37);
		contentPanel.add(this.lblNombre);
		
		this.lblNombre_1 = new JLabel("  ESPINOZA OLIVOS SMITH");
		this.lblNombre_1.setForeground(new Color(255, 250, 250));
		this.lblNombre_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNombre_1.setBounds(140, 276, 156, 22);
		contentPanel.add(this.lblNombre_1);
		
		this.lblNombre_2 = new JLabel("  BATALLA SALDIVAR YOMAR");
		this.lblNombre_2.setForeground(new Color(255, 250, 250));
		this.lblNombre_2.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNombre_2.setBounds(120, 309, 201, 22);
		contentPanel.add(this.lblNombre_2);
		
		this.lblWebsitehelp = new JLabel("WWW.SISTEMASAIO.COM.PE");
		this.lblWebsitehelp.addMouseListener(this);
		this.lblWebsitehelp.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblWebsitehelp.setForeground(new Color(0, 255, 102));
		this.lblWebsitehelp.setFont(new Font("Tahoma", Font.BOLD, 17));
		this.lblWebsitehelp.setBounds(85, 342, 249, 22);
		contentPanel.add(this.lblWebsitehelp);
		
		this.lblSoporteMail = new JLabel("soporte_online@sistemasaio.com.pe");
		this.lblSoporteMail.setForeground(new Color(255, 255, 204));
		this.lblSoporteMail.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblSoporteMail.setBounds(104, 375, 214, 14);
		contentPanel.add(this.lblSoporteMail);
		
		this.labelSoporteTelef = new JLabel("(051)-777-7474");
		this.labelSoporteTelef.setForeground(new Color(255, 255, 204));
		this.labelSoporteTelef.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelSoporteTelef.setBounds(170, 400, 88, 14);
		contentPanel.add(this.labelSoporteTelef);
		
		this.lblPapeleraNacionalSa = new JLabel("Papelera Nacional S.A");
		this.lblPapeleraNacionalSa.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPapeleraNacionalSa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.lblPapeleraNacionalSa.setForeground(new Color(255, 255, 255));
		this.lblPapeleraNacionalSa.setBounds(139, 69, 168, 27);
		contentPanel.add(this.lblPapeleraNacionalSa);
		
		this.label = new JLabel("");
		this.label.setIcon(new ImageIcon(ClassAyuda.class.getResource("/paquete/imagenes/fondo-Ayuda.png")));
		this.label.setBounds(0, 0, 418, 482);
		contentPanel.add(this.label);
	}
	
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == this.lblWebsitehelp) {
			mouseClickedLblWebsitehelp(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedLblWebsitehelp(MouseEvent arg0) {
	String direccion = "http://www.forosdelweb.com";
	try{
	   Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion);
	}catch(Exception err){

	  }
	}
}
