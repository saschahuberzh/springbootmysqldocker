package cts.sh.BookDocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.sh.BookDocker.model.Book;
import cts.sh.BookDocker.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	BookRepo bookRepo;
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	public Book addBook(Book book){
		return bookRepo.save(book);
	}
	
	public void deleteAll(){
		bookRepo.deleteAll();
	}
}
