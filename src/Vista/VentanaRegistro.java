package Vista;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import Controlador.CoordinadorVistas;
import Controlador.Helpers.HelperDomain;
import Modelo.Procesos.ModeloDatos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class VentanaRegistro extends JDialog implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JLabel lblDocumento;
	private JPanel JpanelContenido;
	private JLabel lblRegistro;
	private JLabel lblNombre;
	private JLabel lblNombreEmpresa;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	private JTextField txtDocumento;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtNombreEmpresa;
	private JLabel lblTipoOperario;
	private JRadioButton rdBtnOperario;
	private JRadioButton rdBtnMinero;
	private JLabel lblTratamientoRealizado;
	private JComboBox<String> comboBox;
	private JLabel lblDiasHospitalizacin;
	private JTextField txtCuantosDias;
	private JLabel lblCostosMedicamentos;
	private JTextField txtCostosMedica;
	private JButton btnHecho;
	private JPanel jPanelTitulo;
	private JTextArea textArea;

	// Creamos Group para agrupar los radio Button
	private ButtonGroup groupoDeRadios;
	
	
	// variables que reciben las instancias del paquete relaciones
	private CoordinadorVistas elCoordinador;
	private HelperDomain helperDomain;
	private ModeloDatos modeloDatos; 
	private JButton btnVaciar;
	
// Metodo de acceso para el coordinador
	public void setCoordinador(CoordinadorVistas coordinador) {
		this.elCoordinador=coordinador;
	}
	public void setHelper(HelperDomain helperDomain){
		this.helperDomain = helperDomain;
	}
	public void setModeloDatos(ModeloDatos modeloDatos){
		this.modeloDatos = modeloDatos;
	}
	
	
	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
//		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(500, 100, 806, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contenidoVentana();
	}
	
