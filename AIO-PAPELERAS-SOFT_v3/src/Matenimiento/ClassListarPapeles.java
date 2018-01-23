package Matenimiento;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ClassListarPapeles extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JScrollPane scrollPane;
	private JLabel lblFondo;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassListarPapeles dialog = new ClassListarPapeles();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ClassListarPapeles() {
		setTitle("Listar Papel");
		setBounds(100, 100, 569, 384);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.btnCerrar = new JButton("Cerrar");
		this.btnCerrar.setIcon(new ImageIcon(ClassListarPapeles.class.getResource("/paquete/imagenes/cerrar.png")));
		this.btnCerrar.setBackground(new Color(204, 51, 51));
		this.btnCerrar.setForeground(new Color(255, 255, 255));
		this.btnCerrar.addActionListener(this);
		this.btnCerrar.setBounds(301, 291, 105, 43);
		contentPanel.add(this.btnCerrar);
		
		this.btnListar = new JButton("Listar");
		this.btnListar.setBackground(new Color(51, 153, 0));
		this.btnListar.setForeground(new Color(255, 255, 255));
		this.btnListar.setIcon(new ImageIcon(ClassListarPapeles.class.getResource("/paquete/imagenes/check.png")));
		this.btnListar.addActionListener(this);
		this.btnListar.setBounds(176, 291, 98, 43);
		contentPanel.add(this.btnListar);
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBounds(10, 11, 533, 256);
		contentPanel.add(this.scrollPane);
		
		this.txtS = new JTextArea();
		this.txtS.setForeground(new Color(51, 102, 0));
		this.txtS.setEditable(false);
		this.scrollPane.setViewportView(this.txtS);
		
		this.lblFondo = new JLabel("");
		this.lblFondo.setIcon(new ImageIcon(ClassListarPapeles.class.getResource("/paquete/imagenes/fondo-jframe.png")));
		this.lblFondo.setBackground(new Color(102, 0, 204));
		this.lblFondo.setBounds(0, 0, 553, 345);
		contentPanel.add(this.lblFondo);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == this.btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	
	/*¨
	 * HACEMOS EL LLAMADO DE DATOS DE LAS VARIABLES GLOBALES EN METODOS VACIOS 
	 *========================================================================================*
	 */	
    void getinfomarca0(){
	String marca0 = (String) ClassModificarPapel.marca0;	
	String dimens0 = (String) ClassModificarPapel.dimensiones0;
	double gramaje0 = ClassModificarPapel.gramaje0;
	double blancura0 = ClassModificarPapel.blancura0;
	double precio0  = ClassModificarPapel.precio0;
	datosdemarca(marca0,dimens0,gramaje0,blancura0,precio0);
	}
	void getinfomarca1(){
	String marca1 = (String) ClassModificarPapel.marca1;	
	String dimens1 = (String) ClassModificarPapel.dimensiones1;
	double gramaje1 = ClassModificarPapel.gramaje1;
	double blancura1 = ClassModificarPapel.blancura1;
	double precio1  = ClassModificarPapel.precio1;
	datosdemarca(marca1,dimens1,gramaje1,blancura1,precio1);
	}
	void getinfomarca2(){
	String marca2 = (String) ClassModificarPapel.marca2;
	String dimens2 = (String) ClassModificarPapel.dimensiones2;
	double gramaje2 = ClassModificarPapel.gramaje2;
	double blancura2 = ClassModificarPapel.blancura2;
	double precio2  = ClassModificarPapel.precio2;
	datosdemarca(marca2,dimens2,gramaje2,blancura2,precio2);
	}
	void getinfomarca3(){
    String marca3 = (String) ClassModificarPapel.marca3;	
	String dimens3 = (String) ClassModificarPapel.dimensiones3;
	double gramaje3 = ClassModificarPapel.gramaje3;
	double blancura3 = ClassModificarPapel.blancura3;
	double precio3  = ClassModificarPapel.precio3;
	datosdemarca(marca3,dimens3,gramaje3,blancura3,precio3);
	}
	void getinfomarca4(){
	String marca4 = (String) ClassModificarPapel.marca4;	
	String dimens4 = (String) ClassModificarPapel.dimensiones4;
	double gramaje4 = ClassModificarPapel.gramaje4;
	double blancura4 = ClassModificarPapel.blancura4;
	double precio4  = ClassModificarPapel.precio4;
	datosdemarca(marca4,dimens4,gramaje4,blancura4,precio4);
	}
	/*¨
	 * METODO VACIO PARA RECIBIR DATOS E IMPRIMIRLOS EN UM METODO IMPRIMIR MUY CONOCIDO
	 *========================================================================================*
	 */	
	 void datosdemarca(String marca , String dimension , double gramaje , double blancura , double precio){
		imprimir("");
		imprimir(" Marca         	: "+marca);
		imprimir(" Dimensiones    : "+dimension);
		imprimir(" Gramaje       	: "+gramaje+" g/m²");
		imprimir(" Blancura      	: "+blancura+" %");
		imprimir(" Precio        	: S/."+precio);
	}

	/*¨
	 * METODO  IMPRIMIR ES SU COMPLENTO DE DATOSMARCA
	 *========================================================================================*
	 */	
	void imprimir(String marca){
		txtS.append(marca+"\n");
	}
	
	
	/*¨
	 * JBUTOMS CON ACCIONES EL FAMOSO ACTIONPERFORMED
	 *========================================================================================*
	 */		
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText(" LISTADO DE PAPELES\n");
		getinfomarca0();
		getinfomarca1();
		getinfomarca2();
		getinfomarca3();
		getinfomarca4();
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
