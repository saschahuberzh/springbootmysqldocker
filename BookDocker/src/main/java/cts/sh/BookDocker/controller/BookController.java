package cts.sh.BookDocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cts.sh.BookDocker.model.Book;
import cts.sh.BookDocker.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@PostMapping
	public Book saveBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	
	@DeleteMapping
	public void deleteAllBooks(){
		bookService.deleteAll();
	}
}
