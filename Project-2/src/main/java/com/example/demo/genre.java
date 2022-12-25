package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/getgenre/{genre}")
public class genre {
	@Autowired repo ob;
	@GetMapping()
	public List<Library> getGenre(@PathVariable("genre") String genre)   
	{  
		return ob.findbygenre(genre);  
	}
}


