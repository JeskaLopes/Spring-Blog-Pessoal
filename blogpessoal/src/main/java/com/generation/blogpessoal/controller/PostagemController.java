package com.generation.blogpessoal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.repository.PostagemRepository;

//notação que define que a classe PostagemController, é uma classe controladora para os endpoints da aplicação
@RestController

//notação que define um caminho para o controlador
@RequestMapping("/postagens")

//libera requisições externas como do postman e do nosso front end
@CrossOrigin(value = "*", allowedHeaders = "*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	

}