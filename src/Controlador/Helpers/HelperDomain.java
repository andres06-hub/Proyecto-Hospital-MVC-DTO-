package Controlador.Helpers;


import Modelo.Domain.Paciente;
import Modelo.Procesos.ModeloDatos; 
import Modelo.Procesos.Procesos;


// Sera la clase ayudante para recibir los datos del registro
// los verificara y los convertira si es necesario
/**
 * String -> int
 * String -> Double
 * etc...
 */
public class HelperDomain {

    private String documento;
	private String nombre;
	private String direccion;
    private String telefono;
	private String tipoOperario;
	private String nombreEmpresa;
	private String tratamientoRealizado;
	private int diasHospitalizado;
	private double costosMedicamentos;

	private double costoTotal;

    // Variables para las instancias que llegan por Relaciones
    private ModeloDatos modeloDatos;
    private Procesos misProcesos;

    // Instanciamos clase
    Paciente paciente;
    

    // Llega la instancia de ModeloDatos que se hizo en relaciones
    public void setModeloDatos(ModeloDatos modeloDatos) {
        this.modeloDatos = modeloDatos;
    }
    public void setProcesos(Procesos procesos){
        this.misProcesos = procesos;
    }



    // Constructor Explicito
    // Obtenemos datos
    public void getDatos(String documento, String nombre,String direccion,String telefono, String nombreEmpresa,
    String tipoOperario,Object tratamiento,String diasHospitalizacion,String costoMedicamentos){

        // Obtenemos los datos y los transformarlos a los datos necesarios
        this.documento = documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoOperario = tipoOperario;
        this.nombreEmpresa = nombreEmpresa;
        this.tratamientoRealizado = tratamiento.toString(); 
        this.diasHospitalizado = Integer.parseInt(diasHospitalizacion);
        this.costosMedicamentos = Double.parseDouble(costoMedicamentos);
    }

    // Asignamos los datos a la clase Paciente
    public void asignarDatosPaciente(){

        // Creamos objeto 
        // Metodo Implicito
        paciente = new Paciente();
        // Asignamos datos del objeto
        paciente.setDocumento(this.documento);
        paciente.setNombre(this.nombre);
        paciente.setDireccion(this.direccion);
        paciente.setTelefono(this.telefono);
        paciente.setTipoOperario(this.tipoOperario);
        paciente.setTipoOperario(this.tipoOperario);
        paciente.setNombreEmpresa(this.nombreEmpresa);
        paciente.setTratamientoRealizado(this.tratamientoRealizado);
        paciente.setDiasHospitalizado(this.diasHospitalizado);
        paciente.setCostosMedicamentos(this.costosMedicamentos);
        paciente.setCostoTotal(this.costoTotal);
        // Guardamos personas

        // modeloDatos.registrarPaciente(paciente);

    }

    public void getProceso(){
        // double costoFinal = misProcesos.hacerProcesos(paciente);
        double costoFinal = misProcesos.hacerProcesos(this.tipoOperario, this.tratamientoRealizado, this.diasHospitalizado, this.costosMedicamentos);
        // Asiganamos el costo total dado
        this.costoTotal = costoFinal;
        // paciente.setCostoTotal(costoFinal);
        // return costoFinal;
    }

// Metodo para obtener los datos del paciente en VENTANA REGISTRO
    public StringBuffer mostrarDatosPaciente(){
        StringBuffer datos = paciente.toStringBuffer();
        // System.out.println(datos);
        // JOptionPane.showMessageDialog(null,datos);
        return datos;

    }
/////////////////////////////////////////////////////////////////////
// Modelo de datos
    public boolean registrarPaciente(){
        // Creamos la instancia del modelo de datos
        // Guardamos (Registramos) el paciente
        boolean registro = modeloDatos.registrarPaciente(paciente);
        return registro;

    }
    
// Metodo que se encarga de mostrar todos los datos de los pacientes
// reguistrados
    public String mostrarPacientes(){
        // String pacientesRegistrados = modeloDatos.mostrarPacientes();
        return modeloDatos.mostrarPacientes();
        // return pacientesRegistrados;
    }

// Recibo la cantidad de pacientes registrados
    public int cantidadPacientes(){
        return modeloDatos.cantidadPacientesResgistrados();
    }

// MOSTRAR PACIENTE CONSULTADO (ESPECIFICO)
    public String mostrarPacienteConsultado(String documentoObtenido){
        return modeloDatos.consultarPacienteEspecifico(documentoObtenido);
	}

/////////////////////////////////////////////////////////////////////

    /**
     *
     * @MetodosAcceso
     */

	public String getDocumento() {
        return documento;
	}
    
	public void setDocumento(String documento) {
        this.documento = documento;
	}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoOperario() {
		return tipoOperario;
	}

	public void setTipoOperario(String tipoOperario) {
		this.tipoOperario = tipoOperario;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTratamientoRealizado() {
		return tratamientoRealizado;
	}

	public void setTratamientoRealizado(String tratamientoRealizado) {
		this.tratamientoRealizado = tratamientoRealizado;
	}

	public int getDiasHospitalizado() {
		return diasHospitalizado;
	}

	public void setDiasHospitalizado(int diasHospitalizado) {
		this.diasHospitalizado = diasHospitalizado;
	}

	public double getCostosMedicamentos() {
		return costosMedicamentos;
	}

	public void setCostosMedicamentos(double costosMedicamentos) {
		this.costosMedicamentos = costosMedicamentos;
	}

	public double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}


}
