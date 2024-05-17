/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author janna
 */
public class Library {
    Connection con = null;
    int counter  =  (int) (Math.random() * (200 - 50 + 1)) + 50;

    public Library() {
        try {
            // Establish database connection
            con = DriverManager.getConnection("jdbc:sqlite:Library.db");
            System.out.println("Connected to SQLite database.");
        } catch (SQLException e) {
            System.out.println("Error connecting to SQLite database: " + e.getMessage());
        }
        
    }
    public void addBook(Book book) {
        //add a new book to the db
        // set the issued to 0
        // add date 
        //------------------------------------
//         BookFactory bookFactory = new BookFactory();
//         //Book book = bookFactory.createBook(id, title, author, category, avail);

//        date convert
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfPurchaseStr = dateFormat.format(book.getDateofPurchase());
        String sql = "INSERT INTO Books (sn, title, author,Publisher, price, quantity, Issued, AddedDate,Genre) VALUES (?, ?, ?, ?, ?,?,?,?,?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, book.getSN());
            statement.setString(2, book.getTitle());
            statement.setString(3, book.getAuthor());
            statement.setString(4, book.getPublisher());
            statement.setDouble(5, book.getPrice());
            statement.setInt(6, book.getQuantity());
            statement.setInt(7,book.getIssuedQuantity());
            statement.setString(8,dateOfPurchaseStr);
            statement.setString(9,book.getGenre());
            statement.executeUpdate();
            System.out.println("Book added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }

        
    }
    public boolean issuedBook(Book book, Student student){
        System.out.println(book.printBook());
        System.out.println(student.printStudent());
        //queries 
        String quantityCheck = "SELECT Quantity, Issued FROM Books WHERE SN = ?";
        String update = "UPDATE Books SET Quantity = ?, Issued = ? WHERE SN = ?";
        String insertNewEntry = "INSERT INTO IssuedBooks (issuedBookID, SN, StID, StName, StContact, IssuedDate) VALUES (?, ?, ?, ?, ?,?)";
         System.out.println(book.getSN()+ " + " +student.getStudentID());
         
        try(PreparedStatement statementQuantity = con.prepareStatement(quantityCheck) ){
            statementQuantity.setString(1,book.getSN());
            try(ResultSet resultQuantity = statementQuantity.executeQuery()){
                if(resultQuantity.next()){
                    int quantity = resultQuantity.getInt("Quantity");
                    int issued = resultQuantity.getInt("Issued");
                    if(quantity > 0){
                        try( PreparedStatement updateQuantity = con.prepareStatement(update);
                                PreparedStatement insert = con.prepareStatement(insertNewEntry)){
                            //update
                            System.out.println(resultQuantity.getInt("Quantity"));
                            System.out.println(resultQuantity.getInt("Quantity") - 1);
                            updateQuantity.setInt(1, resultQuantity.getInt("Quantity") - 1);
                            updateQuantity.setInt(2, resultQuantity.getInt("Issued") + 1);
                            updateQuantity.setString(3, book.getSN());
                            System.out.println(issued);
                            updateQuantity.execute();
                            
                            //insert 
                            insert.setInt(1, counter);
                            counter++;
                            insert.setString(2, book.getSN());
                            insert.setInt(3, student.getStudentID());
                            insert.setString(4, student.getName());
                            insert.setString(5, student.getContact());
                            
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                            String issuedDate = sdf.format(book.getDateofPurchase());
                            insert.setString(6,issuedDate );
                            insert.executeUpdate();
                            
                             return true;
                            
                        }
                        
                    }
                }
            }
        }catch(SQLException e){
            System.out.println("Error  issued book: " + e.getMessage());
        
        }
        return false;
        
        //select the book first 
        //update the book
        //then insert a new data to the issued book
        //if the book is available
            // quantity --
            // issued++
            //A new entry in “IssuedBooks” table is added
        
    }
    public boolean returnBook(Book book, Student student) {
        String checkIssuedSql = "SELECT * FROM IssuedBooks WHERE SN = ? AND StID = ?";
        String getBookDetailsSql = "SELECT Quantity, Issued FROM Books WHERE SN = ?";
        String updateBookSql = "UPDATE Books SET Quantity = ?, Issued = ? WHERE SN = ?";
        String deleteIssuedSql = "DELETE FROM IssuedBooks WHERE SN = ? AND StID = ?";
        System.out.println(book.getSN()+ " + " +student.getStudentID());

        try (PreparedStatement checkStatement = con.prepareStatement(checkIssuedSql)) {
            checkStatement.setString(1, book.getSN());
            checkStatement.setInt(2, student.getStudentID());
            try (ResultSet issuedResult = checkStatement.executeQuery()) {
                if (issuedResult.next()) { // if we found a matching entry in IssuedBooks
                    try (PreparedStatement bookDetailsStmt = con.prepareStatement(getBookDetailsSql)) {
                        bookDetailsStmt.setString(1, book.getSN());
                        try (ResultSet bookDetailsResult = bookDetailsStmt.executeQuery()) {
                            if (bookDetailsResult.next()) { // if we found a matching entry in Books
                                int quantity = bookDetailsResult.getInt("Quantity");
                                int issued = bookDetailsResult.getInt("Issued");

                                // Update the book details in Books table
                                try (PreparedStatement updateBookStmt = con.prepareStatement(updateBookSql);
                                     PreparedStatement deleteIssuedStmt = con.prepareStatement(deleteIssuedSql)) {

                                    updateBookStmt.setInt(1, bookDetailsResult.getInt("Quantity") + 1); // Increase quantity
                                    updateBookStmt.setInt(2, bookDetailsResult.getInt("Issued") - 1); // Decrease issued
                                    updateBookStmt.setString(3, book.getSN());
                                    updateBookStmt.executeUpdate();

                                    // Delete the issued book entry from IssuedBooks table
                                    deleteIssuedStmt.setString(1, book.getSN());
                                    deleteIssuedStmt.setInt(2, student.getStudentID());
                                    deleteIssuedStmt.executeUpdate();

                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error returning book: " + e.getMessage());
        }
        return false;
    }

    public Map<String,String> viewCatalog(){
        //sorted by sn
        //return map
        // SQL query to select all from 
        //return list
        Map<String, String> catalog = new TreeMap<>();
        String sql = "SELECT * FROM Books ORDER BY SN";

        try (PreparedStatement statement = con.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int sn = resultSet.getInt("SN");
                String title = resultSet.getString("Title");
                String author = resultSet.getString("Author");
                String publisher = resultSet.getString("Publisher");
                double price = resultSet.getDouble("Price");
                int quantity = resultSet.getInt("Quantity");
                int issued = resultSet.getInt("Issued");
                String addedDate = resultSet.getString("AddedDate");
                String genre = resultSet.getString("Genre");
                //System.out.println(sn);

                String bookDetails = String.format("Title: %s, Author: %s, Publisher: %s, Price: $%.2f, Quantity: %d, Issued: %d, AddedDate: %s, Genre: %s",
                        title, author, publisher, price, quantity, issued, addedDate, genre);
                catalog.put(""+sn, bookDetails);
            }
        } catch (SQLException e) {
            System.out.println("Error viewing catalog: " + e.getMessage());
        }

        return catalog;
        
    }
    public Map<String,String> viewIssuedBooks(){
        Map<String, String> catalog = new TreeMap<>();
         String sql = "SELECT * FROM IssuedBooks ORDER BY SN";
         
         try(PreparedStatement statement = con.prepareStatement(sql)){
             try(ResultSet result = statement.executeQuery()){
                 //iterate over the result
                 while(result.next()){
                     int issuedBookID = result.getInt("issuedBookID");
                     int snBook = result.getInt("SN");
                     int studentID = result.getInt("StID");
                     String studentName = result.getString("StName");
                     String contact = result.getString("StContact");
                     String issuedDate = result.getString("IssuedDate");
                     
                     // Create the key and value strings
                    String key = "" + issuedBookID;
                    String value = " SN: " + snBook + 
                                   ", StudentID: " + studentID + 
                                   ", StudentName: " + studentName + 
                                   ", StudentContact: " + contact + 
                                   ", IssuedDate: " + issuedDate;

                    catalog.put(key, value);
                 }
             }
             
         }catch (SQLException e) {
            System.out.println("Error viewing catalog: " + e.getMessage());
        }
        return catalog;  
    }
    //search book 
    public List<Book> searchBookByTitle(String title){
        List<Book> seachedBook = new ArrayList<>();
        String query = "SELECT * FROM Books WHERE Title = ?";
        
        try(PreparedStatement sql = con.prepareStatement(query)){
            sql.setString(1, title);
            try(ResultSet result = sql.executeQuery()){
                while(result.next()){
                     String sn = String.valueOf(result.getInt("SN"));
                     String bookTitle = result.getString("Title");
                     String author = result.getString("Author");
                     String publisher = result.getString("Publisher");
                     double price = result.getDouble("Price");
                     int quantity = result.getInt("Quantity");
                     int issued = result.getInt("Issued");
                     String addedDate = result.getString("AddedDate");
                     String genre = result.getString("Genre"); // Retrieve genre from the result set
                     Date dateofPurchase = convertStringToDate(addedDate);
                     System.out.println(title);
                     
                     Book book = Bookfactory.createBook(sn, bookTitle, author, publisher, price, quantity, issued, dateofPurchase, genre);  
                     seachedBook.add(book);
                }
                
            }
        }catch(SQLException e){
            System.out.println("error");
        }
        return seachedBook;
    }
    public List<Book> searchBookByAuthor(String author){
        List<Book> seachedBook = new ArrayList<>();
        String query = "SELECT * FROM Books WHERE Author = ?";
        
        try(PreparedStatement sql = con.prepareStatement(query)){
            sql.setString(1, author);
            try(ResultSet result = sql.executeQuery()){
                while(result.next()){
                     String sn = String.valueOf(result.getInt("SN"));
                     String bookTitle = result.getString("Title");
                     String bookAuthor = result.getString("Author");
                     String publisher = result.getString("Publisher");
                     double price = result.getDouble("Price");
                     int quantity = result.getInt("Quantity");
                     int issued = result.getInt("Issued");
                     String addedDate = result.getString("AddedDate");
                     String genre = result.getString("Genre"); // Retrieve genre from the result set
                     Date dateofPurchase = convertStringToDate(addedDate);
                     System.out.println(bookAuthor);
                     
                     Book book = Bookfactory.createBook(sn, bookTitle, bookAuthor, publisher, price, quantity, issued, dateofPurchase, genre);  
                     seachedBook.add(book);
                }
                
            }
        }catch(SQLException e){
            System.out.println("error");
        }
        return seachedBook;
    }
    public List<Book> searchBookByPublisher(String publisher){
        List<Book> seachedBook = new ArrayList<>();
        String query = "SELECT * FROM Books WHERE Publisher = ?";
        
        try(PreparedStatement sql = con.prepareStatement(query)){
            sql.setString(1, publisher);
            try(ResultSet result = sql.executeQuery()){
                while(result.next()){
                     String sn = String.valueOf(result.getInt("SN"));
                     String bookTitle = result.getString("Title");
                     String bookAuthor = result.getString("Author");
                     String bookPublisher = result.getString("Publisher");
                     double price = result.getDouble("Price");
                     int quantity = result.getInt("Quantity");
                     int issued = result.getInt("Issued");
                     String addedDate = result.getString("AddedDate");
                     String genre = result.getString("Genre"); // Retrieve genre from the result set
                     Date dateofPurchase = convertStringToDate(addedDate);
                     System.out.println(bookAuthor);
                     
                     Book book = Bookfactory.createBook(sn, bookTitle, bookAuthor, publisher, price, quantity, issued, dateofPurchase, genre);  
                     seachedBook.add(book);
                }
                
            }
        }catch(SQLException e){
            System.out.println("error");
        }
        return seachedBook;
    }
            
    
    //additional method for verification
    //verify the student 
    public Student getStudent(int stID){
        String sql = "Select * From Students Where StudentID = ? ";
        Student student = null;
        
        try(PreparedStatement statement = con.prepareStatement(sql)){
            statement.setInt(1, stID);
            try(ResultSet result = statement.executeQuery()){
                while(result.next()){
                    int id = result.getInt("StudentID");
                    String name = result.getString("Name");
                    String contact = result.getString("Contact");
                    
                     student = new Student(id, name, contact);   
                }
                return student;
               
               
            }
        }catch(SQLException e){
            System.out.println("Error student Verification");
        }
         return student;
    }
public Book getBook(String snEntered) {
    System.out.println("getbook");
    String sql = "SELECT * FROM Books WHERE SN = ?";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setString(1, snEntered);
        try (ResultSet result = statement.executeQuery()) {
            while (result.next()) {
                String sn = String.valueOf(result.getInt("SN"));
                String title = result.getString("Title");
                String author = result.getString("Author");
                String publisher = result.getString("Publisher");
                double price = result.getDouble("Price");
                int quantity = result.getInt("Quantity");
                int issued = result.getInt("Issued");
                String addedDate = result.getString("AddedDate");
                String genre = result.getString("Genre"); // Retrieve genre from the result set
                Date dateofPurchase = convertStringToDate(addedDate);
                System.out.println(title);

                if (genre != null) {
                    Book book = Bookfactory.createBook(sn, title, author, publisher, price, quantity, issued, dateofPurchase, genre);
                    if (book != null) {
                        return book;
                    }
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }

    return null;
}

public Date convertStringToDate(String date){
    if (date == null) {
        return null; // Return null if the date string is null
    }
    
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
    Date dateConverted ;

    try {
        dateConverted = dateFormat.parse(date);
        System.out.println("Parsed Date: " + date);
        return dateConverted;
    } catch (ParseException e) {
        System.err.println("Error parsing date: " + e.getMessage());
    }
   return null; 
}
    
    
    //do the issued and modigy time
    //review patterns
    //review unix
    //review internet
  
    
}
