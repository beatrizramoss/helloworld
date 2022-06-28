package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BsmGeneration")

public class BsmController {

	@GetMapping
	public String hello () {
		return "Mentalidades\r\n"
				+ "Orientaçao ao Futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Persistência\r\n"
				+ "\r\n"
				+ "Habilidades\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Atenção aos Detalhes\r\n"
				+ "Proatividade\r\n"
				+ "Comunicação";

	}
}