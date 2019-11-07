package Projeto.Enfermagem.projEnf;

import Projeto.Enfermagem.projEnf.model.Medicamento;
import Projeto.Enfermagem.projEnf.model.Paciente;
import Projeto.Enfermagem.projEnf.repository.MedicamentoInterface;
import Projeto.Enfermagem.projEnf.repository.PacInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

@SpringBootApplication
public class ProjEnfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjEnfApplication.class, args);
	}

}
