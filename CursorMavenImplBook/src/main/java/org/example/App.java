package org.example;

import org.example.models.Book;
public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book("Test book 1","Test description 1");
        System.out.println(book);
        book.setTitle("Book 1");
        System.out.println(book.getTitle());
    }
}
