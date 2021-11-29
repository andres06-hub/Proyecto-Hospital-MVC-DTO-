package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.awt.Font;

import Controlador.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

//	Variables globales
	private JPanel contentPane;
	private JPanel jpHeader;
	private JLabel lblBienvenido;
	private JPanel jpBody;
	private JButton btnRegistrar;
	private JButton btnConsultar;

	
	private CoordinadorVistas elCoordinador;
	
//	Metodos de acceso para coordinador
	public void setCoordinador(CoordinadorVistas coordinador) {
		this.elCoordinador = coordinador;		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 40, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		llamamos funcion
		componentesVentana();
	
	}
	
//	Se crea un metodo que tendra todos los componentes de la ventana
	public void componentesVentana() {
		
		jpHeader = new JPanel();
		jpHeader.setBackground(new Color(103, 137, 131));
		contentPane.add(jpHeader, BorderLayout.NORTH);
		GridBagLayout gbl_jpHeader = new GridBagLayout();
		gbl_jpHeader.columnWidths = new int[]{0, 83, 0, 0};
		gbl_jpHeader.rowHeights = new int[]{15, 15, 15, 0};
		gbl_jpHeader.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_jpHeader.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		jpHeader.setLayout(gbl_jpHeader);
		
		lblBienvenido = new JLabel("Bienvenido!");
		lblBienvenido.setFont(new Font("Fira Code", Font.BOLD, 16));
		GridBagConstraints gbc_lblBienvenido = new GridBagConstraints();
		gbc_lblBienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenido.gridx = 1;
		gbc_lblBienvenido.gridy = 1;
		jpHeader.add(lblBienvenido, gbc_lblBienvenido);
		
		jpBody = new JPanel();
		contentPane.add(jpBody, BorderLayout.CENTER);
		jpBody.setBackground(new Color(230,221,196));
		GridBagLayout gbl_jpbody = new GridBagLayout();
		gbl_jpbody.columnWidths = new int[]{0, 0, 18, 0, 0, 0};
		gbl_jpbody.rowHeights = new int[]{0, 36, 0, 0};
		gbl_jpbody.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_jpbody.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		jpBody.setLayout(gbl_jpbody);
		
		btnRegistrar = new JButton("Registrar");
		GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
		gbc_btnRegistrar.fill = GridBagConstraints.VERTICAL;
		btnRegistrar.setBackground(new Color(150,199,193));
		gbc_btnRegistrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrar.gridx = 1;
		gbc_btnRegistrar.gridy = 1;
		jpBody.add(btnRegistrar, gbc_btnRegistrar);
		
		btnConsultar = new JButton("Consultar");
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.fill = GridBagConstraints.VERTICAL;
		btnConsultar.setBackground(new Color(150,199,193));
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultar.gridx = 3;
		gbc_btnConsultar.gridy = 1;
		jpBody.add(btnConsultar, gbc_btnConsultar);
		
		
//		Escuchador
		JButton[] listBtn = {btnRegistrar, btnConsultar};
//		Pasamos asignando
		for(JButton btn : listBtn) {
			btn.addActionListener(this);
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
//		Boton de registrar 
		if(btnRegistrar == e.getSource()) {
			
			// llamamos al metodo para poder coordinar la ventana
			elCoordinador.mostrarVentanaRegistro();
			
		}else if(btnConsultar == e.getSource()){
			
			//	llamamos al metodo para poder coordinar la ventana
			elCoordinador.mostrarVentanaConsulta();
				
		}
	}




}
