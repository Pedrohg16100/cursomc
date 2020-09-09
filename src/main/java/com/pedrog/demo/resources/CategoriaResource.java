package com.pedrog.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedrog.demo.domain.Categoria;

@RestController 
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET )
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "informática");
		Categoria cat2 = new Categoria(2, "escritório");		
		List<Categoria> lista_cat = new ArrayList<>();
		
		lista_cat.add(cat1);
		lista_cat.add(cat2);
	
		
		return lista_cat;
	}

}
