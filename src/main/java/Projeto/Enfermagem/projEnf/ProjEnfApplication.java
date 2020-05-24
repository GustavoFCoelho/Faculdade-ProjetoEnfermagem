package Projeto.Enfermagem.projEnf;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Agenda;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Idoso;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Pessoa;
import Projeto.Enfermagem.projEnf.datastore.database.entity.User;
import Projeto.Enfermagem.projEnf.datastore.database.repository.AgendaRepository;
import Projeto.Enfermagem.projEnf.datastore.database.repository.IdosoRepository;
import Projeto.Enfermagem.projEnf.datastore.database.repository.PessoaRepository;
import Projeto.Enfermagem.projEnf.datastore.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjEnfApplication implements CommandLineRunner {

	private final PessoaRepository pessoaRepository;
	private final UserRepository userRepository;
	private final PasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(ProjEnfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Pessoa pessoa = Pessoa.builder()
//				.cpf("122.476.359-97")
//				.dataentrada(LocalDate.now())
//				.datanascimento(LocalDate.now())
//				.nome("Robson")
//				.sobrenome("Figueiredo")
//				.rg("1431235")
//				.sexo("HOMEM")
//				.tipopessoa("IDOSO")
//				.build();
//
//		pessoaRepository.save(pessoa);
//
//		User user = User.builder()
//				.login("ads").senha(encoder.encode("ads")).pessoa(pessoa).build();
//
//		userRepository.save(user);
	}
}
