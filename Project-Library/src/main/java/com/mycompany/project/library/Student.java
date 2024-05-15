/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

/**
 *
 * @author janna
 */
public class Student {
    private int studentID;
    private String name;
    private String contact;

    public Student(int studentID, String name, String contact) {
        this.studentID = studentID;
        this.name = name;
        this.contact = contact;
    }

    public Student() {
    }
    

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
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
    public boolean borrow(Book book){
        Library lib = new Library();
        return lib.issuedBook(book, this);
    }
    public boolean toReturn(Book book){
        Library lib = new Library();
        return lib.returnBook(book, this);
    }
}
