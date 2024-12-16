package com.day5.fileconcept.LibraryMgtSystem;

import java.io.Serializable;

public class Book implements Serializable {
    public static final long serialVersionUID = 2L;

    public String title;
    public String author;
    public String isbn;

    public transient String department;

    public Book(String title, String author, String isbn, String department) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}