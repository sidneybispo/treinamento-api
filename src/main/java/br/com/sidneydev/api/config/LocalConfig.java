package br.com.sidneydev.api.config;

import br.com.sidneydev.api.domain.User;
import br.com.sidneydev.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "sidney", "sidney@mail.com", "123");
        User u2 = new User(null, "andre", "andre@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
