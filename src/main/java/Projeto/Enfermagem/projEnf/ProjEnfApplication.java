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
public class ProjEnfApplication implements CommandLineRunner {

	@Autowired
	private PacInterface pacInterface;

	@Autowired
	private MedicamentoInterface medicamentoInterface;

	public static void main(String[] args) {
		SpringApplication.run(ProjEnfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Paciente pac = new Paciente();
		pac.setPacnome("Gustavo");
		pac.setPacsobrenome("Coelho");
		pac.setPacalt("1.80");
		pac.setPacpeso("120.00");
		pac.setPacdtnasc(LocalDate.now());
		pac.setPacdtentrada(LocalDate.now());
		pac.setPacenc("Familia");
		Paciente pac2 = new Paciente();
		pac2.setPacnome("Frederson");
		pac2.setPacsobrenome("Coelho");
		pac2.setPacalt("1.80");
		pac2.setPacpeso("120.00");
		pac2.setPacdtnasc(LocalDate.now());
		pac2.setPacdtentrada(LocalDate.now());
		pac2.setPacenc("Familia");
		pacInterface.saveAll(Arrays.asList(pac, pac2));
		Medicamento medicamento = new Medicamento();
		medicamento.setMedinfo("Clamnate");
		medicamento.setMednome("Rivotril");
		medicamento.setMeddosagem("15mg");
		medicamentoInterface.save(medicamento);
		System.out.println(LocalTime.now());
	}
}
