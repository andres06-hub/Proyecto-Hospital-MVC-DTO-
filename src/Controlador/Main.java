package Controlador;


public class Main {

	public static void main(String[] args) {
		try {
			
//			Se inicia el programa
			// new Relaciones().iniciar();
			Relaciones relaciones = new Relaciones();
			relaciones.iniciar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
