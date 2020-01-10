package Projeto.Enfermagem.projEnf.configs;

import Projeto.Enfermagem.projEnf.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("dev")
public class DevConfig {
    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.dll-auto}")
    private String value;

    @Bean
    public boolean instantieateDatabase() throws ParseException {
        if(!"create".equals(value)){
            return false;
        }
        dbService.dadosCriar();
        return true;
    }
}
