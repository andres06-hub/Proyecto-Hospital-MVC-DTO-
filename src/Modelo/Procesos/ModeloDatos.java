package Modelo.Procesos;

import java.util.ArrayList;

// import javax.swing.JOptionPane;

import Modelo.Domain.Paciente;

public class ModeloDatos {


// Creamos lista para tener un modelo de datos
// ArrayList de tipo Pacientes
	ArrayList<Paciente> listaPacientes;

	public ModeloDatos(){
		// ArrayList de tipo Pacientes
		listaPacientes = new ArrayList<Paciente>();
	}

// Metodo para guardar pacientes
	public boolean registrarPaciente(Paciente pacienteIngresado){
		// Si hay elementos en la lista
		if(listaPacientes.size() > 0){
			// pasamos por cada paciente verificando
			for (Paciente paciente : listaPacientes) {
				// Verifivcamos si el usuario ya esta registrado
				if (pacienteIngresado.getDocumento().equals(paciente.getDocumento())) {
					return false;
				}
			}
			// Si no se encuentra ninguna coincidencia con algun paciente
			listaPacientes.add(pacienteIngresado);
			System.out.println("Tamaño lista :: "+listaPacientes.size());
			return true;
		}
		// Si la lista esta vacia se agregara el primer usuario
		listaPacientes.add(pacienteIngresado);
		// Guardamos el paciente
		return true;
	}

	// Metodo para saber cuantos Paceintes hay registrados
	public int cantidadPacientesResgistrados(){
		return listaPacientes.size();
	}

// Metodo : Muestra pacientes registrados
	public String mostrarPacientes(){

		// Creamos cadena
		String cadena = "";
		// Si hay Pacientes registrados
		if(listaPacientes.size() >0){
			for (Paciente paciente : listaPacientes) {
				
				cadena+="Documento: "+paciente.getDocumento()+"\n";
				cadena+="Nombre: "+paciente.getNombre()+"\n";
				cadena+="Telefono: "+paciente.getTelefono()+"\n";
				cadena+="Dirección: "+paciente.getDireccion()+"\n";
				cadena+="Nombre Empresa: "+paciente.getNombreEmpresa()+"\n";
				cadena+="Tratamiento: "+paciente.getTratamientoRealizado()+"\n";
				cadena+="Dias Hoxpitalización: "+paciente.getDiasHospitalizado()+"\n";
				cadena+="Costos Medicamentos: "+paciente.getCostosMedicamentos()+"\n";
				cadena+="Costo TOTAL: "+paciente.getCostoTotal()+"\n\n";
				cadena+="";

			}
		}
		return cadena;
		// return "No hay datos encontrados";
		
	}


// Metodo para consultar pacientes en especifico 
    public String consultarPacienteEspecifico(String documentoObtenido) {

		String cadena = "";
		System.out.println("Documento obtenido :: "+documentoObtenido);
		// Si la lista tiene datos
		if (listaPacientes.size() > 0) {
			// Si el dato no es null
			if(documentoObtenido.length() > 0){
				// for (int paciente = 0; paciente <= listaPacientes.size(); paciente++) {
				// }
				for (Paciente paciente : listaPacientes) {
					// Si los datos coinciden
					System.out.println("Documento paciente -> "+paciente.getDocumento());
					if (documentoObtenido.equals(paciente.getDocumento())) {
						
						// paciente.toString();
						// JOptionPane.showMessageDialog(null, paciente.toString()+"");
						cadena += "Documento : " + paciente.getDocumento()+"\n";
						cadena += "Nombre : " + paciente.getNombre()+"\n";
						cadena += "Teléfono : " + paciente.getTelefono()+"\n";
						cadena += "Dirección : " + paciente.getDireccion()+"\n";
						cadena += "Nombre Empresa : " + paciente.getNombreEmpresa()+"\n";
						cadena += "Tipo Operario : " + paciente.getTipoOperario()+"\n"; 
						cadena += "Tratamiento : " + paciente.getTratamientoRealizado()+"\n"; 
						cadena += "Dias Hozpitalización : " + paciente.getDiasHospitalizado()+"\n"; 
						cadena += "Costos Medicos : " + paciente.getCostosMedicamentos()+"\n";
						cadena += "Costo Total : " + paciente.getCostoTotal()+"\n"; 
						// rompemos el ciclo cuando encuentre al un Paciente
						break;
					}
				}
				// Si la cadena es diferente de vacia entonces la retornamos 
				if (!cadena.equals("")) {
					return cadena;
				// Si la cadena es vacia entonces
				}else{
					return "Paceinte NO existe!!";
				}
			}
			return "Por Favor ingrese un dato!";
			// JOptionPane.showMessageDialog(null, "Por Favor ingrese un dato!");
		}
		return "No hay pacientes Registrados";
		// JOptionPane.showMessageDialog(null, "No hay paceintes Registrados");
		// return "No hay Pacientes registrados";

    }



}
