/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

import java.util.Date;

/**
 *  <p>
 *  MysteryBook class is created by the Bookfactory Class, 
 *  and contains the constructor for the MysteryBook class.
 *  </p>
 * @author janna
 * @author raeeba
 */
public class MysteryBook extends Book {
 
     /**
     * <p>
     * Constructor for MysteryBook class which inherits from Book superclass
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
    public MysteryBook(String SN, String title, String author, String publisher, double price, int quantity, int issuedQuantity, Date dateofPurchase, String genre) {
        super(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
    }
 
}
