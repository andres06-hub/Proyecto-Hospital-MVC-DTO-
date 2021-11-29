package Controlador;

import Controlador.Helpers.HelperDomain;
// import Modelo.Procesos.Procesos;
import Vista.VentanaConsulta;
import Vista.VentanaPrincipal;
import Vista.VentanaRegistro;

public class CoordinadorVistas{

	private VentanaPrincipal ventanaPrincipal;
	private VentanaRegistro ventanaRegistrar;
	private VentanaConsulta ventanaConsultar;
	// private Procesos procesos;

	private HelperDomain helper;
	
	
	// Metodo de acceso del coordinador
	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public void setVentanaRegistrar(VentanaRegistro ventanaRegistrar) {
		this.ventanaRegistrar = ventanaRegistrar;
	}

	public void setVentanaConsultar(VentanaConsulta ventanaConsultar) {
		this.ventanaConsultar = ventanaConsultar;
	}

	// Asignamos la instancia
	public void setHelper(HelperDomain helper) {
		this.helper = helper;
	}

	// public void setProcesos(Procesos procesos) {
	// 	this.procesos = procesos;
		
	// }

//	Metodo el cual se encarga de mostrar la ventana principal
	public void mostrarVentanaPrincipal() {
		ventanaPrincipal.setVisible(true);
	}
	
//	Metodo que se encarga de mostrar la venta de registro
	public void mostrarVentanaRegistro() {
		ventanaRegistrar.setVisible(true);
	}
	
//	Metodo que muestra la ventan de consulta
	public void mostrarVentanaConsulta() {
		ventanaConsultar.setVisible(true);
		
	}

}
