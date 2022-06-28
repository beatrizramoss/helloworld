package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")

public class ObjetivosController {

	@GetMapping
	public String hello () {
		return " Objetivos da semana: \n"
				+ "- Entrega de atividades no prazo;\n"
				+ "- Pesquisas para o projeto;\n"
				+ "- Estudar MySQL. \n";

	}
}
