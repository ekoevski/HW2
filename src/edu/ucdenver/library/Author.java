package edu.ucdenver.library;

public class Author {

    public String name;

    public Author(String argName){
        name = argName;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name + " (Author)";
    }
}
