package Ventas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Configuracion.ClassConfigDescuentos;
import Configuracion.ClassConfigObsequio;
import Configuracion.ClassConfigPreSorpresa;
import Matenimiento.ClassModificarPapel;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
//DECIMAL FORMAT PARA LOS DECIMALES EN LOS IMPORTES //
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class ClassVender extends JDialog implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	@SuppressWarnings("rawtypes")
	private JComboBox cboMarca;
	private JButton btnVender;
	private JLabel lblMarca;
	private JTextField txtCantidad;
	private JLabel lblCantidad;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	
	//PARA EL TEMA DE LOS REPORTES //
	public static int ContClientes;

	public static String marca0 =  "Class Bond";
	public static int cantventas0 =  0;
	public static int cantresmas0 =  0;
	public static double ImporAcomulado0 =  0;

	public static String marca1 =  "Copy Premium";
	public static int cantventas1 =  0;
	public static int cantresmas1 =  0;
	public static double ImporAcomulado1 =  0;

	public static String marca2 =  "Master Bond";
	public static int cantventas2 =  0;
	public static int cantresmas2 =  0;
	public static double ImporAcomulado2 =  0;

	public static String marca3 =  "Vision Bond";
	public static int cantventas3 =  0;
	public static int cantresmas3 =  0;
	public static double ImporAcomulado3 =  0;

	public static String marca4 =  "Copy Paper";
	public static int cantventas4 =  0;
	public static int cantresmas4 =  0;
	public static double ImporAcomulado4 =  0;
	private JLabel label;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassVender dialog = new ClassVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ClassVender() {
		setTitle("Vender Papel");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.cboMarca = new JComboBox();
		this.cboMarca.setBackground(new Color(204, 204, 255));
		this.cboMarca.setBounds(133, 13, 164, 25);
		this.cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Class Bond", "Copy Premium", "Master Bond", "Vision Bond", "Copy Paper"}));
		contentPanel.add(this.cboMarca);
		
		this.btnVender = new JButton("Vender");
		this.btnVender.setIcon(new ImageIcon(ClassVender.class.getResource("/paquete/imagenes/vender-ico.png")));
		this.btnVender.setBackground(new Color(51, 153, 0));
		this.btnVender.setForeground(new Color(255, 255, 255));
		this.btnVender.addActionListener(this);
		this.btnVender.setBounds(320, 13, 104, 28);
		contentPanel.add(this.btnVender);
		
		this.lblMarca = new JLabel("Marca");
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setForeground(new Color(51, 153, 0));
		this.lblMarca.setBounds(10, 17, 46, 14);
		contentPanel.add(this.lblMarca);
		
		this.txtCantidad = new JTextField();
		this.txtCantidad.addKeyListener(this);
		this.txtCantidad.setBounds(133, 48, 164, 20);
		contentPanel.add(this.txtCantidad);
		this.txtCantidad.setColumns(10);
		
		this.lblCantidad = new JLabel("Cantidad de resmas");
		this.lblCantidad.setForeground(new Color(51, 153, 0));
		this.lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCantidad.setBounds(10, 50, 125, 14);
		contentPanel.add(this.lblCantidad);
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBounds(10, 89, 414, 161);
		contentPanel.add(this.scrollPane);
		
		this.txtS = new JTextArea();
		this.txtS.setEditable(false);
		this.txtS.setForeground(new Color(0, 102, 0));
		this.scrollPane.setViewportView(this.txtS);
		
		this.label = new JLabel("");
		this.label.setIcon(new ImageIcon(ClassVender.class.getResource("/paquete/imagenes/Fondo-Vender.png")));
		this.label.setBounds(0, 0, 434, 261);
		contentPanel.add(this.label);
	}
	
	/*¨
	 * EN ESTOS METODOS CON RETORNO ALGUNOS CON PARAMETROS SON PARA CALCULAR IMPORTES Y HACER GET DE LOS CAMPOS 
	 *==========================================================================================================*
	 */
	String getMarcaName(){
		return (String) cboMarca.getSelectedItem();
	}
	int getMarcaIndex(){
		return cboMarca.getSelectedIndex();
	}
	int getCantidad(){
		return Integer.parseInt(txtCantidad.getText());
	}

	double PreResma(int Marca){
		switch(Marca){
		case 0 : return  ClassModificarPapel.precio0;
		case 1 : return  ClassModificarPapel.precio1;
		case 2 : return  ClassModificarPapel.precio2;
		case 3 : return  ClassModificarPapel.precio3;		
		default: return  ClassModificarPapel.precio4;	

		}
	}	
	double ImpCompra(int Marca,int Cant){
		switch(Marca){
		case 0 : return  ClassModificarPapel.precio0 * Cant;
		case 1 : return  ClassModificarPapel.precio1 * Cant;
		case 2 : return  ClassModificarPapel.precio2 * Cant;
		case 3: return   ClassModificarPapel.precio3 * Cant;		
		default: return  ClassModificarPapel.precio4 * Cant;	
		}
	}
	
	double ImpDescuento(int Cant , double ImpCompra){
		 double Desc1 = ClassConfigDescuentos.porcentaje1; 
		 double Desc2 = ClassConfigDescuentos.porcentaje2; 
		 double Desc3 = ClassConfigDescuentos.porcentaje3; 
		 double Desc4 = ClassConfigDescuentos.porcentaje4; 
	
		if( Cant > 15 ){
			return ImpCompra * Desc4 / 100;
		}else if(Cant > 11 && Cant <  15){
			return ImpCompra * Desc3 / 100;			
		}else if(Cant > 6 && Cant <  10){
			return ImpCompra * Desc2 / 100;			
		}else{
			return ImpCompra * Desc1 / 100;			
		}
	}
	
	double ImpPagar(double ImpCompra , double ImpDesc){
		return ImpCompra - ImpDesc;
	}
	
	
	void ventas(int MarcaIndex,int Cantidad,double ImpPagar){
		DecimalFormat aiox = new DecimalFormat("0.00");
		switch(MarcaIndex){
		case 0:  cantventas0+=1;cantresmas0+=Cantidad;aiox.format(ImporAcomulado0+=ImpPagar);break;
		case 1:  cantventas1+=1;cantresmas1+=Cantidad;aiox.format(ImporAcomulado1+=ImpPagar);break;
		case 2:  cantventas2+=1;cantresmas2+=Cantidad;aiox.format(ImporAcomulado2+=ImpPagar);break;
		case 3:  cantventas3+=1;cantresmas3+=Cantidad;aiox.format(ImporAcomulado3+=ImpPagar);break;
		default: cantventas4+=1;cantresmas4+=Cantidad;aiox.format(ImporAcomulado4+=ImpPagar);
		}
		
	}
	
	
	/*¨
	 * LOS DECLARE VACIOS POR QUE EN METODO CON RETORNO ME PEDIA QUE RETORNE ALGO AL PONER LA CONDICION CON ELSE 
	 * PERO YO NO QUERIA RETORNAR NADA ASI ESQUE COMO LO VEEZ EN VOID SI FUNCIONA 	}else{ACA NADA }
	 *============================================================================================*
	 */
	
	void Obsequio(int Cant){
		int CantMiniObseq = ClassConfigObsequio.cantidadObsequiable; 
		String Obseq = ClassConfigObsequio.obsequio; 
		if(Cant > CantMiniObseq)
		{ txtS.append(" OBSEQUIO....................................:" +Obseq+ "\n");
		}else{}
	}
	
	/*¨
	 * AQUI CALCULAMOS AL PROSESO DE VENTAS EFECTUADAS CADA VENTA REPRESENTA A UN CLIENTE 
	 * ENTOCES ASIGNAMOS UNA VARIABLE GLOBAL INCREMENTAMOS EN CONDICION HASTA QUE SEA IGUAL AL NUMERO DE CLIENTE SORPRESA
	 *=====================================================================================================================*
	 */
	void PremioSorpresa(){
	 int ClientSorpres = ClassConfigPreSorpresa.numeroClienteSorpresa; 
	 String PreSorp = ClassConfigPreSorpresa.premioSorpresa;
	 int contador = ContClientes+=1;
		if( contador == ClientSorpres ){
			  txtS.append(" PREMIO SORPRESA ..................:" +PreSorp+"\n");
		}else{}
		
	}
	
	/*¨
	 * METODO MOSTRAR DATOS ES METODO VACIO Y CON PARAMETROS Y TIENE 3 METODOS DENTRO DE EL QUE SON
	 * IMPRIMIR VACIO
	 * OBSEQUIO  VACIO Y CON PARAMETRO
	 * PREMIO SORPRESA VACIO  
	 *============================================================================================*
	 */
	void mostrarDatos(String Marca, double PreResma, int Cantidad , double ImpCompra ,double ImpDescuento , double ImpPagar){
		txtS.setText(" PANASA PAPELERA NACIONAL S.A\n");
		txtS.append(" BOUCHER DE VENTA\n\n");
		DecimalFormat FormatNumber = new DecimalFormat("0.00");
		imprimir(" MARCA...........................................: "+Marca);
		imprimir(" PRECIO DE RESMA....................: S/."+FormatNumber.format(PreResma));
		if(Cantidad == 1)imprimir(" CANTIDAD DE RESMAS.............:"+Cantidad+" Resma");
		else{imprimir(" CANTIDAD DE RESMAS.............:"+Cantidad+" Resmas");}
		imprimir(" IMPORTE COMPRA.....................: S/."+FormatNumber.format(ImpCompra));
		imprimir(" IMPORTE DESCUENTO.............: S/."+FormatNumber.format(ImpDescuento));
		Obsequio(Cantidad);
		PremioSorpresa();
		imprimir("-----------------------------------------------------------------------");
		imprimir(" IMPORTE PAGAR.........................: S/."+FormatNumber.format(ImpPagar));
	}
	
	//METODO IMPRIMIR //
	void imprimir(String aio){
		txtS.append(aio +"\n");
	}
	
	/*¨
	 * BOTOM VENDER ACCION = ACCION PERFORMEND
	 *============================================================================================*
	 */
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.btnVender) {
			actionPerformedBtnVender(arg0);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		/*¨
		*LLAMAMOS A TODOS LOS METODOS PARA QUE SE EJECUTEN AL MOMENTO DE PRESIONAR AL BOTOM  VENDER 
		*============================================================================================*
		*/
		try{
		String MarcaName = getMarcaName();
		int MarcaIndex = getMarcaIndex();
		int Cantidad = getCantidad();
		double ImpCompra = ImpCompra(MarcaIndex,Cantidad);
		double ImpDescuento = ImpDescuento(Cantidad ,   ImpCompra);
		double ImpPagar = ImpPagar( ImpCompra , ImpDescuento);
		ventas( MarcaIndex,Cantidad,ImpPagar);
		double PreResma = PreResma(MarcaIndex); 
		if(Cantidad > 0){
		mostrarDatos(MarcaName,PreResma,Cantidad ,ImpCompra ,ImpDescuento ,ImpPagar);
		}else{
			JOptionPane.showMessageDialog(null, "INTRODUCIR UNA CANTIDAD MAYOR QUE 0");			
		}
		}catch(Exception verfierror){
			JOptionPane.showMessageDialog(null, "INTRODUCIR UNA CANTIDAD");
		}
	
		
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == this.txtCantidad) {
			keyTypedTxtCantidad(arg0);
		}
	}
	protected void keyTypedTxtCantidad(KeyEvent arg0) {
		char caracter = arg0.getKeyChar();
	     if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
	       arg0.consume();
	     }
	     if (txtCantidad.getText().length()== 5){
		    arg0.consume();
			JOptionPane.showMessageDialog(null, "Por el momento contamos con poco stock", "Error",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Compre solo lo necesario =)", "Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
