package Polymorphism.Override.HomeWork.BookSeller;

public class Book {
    protected String Title;
    protected String Author;

    public  Book(){
        disp();
    }
    public void disp(){
        System.out.println("This is Library");
    }
    public Book(String title, String author) {
        Title = title;
        Author = author;
    }

    @Override
    public String toString(){
        return "The Books Title is "+Title+" and The Author is "+Author;
    }
}
