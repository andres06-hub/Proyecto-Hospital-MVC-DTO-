package Modelo.Domain;

public class Paciente extends Persona{
	
	// Atributos
	private String telefono;
	private String tipoOperario;
	private String nombreEmpresa;
	private String tratamientoRealizado;
	private int diasHospitalizado;
	private double costosMedicamentos;
	private double costoTotal;


//	Metodos de acceso

	public String getTelefono(){
		return this.telefono;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getTipoOperario() {
		return this.tipoOperario;
	}

	public void setTipoOperario(String tipoOperario) {
		this.tipoOperario = tipoOperario;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTratamientoRealizado() {
		return this.tratamientoRealizado;
	}

	public void setTratamientoRealizado(String tratamientoRealizado) {
		this.tratamientoRealizado = tratamientoRealizado;
	}

	public int getDiasHospitalizado() {
		return this.diasHospitalizado;
	}

	public void setDiasHospitalizado(int diasHospitalizado) {
		this.diasHospitalizado = diasHospitalizado;
	}

	public double getCostosMedicamentos() {
		return this.costosMedicamentos;
	}

	public void setCostosMedicamentos(double costosMedicamentos) {
		this.costosMedicamentos = costosMedicamentos;
	}

	public double getCostoTotal() {
		return this.costoTotal;
	}

	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}

	
	
	
	// Para mostrar los datos del paciente

//	@Override
	public StringBuffer toStringBuffer() {

		StringBuffer datos = new StringBuffer();

		datos.append("\tPaciente Registrado\n");
		datos.append("------------------------------\n");
		datos.append("Documento = " +getDocumento()+"\n");
		datos.append("Nombre = "+getNombre()+"\n");
		datos.append("Direccion = "+getDireccion()+"\n");
		datos.append("Telefono = "+telefono+"\n");
		datos.append("TipoOperario = "+tipoOperario+"\n");
		datos.append("NombreEmpresa = "+nombreEmpresa+"\n");
		datos.append("TratamientoRealizado = "+tratamientoRealizado+"\n");
		datos.append("DiasHospitalizado = "+diasHospitalizado+"\n");
		datos.append("CostosMedicamentos = "+costosMedicamentos+"\n");
		datos.append("costoTotal = " + costoTotal+"\n");

		return datos;
	}

}
