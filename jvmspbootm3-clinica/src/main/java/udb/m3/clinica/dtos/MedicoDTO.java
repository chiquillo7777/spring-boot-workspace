package udb.m3.clinica.dtos;

public class MedicoDTO {
	
	private Integer idMedico;
	private String nombreMedico;
	private String apellidoMedico;
	private String jvpm;
	
	public MedicoDTO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public MedicoDTO(Integer idMedico, String nombreMedico, String apellidoMedico, String jvpm) {
		super();
		this.idMedico = idMedico;
		this.nombreMedico = nombreMedico;
		this.apellidoMedico = apellidoMedico;
		this.jvpm = jvpm;
	}



	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getApellidoMedico() {
		return apellidoMedico;
	}

	public void setApellidoMedico(String apellidoMedico) {
		this.apellidoMedico = apellidoMedico;
	}

	public String getJvpm() {
		return jvpm;
	}

	public void setJvpm(String jvpm) {
		this.jvpm = jvpm;
	}
}
