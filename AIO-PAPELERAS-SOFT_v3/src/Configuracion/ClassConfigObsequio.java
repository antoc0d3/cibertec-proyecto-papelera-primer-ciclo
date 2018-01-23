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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class ClassConfigObsequio extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private static JTextField txtCantidadObsequio;
	private static JTextField txtNombreObsequio;
	private JButton btnAceptar;
	/*¨
	* VARIABLES GLOBALES
	*======================== *
	*/	
	public static int cantidadObsequiable = 6;
	public static String obsequio = "Un lapicero";
	private JButton btnCancelar;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassConfigObsequio dialog = new ClassConfigObsequio();
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
	public ClassConfigObsequio() {
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 511, 187);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadMinimaDe = new JLabel("Cantidad Minima de Resmas Obsequiada");
			lblCantidadMinimaDe.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblCantidadMinimaDe.setForeground(new Color(51, 153, 0));
			lblCantidadMinimaDe.setBounds(10, 24, 252, 14);
			contentPanel.add(lblCantidadMinimaDe);
		}
		{
			this.txtCantidadObsequio = new JTextField();
			txtCantidadObsequio.addKeyListener(this);
			this.txtCantidadObsequio.setBounds(259, 21, 99, 20);
			contentPanel.add(this.txtCantidadObsequio);
			this.txtCantidadObsequio.setColumns(10);
		}
		{
			this.txtNombreObsequio = new JTextField();
			this.txtNombreObsequio.setBounds(259, 52, 99, 20);
			contentPanel.add(this.txtNombreObsequio);
			this.txtNombreObsequio.setColumns(10);
		}
		{
			JLabel lblObsequio = new JLabel("Obsequio");
			lblObsequio.setForeground(new Color(51, 153, 0));
			lblObsequio.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblObsequio.setBounds(10, 55, 117, 14);
			contentPanel.add(lblObsequio);
		}
		{
			btnAceptar = new JButton("Aceptar");
			this.btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
			this.btnAceptar.setIcon(new ImageIcon(ClassConfigObsequio.class.getResource("/paquete/imagenes/check.png")));
			this.btnAceptar.setForeground(new Color(255, 255, 204));
			this.btnAceptar.setBackground(new Color(0, 204, 51));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(382, 15, 106, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			this.btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
			this.btnCancelar.setIcon(new ImageIcon(ClassConfigObsequio.class.getResource("/paquete/imagenes/cerrar.png")));
			this.btnCancelar.setForeground(new Color(255, 255, 255));
			this.btnCancelar.setBackground(new Color(204, 0, 0));
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(382, 51, 106, 23);
			contentPanel.add(btnCancelar);
		}
		{
			this.label = new JLabel("");
			this.label.setIcon(new ImageIcon(ClassConfigObsequio.class.getResource("/paquete/imagenes/Fondo-Config-Desc.png")));
			this.label.setBounds(0, -1, 497, 149);
			contentPanel.add(this.label);
		}
	}

	/*¨
	 * METODOS VACIOS QUE EXTREN DATOS DE LAS VARIABLES GLOBALES Y LOS PONE EN JTEXTFILED
	 * EL SEGUNDO METODO INPORTA LOS DATOS INGRESADOS A LAS VARIBLES GLOBALES 
	 *============================================================================================*
	 */
	public void runner(){
		txtCantidadObsequio.setText(""+cantidadObsequiable);
		txtNombreObsequio.setText(""+obsequio);
	}
	void grabarobsequio(){
		cantidadObsequiable = Integer.parseInt(txtCantidadObsequio.getText());
		System.out.println(cantidadObsequiable);
		obsequio = (String) txtNombreObsequio.getText();
		System.out.println(obsequio);
	}
	
	/*
	/*¨
	 *ACCION PERFORMEND PARA LOS BOTONES SIMPLES PROCESOS DE METODOS
	 *============================================================================================*
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
		grabarobsequio();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtCantidadObsequio) {
			keyTypedTxtCantidadObsequio(e);
		}
	}
	protected void keyTypedTxtCantidadObsequio(KeyEvent e) {
		char caracter = e.getKeyChar();
		  if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
		      e.consume();
		   }
		  if (txtCantidadObsequio.getText().length()== 5){
			  e.consume();
		JOptionPane.showMessageDialog(null, "Cantiad maxima de 5 cifras", "Error",JOptionPane.INFORMATION_MESSAGE);
		}	
	}
}
