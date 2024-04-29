/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author jannalomibao
 */
public class Student {
    private int studentID;
    private String name;
    private long contact;

    public Student(int studentID, String name, long contact) {
        this.studentID = studentID;
        this.name = name;
        this.contact = contact;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public long getContact() {
        return contact;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

}
