/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

import java.util.Date;

/**
 * Bookfactory creates Book objects of specified genres.
 * @author janna
 * @author raeeba
 */
public class Bookfactory {
    
    /**
     * Creates a new Bookfactory object.
     * Default constructor
     */
    public Bookfactory() {
    }
    
    /**
     * <p>
     * Method for creating Book objects with a specified genre.
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
     * @return Book             a Book object with a specified genre 
     */
     public static Book createBook(String SN, String title, String author,String publisher ,double price, int quantity, int issuedQuantity, Date dateofPurchase, String genre){
        switch (genre) {
            case "Romance" -> {
                return new RomanceBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "Biography" -> {
                /**
                 * Creates a BiographyBook object
                 */
                return new BiographyBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "Mystery" -> {
                /**
                 * Creates a MysteryBook object
                 */
                return new MysteryBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "ShortStory" -> {
                /**
                 * Creates a ShortStoryBook object
                 */
                return new ShortStoryBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "Fantasy" -> {
                /**
                 * Creates a FantasyBook object
                 */
                return new FantasyBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
                /**
                 * Creates a Unknown genre Book object
                 */
            default -> throw new IllegalArgumentException("Unknown genre: " + genre);
        }
    }  
}
