package org.example;

import java.util.Objects;

public class Book implements Comparable<Book>{
    
    private int id;
    private String title;
    private String author;
    private String pd;
    private String type;
    private  int quantity;

    public Book(int id, String title, String author, String pd, String type, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pd = pd;
        this.type = type;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.id, this.id);
    }
    
    
}
