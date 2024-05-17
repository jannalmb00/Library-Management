/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

import java.util.Date;

/**
 * <p>
 * Book is an abstract class used to define Book objects.
 * </p>
 * @author janna
 * @author raeeba
 */
public abstract class Book {
    private String SN;
    private String title;
    private String author;
    private String publisher;
    private double  price;
    private int quantity;
    private int issuedQuantity;
    private Date dateofPurchase;
    private String genre;

    /**
     * <p>
     * Constructor for Book class
     * </p>
     * @param SN                the serial number of the book
     * @param title             the book's title
     * @param author            the book's author
     * @param publisher         the publisher of the book
     * @param price             the price of the book
     * @param quantity          the number of copies of the books
     * @param issuedQuantity    the number of books that have been issued
     * @param dateofPurchase    the data the book was purchased
     * @param genre             the genre of the book
     */
    public Book(String SN, String title, String author, String publisher, double price, int quantity, int issuedQuantity, Date dateofPurchase, String genre) {
        this.SN = SN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.issuedQuantity = issuedQuantity;
        this.dateofPurchase = dateofPurchase;
        this.genre = genre;
    }

    /**
     * <p>
     * Method to get the book's serial number.
     * </p>
     * @return SN   the book's serial number 
     */
    public String getSN() {
        return SN;
    }
    /**
     * <p>
     * Method to get the book's title.
     * </p>
     * @return title    the book's title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * <p>
     * Method to get the book's author.
     * </p>
     * @return author    the book's author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <p>
     * Method to get the book's publisher.
     * </p>
     * @return publisher    the book's publisher
     */
    public String getPublisher() {
        return publisher;
    }
    
    /**
     * <p>
     * Method to get the book's price.
     * </p>
     * @return price    the book's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * <p>
     * Method to get the quantity of book copies.
     * </p>
     * @return quantity    the quantity of copies of the book
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * Method to get the quantity of issued book copies.
     * </p>
     * @return issuedQuantity    the quantity of issued copies of the book
     */
    public int getIssuedQuantity() {
        return issuedQuantity;
    }

    /**
     * <p>
     * Method to get the date of the book purchase.
     * </p>
     * @return dateofPurchase    the date of the purchase of the book
     */
    public Date getDateofPurchase() {
        return dateofPurchase;
    }

    /**
     * <p>
     * Method to get the genre of the book.
     * </p>
     * @return genre    the genre of the book
     */
    public String getGenre() {
        return genre;
    }

    /**
     * <p>
     * Method to set the serial number of the book.
     * </p>
     * @param SN    the book's serial number 
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * <p>
     * Method to set the serial number of the book.
     * </p>
     * @param title     the book's title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * Method to set the author of the book.
     * </p>
     * @param author     the book's author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * <p>
     * Method to set the publisher of the book.
     * </p>
     * @param publisher     the book's publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    /**
     * <p>
     * Method to set the price of the book.
     * </p>
     * @param price     the book's price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * <p>
     * Method to set the quantity of book copies.
     * </p>
     * @param quantity     the quantity of book copies
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * Method to set the quantity of issued book copies.
     * </p>
     * @param issuedQuantity     the quantity of issued book copies
     */
    public void setIssuedQuantity(int issuedQuantity) {
        this.issuedQuantity = issuedQuantity;
    }

    /**
     * <p>
     * Method to set the date of purchase of the book.
     * </p>
     * @param dateofPurchase     the date of the book's purchase
     */
    public void setDateofPurchase(Date dateofPurchase) {
        this.dateofPurchase = dateofPurchase;
    }

    /**
     * <p>
     * Method to set the genre of the book.
     * </p>
     * @param genre     the genre of the book
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /**
     *  <p>
     *  Method that prints the book's information in a specified format.
     *  </p>
     * @return String      string with book's information in a specified format
     */
    public String printBook(){
        return String.format("SN: %s, Title: %s, Author: %s, Publisher: %s, Price: $%.2f, Quantity: %d, Issued: %d, AddedDate: %s, Genre: %s",
                        SN,title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
    }
    
}
