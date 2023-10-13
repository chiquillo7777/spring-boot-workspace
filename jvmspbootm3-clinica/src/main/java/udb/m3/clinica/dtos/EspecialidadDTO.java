package udb.m3.clinica.dtos;

public class EspecialidadDTO {
	
		
		private Integer idEspecialidad;
		private String nombreEspeciadad;
		
		public EspecialidadDTO() {
			// TODO Auto-generated constructor stub
		}
		
		

		public EspecialidadDTO(Integer idEspecialidad, String nombreEspeciadad) {
			super();
			this.idEspecialidad = idEspecialidad;
			this.nombreEspeciadad = nombreEspeciadad;
		}



		public Integer getIdEspecialidad() {
			return idEspecialidad;
		}

		public void setIdEspecialidad(Integer idEspecialidad) {
			this.idEspecialidad = idEspecialidad;
		}

		public String getNombreEspeciadad() {
			return nombreEspeciadad;
		}

		public void setNombreEspeciadad(String nombreEspeciadad) {
			this.nombreEspeciadad = nombreEspeciadad;
		}
}
