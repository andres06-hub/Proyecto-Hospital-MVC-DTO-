package Controlador;

import Controlador.Helpers.HelperDomain;
import Modelo.Procesos.ModeloDatos;
import Modelo.Procesos.Procesos;
// import Modelo.Procesos.Procesos;
import Vista.*;

public class Relaciones {
	
	
	public void iniciar() {
		

//	INSTANCIAMOS las clases unicas
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		VentanaRegistro ventanaRegistrar = new VentanaRegistro();
		VentanaConsulta ventanaConsultar = new VentanaConsulta();
		CoordinadorVistas coordinador = new CoordinadorVistas();
		Procesos procesos = new Procesos();
		
		// Tendremos solo un modelo de datos
		HelperDomain helper = new HelperDomain();
		ModeloDatos modeloDatos = new ModeloDatos();
		
		
// RELACIONES PARA LAS INSTANCIAS
		//	Relacionar el coordinador con las clases
		ventanaPrincipal.setCoordinador(coordinador);
		ventanaConsultar.setCoordinador(coordinador);
		ventanaRegistrar.setCoordinador(coordinador);
		// Se reaciona las clases al coordinador ya que solo es un coordinador para todos
		coordinador.setVentanaPrincipal(ventanaPrincipal);
		coordinador.setVentanaRegistrar(ventanaRegistrar);
		coordinador.setVentanaConsultar(ventanaConsultar);
		// Metodo para mostrar la ventana principal 
		coordinador.mostrarVentanaPrincipal();

		// Relaciones las helperDomain VENTANAREGISTRAR
		ventanaRegistrar.setHelper(helper);
		// Relaciones ModeloDatos al helperDomain
		// Ya que el helper es el que administra 
		helper.setModeloDatos(modeloDatos);
		// Relacionamos los procesos con helper
		helper.setProcesos(procesos);
		
		// Relaciones las helperDomain VENTANACONSULTAR
		ventanaConsultar.setHelper(helper);
		coordinador.setHelper(helper);

		// coordinador.setProcesos(procesos);
		
		
	}
}
