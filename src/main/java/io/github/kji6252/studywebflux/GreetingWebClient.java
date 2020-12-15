package io.github.kji6252.studywebflux;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GreetingWebClient {
    private final WebClient client = WebClient.create("http://localhost:8080");

    private final Mono<String> result = client.get()
                                                      .uri("/hello")
                                                      .accept(MediaType.TEXT_PLAIN)
                                                      .exchangeToMono(clientResponse -> clientResponse.bodyToMono(String.class));

    public String getResult() {
        return ">> result + " + result.block();
    }

    private final Mono<Human> result2 = client.get()
                                              .uri("/hello2")
                                              .accept(MediaType.APPLICATION_JSON)
                                              .exchangeToMono(clientResponse -> clientResponse.bodyToMono(Human.class));

    public Human getResult2() {
        return result2.block();
    }

}
