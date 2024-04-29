/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author jannalomibao
 */
public class Controller {
    Library library = new Library();
    private MainForm mainFormView;
    private static Controller controllerObject;
    
    private Controller() {
        
    }
    private Controller(Library library, MainForm mainFormView) {
        this.library = library;
        this.mainFormView = mainFormView;     
    }
    public static Controller getInstance() {
        // create object if it's not already created
        if(controllerObject == null) {
           controllerObject = new Controller();
        }
         // returns the singleton object
         return controllerObject;
    }
    public static Controller getInstance(Library library, MainForm mainFormView) {
        // create object if it's not already created
        if(controllerObject == null) {
           controllerObject = new Controller(library, mainFormView);
        }

         // returns the singleton object
         return controllerObject;
    }
    public void showForm() {
        mainFormView.show();
    }
    
}
