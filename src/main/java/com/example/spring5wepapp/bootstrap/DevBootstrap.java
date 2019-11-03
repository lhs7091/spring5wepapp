package com.example.spring5wepapp.bootstrap;

import com.example.spring5wepapp.model.Author;
import com.example.spring5wepapp.model.Book;
import com.example.spring5wepapp.model.Publisher;
import com.example.spring5wepapp.model.repositories.AuthorRepository;
import com.example.spring5wepapp.model.repositories.BookRepository;
import com.example.spring5wepapp.model.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/*
DB 저장시 간단하게 authorRepository.save 를 사용하면 초기 data를 저장 할 수 있음
 */

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    /*
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }*/

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisher.setAddress("12th street, LA");
        publisherRepository.save(publisher);


        // Eric
         Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        // Rod
        Author rod = new Author("Rod", "johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }


}
