package udb.net.mod1.regacad;

 class EstudianteColP extends Estudiante {

	public EstudianteColP() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteColP(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual) {
		super(codigo, nombre, apellido, cum, cuotaMensual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMontobeca() {
		// TODO Auto-generated method stub
		return getCum()>=9.0?getCuotaMensual() * 0.5:0.00;
	}

}
