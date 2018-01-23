package Ventas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Configuracion.ClassConfigMaxCantRamasVend;
import Matenimiento.ClassModificarPapel;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class ClassGenerarReportes extends JDialog implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipoDeReporte;
	@SuppressWarnings("rawtypes")
	private JComboBox cboTipo;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblClassFondoGenerarReportes;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClassGenerarReportes dialog = new ClassGenerarReportes();
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
	public ClassGenerarReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 487, 319);
		getContentPane().setLayout(new BorderLayout());
		this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this.contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.lblTipoDeReporte = new JLabel("Tipo de Reporte");
		this.lblTipoDeReporte.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblTipoDeReporte.setForeground(new Color(0, 153, 0));
		this.lblTipoDeReporte.setBounds(10, 23, 101, 14);
		contentPanel.add(this.lblTipoDeReporte);
		
		this.cboTipo = new JComboBox();
		this.cboTipo.setBackground(new Color(204, 204, 255));
		this.cboTipo.addItemListener(this);
		this.cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por marca", "Marcas con venta \u00F3ptima", "Marcas con precios menores al 85% del precio m\u00E1ximo", "Marcas con precios mayores al 85% del precio m\u00E1ximo ", "Precios menor, mayor y promedio"}));
		this.cboTipo.setBounds(122, 17, 211, 29);
		contentPanel.add(this.cboTipo);
		
		this.btnCerrar = new JButton("Cerrar");
		this.btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
		this.btnCerrar.setForeground(new Color(255, 255, 255));
		this.btnCerrar.setIcon(new ImageIcon(ClassGenerarReportes.class.getResource("/paquete/imagenes/cerrar.png")));
		this.btnCerrar.setBackground(new Color(204, 0, 51));
		this.btnCerrar.addActionListener(this);
		this.btnCerrar.setBounds(369, 17, 92, 29);
		contentPanel.add(this.btnCerrar);
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBounds(10, 62, 451, 207);
		contentPanel.add(this.scrollPane);
		
		this.txtS = new JTextArea();
		this.txtS.setForeground(new Color(0, 102, 0));
		this.scrollPane.setViewportView(this.txtS);
		
		this.lblClassFondoGenerarReportes = new JLabel("");
		this.lblClassFondoGenerarReportes.setIcon(new ImageIcon(ClassGenerarReportes.class.getResource("/paquete/imagenes/Fondo-Generar-Reportes.png")));
		this.lblClassFondoGenerarReportes.setBounds(0, -2, 471, 282);
		contentPanel.add(this.lblClassFondoGenerarReportes);
	}
	
	
	/*¨
	 * 
	 *GENERAMOS LOS REPORTES DE VENTAS TOTALES DE CADA MARCA DE LA CLASE CLASSVENDER.JAVA
	 *============================================================================================*
	 */
	
	void genventas(){
		DecimalFormat imporformart = new DecimalFormat("0.00");
		txtS.setText("  VENTAS POR MARCA\n");
		imprimir("  ");
		//MARCA 0  CBOMARCA//
		imprimir("  Marca			: "+ClassVender.marca0);
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantventas0 == 0)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0);
		else if	(ClassVender.cantventas0 == 1)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0+" Venta");
		else
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0 +" Ventas");
		
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantresmas0 == 0)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas0);
		else if	(ClassVender.cantresmas0 == 1)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas0+" Resma");
		else
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas0 +" Resmas");
		imprimir("  Importe total acumulado		: S/. "+imporformart.format(ClassVender.ImporAcomulado0));
		imprimir("  ");

		//MARCA 1  CBOMARCA//
		imprimir("  Marca			: "+ClassVender.marca1);
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantventas1 == 0)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas1);
		else if	(ClassVender.cantventas1 == 1)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas1+" Venta");
		else
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas1 +" Ventas");
		
		if(ClassVender.cantresmas1 == 0)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas1);
		else if	(ClassVender.cantresmas1 == 1)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas1+" Resma");
		else
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas1 +" Resmas");
		imprimir("  Importe total acumulado		: S/. "+imporformart.format(ClassVender.ImporAcomulado1));
		imprimir("  ");
		

		//MARCA 2  CBOMARCA//
		imprimir("  Marca			: "+ClassVender.marca2);
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantventas2 == 0)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas2);
		else if	(ClassVender.cantventas2 == 1)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas2+" Venta");
		else
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas2 +" Ventas");
		
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantresmas2 == 0)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas2);
		else if	(ClassVender.cantresmas2 == 1)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas2+" Resma");
		else
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas2 +" Resmas");
		imprimir("  Importe total acumulado		: S/. "+imporformart.format(ClassVender.ImporAcomulado2));
		imprimir("  ");
		

		//MARCA 3  CBOMARCA//
		imprimir("  Marca			: "+ClassVender.marca3);
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantventas3 == 0)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas3);
		else if	(ClassVender.cantventas0 == 1)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0+" Venta");
		else
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0 +" Ventas");
		
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantresmas3 == 0)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas3);
		else if	(ClassVender.cantresmas3 == 1)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas3+" Resma");
		else
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas3 +" Resmas");
		imprimir("  Importe total acumulado		: S/. "+imporformart.format(ClassVender.ImporAcomulado3));
		imprimir("  ");
		

		//MARCA 4  CBOMARCA//
		imprimir("  Marca			: "+ClassVender.marca4);
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantventas4 == 0)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0);
		else if	(ClassVender.cantventas4 == 1)
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0+" Venta");
		else
		imprimir("  Cantidad de ventas		: "+ClassVender.cantventas0 +" Ventas");
		
		//INTERCOMUNICACION CON EL QUIEN OPERA EL SOFTWARE//
		if(ClassVender.cantresmas4 == 0)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas4);
		else if	(ClassVender.cantresmas4 == 1)
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas4+" Resma");
		else
		imprimir("  Cantidad total de resmas vendidas	: "+ClassVender.cantresmas4 +" Resmas");
		imprimir("  Importe total acumulado		: S/. "+imporformart.format(ClassVender.ImporAcomulado4));	
		imprimir("  ");
	}
	
	
	
	/*¨
	 * GENERAMOS LAS MARCAS CON VENTAS SUPERIORES A LA CANTIDAD OPTIMA
	 *============================================================================================*
	 */
	
	
	void genCantOptimas(){
		txtS.setText("  MARCAS CON VENTA ÓPTIMA\n");
		if(ClassVender.cantresmas0 > ClassConfigMaxCantRamasVend.cantidadTotalOptima){
			imprimir("  Marca			: "+ClassVender.marca0);
			imprimir("  Cantidad total de resmas vendidas:	: "+ClassVender.cantresmas0);
			imprimir("  ");
		}else{
			
		}
		
		if(ClassVender.cantresmas1 > ClassConfigMaxCantRamasVend.cantidadTotalOptima){
			imprimir("  Marca			: "+ClassVender.marca1);
			imprimir("  Cantidad total de resmas vendidas:	: "+ClassVender.cantresmas1);
			imprimir("  ");
		}else{
			
		}
		
		if(ClassVender.cantresmas2 > ClassConfigMaxCantRamasVend.cantidadTotalOptima){
			imprimir("  Marca			: "+ClassVender.marca2);
			imprimir("  Cantidad total de resmas vendidas:	: "+ClassVender.cantresmas2);
			imprimir("  ");
		}else{
			
		}

		if(ClassVender.cantresmas3 > ClassConfigMaxCantRamasVend.cantidadTotalOptima){
			imprimir("  Marca			: "+ClassVender.marca3);
			imprimir("  Cantidad total de resmas vendidas:	: "+ClassVender.cantresmas3);
			imprimir("  ");
		}else{
			
		}
		
		if(ClassVender.cantresmas4 > ClassConfigMaxCantRamasVend.cantidadTotalOptima){
			imprimir("  Marca			: "+ClassVender.marca4);
			imprimir("  Cantidad total de resmas vendidas:	: "+ClassVender.cantresmas4);
			imprimir("  ");
		}else{
			
		}
			
	}
	
	
	
	/*¨
	 * 
	 *METODO PARA LO ITEN 3 Y 4 
	 *============================================================================================*
	 */
	
	
	double preciomayor(){
		if( ClassModificarPapel.precio0 > ClassModificarPapel.precio1 && ClassModificarPapel.precio0 > ClassModificarPapel.precio2 && ClassModificarPapel.precio0 > ClassModificarPapel.precio3 && ClassModificarPapel.precio0 > ClassModificarPapel.precio4 ){
			return ClassModificarPapel.precio0 * 85 / 100;

		}else if (ClassModificarPapel.precio1 > ClassModificarPapel.precio0 && ClassModificarPapel.precio1 > ClassModificarPapel.precio2 && ClassModificarPapel.precio1 > ClassModificarPapel.precio3 && ClassModificarPapel.precio1 > ClassModificarPapel.precio4){
			return ClassModificarPapel.precio1 * 85 / 100;
	
		}else if (ClassModificarPapel.precio2 > ClassModificarPapel.precio0 && ClassModificarPapel.precio2 > ClassModificarPapel.precio1 && ClassModificarPapel.precio2 > ClassModificarPapel.precio3 && ClassModificarPapel.precio2 > ClassModificarPapel.precio4){ 
			return ClassModificarPapel.precio2 * 85 / 100;
	
		}else if (ClassModificarPapel.precio3 > ClassModificarPapel.precio0 && ClassModificarPapel.precio3 > ClassModificarPapel.precio1 && ClassModificarPapel.precio3 > ClassModificarPapel.precio2 && ClassModificarPapel.precio3 > ClassModificarPapel.precio4){ 
			return ClassModificarPapel.precio3 * 85 / 100;
	
		}else if (ClassModificarPapel.precio4 > ClassModificarPapel.precio0 && ClassModificarPapel.precio4 > ClassModificarPapel.precio1 && ClassModificarPapel.precio4 > ClassModificarPapel.precio2 && ClassModificarPapel.precio4 > ClassModificarPapel.precio3){
			return ClassModificarPapel.precio4 * 85 / 100;
		
		}else{
			return 0;			 
		}
	}
	
	
	
	/*¨
	 * 
	 *MARCAS CON PRECIOS MAYOR AL 85% DEL PRECIO MÁXIMO
	 *============================================================================================*
	 */
	
	void marcasmayores(){
		int numerodemarcas = 0;
		txtS.setText("  MARCAS CON PRECIOS MAYORES AL 85% DEL PRECIO MÁXIMO\n");
		imprimir("  ");
		double preciomayor = preciomayor();
		if(ClassModificarPapel.precio0 > preciomayor){
			imprimir("  "+ClassModificarPapel.marca0);
			numerodemarcas+=1;
		}
		
		if(ClassModificarPapel.precio1 > preciomayor){
			imprimir("  "+ClassModificarPapel.marca1);
			numerodemarcas+=1;
		}
		
		if(ClassModificarPapel.precio2 > preciomayor){
			imprimir("  "+ClassModificarPapel.marca2);	
			numerodemarcas+=1;
		}
		
		if(ClassModificarPapel.precio3 > preciomayor){
			imprimir("  "+ClassModificarPapel.marca3);
			numerodemarcas+=1;
		}
		if(ClassModificarPapel.precio4 > preciomayor){
			imprimir("  "+ClassModificarPapel.marca4);
			numerodemarcas+=1;
		}
		imprimir("  ");
		imprimir("  85% del precio máximo : S/."+preciomayor);
		imprimir("  Número de marcas      : "+numerodemarcas);	
	}
	

	
	
	/*¨
	 * 
	 *MARCAS CON PRECIOS MENORES AL 85% DEL PRECIO MÁXIMO
	 *============================================================================================*
	 */
	
	void marcasmenores(){
		int numerodemarcas = 0;
		txtS.setText("  MARCAS CON PRECIOS MENORES AL 85% DEL PRECIO MÁXIMO\n");
		imprimir("  ");
		double preciomayor = preciomayor();
		if(ClassModificarPapel.precio0 < preciomayor){
			imprimir("  "+ClassModificarPapel.marca0);
			numerodemarcas+=1;
		}
		
		if(ClassModificarPapel.precio1 < preciomayor){
			imprimir("  "+ClassModificarPapel.marca1);
			numerodemarcas+=1;
		}
		
		if(ClassModificarPapel.precio2 < preciomayor){
			imprimir("  "+ClassModificarPapel.marca2);	
			numerodemarcas+=1;
		}
		
		if(ClassModificarPapel.precio3 < preciomayor){
			imprimir("  "+ClassModificarPapel.marca3);
			numerodemarcas+=1;
		}
		if(ClassModificarPapel.precio4 < preciomayor){
			imprimir("  "+ClassModificarPapel.marca4);
			numerodemarcas+=1;
		}
		imprimir("  ");
		imprimir("  85% del precio máximo : S/."+preciomayor);
		imprimir("  Número de marcas      : "+numerodemarcas);	
	}
	
	
	
	
	/*¨
	 * 
	 *EMPIEZA ITEN 5 SELECTEDITEM
	 *============================================================================================*
	 */
	
	
	double rangogramajemayor(){
		if( ClassModificarPapel.gramaje0 > ClassModificarPapel.gramaje1 && ClassModificarPapel.gramaje0 > ClassModificarPapel.gramaje2 && ClassModificarPapel.gramaje0 > ClassModificarPapel.gramaje3 && ClassModificarPapel.gramaje0 > ClassModificarPapel.gramaje4 ){
			return ClassModificarPapel.gramaje0;

		}else if (ClassModificarPapel.gramaje1 > ClassModificarPapel.gramaje0 && ClassModificarPapel.gramaje1 > ClassModificarPapel.gramaje2 && ClassModificarPapel.gramaje1 > ClassModificarPapel.gramaje3 && ClassModificarPapel.gramaje1 > ClassModificarPapel.gramaje4){
			return ClassModificarPapel.gramaje1;
	
	
		}else if (ClassModificarPapel.gramaje2 > ClassModificarPapel.gramaje0 && ClassModificarPapel.gramaje2 > ClassModificarPapel.gramaje1 && ClassModificarPapel.gramaje2 > ClassModificarPapel.gramaje3 && ClassModificarPapel.gramaje2 > ClassModificarPapel.gramaje4){ 
			return ClassModificarPapel.gramaje2;
	
		}else if (ClassModificarPapel.gramaje3 > ClassModificarPapel.gramaje0 && ClassModificarPapel.gramaje3 > ClassModificarPapel.gramaje1 && ClassModificarPapel.gramaje3 > ClassModificarPapel.gramaje2 && ClassModificarPapel.gramaje3 > ClassModificarPapel.gramaje4){ 
			return ClassModificarPapel.gramaje3;
	
		}else{
			return ClassModificarPapel.gramaje4;
		
		}
		
	}
	
	double rangogramajemenor(){
		if( ClassModificarPapel.gramaje0 < ClassModificarPapel.gramaje1 && ClassModificarPapel.gramaje0 < ClassModificarPapel.gramaje2 && ClassModificarPapel.gramaje0 < ClassModificarPapel.gramaje3 && ClassModificarPapel.gramaje0 < ClassModificarPapel.gramaje4 ){
			return ClassModificarPapel.gramaje0;

		}else if (ClassModificarPapel.gramaje1 < ClassModificarPapel.gramaje0 && ClassModificarPapel.gramaje1 < ClassModificarPapel.gramaje2 && ClassModificarPapel.gramaje1 < ClassModificarPapel.gramaje3 && ClassModificarPapel.gramaje1 < ClassModificarPapel.gramaje4){
			return ClassModificarPapel.gramaje1;
	
	
		}else if (ClassModificarPapel.gramaje2 < ClassModificarPapel.gramaje0 && ClassModificarPapel.gramaje2 < ClassModificarPapel.gramaje1 && ClassModificarPapel.gramaje2 < ClassModificarPapel.gramaje3 && ClassModificarPapel.gramaje2 < ClassModificarPapel.gramaje4){ 
			return ClassModificarPapel.gramaje2;
	
		}else if (ClassModificarPapel.gramaje3 < ClassModificarPapel.gramaje0 && ClassModificarPapel.gramaje3 < ClassModificarPapel.gramaje1 && ClassModificarPapel.gramaje3 < ClassModificarPapel.gramaje2 && ClassModificarPapel.gramaje3 < ClassModificarPapel.gramaje4){ 
			return ClassModificarPapel.gramaje3;
	
		}else{
			return ClassModificarPapel.gramaje4;
		
		}
		
	}
	
	
	/*¨
	 * PROMEDIOS, MÁXIMOS Y MÍNIMOS
	 *============================================================================================*
	 */
	
	void gramaje(){
		txtS.setText("  PROMEDIOS, MÁXIMOS Y MÍNIMOS \n\n");
		int contadordivisor = 0;
		double  sumar =  ClassModificarPapel.gramaje0;contadordivisor++;
				sumar+=  ClassModificarPapel.gramaje1;contadordivisor++;
				sumar+=  ClassModificarPapel.gramaje2;contadordivisor++;
				sumar+=  ClassModificarPapel.gramaje3;contadordivisor++;
				sumar+=  ClassModificarPapel.gramaje4;contadordivisor++;

			 imprimir("  Gramage promedio	: "+sumar/contadordivisor+ " g/m²");
			 imprimir("  Gramage mínimo:	: "+rangogramajemenor()+ " g/m²");
		     imprimir("  Gramage máximo:	: "+rangogramajemayor()+ " g/m²");	
			 imprimir("  ");	
	}
	
	
	double rangoblancuramayor(){
		if( ClassModificarPapel.blancura0 > ClassModificarPapel.blancura1 && ClassModificarPapel.blancura0 > ClassModificarPapel.blancura2 && ClassModificarPapel.blancura0 > ClassModificarPapel.blancura3 && ClassModificarPapel.blancura0 > ClassModificarPapel.blancura4 ){
			return ClassModificarPapel.blancura0;

		}else if (ClassModificarPapel.blancura1 > ClassModificarPapel.blancura0 && ClassModificarPapel.blancura1 > ClassModificarPapel.blancura2 && ClassModificarPapel.blancura1 > ClassModificarPapel.blancura3 && ClassModificarPapel.blancura1 > ClassModificarPapel.blancura4){
			return ClassModificarPapel.blancura1;
	
	
		}else if (ClassModificarPapel.blancura2 > ClassModificarPapel.blancura0 && ClassModificarPapel.blancura2 > ClassModificarPapel.blancura1 && ClassModificarPapel.blancura2 > ClassModificarPapel.blancura3 && ClassModificarPapel.blancura2 > ClassModificarPapel.blancura4){ 
			return ClassModificarPapel.blancura2;
	
		}else if (ClassModificarPapel.blancura3 > ClassModificarPapel.blancura0 && ClassModificarPapel.blancura3 > ClassModificarPapel.blancura1 && ClassModificarPapel.blancura3 > ClassModificarPapel.blancura2 && ClassModificarPapel.blancura3 > ClassModificarPapel.blancura4){ 
			return ClassModificarPapel.blancura3;
	
		}else{
			return ClassModificarPapel.blancura4;			 
		}
		
	}
	
	double rangoblancuramenor(){
		if( ClassModificarPapel.blancura0 < ClassModificarPapel.blancura1 && ClassModificarPapel.blancura0 < ClassModificarPapel.blancura2 && ClassModificarPapel.blancura0 < ClassModificarPapel.blancura3 && ClassModificarPapel.blancura0 < ClassModificarPapel.blancura4 ){
			return ClassModificarPapel.blancura0;

		}else if (ClassModificarPapel.blancura1 < ClassModificarPapel.blancura0 && ClassModificarPapel.blancura1 < ClassModificarPapel.blancura2 && ClassModificarPapel.blancura1 < ClassModificarPapel.blancura3 && ClassModificarPapel.blancura1 < ClassModificarPapel.blancura4){
			return ClassModificarPapel.blancura1;
	
	
		}else if (ClassModificarPapel.blancura2 < ClassModificarPapel.blancura0 && ClassModificarPapel.blancura2 < ClassModificarPapel.blancura1 && ClassModificarPapel.blancura2 < ClassModificarPapel.blancura3 && ClassModificarPapel.blancura2 < ClassModificarPapel.blancura4){ 
			return ClassModificarPapel.blancura2;
	
		}else if (ClassModificarPapel.blancura3 < ClassModificarPapel.blancura0 && ClassModificarPapel.blancura3 < ClassModificarPapel.blancura1 && ClassModificarPapel.blancura3 < ClassModificarPapel.blancura2 && ClassModificarPapel.blancura3 < ClassModificarPapel.blancura4){ 
			return ClassModificarPapel.blancura3;
	
		}else {
			return ClassModificarPapel.blancura4;
		
		}
		
	}
	void blacuras(){
		int contadordivisor = 0;
		double  sumar =  ClassModificarPapel.blancura0;contadordivisor++;
				sumar+=  ClassModificarPapel.blancura1;contadordivisor++;
				sumar+=  ClassModificarPapel.blancura2;contadordivisor++;
				sumar+=  ClassModificarPapel.blancura3;contadordivisor++;
				sumar+=  ClassModificarPapel.blancura4;contadordivisor++;

			 imprimir("  Blancura promedio	: "+sumar/contadordivisor);
			 imprimir("  Blancura mínimo	: "+rangoblancuramenor());
			 imprimir("  Blancura máximo	: "+rangoblancuramayor());	
		     imprimir("  ");
	}
	
	
	
	
	
	double rangopreciomayor(){
		if( ClassModificarPapel.precio0 > ClassModificarPapel.precio1 && ClassModificarPapel.precio0 > ClassModificarPapel.precio2 && ClassModificarPapel.precio0 > ClassModificarPapel.precio3 && ClassModificarPapel.precio0 > ClassModificarPapel.precio4 ){
			return ClassModificarPapel.precio0;

		}else if (ClassModificarPapel.precio1 > ClassModificarPapel.precio0 && ClassModificarPapel.precio1 > ClassModificarPapel.precio2 && ClassModificarPapel.precio1 > ClassModificarPapel.precio3 && ClassModificarPapel.precio1 > ClassModificarPapel.precio4){
			return ClassModificarPapel.precio1;
	
	
		}else if (ClassModificarPapel.precio2 > ClassModificarPapel.precio0 && ClassModificarPapel.precio2 > ClassModificarPapel.precio1 && ClassModificarPapel.precio2 > ClassModificarPapel.precio3 && ClassModificarPapel.precio2 > ClassModificarPapel.precio4){ 
			return ClassModificarPapel.precio2;
	
		}else if (ClassModificarPapel.precio3 > ClassModificarPapel.precio0 && ClassModificarPapel.precio3 > ClassModificarPapel.precio1 && ClassModificarPapel.precio3 > ClassModificarPapel.precio2 && ClassModificarPapel.precio3 > ClassModificarPapel.precio4){ 
			return ClassModificarPapel.precio3;
	
		}else {
			return ClassModificarPapel.precio4;
		
		}
		
	}
	double rangopreciomenor(){
		if( ClassModificarPapel.precio0 < ClassModificarPapel.precio1 && ClassModificarPapel.precio0 < ClassModificarPapel.precio2 && ClassModificarPapel.precio0 < ClassModificarPapel.precio3 && ClassModificarPapel.precio0 < ClassModificarPapel.precio4 ){
			return ClassModificarPapel.precio0;

		}else if (ClassModificarPapel.precio1 < ClassModificarPapel.precio0 && ClassModificarPapel.precio1 < ClassModificarPapel.precio2 && ClassModificarPapel.precio1 < ClassModificarPapel.precio3 && ClassModificarPapel.precio1 < ClassModificarPapel.precio4){
			return ClassModificarPapel.precio1;
	
	
		}else if (ClassModificarPapel.precio2 < ClassModificarPapel.precio0 && ClassModificarPapel.precio2 < ClassModificarPapel.precio1 && ClassModificarPapel.precio2 < ClassModificarPapel.precio3 && ClassModificarPapel.precio2 < ClassModificarPapel.precio4){ 
			return ClassModificarPapel.precio2;
	
		}else if (ClassModificarPapel.precio3 < ClassModificarPapel.precio0 && ClassModificarPapel.precio3 < ClassModificarPapel.precio1 && ClassModificarPapel.precio3 < ClassModificarPapel.precio2 && ClassModificarPapel.precio3 < ClassModificarPapel.precio4){ 
			return ClassModificarPapel.precio3;
	
		}else {
			return ClassModificarPapel.precio4;
		
		}
	}
	
	
	void sumas(){
		int contador = 0;
		double  sumadeprecio =  ClassModificarPapel.precio0;contador++;
				sumadeprecio+=  ClassModificarPapel.precio1;contador++;
				sumadeprecio+=  ClassModificarPapel.precio2;contador++;
				sumadeprecio+=  ClassModificarPapel.precio3;contador++;
				sumadeprecio+=  ClassModificarPapel.precio4;contador++;

		     imprimir("  Precio promedio     	:S/. "+sumadeprecio/contador);
		     imprimir("  Precio mínimo 	 :S/. "+rangopreciomenor());
		     imprimir("  Precio máximo    	 :S/. "+rangopreciomayor());
		     imprimir("  ");
	}
	
	void imprimir(String cadena){
		txtS.append(cadena+"\n");
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	
	
	/*¨
	 * 
	 *END ITEN 5 FIN 
	 *============================================================================================*
	 */
	
	
	
	
	/*¨
	 * METODO Y EVENTO ITEMSTATECHARGED
	 *============================================================================================*
	 */
	
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == this.cboTipo) {
			itemStateChangedCboTipo(arg0);
		}
	}
	protected void itemStateChangedCboTipo(ItemEvent arg0) {
		int tipodereporte = cboTipo.getSelectedIndex();
		if(tipodereporte == 0){
			genventas();
		}else if (tipodereporte == 1){
			genCantOptimas();
		}else if(tipodereporte == 2){
			marcasmayores();
		}else if(tipodereporte == 3){
			marcasmenores();
		}else{
			gramaje();
			blacuras();
			sumas();
		}

	}
}
