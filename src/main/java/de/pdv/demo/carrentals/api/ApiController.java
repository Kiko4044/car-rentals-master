package de.pdv.demo.carrentals.api;

import de.pdv.demo.carrentals.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * handles http requests to an api endpoint
 */
@RestController
@RequestMapping("api")
public class ApiController
{
    public ApiController(ApiService apiService)
    {
        this.apiService = apiService;
    }

    private final ApiService apiService;

    @GetMapping
    public String hello()
    {
        return apiService.getGreeting();
    }

    @PostMapping
    public void addSomeThing(final String data) {
        apiService.addSomeThing(data);
    }
}
