package com.example.spring5wepapp.model.repositories;

import com.example.spring5wepapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
