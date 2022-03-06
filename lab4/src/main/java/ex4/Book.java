package ex4;

import ex2.Author;

public class Book {
    private String name;
    private Author[] authors;
    private Author author= new Author("John","johnn@ygmail.com",'m');
    private double price;
    private int qtylnStock = 0;

    public Book(String name0, Author[] authors0, double price0) {
        this.name = name0;
        this.authors = authors0;
        this.price = price0;
    }

    public Book(String name0, Author[] authors0, double price0, int qtylnStock0) {
        this.name = name0;
        this.authors = authors0;
        this.price = price0;
        this.qtylnStock = qtylnStock0;
    }


    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getQtyInStock() {
        return qtylnStock;
    }

    public void setQtyInStock(int qtylnStock) {
        this.qtylnStock = qtylnStock;
    }

    public String toString() {
        return "" + author.getName() + " (" + author.getGender() + ") " + "at " + author.getEmail();
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void printAuthors() {
        for(int i=0; i<authors.length; i++)
        System.out.println(authors[i].getName());

    }



}
