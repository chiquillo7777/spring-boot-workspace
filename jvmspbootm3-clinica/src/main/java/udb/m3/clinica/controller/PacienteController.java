package udb.m3.clinica.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udb.m3.clinica.modelo.Paciente;
import udb.m3.clinica.servicio.IPacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
private final IPacienteService servicePaciente;

	
	@Autowired
	public PacienteController(IPacienteService servicePaciente) {
		// TODO Auto-generated constructor stub
		this.servicePaciente = servicePaciente;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Paciente> pacienteById(@PathVariable("id") Integer id){
		Paciente paciente = null;
		Optional<Paciente> pacienteOpt =this.servicePaciente.leerPorId(id);
		if(pacienteOpt.isPresent()) {
			paciente = pacienteOpt.orElse(null);
		}
		return new ResponseEntity<Paciente>(paciente,HttpStatus.OK);
	}
		
}
