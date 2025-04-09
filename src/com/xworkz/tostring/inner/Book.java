package com.xworkz.tostring.inner;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book() {
        this.title = "Java 101";
        this.author = "John Doe";
        this.pages = 300;
    }

    @Override
    public String toString() {
        return "Book [ title=" + title + ", author=" + author + ", pages=" + pages + " ]";
    }
}
