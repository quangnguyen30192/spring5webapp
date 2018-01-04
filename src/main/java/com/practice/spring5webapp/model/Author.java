package com.practice.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
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
     * Getter for property 'firstName'.
     *
     * @return Value for property 'firstName'.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for property 'firstName'.
     *
     * @param firstName Value to set for property 'firstName'.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for property 'lastName'.
     *
     * @return Value for property 'lastName'.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for property 'lastName'.
     *
     * @param lastName Value to set for property 'lastName'.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for property 'books'.
     *
     * @return Value for property 'books'.
     */
    public Set<Book> getBooks() {
        return this.books;
    }

    /**
     * Setter for property 'books'.
     *
     * @param books Value to set for property 'books'.
     */
    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
