package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  
public class BooksService   
{  
	@Autowired  repo ob;  
    Library lib1 = new Library();
	public void saveOrUpdate(Library library)   
	{  
		ob.save(library);  
		
	}  
	
	
	public List<Library> getAllBooks()   
	{  
		List<Library> books = new ArrayList<Library>();  
		ob.findAll().forEach(books1 -> books.add(books1));  
		return books;  
	}  
	
	

}
