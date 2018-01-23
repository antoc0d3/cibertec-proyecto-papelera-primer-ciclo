package Configuracion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("unused")
public class ClassConfigDescuentos extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private static final KeyEvent evt = null;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblDescuento2;
	private JLabel lblDescuento3;
	private JLabel lblDescuento4;
	private JLabel lblSimboPorc1;
	private JLabel lblSimboPorc2;
	private JLabel lblSimboPorc3;
	private JLabel lblSimboPorc4;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private static JTextField txtDescuento1;
	private static JTextField txtDescuento2;
	private static JTextField txtDescuento3;
	private static JTextField txtDescuento4;
	/*¨
	 * VARIABLES GLOBALES
	 *======================== *
	 */	
	public static double porcentaje1 = 4.0;
	public static double porcentaje2 = 5.5;
	public static double porcentaje3 = 7.0;
	public static double porcentaje4 = 8.5;
	
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			ClassConfigDescuentos dialog = new ClassConfigDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings("static-access")
	public ClassConfigDescuentos() {
		setTitle("Configurar - Descuento");
		setBounds(100, 100, 460, 252);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
	
		JLabel lblDescuento1 = new JLabel("1 a 5 resmas");
		lblDescuento1.setForeground(new Color(51, 153, 0));
		lblDescuento1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescuento1.setBounds(20, 11, 98, 14);
		contentPanel.add(lblDescuento1);
		
		this.lblDescuento2 = new JLabel("6 a 10 resmas");
		this.lblDescuento2.setForeground(new Color(51, 153, 0));
		this.lblDescuento2.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblDescuento2.setBounds(20, 54, 98, 14);
		contentPanel.add(this.lblDescuento2);
		
		this.lblDescuento3 = new JLabel("11 a 15 resmas");
		this.lblDescuento3.setForeground(new Color(51, 153, 0));
		this.lblDescuento3.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblDescuento3.setBounds(20, 96, 98, 14);
		contentPanel.add(this.lblDescuento3);
		
		this.lblDescuento4 = new JLabel("mas de 15 resmas");
		this.lblDescuento4.setForeground(new Color(51, 153, 0));
		this.lblDescuento4.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblDescuento4.setBounds(20, 134, 124, 14);
		contentPanel.add(this.lblDescuento4);
		
		this.txtDescuento1 = new JTextField();
		txtDescuento1.addKeyListener(this);
		this.txtDescuento1.setBounds(154, 8, 115, 20);
		contentPanel.add(this.txtDescuento1);
		this.txtDescuento1.setColumns(10);
		
		this.txtDescuento2 = new JTextField();
		txtDescuento2.addKeyListener(this);
		this.txtDescuento2.setColumns(10);
		this.txtDescuento2.setBounds(154, 51, 115, 20);
		contentPanel.add(this.txtDescuento2);
		
		this.txtDescuento3 = new JTextField();
		txtDescuento3.addKeyListener(this);
		this.txtDescuento3.setColumns(10);
		this.txtDescuento3.setBounds(154, 93, 115, 20);
		contentPanel.add(this.txtDescuento3);
		
		this.txtDescuento4 = new JTextField();
		txtDescuento4.addKeyListener(this);
		this.txtDescuento4.setColumns(10);
		this.txtDescuento4.setBounds(154, 131, 115, 20);
		contentPanel.add(this.txtDescuento4);
		
		this.btnAceptar = new JButton("Aceptar");
		this.btnAceptar.setIcon(new ImageIcon(ClassConfigDescuentos.class.getResource("/paquete/imagenes/check.png")));
		this.btnAceptar.setForeground(new Color(255, 255, 255));
		this.btnAceptar.setBackground(new Color(51, 204, 0));
		this.btnAceptar.addActionListener(this);
		this.btnAceptar.setBounds(327, 7, 107, 23);
		contentPanel.add(this.btnAceptar);
		
		this.btnCancelar = new JButton("Cancelar");
		this.btnCancelar.setIcon(new ImageIcon(ClassConfigDescuentos.class.getResource("/paquete/imagenes/cerrar.png")));
		this.btnCancelar.setForeground(new Color(255, 255, 255));
		this.btnCancelar.setBackground(new Color(204, 0, 0));
		this.btnCancelar.addActionListener(this);
		this.btnCancelar.setBounds(327, 41, 107, 23);
		contentPanel.add(this.btnCancelar);
		
		this.lblSimboPorc1 = new JLabel("%");
		this.lblSimboPorc1.setForeground(new Color(0, 153, 0));
		this.lblSimboPorc1.setBounds(279, 10, 32, 17);
		contentPanel.add(this.lblSimboPorc1);
		
		this.lblSimboPorc2 = new JLabel("%");
		this.lblSimboPorc2.setForeground(new Color(0, 153, 0));
		this.lblSimboPorc2.setBounds(279, 54, 32, 14);
		contentPanel.add(this.lblSimboPorc2);
		
		this.lblSimboPorc3 = new JLabel("%");
		this.lblSimboPorc3.setForeground(new Color(0, 153, 0));
		this.lblSimboPorc3.setBounds(279, 96, 32, 14);
		contentPanel.add(this.lblSimboPorc3);
		
		this.lblSimboPorc4 = new JLabel("%");
		this.lblSimboPorc4.setForeground(new Color(0, 153, 0));
		this.lblSimboPorc4.setBounds(279, 134, 32, 14);
		contentPanel.add(this.lblSimboPorc4);
		
		this.label = new JLabel("");
		this.label.setIcon(new ImageIcon(ClassConfigDescuentos.class.getResource("/paquete/imagenes/Fondo-Config-Descuentos.png")));
		this.label.setBounds(0, 0, 455, 214);
		contentPanel.add(this.label);
	}
	
	
	void alertasdecamposvacios(){
		if(txtDescuento1.getText().length()==0)
		     JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE UN VALOR DEL PRIMER CAMPO 1 a 5 RESMAS");
				
	    if(txtDescuento2.getText().length()==0)
		     JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE UN VALOR DEL SEGUNDO CAMPO 6 a 10 RESMAS");
						
	    if(txtDescuento3.getText().length()==0)
		     JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE UN VALOR DEL TERCER CAMPO 11 a 15 RESMAS");

		 if(txtDescuento4.getText().length()==0)
		     JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE UN VALOR DEL CUARTO CAMPO MAS DE 15 RESMAS");
	}
	
	/*¨
	 *CONFIGURAMOS 2 METODOSS VACIOS SIN PARAMETROS RUNNER ES PARA QUE INICIE AUTOMATICAMENTE LOS CAMPOS 
	 *=================================================================================================== *
	 */
	public void runer(){
		txtDescuento1.setText(""+porcentaje1);
		txtDescuento2.setText(""+porcentaje2);
		txtDescuento3.setText(""+porcentaje3);
		txtDescuento4.setText(""+porcentaje4);
	}
	
	/*¨
	 * ESTE METODO GRABA LOS DESCUENTOS ES COMO ASIGNARLE UN VALOR A UNA VARIABLE PERO ESTA VES LAS VARIABLES 
	 * SON GLOBALES Y EL VALOR QUE LE ASIGNAS SERA GUARDADO  
	 *=================================================================================================== *
	 */
	void grabardescuentos(){
		 porcentaje1 = Double.parseDouble(txtDescuento1.getText());
		 porcentaje2 = Double.parseDouble(txtDescuento2.getText());
		 porcentaje3 = Double.parseDouble(txtDescuento3.getText());
		 porcentaje4 = Double.parseDouble(txtDescuento4.getText());
	}
	
	/*¨
	 *  BOTONES Y ACCIONES PERFORMENS PARA EL PROGRAMA
	 *=================================================================================================== *
	 */	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == this.btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		try{
		grabardescuentos();
		}catch (Exception e2) {
			alertasdecamposvacios();
			}
		}

	
	protected void actionPerformedBtnCancelar(ActionEvent e) {
	   dispose();
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtDescuento4) {
			keyTypedTxtDescuento4(arg0);
		}
		if (arg0.getSource() == txtDescuento3) {
			keyTypedTxtDescuento3(arg0);
		}
		if (arg0.getSource() == txtDescuento2) {
			keyTypedTxtDescuento2(arg0);
		}
		if (arg0.getSource() == txtDescuento1) {
			keyTypedTxtDescuento1(arg0);
		}
	}
	protected void keyTypedTxtDescuento1(KeyEvent arg0) {
		char caracter = arg0.getKeyChar();
		  if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
		      arg0.consume();
		   }
		  if (txtDescuento1.getText().length()== 4){
			  arg0.consume();
		JOptionPane.showMessageDialog(null, "Solo se permite de 1% al 99%", "Error",JOptionPane.INFORMATION_MESSAGE);
		}	
		  
	}
	protected void keyTypedTxtDescuento2(KeyEvent arg0) {
		char caracter = arg0.getKeyChar();
	     if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
	       arg0.consume();
	     }
	     if (txtDescuento2.getText().length()== 4){
		    arg0.consume();
			JOptionPane.showMessageDialog(null, "Solo se permite de 1% al 99%", "Error",JOptionPane.INFORMATION_MESSAGE);
		}

}	protected void keyTypedTxtDescuento3(KeyEvent arg0) {
	char caracter = arg0.getKeyChar();
	  if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
	      arg0.consume();
	   }
	  if (txtDescuento3.getText().length()== 4){
		  arg0.consume();
	JOptionPane.showMessageDialog(null, "Solo se permite de 1% al 99%", "Error",JOptionPane.INFORMATION_MESSAGE);
	}	
	}
	protected void keyTypedTxtDescuento4(KeyEvent arg0) {
		char caracter = arg0.getKeyChar();
		  if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
		      arg0.consume();
		   }
		  if (txtDescuento4.getText().length()== 4){
			  arg0.consume();
		JOptionPane.showMessageDialog(null, "Solo se permite de 1% al 99%", "Error",JOptionPane.INFORMATION_MESSAGE);
		}	
	}
}
