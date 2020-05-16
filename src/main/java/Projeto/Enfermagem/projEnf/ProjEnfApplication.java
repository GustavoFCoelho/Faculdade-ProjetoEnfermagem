package Projeto.Enfermagem.projEnf;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Agenda;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Idoso;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Pessoa;
import Projeto.Enfermagem.projEnf.datastore.database.repository.AgendaRepository;
import Projeto.Enfermagem.projEnf.datastore.database.repository.IdosoRepository;
import Projeto.Enfermagem.projEnf.datastore.database.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjEnfApplication {

	private final PessoaRepository pessoaRepository;
	private final AgendaRepository agendaRepository;
	private final IdosoRepository idosoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjEnfApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Pessoa pessoa = Pessoa.builder()
//				.cpf("122.476.359-97")
//				.dataentrada(LocalDate.now())
//				.datanascimento(LocalDate.MIN)
//				.nome("Robson")
//				.sobrenome("Figueiredo")
//				.rg("1431235")
//				.sexo("HOMEM")
//				.tipopessoa("IDOSO")
//				.build();
//
//		pessoaRepository.save(pessoa);
//
//		Idoso idoso = Idoso.builder()
//				.chegada("CHEGADO")
//				.criseconvulsiva("CRISEDO")
//				.diabetico("SIM")
//				.enchaminhado("SIM")
//				.estagioulcera("IV")
//				.pessoa(pessoa)
//				.build();
//
//		idosoRepository.save(idoso);
//
//		Agenda agenda = Agenda.builder()
//				.data(LocalDate.of(2020, 05, 17))
//				.descricao("Medico")
//				.hora(LocalTime.of(12, 50))
//				.numerorua("5021")
//				.pessoa(pessoa)
//				.rua("Rua Condor")
//				.build();
//
//		agendaRepository.save(agenda);
//	}
}
