package org.example;

import org.example.models.Book;

public class App
{
    public static void main( String[] args )
    {
        Book book = new Book("Book 1","description book");
        System.out.println(book);
    }
}
