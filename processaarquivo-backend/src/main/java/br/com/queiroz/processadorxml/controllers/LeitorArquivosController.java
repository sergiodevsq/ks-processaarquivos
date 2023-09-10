package br.com.queiroz.processadorxml.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/leituradados")
public class LeitorArquivosController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String inserirDados() {
		return "Rest está funcionando";
	}
	
}
