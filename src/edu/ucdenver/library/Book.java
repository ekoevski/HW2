package edu.ucdenver.library;

import java.time.LocalDate;

public class Book {


    //DECLARATIONS
    public String title;
    public LocalDate publicationDate;
    public String[] otherTitles;
    public String isbn;

    public Author bookAuthor;



    //CONSTRUCTOR

    //Default
    public Book(){}

    public Book(String title, LocalDate publicationDate, String[] otherTitles, int numPages, Author author){
        this.title = title;
        this.publicationDate = publicationDate;
        this.otherTitles = otherTitles;
        this.bookAuthor = author;
    }




    //METHODS
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return bookAuthor;
    }
    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public String[] getOtherTitles() {
        return otherTitles;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(Author author) {
        this.bookAuthor = author;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
    public void setOtherTitles(String[] otherTitles) {
        this.otherTitles = otherTitles;
    }



}
