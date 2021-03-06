/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.ashma.SIS.GUI;

import com.nccs.ashma.SIS.DAO.UserDAO;
import com.nccs.ashma.SIS.DTO.UserDTO;

/**
 *
 * @author lenovo
 */
public class AddUser extends javax.swing.JPanel {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        useridlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        useridtxt = new javax.swing.JTextField();
        firstnametxt = new javax.swing.JTextField();
        permanentaddrtxt = new javax.swing.JTextField();
        contacttxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        middlenametxt = new javax.swing.JTextField();
        temporaryaddrtxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lastnametxt = new javax.swing.JTextField();
        addUserBttn = new javax.swing.JButton();
        editUserBttn = new javax.swing.JButton();
        deleteUserBttn = new javax.swing.JButton();
        cancelUserBttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        passwordtxt = new javax.swing.JPasswordField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        useridlbl.setText("UserId");

        jLabel2.setText("First Name");

        jLabel3.setText("Permanent Address");

        jLabel4.setText("Contact");

        useridtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridtxtActionPerformed(evt);
            }
        });

        permanentaddrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permanentaddrtxtActionPerformed(evt);
            }
        });

        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });

        jLabel5.setText("UserName");

        jLabel6.setText("Middle Name");

        jLabel7.setText("Temprary Address");

        jLabel8.setText("Email");

        jLabel9.setText("Password");

        jLabel10.setText("Last Name");

        addUserBttn.setText("Add");
        addUserBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBttnActionPerformed(evt);
            }
        });

        editUserBttn.setText("Edit");
        editUserBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserBttnActionPerformed(evt);
            }
        });

        deleteUserBttn.setText("Delete");
        deleteUserBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBttnActionPerformed(evt);
            }
        });

        cancelUserBttn.setText("Cancel");
        cancelUserBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUserBttnActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "userId", "username", "firstname", "middlename", "lastname", "peraddress", "tempaddress", "contact", "email"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(permanentaddrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(useridlbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(61, 61, 61)
                                        .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(addUserBttn)
                                .addGap(18, 18, 18)
                                .addComponent(editUserBttn)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteUserBttn)
                                .addGap(36, 36, 36)
                                .addComponent(cancelUserBttn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(middlenametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temporaryaddrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 251, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useridlbl)
                    .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10)
                        .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(middlenametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(permanentaddrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(temporaryaddrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUserBttn)
                    .addComponent(editUserBttn)
                    .addComponent(addUserBttn)
                    .addComponent(cancelUserBttn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void permanentaddrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permanentaddrtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_permanentaddrtxtActionPerformed

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void useridtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridtxtActionPerformed

    private void addUserBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBttnActionPerformed
        // TODO add your handling code here:
        UserDTO user = new UserDTO();
        user.setUserId(Integer.parseInt(useridtxt.getText()));
        user.setUsername(usernametxt.getText());
        user.setFirstname(firstnametxt.getText());
        user.setMiddlename(middlenametxt.getText());
        user.setLastname(lastnametxt.getText());
        user.setPassword(new String(passwordtxt.getPassword()));
        user.setPeraddress(permanentaddrtxt.getText());
        user.setTempaddress(temporaryaddrtxt.getText());
        user.setContact(contacttxt.getText());
        user.setEmail(emailtxt.getText());

        new UserDAO().addUser(user);

    }//GEN-LAST:event_addUserBttnActionPerformed

    private void editUserBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserBttnActionPerformed
        // TODO add your handling code here:
        UserDTO user = new UserDTO();
        if (editUserBttn.getText().equalsIgnoreCase("Edit")) {
            editUserBttn.setText("Update");
            user = new UserDAO().editUser(table);

            useridtxt.setText(String.valueOf(user.getUserId()));
            useridtxt.setEditable(false);
            usernametxt.setText(user.getUsername());
            usernametxt.setEditable(false);
            firstnametxt.setText(user.getFirstname());
            middlenametxt.setText(user.getMiddlename());
            lastnametxt.setText(user.getLastname());
            permanentaddrtxt.setText(user.getPeraddress());
            temporaryaddrtxt.setText(user.getTempaddress());
            contacttxt.setText(user.getContact());
            emailtxt.setText(user.getEmail());
            passwordtxt.setText("*******");
            passwordtxt.setEditable(false);
        } else {
            editUserBttn.setText("Edit");
            user.setUserId(Integer.parseInt(useridtxt.getText()));
            user.setFirstname(firstnametxt.getText());
            user.setMiddlename(middlenametxt.getText());
            user.setLastname(lastnametxt.getText());
            user.setPeraddress(permanentaddrtxt.getText());
            user.setTempaddress(temporaryaddrtxt.getText());
            user.setContact(contacttxt.getText());
            user.setEmail(emailtxt.getText());
            
            new UserDAO().UpdateUser(user);
            
            useridtxt.setEditable(true);
            usernametxt.setEditable(true);
            passwordtxt.setEditable(true);
            loadData();
            clearField();
        }
    }//GEN-LAST:event_editUserBttnActionPerformed

    private void cancelUserBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUserBttnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_cancelUserBttnActionPerformed

    private void deleteUserBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBttnActionPerformed
        // TODO add your handling code here:
        new UserDAO().delete(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
        loadData();
    }//GEN-LAST:event_deleteUserBttnActionPerformed

    private void loadData() {
        UserDAO user = new UserDAO();

        try {
            table.setModel(user.builtTableModel(user.getQueryResult()));
        } catch (Exception e) {
        }
    }

    private void clearField() {
        useridtxt.setText("");
        usernametxt.setText("");
        firstnametxt.setText("");
        middlenametxt.setText("");
        lastnametxt.setText("");
        passwordtxt.setText("");
        permanentaddrtxt.setText("");
        temporaryaddrtxt.setText("");
        contacttxt.setText("");
        emailtxt.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBttn;
    private javax.swing.JButton cancelUserBttn;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JButton deleteUserBttn;
    private javax.swing.JButton editUserBttn;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JTextField middlenametxt;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField permanentaddrtxt;
    private javax.swing.JTable table;
    private javax.swing.JTextField temporaryaddrtxt;
    private javax.swing.JLabel useridlbl;
    private javax.swing.JTextField useridtxt;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
