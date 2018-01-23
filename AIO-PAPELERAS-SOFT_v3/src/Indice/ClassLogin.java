package Indice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class ClassLogin extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTitle;
	private JTextField txtUsuario;
	private JButton btnIniciarSesion;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JPasswordField txtContrasena;
	private JLabel lblFondo;
	private JButton btnCerrarSesion;
	private JLabel lblLogo;
	private JLabel lblPapeleraNacional;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassLogin dialog = new ClassLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ClassLogin() {
		setTitle("Papelera Nacional Panasa S.A - Software");
		setBounds(100, 100, 425, 318);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.lblTitle = new JLabel("");
		this.lblTitle.setIcon(new ImageIcon(ClassLogin.class.getResource("/paquete/imagenes/logo.png")));
		this.lblTitle.setBounds(67, 17, 280, 65);
		contentPanel.add(this.lblTitle);
		
		this.txtUsuario = new JTextField();
		this.txtUsuario.setBounds(127, 104, 232, 34);
		contentPanel.add(this.txtUsuario);
		txtUsuario.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		this.txtUsuario.setColumns(10);
		
		this.btnIniciarSesion = new JButton("INICIAR SESION");
		this.btnIniciarSesion.setIcon(new ImageIcon(ClassLogin.class.getResource("/paquete/imagenes/check.png")));
		this.btnIniciarSesion.setForeground(new Color(255, 255, 255));
		this.btnIniciarSesion.setBackground(new Color(51, 153, 0));
		this.btnIniciarSesion.addActionListener(this);
		this.btnIniciarSesion.setBounds(47, 246, 145, 31);
		contentPanel.add(this.btnIniciarSesion);
		
		this.lblUsuario = new JLabel("USUARIO");
		this.lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblUsuario.setForeground(new Color(34, 139, 34));
		this.lblUsuario.setBounds(26, 113, 65, 14);
		contentPanel.add(this.lblUsuario);
		
		this.lblPassword = new JLabel("CONTRASE\u00D1A");
		this.lblPassword.setForeground(new Color(34, 139, 34));
		this.lblPassword.setFont(new Font("Arial", Font.BOLD, 13));
		this.lblPassword.setBounds(26, 162, 103, 14);
		contentPanel.add(this.lblPassword);
		
		this.txtContrasena = new JPasswordField();
		this.txtContrasena.setBounds(127, 149, 232, 34);
		txtContrasena.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		contentPanel.add(this.txtContrasena);
		
		this.btnCerrarSesion = new JButton("CERRAR");
		this.btnCerrarSesion.addActionListener(this);
		this.btnCerrarSesion.setIcon(new ImageIcon(ClassLogin.class.getResource("/paquete/imagenes/cerrar.png")));
		this.btnCerrarSesion.setForeground(Color.WHITE);
		this.btnCerrarSesion.setBackground(new Color(153, 0, 0));
		this.btnCerrarSesion.setBounds(202, 246, 145, 31);
		contentPanel.add(this.btnCerrarSesion);
		
		this.lblLogo = new JLabel("");
		this.lblLogo.setIcon(new ImageIcon(ClassLogin.class.getResource("/paquete/imagenes/border-radius.png")));
		this.lblLogo.setBounds(84, 0, 274, 80);
		contentPanel.add(this.lblLogo);
		
		this.lblPapeleraNacional = new JLabel("Papelera Nacional S.A");
		this.lblPapeleraNacional.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.lblPapeleraNacional.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPapeleraNacional.setForeground(new Color(255, 255, 255));
		this.lblPapeleraNacional.setBounds(170, 79, 137, 14);
		contentPanel.add(this.lblPapeleraNacional);
		
		this.lblFondo = new JLabel("");
		this.lblFondo.setIcon(new ImageIcon(ClassLogin.class.getResource("/paquete/imagenes/Fondo-Login.png")));
		this.lblFondo.setBounds(0, 0, 414, 279);
		contentPanel.add(this.lblFondo);
	}
	
	//METODO VALIDAR SESION ( CARACTERES ) 
	//==========================================================================================*//
	
	void validarsesion(){
		int vaciosuser = txtUsuario.getText().length();
		int vaciopass  = txtContrasena.getPassword().length;
		//PROCESSO VALIDATION VACIO //
	      if(vaciosuser == 0 && vaciopass == 0 )
	      {JOptionPane.showMessageDialog(this, "ERROR FALAN AMBOS CAMPOS ESTAN VACIOS");}
	      else if(vaciosuser == 0){
		      JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE UN USUARIO");}
	      else if(vaciopass ==0){
	    	  JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE UN CONTRASEÑA");}
	      else{  ingresar();} //<=== SI ES VERDADERO AMBOS CAMPOS PASAR AL METODO DE INGRESO // 
	}
	
	
	//METODO INGRESAR VERIFICA LOS DATOS INGRESADOS DEL CAMPO  CON LOS USUARIOS DEL SISTEMA //
	//==========================================================================================*//
	
	void ingresar(){
		String Usuario,Password;
		Usuario = txtUsuario.getText();
		Password = String.valueOf(txtContrasena.getPassword());
		if(Usuario.equals("Administrador")&&Password.equals("12345")){
			this.dispose();
			ClassJFrame abrir = new ClassJFrame();
			abrir.setLocationRelativeTo(this);
			abrir.setVisible(true);
			JOptionPane.showMessageDialog(this,"BIENVENIDO "+Usuario);	
		}else{
			JOptionPane.showMessageDialog(this,"USUARIO O CONTRASEÑA INCORRECTO POR FAVOR INTENTELO NUEVAMENTE","ERROR - LOGIN",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//METODO VACIO INICIARSESION  Y CERRAR PROGRAMA  EVENT ACCIONPERFORMENT
	//==========================================================================================*//
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.btnCerrarSesion) {
			actionPerformedBtnCerrarSesion(arg0);
		}
		if (arg0.getSource() == this.btnIniciarSesion) {
			actionPerformedBtnIniciarSesion(arg0);
		}
	}
	
	protected void actionPerformedBtnIniciarSesion(ActionEvent arg0) {
		validarsesion();
	}
	
	protected void actionPerformedBtnCerrarSesion(ActionEvent arg0) {
		System.exit(0);
	}
}
