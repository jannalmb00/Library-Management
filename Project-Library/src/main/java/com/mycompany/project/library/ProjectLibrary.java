/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.library;

/**
 *
 * @author janna
 */
public class ProjectLibrary {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         System.out.println("yes");
        Library library = new Library();
        MainForm myFrame = new MainForm();
        
        Controller controller = Controller.getInstance(library,myFrame);

        controller.showForm();
    }
}
