package com.springstudy.springjournal;

import com.springstudy.springjournal.domain.Journal;
import com.springstudy.springjournal.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJournalApplication {

    @Bean
    InitializingBean saveData(JournalRepository repo){
        return () -> {
            repo.save(new Journal("What is Spring-boot?", "Today i will learn Spring-boot", "05/07/18"));
            repo.save(new Journal("Why example does not work?", "I have no idea", "06/07/18"));
            repo.save(new Journal("Example works?", "Ok", "06/07/18"));
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringJournalApplication.class, args);
    }
}
