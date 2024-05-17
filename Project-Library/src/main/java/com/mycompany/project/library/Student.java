/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

/**
 * Student class used to create and define Student objects.
 * @author janna
 * @author raeeba
 */
public class Student {
    private int studentID;
    private String name;
    private String contact;

    /**
     * Constructor for Student class
     * @param studentID     student ID
     * @param name          student name
     * @param contact       student contact
     */
    public Student(int studentID, String name, String contact) {
        this.studentID = studentID;
        this.name = name;
        this.contact = contact;
    }

    /**
     * Parameter-less constructor for Student class
     */
    public Student() {
    }
    
    /**
     * Method to get the student's ID.
     * @return studentID    
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Method to get the student's name.
     * @return name    
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get the student's contact.
     * @return contact    
     */
    public String getContact() {
        return contact;
    }

    /**
     * Method to set the student's ID.
     * @param studentID     the student's ID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * Method to set the student's name.
     * @param name     the student's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to set the student's contact.
     * @param contact     the student's contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    /**

     *  Method that prints the student's information in a specified format.

     * @return String      string with student's information in a specified format
     */
    public String printStudent(){
        return String.format("Student ID: %d, Name: %s, Contact: %s", studentID, name,contact);
    }
    //------------------behavoir------------------
//    public List<Book> searchBookByTitle(String title){
//        return " ";   
//    }
//    public List<Book> searchBookByName(String title){
//        return " ";   
//    }
//    public List<Book> searchBookByPublisher(String title){
//        return " ";   
//    } 
//    public List<String> viewCatalog(){
//        return " ";
//    }
    
    /**
     * Method that enables Student to borrow a Book.
     * @param book      book to be issued
     * @return true     if issuedBook() returns true
     */
    public boolean borrow(Book book){
        Library lib = new Library();
        return lib.issuedBook(book, this);
    }
    
    /**
     * Method that enables Student to return a Book.
     * @param book      book to be returned
     * @return true     if returnBook() returns true
     */
    public boolean toReturn(Book book){
        Library lib = new Library();
        return lib.returnBook(book, this);
    }
}
