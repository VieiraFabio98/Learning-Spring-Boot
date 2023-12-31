package io.github.VieiraFabio98;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasAplicattion {

    @Value("${application.name}")
    private String applicationName;

    @Gato
    private Animal animal;

    @Cachorro
    private Animal animal2;

    @Bean(name = "executar animal")
    public CommandLineRunner executar() {
        return args -> {
            this.animal.fazerBarulho();
            this.animal2.fazerBarulho();
        };
    }

    @GetMapping ("/hello")
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasAplicattion.class, args);
    }
}
