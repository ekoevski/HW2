package edu.ucdenver.library;
import java.time.LocalDate;



    public class EBook extends Book {


        //Declaration
        //================
        private int numPages;
        private int wordsPerPage;

        //Constructor
        //================
        public EBook(String subTitle, LocalDate subdate, String[] subOtherTitles, Author subauthor, String sibisbn, int pageNum, int argWordsPerPage) {
            title = subTitle;
            publicationDate = subdate;
            otherTitles = subOtherTitles;
            isbn = sibisbn;
            numPages = pageNum;
            wordsPerPage = argWordsPerPage;
            bookAuthor = subauthor;

        }



        //Methods

        public int getNumPages() {
            return numPages;
        }


        public String toString(){
            String out = "Electronic-Book: " + title + " isbn: isbn(" + isbn + ") , published on " + publicationDate + " authored by " +
                    bookAuthor.getName() + "(Author) with " + numPages + " pages and " + otherTitles.length + " other titles.";
            return out;
        }


    }
