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
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


@SuppressWarnings("unused")
public class ClassConfigMaxCantRamasVend extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private static JTextField txtCantOptima;
	public static int cantidadTotalOptima = 50;
	private JButton btnAceptar;
	private JButton btnCerrar;
	private JLabel lblFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassConfigMaxCantRamasVend dialog = new ClassConfigMaxCantRamasVend();
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
	public ClassConfigMaxCantRamasVend() {
		setTitle("Cofigurar Cantidad Optima de Resmas");
		setBounds(100, 100, 398, 156);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblConfigCantOptima = new JLabel("cantidad \u00F3ptima de resmas vendidas");
			lblConfigCantOptima.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblConfigCantOptima.setForeground(new Color(51, 153, 0));
			lblConfigCantOptima.setBounds(10, 22, 256, 14);
			contentPanel.add(lblConfigCantOptima);
		}
		{
			this.txtCantOptima = new JTextField();
			txtCantOptima.addKeyListener(this);
			this.txtCantOptima.setBounds(276, 20, 86, 20);
			contentPanel.add(this.txtCantOptima);
			this.txtCantOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			this.btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
			this.btnAceptar.setIcon(new ImageIcon(ClassConfigMaxCantRamasVend.class.getResource("/paquete/imagenes/check.png")));
			this.btnAceptar.setForeground(new Color(255, 255, 255));
			this.btnAceptar.setBackground(new Color(51, 204, 0));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(72, 69, 103, 27);
			contentPanel.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			this.btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
			this.btnCerrar.setIcon(new ImageIcon(ClassConfigMaxCantRamasVend.class.getResource("/paquete/imagenes/cerrar.png")));
			this.btnCerrar.setForeground(new Color(255, 255, 255));
			this.btnCerrar.setBackground(new Color(204, 0, 0));
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(192, 69, 103, 27);
			contentPanel.add(btnCerrar);
		}
		{
			this.lblFondo = new JLabel("");
			this.lblFondo.setIcon(new ImageIcon(ClassConfigMaxCantRamasVend.class.getResource("/paquete/imagenes/Fondo-Config-Optima-Resmas.png")));
			this.lblFondo.setBounds(0, 0, 382, 117);
			contentPanel.add(this.lblFondo);
		}
	}
	
	/*¨
	 *METODOS PARA HACER EL GET OSEA EXTRAER LOS DATOS Y IMPORTAR EL DATO EN INTEGER INT 
	 *============================================================================================*
	 */	
	public void runner(){
		txtCantOptima.setText(""+cantidadTotalOptima);
	}
	void GrabarCantOpt(){
		cantidadTotalOptima = Integer.parseInt(txtCantOptima.getText());
	}
	/*¨
	 *ACCIONES SIMPLES DE BOTONES
	 *============================================================================================*
	 */	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == this.btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		GrabarCantOpt();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtCantOptima) {
			keyTypedTxtCantOptima(e);
		}
	}
	protected void keyTypedTxtCantOptima(KeyEvent e) {
		char caracter = e.getKeyChar();
		  if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.') ){
		      e.consume();
		   }
		  if (txtCantOptima.getText().length()== 5){
			  e.consume();
		JOptionPane.showMessageDialog(null, "Maximo numero de 5 cifras", "Error",JOptionPane.INFORMATION_MESSAGE);
		}	
	}
}
