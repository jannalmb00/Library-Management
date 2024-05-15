/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

import java.util.Date;

/**
 *
 * @author janna
 */
public class Bookfactory {
     public static Book createBook(String SN, String title, String author,String publisher ,double price, int quantity, int issuedQuantity, Date dateofPurchase, String genre){
        switch (genre) {
            case "Romance" -> {
                return new RomanceBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "Biography" -> {
                return new BiographyBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "Mystery" -> {
                return new MysteryBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "ShortStory" -> {
                return new ShortStoryBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            case "Fantasy" -> {
                return new FantasyBook(SN, title, author, publisher, price, quantity, issuedQuantity, dateofPurchase, genre);
             }
            default -> throw new IllegalArgumentException("Unknown genre: " + genre);
        }
    }
     
}