//	Metodo qeu tiene el contenido de la  ventana
	public void contenidoVentana() {
		
		jPanelTitulo = new JPanel();
		jPanelTitulo.setBackground(new Color(0, 0, 51));
		contentPane.add(jPanelTitulo, BorderLayout.NORTH);
		GridBagLayout gbl_jPanel = new GridBagLayout();
		gbl_jPanel.columnWidths = new int[]{60, 0, 98, 0, 0};
		gbl_jPanel.rowHeights = new int[]{0, 0, 7, 30, 30, 0};
		gbl_jPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_jPanel.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		jPanelTitulo.setLayout(gbl_jPanel);
		
		lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Fira Code", Font.BOLD, 18));
		lblRegistro.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblRegistro.gridx = 2;
		gbc_lblRegistro.gridy = 3;
		jPanelTitulo.add(lblRegistro, gbc_lblRegistro);
		
		JpanelContenido = new JPanel();
		JpanelContenido.setBackground(new Color(218,221,252));
		contentPane.add(JpanelContenido, BorderLayout.WEST);
		GridBagLayout gbl_JpanelContenido = new GridBagLayout();
		gbl_JpanelContenido.columnWidths = new int[]{33, 0, 198, 162, 144, 136, 0};
		gbl_JpanelContenido.rowHeights = new int[]{43, 43, 43, 43, 43, 40, 33, 28, 0};
		gbl_JpanelContenido.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_JpanelContenido.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		JpanelContenido.setLayout(gbl_JpanelContenido);
		
		lblDocumento = new JLabel("Documento");
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDocumento = new GridBagConstraints();
		gbc_lblDocumento.anchor = GridBagConstraints.SOUTH;
		gbc_lblDocumento.insets = new Insets(0, 0, 13, 13);
		gbc_lblDocumento.gridx = 1;
		gbc_lblDocumento.gridy = 0;
		JpanelContenido.add(lblDocumento, gbc_lblDocumento);
		
		txtDocumento = new JTextField();
		GridBagConstraints gbc_txtDocumento = new GridBagConstraints();
		gbc_txtDocumento.anchor = GridBagConstraints.WEST;
		gbc_txtDocumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtDocumento.gridx = 2;
		gbc_txtDocumento.gridy = 0;
		JpanelContenido.add(txtDocumento, gbc_txtDocumento);
		txtDocumento.setColumns(10);
		
		lblTratamientoRealizado = new JLabel("Tratamiento realizado:");
		GridBagConstraints gbc_lblTratamientoRealizado = new GridBagConstraints();
		gbc_lblTratamientoRealizado.anchor = GridBagConstraints.EAST;
		gbc_lblTratamientoRealizado.insets = new Insets(0, 0, 5, 5);
		gbc_lblTratamientoRealizado.gridx = 3;
		gbc_lblTratamientoRealizado.gridy = 0;
		JpanelContenido.add(lblTratamientoRealizado, gbc_lblTratamientoRealizado);
		
		// Se hace combo para tener diferentes opciones de elección

		// Se le coloca el tipo al combo ya que es un arrayList 
		// Se le coloca el ArrayList por el tema de los genericos
		comboBox = new JComboBox<String>();
		//1) forma de hacerlo 
		String itemsDeSeleccion[] = {"...", "Neumoconiosis", "Vertigo", "Respiracion"}; 
		comboBox.setModel(new DefaultComboBoxModel<>(itemsDeSeleccion));
		// 2) forma de hacerlo
		// comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "Neumoconiosis", "Vertigo", "Respiracion"}));
		// Para poder definir cual elemento se visualisara por defecto sera el siguiente: 
		comboBox.setSelectedIndex(0);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 0;
		JpanelContenido.add(comboBox, gbc_comboBox);
		comboBox.addActionListener(this);
		

		lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		JpanelContenido.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.WEST;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		JpanelContenido.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblDiasHospitalizacin = new JLabel("Hospitalización (dias)");
		GridBagConstraints gbc_lblDiasHospitalizacin = new GridBagConstraints();
		gbc_lblDiasHospitalizacin.anchor = GridBagConstraints.EAST;
		gbc_lblDiasHospitalizacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDiasHospitalizacin.gridx = 3;
		gbc_lblDiasHospitalizacin.gridy = 1;
		JpanelContenido.add(lblDiasHospitalizacin, gbc_lblDiasHospitalizacin);
		
		txtCuantosDias = new JTextField();
		GridBagConstraints gbc_txtCuantosDias = new GridBagConstraints();
		gbc_txtCuantosDias.insets = new Insets(0, 0, 5, 5);
		gbc_txtCuantosDias.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCuantosDias.gridx = 4;
		gbc_txtCuantosDias.gridy = 1;
		JpanelContenido.add(txtCuantosDias, gbc_txtCuantosDias);
		txtCuantosDias.setColumns(10);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 2;
		JpanelContenido.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.anchor = GridBagConstraints.WEST;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.gridx = 2;
		gbc_txtDireccion.gridy = 2;
		JpanelContenido.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		lblCostosMedicamentos = new JLabel("Costos medicamentos");
		GridBagConstraints gbc_lblCostosMedicamentos = new GridBagConstraints();
		gbc_lblCostosMedicamentos.anchor = GridBagConstraints.EAST;
		gbc_lblCostosMedicamentos.insets = new Insets(0, 0, 5, 5);
		gbc_lblCostosMedicamentos.gridx = 3;
		gbc_lblCostosMedicamentos.gridy = 2;
		JpanelContenido.add(lblCostosMedicamentos, gbc_lblCostosMedicamentos);
		
		txtCostosMedica = new JTextField();
		GridBagConstraints gbc_txtCostosMedica = new GridBagConstraints();
		gbc_txtCostosMedica.insets = new Insets(0, 0, 5, 5);
		gbc_txtCostosMedica.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCostosMedica.gridx = 4;
		gbc_txtCostosMedica.gridy = 2;
		JpanelContenido.add(txtCostosMedica, gbc_txtCostosMedica);
		txtCostosMedica.setColumns(10);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 3;
		JpanelContenido.add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.anchor = GridBagConstraints.WEST;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.gridx = 2;
		gbc_txtTelefono.gridy = 3;
		JpanelContenido.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		btnHecho = new JButton("Hecho");
		GridBagConstraints gbc_btnHecho = new GridBagConstraints();
		gbc_btnHecho.insets = new Insets(0, 0, 5, 5);
		gbc_btnHecho.gridx = 3;
		gbc_btnHecho.gridy = 3;
		JpanelContenido.add(btnHecho, gbc_btnHecho);
		btnHecho.addActionListener(this);
		
		btnVaciar = new JButton("Vaciar");
		GridBagConstraints gbc_btnVaciar = new GridBagConstraints();
		gbc_btnVaciar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVaciar.gridx = 4;
		gbc_btnVaciar.gridy = 3;
		JpanelContenido.add(btnVaciar, gbc_btnVaciar);
		btnVaciar.addActionListener(this);
		
		lblNombreEmpresa = new JLabel("Nombre Empresa");
		lblNombreEmpresa.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNombreEmpresa = new GridBagConstraints();
		gbc_lblNombreEmpresa.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreEmpresa.gridx = 1;
		gbc_lblNombreEmpresa.gridy = 4;
		JpanelContenido.add(lblNombreEmpresa, gbc_lblNombreEmpresa);
		
		txtNombreEmpresa = new JTextField();
		GridBagConstraints gbc_txtNombreEmpresa = new GridBagConstraints();
		gbc_txtNombreEmpresa.anchor = GridBagConstraints.WEST;
		gbc_txtNombreEmpresa.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreEmpresa.gridx = 2;
		gbc_txtNombreEmpresa.gridy = 4;
		JpanelContenido.add(txtNombreEmpresa, gbc_txtNombreEmpresa);
		txtNombreEmpresa.setColumns(10);
		
		lblTipoOperario = new JLabel("Tipo Operario");
		lblTipoOperario.setFont(new Font("Dialog", Font.BOLD, 16));
		GridBagConstraints gbc_lblTipoOperario = new GridBagConstraints();
		gbc_lblTipoOperario.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoOperario.gridx = 1;
		gbc_lblTipoOperario.gridy = 5;
		JpanelContenido.add(lblTipoOperario, gbc_lblTipoOperario);
		
		// Grupo de radios
		// Creamos instancia 
		groupoDeRadios = new ButtonGroup();

		rdBtnOperario = new JRadioButton("Operario");
		rdBtnOperario.setFont(new Font("Dialog", Font.BOLD, 15));
		rdBtnOperario.setBackground(new Color(218, 221, 252));
		rdBtnOperario.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_rdBtnOperario = new GridBagConstraints();
		gbc_rdBtnOperario.anchor = GridBagConstraints.WEST;
		gbc_rdBtnOperario.insets = new Insets(0, 0, 5, 5);
		gbc_rdBtnOperario.gridx = 2;
		gbc_rdBtnOperario.gridy = 5;
		JpanelContenido.add(rdBtnOperario, gbc_rdBtnOperario);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 4;
		gbc_textArea.gridy = 5;
		JpanelContenido.add(textArea, gbc_textArea);
		textArea.setBackground(new Color(216,227,231));
		
		
		rdBtnMinero = new JRadioButton("Minero");
		rdBtnMinero.setFont(new Font("Dialog", Font.BOLD, 15));
		rdBtnMinero.setBackground(new Color(218,221,252));
		rdBtnMinero.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_rdBtnMinero = new GridBagConstraints();
		gbc_rdBtnMinero.anchor = GridBagConstraints.WEST;
		gbc_rdBtnMinero.insets = new Insets(0, 0, 5, 5);
		gbc_rdBtnMinero.gridx = 2;
		gbc_rdBtnMinero.gridy = 6;
		JpanelContenido.add(rdBtnMinero, gbc_rdBtnMinero);

		// Agregamos los radios al grupo
		groupoDeRadios.add(rdBtnOperario);
		groupoDeRadios.add(rdBtnMinero);

		// // Elementos para el escuchador
		// Object[] listEscucha = {btnHecho, comboBox};

		// for(Object itme : listEscucha){
		// 	itme.addActionListener(this);
		// }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnHecho == e.getSource()) {

			// Obtenemos los datos
			String documento = txtDocumento.getText();
			String nombre = txtNombre.getText();
			String direccion = txtDireccion.getText();
			String telefono = txtTelefono.getText();
			String nombreEmpresa = txtNombreEmpresa.getText();
			String tipoOperario = tipoOperarioSeleccionado();
			Object tratamiento = comboBox.getSelectedItem();
			String diasHospitalizacion = txtCuantosDias.getText();
			String costoMedicamentos = txtCostosMedica.getText();

			// instanciamos clase
			
			// Pasamos datos al helper
			helperDomain.getDatos(documento,nombre,direccion,telefono,nombreEmpresa,tipoOperario,tratamiento,diasHospitalizacion,costoMedicamentos);  
			helperDomain.getProceso();
			helperDomain.asignarDatosPaciente();
			boolean registro = helperDomain.registrarPaciente();
			// Si el registro es True entonces
			if(registro){
				// Mostramos los datos del paciente registrado
				StringBuffer datos = helperDomain.mostrarDatosPaciente();
				textArea.setText("Usuario Registrado");
				textArea.setForeground(new Color(15,0,255));
				System.out.println(datos);
				JOptionPane.showMessageDialog(null, datos);
				System.out.println("->Cantidad Pacientes Registrados :: "+helperDomain.cantidadPacientes());
				
			}else{
				// Ya esta registrado
				textArea.setText( "-Ya esta registrado-"+"\n\n"+":: Nombre = "+nombre+ "::\n:: Documento = "+documento+" ::");
				textArea.setForeground(Color.RED);
			}
		}

		// Boton para vaciar las celdas
		if (btnVaciar == e.getSource()) {
			txtDocumento.setText(""); 
			txtNombre.setText("");
			txtDireccion.setText("");
			txtTelefono.setText("");
			txtNombreEmpresa.setText("");
			txtCuantosDias.setText("");
			txtCostosMedica.setText("");
		}
	}

	// Metodo para saber que opcion seleccion
	public String tipoOperarioSeleccionado(){

		// String tipo = "";

		if(rdBtnOperario.isSelected()){
			return "Operario";
		}
		else if(rdBtnMinero.isSelected()){
			return "Minero";
		}
		
		return "null";
		// return tipo;
	}
}
