package Matenimiento;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Indice.ClassJFrame;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class ClassModificarPapel extends JDialog implements ActionListener, ItemListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private static final KeyEvent ke = null;
	private final JPanel contentPanel = new JPanel();
	@SuppressWarnings("rawtypes")
	private JComboBox cboMarca;
	private JButton btnCerrar;
	private JButton btnGrabar;
	private static JTextField txtDimension;
	private static JTextField txtGramaje;
	private static JTextField txtBlancura;
	private static JTextField txtPrecio;
	private JLabel lblMarca;
	private JLabel lblDimension;
	private JLabel lblGramaje;
	private JLabel lblBlancura;
	private JLabel lblPrecios;


	//VARIABLES GLOBALES 
	//===================================================================//
	// Datos mínimos de la primera marca
	public static String marca0 = "Class Bond";
	public static String dimensiones0 = "21.6 x 28.0 cm";
	public static double gramaje0 = 74.8;
	public static double blancura0 = 90.2;
	public static double precio0 = 12.0;
	// Datos mínimos de la segunda marca
	public static String marca1 = "Copy Premium";
	public static String dimensiones1 = "21.6 x 27.9 cm";
	public static double gramaje1 = 74.3;
	public static double blancura1 = 90.0;
	public static double precio1 = 11.5;
	// Datos mínimos de la tercera marca
	public static String marca2 = "Master Bond";
	public static String dimensiones2 = "21.6 x 28.0 cm";
	public static double gramaje2 = 74.4;
	public static double blancura2 = 90.3;
	public static double precio2 = 13.0;
	// Datos mínimos de la cuarta marca
	public static String marca3 = "Vision Bond";
	public static String dimensiones3 = "21.6 x 27.9 cm";
	public static double gramaje3 = 74.5;
	public static double blancura3 = 96.1;
	public static double precio3 = 14.5;
	// Datos mínimos de la quinta marca
	public static String marca4 = "Copy Paper";
	public static String dimensiones4 = "21.6 x 27.9";
	public static double gramaje4 = 75.0;
	public static double blancura4 = 93.9;
	public static double precio4 = 11.0;
	private JLabel lblFondo;
	private AWTEvent evt;

	
	//VARIABLES GLOBALES 
	//===================================================================//

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassModificarPapel dialog = new ClassModificarPapel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	public ClassModificarPapel() {
		setTitle("Modificar Papel");
		setBounds(100, 100, 446, 252);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.cboMarca = new JComboBox();
		this.cboMarca.setBackground(new Color(204, 204, 255));
		this.cboMarca.addItemListener(this);
		this.cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Class Bond", "Copy Premium", "Master Bond", "Vision Bond", "Copy Paper"}));
		this.cboMarca.setBounds(118, 24, 173, 20);
		contentPanel.add(this.cboMarca);
		
		this.btnCerrar = new JButton("Cerrar");
		this.btnCerrar.setForeground(new Color(255, 255, 255));
		this.btnCerrar.setBackground(new Color(204, 0, 0));
		this.btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
		this.btnCerrar.setIcon(new ImageIcon(ClassModificarPapel.class.getResource("/paquete/imagenes/cerrar.png")));
		this.btnCerrar.addActionListener(this);
		this.btnCerrar.setBounds(330, 11, 94, 33);
		contentPanel.add(this.btnCerrar);
		
		this.btnGrabar = new JButton("Grabar");
		this.btnGrabar.setForeground(new Color(255, 255, 255));
		this.btnGrabar.setBackground(new Color(102, 204, 51));
		this.btnGrabar.setHorizontalAlignment(SwingConstants.LEFT);
		this.btnGrabar.setIcon(new ImageIcon(ClassModificarPapel.class.getResource("/paquete/imagenes/check.png")));
		this.btnGrabar.addActionListener(this);
		this.btnGrabar.setBounds(330, 55, 94, 30);
		contentPanel.add(this.btnGrabar);
		
		this.txtDimension = new JTextField();
		txtDimension.setForeground(new Color(0, 102, 0));
		this.txtDimension.setBounds(118, 55, 173, 20);
		contentPanel.add(this.txtDimension);
		this.txtDimension.setColumns(10);
		
		this.txtGramaje = new JTextField();
		txtGramaje.addKeyListener(this);
		txtGramaje.setForeground(new Color(0, 102, 0));
		this.txtGramaje.setColumns(10);
		this.txtGramaje.setBounds(118, 90, 173, 20);
		contentPanel.add(this.txtGramaje);
		
		this.txtBlancura = new JTextField();
		txtBlancura.addKeyListener(this);
		txtBlancura.setForeground(new Color(0, 102, 0));
		this.txtBlancura.setColumns(10);
		this.txtBlancura.setBounds(118, 124, 173, 20);
		contentPanel.add(this.txtBlancura);
		
		this.txtPrecio = new JTextField();
		txtPrecio.addKeyListener(this);
		txtPrecio.setForeground(new Color(0, 102, 0));
		this.txtPrecio.setColumns(10);
		this.txtPrecio.setBounds(118, 156, 173, 20);
		contentPanel.add(this.txtPrecio);
		
		this.lblMarca = new JLabel("Marca");
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setForeground(new Color(102, 153, 51));
		this.lblMarca.setBounds(10, 27, 64, 14);
		contentPanel.add(this.lblMarca);
		
		this.lblDimension = new JLabel("Dimension");
		this.lblDimension.setForeground(new Color(102, 153, 51));
		this.lblDimension.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblDimension.setBounds(10, 58, 76, 14);
		contentPanel.add(this.lblDimension);
		
		this.lblGramaje = new JLabel("Gramaje");
		this.lblGramaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblGramaje.setForeground(new Color(102, 153, 51));
		this.lblGramaje.setBounds(10, 93, 64, 14);
		contentPanel.add(this.lblGramaje);
		
		this.lblBlancura = new JLabel("Blancura");
		this.lblBlancura.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblBlancura.setForeground(new Color(102, 153, 51));
		this.lblBlancura.setBounds(10, 127, 64, 14);
		contentPanel.add(this.lblBlancura);
		
		this.lblPrecios = new JLabel("Precios");
		this.lblPrecios.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPrecios.setForeground(new Color(102, 153, 51));
		this.lblPrecios.setBounds(10, 159, 64, 14);
		contentPanel.add(this.lblPrecios);
		
		this.lblFondo = new JLabel("");
		this.lblFondo.setIcon(new ImageIcon(ClassModificarPapel.class.getResource("/paquete/imagenes/fondo4.png")));
		this.lblFondo.setBounds(0, 0, 435, 214);
		contentPanel.add(this.lblFondo);
	}

	
	public /*¨
	 *AGINAMOS METODOS PARA CADA MARCA ASI SERA MAS FACIL DE ENTENDER EL CODIGO
	 *==========================================================================*
	 */
	
	void getinfomarca0(){
	String dimens0 = (String) ClassModificarPapel.dimensiones0;
	double gramaje0 = ClassModificarPapel.gramaje0;
	double blancura0 = ClassModificarPapel.blancura0;
	double precio0  = ClassModificarPapel.precio0;
	datosdemarca(dimens0,gramaje0,blancura0,precio0);
	}
	void getinfomarca1(){
	String dimens1 = (String) ClassModificarPapel.dimensiones1;
	double gramaje1 = ClassModificarPapel.gramaje1;
	double blancura1 = ClassModificarPapel.blancura1;
	double precio1  = ClassModificarPapel.precio1;
	datosdemarca(dimens1,gramaje1,blancura1,precio1);
	}
	void getinfomarca2(){
	String dimens2 = (String) ClassModificarPapel.dimensiones2;
	double gramaje2 = ClassModificarPapel.gramaje2;
	double blancura2 = ClassModificarPapel.blancura2;
	double precio2  = ClassModificarPapel.precio2;
	datosdemarca(dimens2,gramaje2,blancura2,precio2);
	}
	void getinfomarca3(){
	String dimens3 = (String) ClassModificarPapel.dimensiones3;
	double gramaje3 = ClassModificarPapel.gramaje3;
	double blancura3 = ClassModificarPapel.blancura3;
	double precio3  = ClassModificarPapel.precio3;
	datosdemarca(dimens3,gramaje3,blancura3,precio3);
	}
	void getinfomarca4(){
	String dimens4 = (String) ClassModificarPapel.dimensiones4;
	double gramaje4 = ClassModificarPapel.gramaje4;
	double blancura4 = ClassModificarPapel.blancura4;
	double precio4  = ClassModificarPapel.precio4;
	datosdemarca(dimens4,gramaje4,blancura4,precio4);
	}
	
	/*¨
	 *ESTE METODO CON PARAMETROS RECIBE LOS EL VALOR ASIGNADO Y IMPRIME LO QUE LE ESTAS MANDANDO 
	 *============================================================================================*
	 */
	static void datosdemarca(String dimension , double gramaje , double blancura , double precio){
		txtDimension.setText(dimension);
		txtGramaje.setText(""+gramaje);
		txtBlancura.setText(""+blancura);
		txtPrecio.setText(""+precio);
	}
	
	 void guardardatos0(){
		String vardimension0 = txtDimension.getText();
		dimensiones0 = vardimension0;
	    txtDimension.setText(""+vardimension0);
	    
		double vargramaje0 = Double.parseDouble(txtGramaje.getText());
		gramaje0 = vargramaje0;
	    txtGramaje.setText(""+vargramaje0);   
	    
		double varblancura0 = Double.parseDouble(txtBlancura.getText());
		blancura0 = varblancura0;
	    txtBlancura.setText(""+varblancura0);   
	    
		double varprecio0 = Double.parseDouble(txtPrecio.getText());
		precio0 = varprecio0;
	    txtPrecio.setText(""+varprecio0);   
	}
	 
	 void guardardatos1(){
			String vardimension1 = txtDimension.getText();
			dimensiones1 = vardimension1;
		    txtDimension.setText(""+vardimension1);
		    
			double vargramaje1 = Double.parseDouble(txtGramaje.getText());
			gramaje1 = vargramaje1;
		    txtGramaje.setText(""+vargramaje1);   
		    
			double varblancura1 = Double.parseDouble(txtBlancura.getText());
			blancura1 = varblancura1;
		    txtBlancura.setText(""+varblancura1);   
		    
			double varprecio1 = Double.parseDouble(txtPrecio.getText());
			precio1 = varprecio1;
		    txtPrecio.setText(""+varprecio1);   
		}
	 
	 
	 void guardardatos2(){
			String vardimension2 = txtDimension.getText();
			dimensiones2 = vardimension2;
		    txtDimension.setText(""+vardimension2);
		    
			double vargramaje2 = Double.parseDouble(txtGramaje.getText());
			gramaje2 = vargramaje2;
		    txtGramaje.setText(""+vargramaje2);   
		    
			double varblancura2 = Double.parseDouble(txtBlancura.getText());
			blancura2 = varblancura2;
		    txtBlancura.setText(""+varblancura2);   
		    
			double varprecio2 = Double.parseDouble(txtPrecio.getText());
			precio2 = varprecio2;
		    txtPrecio.setText(""+varprecio2);   
		}
	 
	 
	 void guardardatos3(){
			String vardimension3 = txtDimension.getText();
			dimensiones3 = vardimension3;
		    txtDimension.setText(""+vardimension3);
		    
			double vargramaje3 = Double.parseDouble(txtGramaje.getText());
			gramaje3 = vargramaje3;
		    txtGramaje.setText(""+vargramaje3);   
		    
			double varblancura3 = Double.parseDouble(txtBlancura.getText());
			blancura3 = varblancura3;
		    txtBlancura.setText(""+varblancura3);   
		    
			double varprecio3 = Double.parseDouble(txtPrecio.getText());
			precio3 = varprecio3;
		    txtPrecio.setText(""+varprecio3);   
		}
	 
	 void guardardatos4(){
			String vardimension4 = txtDimension.getText();
			dimensiones4 = vardimension4;
		    txtDimension.setText(""+vardimension4);
		    
			double vargramaje4 = Double.parseDouble(txtGramaje.getText());
			gramaje4 = vargramaje4;
		    txtGramaje.setText(""+vargramaje4);   
		    
			double varblancura4 = Double.parseDouble(txtBlancura.getText());
			blancura4 = varblancura4;
		    txtBlancura.setText(""+varblancura4);   
		    
			double varprecio4 = Double.parseDouble(txtPrecio.getText());
			precio4 = varprecio4;
		    txtPrecio.setText(""+varprecio4);   
		}
	

	/*¨
	 *ESTE METODO ELIJE AL TIPO DE MARCA Y RAPIDAMENTE IMPRIME SU RESPECTIVO METODO  
	 *============================================================================================*
	 */
	void preguntarmarca(){
		int categoria = cboMarca.getSelectedIndex();
		if(categoria == 0) {
			getinfomarca0();
		}else if(categoria == 1 ){
			getinfomarca1();
		}else if(categoria == 2 ){
			getinfomarca2();
		}else if(categoria == 3 ){
			getinfomarca3();
		}else{
			getinfomarca4();
		}
	}
	
	/*¨
	 *ESTE METODO ELIJE AL TIPO DE MARCA Y RAPIDAMENTE IMPRIME SU RESPECTIVO METODO  
	 *============================================================================================*
	 */	
	void savemarcas(){
	int categoria = cboMarca.getSelectedIndex();
	if(categoria == 0) {
		guardardatos0();
	}else if(categoria == 1 ){
		guardardatos1();
	}else if(categoria == 2 ){
		guardardatos2();
	}else if(categoria == 3 ){
		guardardatos3();
	}else{
		guardardatos4();}
	}
	
	/*¨
	 *METODO CON ACCION ITEN STATE CHANGED PARA EL JCOMBOBOX  
	 *============================================================================================*
	 */	
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == this.cboMarca) {
			itemStateChangedCboMarca(arg0);}
	}
	protected void itemStateChangedCboMarca(ItemEvent arg0) {
		preguntarmarca();
	}
	/*¨
	 *ACCIONES PARA EL BOTOM CERRAR Y GRABAR
	 *============================================================================================*
	 */	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == this.btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		savemarcas();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
