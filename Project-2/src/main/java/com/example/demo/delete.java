package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/delete/{bookid}")

public class delete {
	
	@Autowired repo ob;
	@PostMapping()
	    public String deletebyid(@PathVariable("bookid") int bookid)
	    {
		 
		
		 
					ob.deleteAllByIdInBatch(bookid);
					
				 
			
		return "deleted updated";
}

}
