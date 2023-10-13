package udb.net.mod1.regacad.main;

import udb.net.mod1.regacad.Estudiante;
import udb.net.mod1.regacad.FactoriaEstudiante;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 = FactoriaEstudiante.getInstance("CEP");
		e1.setNombre("Jose");
		e1.setApellido("Perez");
		e1.setCum(8.21);
		e1.setCuotaMensual(65.00);
		
		Estudiante e2 = FactoriaEstudiante.getInstance("COL");
		e2.setNombre("Mario");
		e2.setApellido("Martinez");
		e2.setCum(9.21);
		e2.setCuotaMensual(65.00);
		
		imprimir(e1);
		imprimir(e2);

	}
	
	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCUM: %.2f\nCuota: %.2f",
				e.getNombre(), e.getApellido(), e.getCum(), (e.getCuotaMensual() - e.calcularMontobeca())));
		System.out.println("****************************************************************************************");
	}

}
