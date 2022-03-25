package cts.sh.BookDocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cts.sh.BookDocker.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
