package com.arxman.apidemo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Book")
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;

    private String bid;
    private String name;
    private String author;
    private boolean isAvailable;

    public Book() {}

    public Book(String bid, String name, String author, boolean isAvailable) {
        this.bid = bid;
        this.name = name;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}