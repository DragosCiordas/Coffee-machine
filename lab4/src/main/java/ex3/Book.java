package ex3;

import ex2.Author;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtylnStock = 0;

    public Book(String name0, Author author0, double price0) {
        this.name = name0;
        this.author = author0;
        this.price = price0;
    }

    public Book(String name0, Author author0, double price0, int qtylnStock0) {
        this.name = name0;
        this.author = author0;
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
        return name;
    }

    public int getQtylnStock() {
        return qtylnStock;
    }

    public void setQtylnStock(int qtylnStock) {
        this.qtylnStock = qtylnStock;
    }

    public String toString() {
        return ""+author.getName()+" ("+ author.getGender()+") "+"at "+author.getEmail();
    }
}

