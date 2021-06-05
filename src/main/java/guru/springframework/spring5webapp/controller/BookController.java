package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepository;


@Controller
public class BookController {
	 // so now we have the books controller to manage the things relative to the books
	
	private final BookRepository bookRepository;
	
	public BookController(BookRepository bookRepsository) {
		this.bookRepository = bookRepsository;
	}
	
	
	
	@RequestMapping("/books")
	public String getBook(Model model) {
			
		model.addAttribute("books", bookRepository.findAll());
		
		return "books"; // the said this is the view name of book
	}
	
}
