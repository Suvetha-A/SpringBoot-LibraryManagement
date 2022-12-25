package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/updatebook/{bookId}")
public class update {
	@Autowired  repo ob;
	@PostMapping()
	public String update1(@RequestBody Library lib1,@PathVariable("bookId") int bookId)
    {
	 //LogModel logs = ob.findbybookid(bookid);
	
	 
				int bookid =lib1.getBookId();
				
				int quantity= lib1.getQuantity();
				String bookName = lib1.getBookName();
				String genre=lib1.getGenre();

		       
				
				ob.update1(bookid,quantity,bookName,genre,bookId);
			 
			 //ob.save(log);
	// return"success";
	return "successfully updated";
}

}
