/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.Date;

/**
 *
 * @author 2322746
 */
public class Book {
    private String SN;
    private String title;
    private String author;
    private double  price;
    private int quantity;
    private int issuedQuantity;
    private Date dateofPurchase;

    public Book(String SN, String title, String author, double price, int quantity, int issuedQuantity, Date dateofPurchase) {
        this.SN = SN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.issuedQuantity = issuedQuantity;
        this.dateofPurchase = dateofPurchase;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIssuedQuantity() {
        return issuedQuantity;
    }

    public void setIssuedQuantity(int issuedQuantity) {
        this.issuedQuantity = issuedQuantity;
    }

    public Date getDateofPurchase() {
        return dateofPurchase;
    }

    public void setDateofPurchase(Date dateofPurchase) {
        this.dateofPurchase = dateofPurchase;
    }
    
    
    
    
}
