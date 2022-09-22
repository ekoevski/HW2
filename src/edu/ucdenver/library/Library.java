package edu.ucdenver.library;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ArrayList; // import the ArrayList class

public class Library {


    //Attributes
    //==========

    private String name;
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Author> authors = new ArrayList<Author>();



    //Constructor
    //===========
    public Library(String libraryName){

        name = libraryName;

    }

    //MEMBER FUNCTIONS
    //================




    // Add PrintedBook
    //                        (book title, publication date, list of other titles, author, isbn, number of pages)
    public void addPrintedBook(String bookTitle   , LocalDate pubDate, String[] argOtherTitles, String argAuthor, String argIsbn, int pageNum)
            throws IllegalArgumentException{

        Author theAuthor = null;

        for (Author anAuthor: this.authors){
            if (anAuthor.getName().equals(argAuthor)){
                theAuthor = anAuthor;
                break;
            }
        }

        if (theAuthor == null)
            throw new IllegalArgumentException("The author name does not exist.");

        //                           book title,   publication date,    list of other titles,      author,        isbn,        number of pages
        PrintedBook tempBook = new PrintedBook(  bookTitle, pubDate, argOtherTitles, theAuthor,  argIsbn , pageNum  );
        books.add(tempBook);
    }




    // Add EBook

    //EBook                (book title, publication date, list of other titles, author, isbn,  number of words, words per page
    public void addEBook(String bookTitle   , LocalDate pubDate, String[] argOtherTitles, String argAuthor, String argIsbn, int pageNum, int wordsPerPage)
            throws IllegalArgumentException{

        Author theAuthor = null;

        for (Author anAuthor: this.authors){
            if (anAuthor.getName().equals(argAuthor)){
                theAuthor = anAuthor;
                break;
            }
        }

        if (theAuthor == null)
            throw new IllegalArgumentException("The author name does not exist.");

        //                           book title,   publication date,    list of other titles,      author,        isbn,        number of pages
        EBook tempBook = new EBook(  bookTitle, pubDate, argOtherTitles, theAuthor,  argIsbn , pageNum  , wordsPerPage);
        books.add(tempBook);
    }








    // Add another author to library author list.
    public void addAuthor(String authorName) throws IllegalArgumentException{

        if (this.authors.isEmpty()){
            Author temp = new Author(authorName);
            authors.add(temp);
            return;
        }


        for (int i = 0; i < this.authors.size(); i++){
            if (authors.get(i).getName() == authorName){
                throw new IllegalArgumentException("The author already exists.");

            } else {
                Author temp = new Author(authorName);
                authors.add(temp);
                return;
            }

        }

    }

    public Author getAuthor(String authorName)            throws IllegalArgumentException{

        if (authors.isEmpty()){
            throw new IllegalArgumentException("The author name does not exist.");
        }

        for(Author anAuthor: this.authors){
            if(anAuthor.getName() == authorName){
                return anAuthor;
            }
        }

        throw new IllegalArgumentException("The author name does not exist.");

    }

    public String getName(){
        return name;
    }


        //Default Print
    public String toString(){

        if(authors.isEmpty()){
            return ("There are no authors in this library.");
        }


        String temp1 = "This is the " + name + " library. \n";
        temp1 += "== Author list =\n";
        temp1 += " ";
        for (Author someAuthor: this.authors){
            temp1 += someAuthor.getName() + " (author)\n";
            }
        temp1 += "== Book list =\n";
        for (Book aBook: this.books){
            temp1 += aBook.toString() + "\n";
            }
        temp1 += "--0--";

        return temp1;
    }


    public String printBooks() {

        String temp1 = "This is the " + name + " library. \n";
        temp1 += "== Author list =\n";
        temp1 += " ";
        for (int i = 0; i < authors.size(); i++) {
            temp1 += authors.get(i).getName() + " (author)\n";
        }
        temp1 += "== Book list =\n";
        for (Book aBook : this.books) {
            temp1 += aBook.toString() + "\n";
        }
        temp1 += "--0--";

        return temp1;
    }
}
