package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.CoordinadorVistas;
import Controlador.Helpers.HelperDomain;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
// import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;

public class VentanaConsulta extends JDialog implements ActionListener {

	private JPanel contentPane = new JPanel();
	private JPanel panelTitulo;
	private JLabel lblConsultar;
	private JPanel panelConsulta;
	private JLabel lblIngresoDocumento;
	private JPanel panelTabla;
	private JButton btnConsultar;
	private JTextField textIngresoDocumento;

	private CoordinadorVistas elCoordinador; 

	// variables que reciben las instancias del paquete relaciones
	private HelperDomain helperDomain;
	private JButton btnVerPacientes;
	private JLabel lblCantidadPacientes;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
	// Metodo de acceso para el coordinador
	public void setCoordinador(CoordinadorVistas coordinador) {
		this.elCoordinador = coordinador;
	}

	public void setHelper(HelperDomain helperDomain){
		this.helperDomain = helperDomain;
	}

	/**
	 * Create the frame.
	 */
	public VentanaConsulta() {
//		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(40, 360, 755, 528);
		contentPane = new JPanel();
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		/*addWindowListener(this);*/
		
	
//		Llamamos el metodo
		contenidoVentana();
		// pacientesRegistrados();
	
	}
	
	public void contenidoVentana() {
	
		panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(255,201,71));
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		GridBagLayout gbl_panelTitulo = new GridBagLayout();
		gbl_panelTitulo.columnWidths = new int[]{80, 620, 80, 0};
		gbl_panelTitulo.rowHeights = new int[]{27, 45, 0, 0};
		gbl_panelTitulo.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelTitulo.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelTitulo.setLayout(gbl_panelTitulo);
		
		lblConsultar = new JLabel("Consultar");
		lblConsultar.setBackground(Color.black);
		lblConsultar.setFont(new Font("Fira Code", Font.BOLD, 16));
		lblConsultar.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblConsultar = new GridBagConstraints();
		gbc_lblConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultar.gridx = 1;
		gbc_lblConsultar.gridy = 1;
		panelTitulo.add(lblConsultar, gbc_lblConsultar);
		
		panelTabla = new JPanel();
		contentPane.add(panelTabla, BorderLayout.SOUTH);
		GridBagLayout gbl_panelTabla = new GridBagLayout();
		gbl_panelTabla.columnWidths = new int[]{0, 692, 0, 0};
		gbl_panelTabla.rowHeights = new int[]{0, 29, 230, 0};
		gbl_panelTabla.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelTabla.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		panelTabla.setLayout(gbl_panelTabla);
		
		btnVerPacientes = new JButton("Ver Pacientes");
		GridBagConstraints gbc_btnVerPacientes = new GridBagConstraints();
		gbc_btnVerPacientes.anchor = GridBagConstraints.WEST;
		gbc_btnVerPacientes.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerPacientes.gridx = 1;
		gbc_btnVerPacientes.gridy = 1;
		panelTabla.add(btnVerPacientes, gbc_btnVerPacientes);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panelTabla.add(scrollPane, gbc_scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		btnVerPacientes.addActionListener(this);
		// String datosPacientes = helperDomain.mostrarPacientes();
		// textArea.setText(datosPacientes);
		
		panelConsulta = new JPanel();
		contentPane.add(panelConsulta, BorderLayout.CENTER);
		panelConsulta.setBackground(new Color(239,239,239));
		GridBagLayout gbl_panelConsulta = new GridBagLayout();
		gbl_panelConsulta.columnWidths = new int[]{38, 167, 313, 237, 0, 0};
		gbl_panelConsulta.rowHeights = new int[]{30, 25, 15, 0};
		gbl_panelConsulta.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelConsulta.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelConsulta.setLayout(gbl_panelConsulta);
		
		lblIngresoDocumento = new JLabel("Ingresar Documento");
		GridBagConstraints gbc_lblIngresoDocumento = new GridBagConstraints();
		gbc_lblIngresoDocumento.anchor = GridBagConstraints.EAST;
		gbc_lblIngresoDocumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngresoDocumento.gridx = 1;
		gbc_lblIngresoDocumento.gridy = 1;
		panelConsulta.add(lblIngresoDocumento, gbc_lblIngresoDocumento);
		
		textIngresoDocumento = new JTextField();
		textIngresoDocumento.setFont(new Font("Fira Mono", Font.PLAIN, 15));
		GridBagConstraints gbc_textIngresoDocumento = new GridBagConstraints();
		gbc_textIngresoDocumento.insets = new Insets(0, 0, 5, 5);
		gbc_textIngresoDocumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textIngresoDocumento.gridx = 2;
		gbc_textIngresoDocumento.gridy = 1;
		panelConsulta.add(textIngresoDocumento, gbc_textIngresoDocumento);
		textIngresoDocumento.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.anchor = GridBagConstraints.WEST;
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultar.gridx = 3;
		gbc_btnConsultar.gridy = 1;
		panelConsulta.add(btnConsultar, gbc_btnConsultar);
		
		lblCantidadPacientes = new JLabel("Cantidad Pacientes :: 0");
		GridBagConstraints gbc_lblCantidadPacientes = new GridBagConstraints();
		gbc_lblCantidadPacientes.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidadPacientes.gridx = 2;
		gbc_lblCantidadPacientes.gridy = 2;
		panelConsulta.add(lblCantidadPacientes, gbc_lblCantidadPacientes);
		btnConsultar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Boton para ver los Pacientes
		if(btnVerPacientes == e.getSource()){
			// Asiganamos al area de texto
			textArea.setText(helperDomain.mostrarPacientes()); 
			lblCantidadPacientes.setText("Cantidad Pacientes :: "+helperDomain.cantidadPacientes());
		}
		// Boton para Ver un paciente en especifico
		if(btnConsultar == e.getSource()){
			// Obtenemos el documento a consultar
			String documento = textIngresoDocumento.getText();
			// Pasamos el documento a consuktar y obtenemos el resultado
			// helperDomain.mostrarPacienteConsultado(documento);
			System.out.println(helperDomain.mostrarPacientes());
			// Mostramos mensaje
			JOptionPane.showMessageDialog(null, helperDomain.mostrarPacienteConsultado(documento));
		}
		
	}
}