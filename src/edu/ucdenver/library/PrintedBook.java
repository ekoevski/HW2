package edu.ucdenver.library;
import java.time.LocalDate;



public class PrintedBook extends Book {

    //Declaration
    //================
    private int numPages;


    //Constructor
    //================
    public PrintedBook(String subTitle, LocalDate subdate, String[] subOtherTitles, Author subauthor, String sibisbn, int pageNum) {
        title = subTitle;
        publicationDate = subdate;
        otherTitles = subOtherTitles;
        isbn = sibisbn;
        bookAuthor = subauthor;
        numPages = pageNum;
    }

    //Methods


    public int getNumPages() {
        return numPages;
    }

    public String toString(){
        String out = "Printed-Book: " + title + " isbn: isbn(" + isbn + ") , published on " + publicationDate + " authored by " +
                bookAuthor.getName() + "(Author) with " + numPages + " pages and " + otherTitles.length + " other titles.";
        return out;
    }

}
