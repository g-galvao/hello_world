package com.helloworld.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping
    public String HelloWorld() {
        return "<h1>Hello World!</h1>";
    }

    @GetMapping("/bsm")
    public String retornaBsm() {
        return "<h2>Mentalidades:</h2>- Orientação ao Futuro <br>- Responsabilidade Pessoal<br>- Mentalidade de Crescimento<br>- Persistência<br>" +
                "<h2>Habilidades:</h2>- Trabalho em Equipe<br>- Atenção aos Detalhes<br>- Proatividade <br>Comunicação";
    }

    @GetMapping("/objetivos")
    public String retornaObjetivos() {
        return "<h2>Objetivos de aprendizagem desta semana:</h2> <br>- Desenvolver minhas habilidades de trabalho em equipe para o projeto;" +
                "<br>- Orientação ao Futuro pensando no trabalho após o NeoCamp;<br>- Mentalidade de Crescimento e " +
                "possivelmente buscar um curso de Java/Spring/SQL para complementar os estudos;<br>- Persistência sempre.";
    }

}