//FIN//	
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtGramaje) {
			keyTypedTxtGramaje(arg0);
		}
		if (arg0.getSource() == txtBlancura) {
			keyTypedTxtBlancura(arg0);
		}
		if (arg0.getSource() == txtPrecio) {
			keyTypedTxtPrecio(arg0);
		}
	}

	protected void keyTypedTxtPrecio(KeyEvent arg0) {
		
		char caracter = arg0.getKeyChar();
	     if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
	       arg0.consume();
	     }
	     if (txtPrecio.getText().length()== 6){
		    arg0.consume();
			JOptionPane.showMessageDialog(null, "Numeros Maximos en Precio 6", "Error",JOptionPane.INFORMATION_MESSAGE);
		}
	    
	}
	
	protected void keyTypedTxtBlancura(KeyEvent arg0) {
		char caracter = arg0.getKeyChar();
	     if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
	       arg0.consume();
	     }
	     if (txtBlancura.getText().length()== 2){
		    arg0.consume();
			JOptionPane.showMessageDialog(null, "Esta permitido de 1% al 99%", "Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	protected void keyTypedTxtGramaje(KeyEvent arg0) {
		char caracter = arg0.getKeyChar();
	     if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
	       arg0.consume();
	     }
	     if (txtGramaje.getText().length()== 6){
		    arg0.consume();
			JOptionPane.showMessageDialog(null, "Maximo de cararacteres permitidos 6", "Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
