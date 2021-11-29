package Modelo.Procesos;

// import Controlador.Helpers.HelperDomain;

// import java.util.ArrayList;

// import javax.swing.event.ListDataEvent;

// import Controlador.CoordinadorVistas;
// import Modelo.Domain.Paciente;

public class Procesos {

		double resultadoDias;
		double resultadoCostosMedicamentos;
		double costoTratamiento;
		double costoFinal;
		double descuento = 20;

		// Costos de tratamiento
		double neumoconiosis = 500000;
		double vertigo = 300000;
		double respiracion = 250000;
		double costoDia = 80000;

	public double hacerProcesos(String tipoOperario, String tratamientoRealizado, int diasHospitalizado, double costosMedicamentos){


		// Instanciamos clase
		
		// Paciente de tipo Operario tendran los precios iniciales
		if (tipoOperario.equalsIgnoreCase("Operario")){

			// Si selecciona "Neumoconiosis"
			if(tratamientoRealizado.equalsIgnoreCase("Neumoconiosis")){

				// asignamos el costo del tratamiento
				costoTratamiento = neumoconiosis;
				// Hacemos el calculo de cuantos 
				resultadoDias = diasHospitalizado * costoDia;
				// obtenemos los resultados del costo de medicamentos
				resultadoCostosMedicamentos = costosMedicamentos;
				// Tendremos el conto final del registro
				costoFinal = costoTratamiento + resultadoDias + resultadoCostosMedicamentos;
				
//				// Asiganamos el costo total de la persona
//				paciente.setCostoTotal(costoFinal);
				
				return costoFinal;

			// Por el contrario si seleccionan "Vertigo"
			}else if(tratamientoRealizado.equalsIgnoreCase("Vertigo")){

				// asignamos el costo del tratamiento
				costoTratamiento = vertigo;
				// Hacemos el calculo de cuantos 
				resultadoDias = diasHospitalizado * costoDia;
				// obtenemos los resultados del costo de medicamentos
				resultadoCostosMedicamentos = costosMedicamentos; 
				// Tendremos el conto final del registro
				costoFinal = costoTratamiento + resultadoDias + resultadoCostosMedicamentos;
				
				// Asiganamos el costo total de la persona
//				paciente.setCostoTotal(costoFinal);
				return costoFinal;

			// Por el contrario si seleccionan "Respiracion"
			} else if(tratamientoRealizado.equalsIgnoreCase("Respiracion")){

				// asignamos el costo del tratamiento
				costoTratamiento = respiracion;
				// Hacemos el calculo de cuantos 
				resultadoDias = diasHospitalizado * costoDia;
				// obtenemos los resultados del costo de medicamentos
				resultadoCostosMedicamentos = costosMedicamentos; 
				// Tendremos el conto final del registro
				costoFinal = costoTratamiento + resultadoDias + resultadoCostosMedicamentos;

				// Asiganamos el costo total de la persona
//				paciente.setCostoTotal(costoFinal);
				
				return costoFinal;
			}
		}
		// Pacientes de tipo "Minero" tendrab descuento del 20% 
		// En los valores iniciales

		else if (tipoOperario.equalsIgnoreCase("Minero")){

			// Si selecciona "Neumoconiosis"
			if(tratamientoRealizado.equalsIgnoreCase("Neumoconiosis")){

				// asignamos el costo del tratamiento
				costoTratamiento = neumoconiosis - (neumoconiosis*descuento/100);
				// Hacemos el calculo de cuantos 
				resultadoDias = diasHospitalizado * costoDia - (costoDia*descuento/100);
				// obtenemos los resultados del costo de medicamentos
				resultadoCostosMedicamentos = costosMedicamentos; 
				// Tendremos el conto final del registro
				costoFinal = costoTratamiento + resultadoDias + resultadoCostosMedicamentos;
				
//				// Asiganamos el costo total de la persona
//				paciente.setCostoTotal(costoFinal);

				return costoFinal;
				
			// Por el contrario si seleccionan "Vertigo"
			}else if(tratamientoRealizado.equalsIgnoreCase("Vertigo")){  
			
				// asignamos el costo del tratamiento
				costoTratamiento = vertigo - (vertigo*descuento/100);
				// Hacemos el calculo de cuantos 
				resultadoDias = diasHospitalizado * costoDia - (costoDia*descuento/100);
				// obtenemos los resultados del costo de medicamentos
				resultadoCostosMedicamentos = costosMedicamentos; 
				// Tendremos el conto final del registro
				costoFinal = costoTratamiento + resultadoDias + resultadoCostosMedicamentos;
				
				// Asiganamos el costo total de la persona
//				paciente.setCostoTotal(costoFinal);
				return costoFinal;
				
			// Por el contrario si seleccionan "Respiracion"
			} else if(tratamientoRealizado.equalsIgnoreCase("Respiracion")){

				// asignamos el costo del tratamiento
				costoTratamiento = respiracion - (respiracion*descuento/100);
				// Hacemos el calculo de cuantos 
				resultadoDias = diasHospitalizado * costoDia - (costoDia*descuento/100);
				// obtenemos los resultados del costo de medicamentos
				resultadoCostosMedicamentos = costosMedicamentos; 
				// Tendremos el conto final del registro
				costoFinal = costoTratamiento + resultadoDias + resultadoCostosMedicamentos;
				
				// Asiganamos el costo total de la persona
//				paciente.setCostoTotal(costoFinal);
				
				return costoFinal;
			}
		}
		return 0;
	}

	
}
