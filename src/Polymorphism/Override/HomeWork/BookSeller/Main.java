package Polymorphism.Override.HomeWork.BookSeller;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter","James");
        System.out.println(book);
        ArrayList<Book>books=new ArrayList<>();
        books.add(new Book("Mahabarath","Ganesha"));
        books.add(new Book("Ramayana","Valmiki"));
        for(Book book1:books){
            System.out.println(book1);
        }
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the Book and Author"+books.add(new Book(sc.next(),sc.next())));
        }

        for(Book book1:books){
            System.out.println(book1);
        }
    }
}
