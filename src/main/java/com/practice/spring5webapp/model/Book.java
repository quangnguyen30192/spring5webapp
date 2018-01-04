package com.practice.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    private String publisher;

    @ManyToMany
    @JoinTable(name = "author_book",
               joinColumns = @JoinColumn(name = "book_id"),
               inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    public Book(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book(String title, String isbn, String publisher, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for property 'title'.
     *
     * @return Value for property 'title'.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for property 'title'.
     *
     * @param title Value to set for property 'title'.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for property 'isbn'.
     *
     * @return Value for property 'isbn'.
     */
    public String getIsbn() {
        return this.isbn;
    }

    /**
     * Setter for property 'isbn'.
     *
     * @param isbn Value to set for property 'isbn'.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter for property 'publisher'.
     *
     * @return Value for property 'publisher'.
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Setter for property 'publisher'.
     *
     * @param publisher Value to set for property 'publisher'.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Getter for property 'authors'.
     *
     * @return Value for property 'authors'.
     */
    public Set<Author> getAuthors() {
        return this.authors;
    }

    /**
     * Setter for property 'authors'.
     *
     * @param authors Value to set for property 'authors'.
     */
    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}