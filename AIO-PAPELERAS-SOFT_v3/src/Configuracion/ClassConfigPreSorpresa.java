package Configuracion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class ClassConfigPreSorpresa extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private static JTextField txtConfigNumCliente;
	private static JTextField txtConfigPremioSopresa;
	private JButton btnAceptar;
	private JButton btnCancelar;
	/*¨
	* VARIABLES GLOBALES
	*======================== *
	*/	
	public static int numeroClienteSorpresa = 5;
	public static String premioSorpresa = "Un chocolate";
	private JLabel lblFondo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassConfigPreSorpresa dialog = new ClassConfigPreSorpresa();
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
	public ClassConfigPreSorpresa() {
		setTitle("Config Premio Sorpresa");
		setBounds(100, 100, 449, 170);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			this.txtConfigNumCliente = new JTextField();
			txtConfigNumCliente.addKeyListener(this);
			this.txtConfigNumCliente.setBounds(127, 12, 144, 20);
			contentPanel.add(this.txtConfigNumCliente);
			this.txtConfigNumCliente.setColumns(10);
		}
		{
			this.txtConfigPremioSopresa = new JTextField();
			this.txtConfigPremioSopresa.setBounds(127, 46, 144, 20);
			contentPanel.add(this.txtConfigPremioSopresa);
			this.txtConfigPremioSopresa.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			this.btnAceptar.setForeground(new Color(255, 255, 255));
			this.btnAceptar.setBackground(new Color(51, 204, 0));
			this.btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
			this.btnAceptar.setIcon(new ImageIcon(ClassConfigPreSorpresa.class.getResource("/paquete/imagenes/check.png")));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(312, 11, 112, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			this.btnCancelar.setForeground(new Color(255, 255, 255));
			this.btnCancelar.setBackground(new Color(204, 0, 0));
			this.btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
			this.btnCancelar.setIcon(new ImageIcon(ClassConfigPreSorpresa.class.getResource("/paquete/imagenes/cerrar.png")));
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(312, 45, 112, 23);
			contentPanel.add(btnCancelar);
		}
		{
			JLabel lblNumeroDeCliente = new JLabel("Numero de Cliente");
			lblNumeroDeCliente.setForeground(new  Color(51, 153, 0));
			lblNumeroDeCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNumeroDeCliente.setBounds(10, 15, 119, 14);
			contentPanel.add(lblNumeroDeCliente);
		}
		{
			JLabel lblPremioSorpresa = new JLabel("Premio Sorpresa");
			lblPremioSorpresa.setForeground(new  Color(51, 153, 0));
			lblPremioSorpresa.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPremioSorpresa.setBounds(10, 49, 119, 14);
			contentPanel.add(lblPremioSorpresa);
		}
		{
			this.lblFondo = new JLabel("");
			this.lblFondo.setIcon(new ImageIcon(ClassConfigPreSorpresa.class.getResource("/paquete/imagenes/Fondo-Config-PreSorpresa.png")));
			this.lblFondo.setBounds(0, 0, 433, 131);
			contentPanel.add(this.lblFondo);
		}
	}

	/*¨
	 * METODOS VACIOS QUE EXTREN DATOS DE LAS VARIABLES GLOBALES Y LOS PONE EN JTEXTFILED
	 * EL SEGUNDO METODO INPORTA LOS DATOS INGRESADOS A LAS VARIBLES GLOBALES 
	 *============================================================================================*
	 */
	public void runner(){
		txtConfigNumCliente.setText(""+numeroClienteSorpresa);
		txtConfigPremioSopresa.setText(""+premioSorpresa);
	}
	void grabarpremio(){
		numeroClienteSorpresa = Integer.parseInt(txtConfigNumCliente.getText());
		premioSorpresa = (String) txtConfigPremioSopresa.getText();
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
		grabarpremio();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtConfigNumCliente) {
			keyTypedTxtConfigNumCliente(e);
		}
	}
	protected void keyTypedTxtConfigNumCliente(KeyEvent e) {
		char caracter = e.getKeyChar();
		  if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
		      e.consume();
		   }
		  if (txtConfigNumCliente.getText().length()== 5){
			  e.consume();
		JOptionPane.showMessageDialog(null, "Cantiad maxima de 5 cifras", "Error",JOptionPane.INFORMATION_MESSAGE);
		}	
	}
}
