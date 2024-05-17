/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.library;

/**
 * <p> 
 * Project Library is the main class.
 * </p>
 * @author janna
 * @author raeeba
 */
public class ProjectLibrary {

    /**
     * Opens the Main Form
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
         System.out.println("yes");
        Library library = new Library();
        MainForm myFrame = new MainForm();
        
        Controller controller = Controller.getInstance(library,myFrame);

        controller.showForm();
    }
}
