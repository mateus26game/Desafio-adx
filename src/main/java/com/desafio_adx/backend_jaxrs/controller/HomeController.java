package com.desafio_adx.backend_jaxrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/isso")
    public String home() {
        // Serve o arquivo HTML diretamente
        return "index.html";  // O arquivo precisa estar em src/main/resources/static
    }
}
