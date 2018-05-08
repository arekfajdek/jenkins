package pl.rebelwise.jenkinsexample.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rebelwise.jenkinsexample.model.Model;

@RestController
public class Controller {

    @GetMapping("/api/first")
    public Model metoda() {
        return new Model("Arek", 29);
    }
}
