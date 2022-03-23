package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloworldController {
	
	@GetMapping("/helloworld")
	public String helloworld() 
	{
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String BSM() 
	{
		return "Mentalidades da Generation:\nOrientação ao futuro.\nResponsabilidade Pessoal." +
				"\nMentalidade de crescimento.\nPersistencia." + 
				"\n\nHabilidades da Generation:\nTrabalho em equipe." +
				"\nAtençao aos detalhes.\nProatividade.\nComunicação.";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() 
	{
		return "Meus objetivos desta semana: Aprender os termos básicos utilizados no Spring.";
	}
}
