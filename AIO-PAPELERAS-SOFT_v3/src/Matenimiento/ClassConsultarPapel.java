package Matenimiento;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class ClassConsultarPapel extends JDialog implements ItemListener, ActionListener {

	private static final long serialVersionUID = 6842668409438714216L;
	private final JPanel contentPanel = new JPanel();
	@SuppressWarnings("rawtypes")
	private JComboBox cboMarca;
	private static JTextField txtDimension;
	private static JTextField txtGramaje;
	private static JTextField txtBlancura;
	private JButton btnCancelar;
	private JLabel lblMarca;
	private JLabel lblDimension;
	private JLabel lblGramaje;
	private JLabel lblBlancura;
	private JLabel lblPrecios;
	private static JTextField txtPrecio;
	private JLabel lblFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassConsultarPapel dialog = new ClassConsultarPapel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "static-access", "rawtypes", "unchecked" })
	public ClassConsultarPapel() {
		setTitle("Consultar Papel");
		setBounds(100, 100, 340, 299);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.cboMarca = new JComboBox();
		this.cboMarca.setForeground(Color.BLACK);
		this.cboMarca.setBackground(new Color(204, 204, 255));
		this.cboMarca.addItemListener(this);
		this.cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Class Bond", "Copy Premium", "Master Bond", "Vision Bond", "Copy Paper"}));
		this.cboMarca.setBounds(106, 28, 202, 23);
		contentPanel.add(this.cboMarca);
		
		this.txtDimension = new JTextField();
		txtDimension.setForeground(new Color(0, 102, 0));
		txtDimension.setEditable(false);
		this.txtDimension.setBounds(106, 62, 202, 20);
		contentPanel.add(this.txtDimension);
		this.txtDimension.setColumns(10);
		
		this.txtGramaje = new JTextField();
		txtGramaje.setForeground(new Color(0, 102, 0));
		txtGramaje.setEditable(false);
		this.txtGramaje.setColumns(10);
		this.txtGramaje.setBounds(106, 93, 202, 20);
		contentPanel.add(this.txtGramaje);
		
		this.txtBlancura = new JTextField();
		txtBlancura.setForeground(new Color(0, 102, 0));
		txtBlancura.setEditable(false);
		this.txtBlancura.setColumns(10);
		this.txtBlancura.setBounds(106, 124, 202, 20);
		contentPanel.add(this.txtBlancura);
		
		this.btnCancelar = new JButton("Cancelar");
		this.btnCancelar.setIcon(new ImageIcon(ClassConsultarPapel.class.getResource("/paquete/imagenes/cerrar.png")));
		this.btnCancelar.setBackground(new Color(204, 0, 0));
		this.btnCancelar.setForeground(new Color(255, 255, 255));
		this.btnCancelar.addActionListener(this);
		
		this.txtPrecio = new JTextField();
		txtPrecio.setForeground(new Color(0, 102, 0));
		txtPrecio.setEditable(false);
		this.txtPrecio.setColumns(10);
		this.txtPrecio.setBounds(106, 164, 202, 20);
		contentPanel.add(this.txtPrecio);
		this.btnCancelar.setBounds(106, 219, 114, 34);
		contentPanel.add(this.btnCancelar);
		
		this.lblMarca = new JLabel("Marca ");
		this.lblMarca.setForeground(new Color(51, 153, 0));
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setBounds(10, 32, 46, 14);
		contentPanel.add(this.lblMarca);
		
		this.lblDimension = new JLabel("Dimension");
		this.lblDimension.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblDimension.setForeground(new Color(51, 153, 0));
		this.lblDimension.setBounds(10, 65, 89, 14);
		contentPanel.add(this.lblDimension);
		
		this.lblGramaje = new JLabel("Gramaje");
		this.lblGramaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblGramaje.setForeground(new Color(51, 153, 0));
		this.lblGramaje.setBounds(10, 96, 75, 14);
		contentPanel.add(this.lblGramaje);
		
		this.lblBlancura = new JLabel("Blancura");
		this.lblBlancura.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblBlancura.setForeground(new Color(51, 153, 0));
		this.lblBlancura.setBounds(10, 127, 75, 14);
		contentPanel.add(this.lblBlancura);
		
		this.lblPrecios = new JLabel("Precio (S/.)");
		this.lblPrecios.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPrecios.setForeground(new Color(51, 153, 0));
		this.lblPrecios.setBounds(10, 167, 75, 14);
		contentPanel.add(this.lblPrecios);
		
		this.lblFondo = new JLabel("");
		this.lblFondo.setIcon(new ImageIcon(ClassConsultarPapel.class.getResource("/paquete/imagenes/fondo-consultar-papel.png")));
		this.lblFondo.setBounds(0, 0, 324, 261);
		contentPanel.add(this.lblFondo);
	}
	public  /*¨
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
	 *ESTE METODO CON PARAMETROS RECIBE PARAMETROS CON VALOR Y IPRIME LO QUE LE ESTAS MANDANDO 
	 *============================================================================================*
	 */
	static void datosdemarca(String dimension , double gramaje , double blancura , double precio){
		txtDimension.setText(dimension);
		txtGramaje.setText(""+gramaje);
		txtBlancura.setText(""+blancura);
		txtPrecio.setText(""+precio);
	}
	/*¨
	 *ESTE METODO ELIJE AL TIPO DE MARCA Y RAPIDAMENTE IMPRIME SU RESPECTIVO METODO  
	 *============================================================================================*
	 */
	void preguntarmarca(){
		int categoria = cboMarca.getSelectedIndex();
		if(categoria == 0){
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
	 *ESTE METODO TIENE UNA ACCION LLAMADA (ITEN STATE CHARGED) - EJECUTA UN LLAMADO DE INFORMACION AL SELECCIONAR UNA OPCION 
	 *==========================================================================================================================*
	 */	
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == this.cboMarca) {
			itemStateChangedCboMarca(arg0);
		}
	}
	protected void itemStateChangedCboMarca(ItemEvent arg0) {
		preguntarmarca();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
	}
	
	//CIERRE DEL JDIALOG //
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		dispose();
	}
}
