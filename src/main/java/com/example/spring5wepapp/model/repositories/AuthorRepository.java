package com.example.spring5wepapp.model.repositories;

import com.example.spring5wepapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
