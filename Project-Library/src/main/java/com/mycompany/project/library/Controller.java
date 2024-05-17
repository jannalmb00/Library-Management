/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.library;

/**
 *<p> 
 * Controller class uses Singleton to ensure there's at least one Library and MainForm.
 * </p>
 * @author janna
 * @author raeeba
 */
public class Controller {
     Library library = new Library();
    private MainForm mainFormView;
    private static Controller controllerObject;
    
    /**
     * <p>
     * Parameter-less constructor for Controller class
     * </p>
     */
    private Controller() {
        
    }
    
    /**
     * <p>
     * Constructor for Controller class
     * </p>
     * @param library       library object
     * @param mainFormView  main form object
     */
    private Controller(Library library, MainForm mainFormView) {
        this.library = library;
        this.mainFormView = mainFormView;     
    }
    
    /**
     * <p>
     * Returns instance of Controller class
     * </p>
     * @return Controller  instance of controller
     */
    public static Controller getInstance() {
        // create object if it's not already created
        if(controllerObject == null) {
           controllerObject = new Controller();
        }
         // returns the singleton object
         return controllerObject;
    }
    
    /**
     * <p>
     * Returns instance of Controller class
     * </p>
     * @param library       library object
     * @param mainFormView  main form object
     * @return Controller  instance of controller
     */
    public static Controller getInstance(Library library, MainForm mainFormView) {
        // create object if it's not already created
        if(controllerObject == null) {
           controllerObject = new Controller(library, mainFormView);
        }

         // returns the singleton object
         return controllerObject;
    }
    
    /**
     * <p>
     * Shows MainForm
     * </p>
     */
    public void showForm() {
        mainFormView.show();
    }  
}
