/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author janna
 */
public class StudentFormView extends javax.swing.JFrame {

    /**
     * Creates new form StudentFormView
     */
    public StudentFormView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchByComboBox = new javax.swing.JComboBox<>();
        searchByTextBox = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        viewCatalogBtn = new javax.swing.JButton();
        viewIssuedCatalogBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTextAreaS = new javax.swing.JTextArea();
        returnBtn = new javax.swing.JButton();
        borrowBtnS = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchByComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Author", "Publisher" }));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        viewCatalogBtn.setText("View Catalog");
        viewCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCatalogBtnActionPerformed(evt);
            }
        });

        viewIssuedCatalogBtn.setText("View Issued Catalog");
        viewIssuedCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIssuedCatalogBtnActionPerformed(evt);
            }
        });

        displayTextAreaS.setColumns(20);
        displayTextAreaS.setRows(5);
        jScrollPane1.setViewportView(displayTextAreaS);

        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        borrowBtnS.setText("Borrow");
        borrowBtnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBtnSActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(borrowBtnS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(searchByTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(viewCatalogBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(viewIssuedCatalogBtn)))
                            .addComponent(backButton))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(searchByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewIssuedCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(borrowBtnS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCatalogBtnActionPerformed
        // TODO add your handling code here:
        displayTextAreaS.setText("");
        Map<String, String> catalog = Controller.getInstance().library.viewCatalog();
        
        StringBuilder mapAsString = new StringBuilder();
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            mapAsString.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        displayTextAreaS.setText(mapAsString.toString());
    }//GEN-LAST:event_viewCatalogBtnActionPerformed

    private void viewIssuedCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIssuedCatalogBtnActionPerformed
        // TODO add your handling code here:
         displayTextAreaS.setText("");
        Map<String, String> issuedCatalog = Controller.getInstance().library.viewIssuedBooks();
        
        if(!issuedCatalog.isEmpty()){
            StringBuilder mapAsString = new StringBuilder();
            for (Map.Entry<String, String> entry : issuedCatalog.entrySet()) {
                mapAsString.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            displayTextAreaS.setText(mapAsString.toString());
        }else{
             displayTextAreaS.setText("No record");
        }
    }//GEN-LAST:event_viewIssuedCatalogBtnActionPerformed

    private void borrowBtnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBtnSActionPerformed
        // TODO add your handling code here:
        BorrowViewBook borrowForm = new BorrowViewBook();
        borrowForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_borrowBtnSActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        ReturnFormView returnForm = new ReturnFormView();
        returnForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
         displayTextAreaS.setText("");
        if(searchByComboBox.getSelectedItem() == null || searchByTextBox.getText().isEmpty()){
            displayTextAreaS.setText("`Fill up every fields");
            return;
        }
        
        
        String searchb =  searchByComboBox.getSelectedItem().toString();
        String toSearch = searchByTextBox.getText();
        List<Book>  books = new ArrayList<>() ;
        System.out.println(searchb);

        switch (searchb) {
            case "Title" -> {
                books = Controller.getInstance().library.searchBookByTitle(toSearch);
                System.out.println(books);
                if(!books.isEmpty()){
                    for(Book b :books){
                        displayTextAreaS.append(b.printBook() +"\n"); 
                    }  
                }
                else{
                    displayTextAreaS.setText("Title not found");
                }
             }
            case "Author" -> {
                books = Controller.getInstance().library.searchBookByAuthor(toSearch);
                System.out.println(books);
                 if(!books.isEmpty()){
                    for(Book b :books){
                        displayTextAreaS.append(b.printBook() +"\n"); 
                    }  
                }
                else{
                    displayTextAreaS.setText("Author not found");
                }
             }
            case "Publisher" -> {
                 books = Controller.getInstance().library.searchBookByPublisher(toSearch);
                 System.out.println(books);
                if(!books.isEmpty()){
                    for(Book b :books){
                        displayTextAreaS.append(b.printBook() +"\n"); 
                    }  
                }
                else{
                    displayTextAreaS.setText("Publisher not found");
                }
             }

            default -> throw new IllegalArgumentException("Unknown search type: " + searchb);
        }
        searchByTextBox.setText("");
    }//GEN-LAST:event_searchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFormView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton borrowBtnS;
    private javax.swing.JTextArea displayTextAreaS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchByComboBox;
    private javax.swing.JTextField searchByTextBox;
    private javax.swing.JButton viewCatalogBtn;
    private javax.swing.JButton viewIssuedCatalogBtn;
    // End of variables declaration//GEN-END:variables
}