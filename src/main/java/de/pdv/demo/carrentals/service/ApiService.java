package de.pdv.demo.carrentals.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ApiService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiService.class);

    public String getGreeting() {
        return "Hello World";
    }

    public void addSomeThing(String data) {
        // NOCH NICHT UMGESETZT
        LOGGER.info("Daten empfangen: {}", data);
    }
}
