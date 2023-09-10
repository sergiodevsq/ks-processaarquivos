package br.com.queiroz.processadorxml.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.queiroz.processadorxml.models.Arquivo;



@RestController
@RequestMapping(value="/leituradados")
public class LeitorArquivosController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Arquivo> inserirDados() {
		
		Arquivo arq1 = new Arquivo(1L, "Arquivo001.xml");
		Arquivo arq2 = new Arquivo(2L, "Arquivo002.xml");
		
		
		List<Arquivo> arquivos = new ArrayList<>();
		
		
		arquivos.add(arq1);
		arquivos.add(arq2);
		
		return arquivos;
	}
	
}
