package com.example.demo3;

import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class GreetingClient {

    private final WebClient client;

    public GreetingClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8081").build();
    }

    public Mono<String> getMessage(String name) {
        return this.client.get().uri(uriBuilder -> uriBuilder.path("/info-service/"+name)
                        .build()).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Greeting.class)
                .map(Greeting::getJob);
    }

}