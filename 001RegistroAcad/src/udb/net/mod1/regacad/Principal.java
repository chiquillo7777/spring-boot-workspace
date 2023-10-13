package udb.net.mod1.regacad;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstudianteCep e1 = new EstudianteCep(1,"Jose", "Perez", 8.21, 65.00);
		EstudianteColP e2 = new EstudianteColP(2, "Mario", "Martinez", 9.6, 70.40);
		
		imprimir(e1);
		imprimir(e2);
		
	}
	
	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCUM: %.2f\nCuota: %.2f",
				e.getNombre(), e.getApellido(), e.getCum(), (e.getCuotaMensual() - e.calcularMontobeca())));
		System.out.println("****************************************************************************************");
	}

}
