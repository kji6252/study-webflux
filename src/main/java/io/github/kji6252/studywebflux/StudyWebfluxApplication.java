package io.github.kji6252.studywebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyWebfluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyWebfluxApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
        System.out.println(gwc.getResult2());
    }

}
