package com.practice.spring5webapp;

import com.practice.spring5webapp.model.Author;
import com.practice.spring5webapp.model.Book;
import com.practice.spring5webapp.model.Publisher;
import com.practice.spring5webapp.repository.AuthorRepository;
import com.practice.spring5webapp.repository.BookRepository;
import com.practice.spring5webapp.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DatabasePopulator implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publisher publisher1 = new Publisher("Harpher", "Sanfrancisco, CA");
        Publisher publisher2 = new Publisher("QA", "Sanfrancisco, CA");
        Publisher publisher3 = new Publisher("Phuong Nam", "Sanfrancisco, CA");

        Book book1 = new Book("Domain Driven Design", "1234", publisher1);
        Book book2 = new Book("Effective Java", "1236", publisher2);
        Book book3 = new Book("Complete Code", "1238", publisher3);

        Author author1 = new Author("Quang", "NGUYEn");
        Author author2 = new Author("MINH", "Phong");

        book1.getAuthors().add(author1);
        book1.getAuthors().add(author2);
        book2.getAuthors().add(author2);
        book3.getAuthors().add(author2);


        publisherRepository.save(publisher1);
        publisherRepository.save(publisher2);
        publisherRepository.save(publisher3);

        authorRepository.save(author1);
        authorRepository.save(author2);

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);
    }
}
