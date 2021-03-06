/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.ashma.SIS.GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dipesh
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        Toolkit thekit=getToolkit();
        Dimension dim=thekit.getScreenSize();
        setSize(dim);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        changemenuitem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        logoutmenuitem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        addusermenuitem = new javax.swing.JMenuItem();
        addstudentmenuitem = new javax.swing.JMenuItem();
        searchusermenuitem = new javax.swing.JMenuItem();
        searchstudentmenuitem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitmenuitem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("File");

        changemenuitem.setText("Change Username and Password");
        changemenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changemenuitemActionPerformed(evt);
            }
        });
        jMenu3.add(changemenuitem);
        jMenu3.add(jSeparator3);

        logoutmenuitem.setText("logout");
        logoutmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutmenuitemActionPerformed(evt);
            }
        });
        jMenu3.add(logoutmenuitem);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");

        addusermenuitem.setText("Add User");
        addusermenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addusermenuitemActionPerformed(evt);
            }
        });
        jMenu4.add(addusermenuitem);

        addstudentmenuitem.setText("Add Student");
        addstudentmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentmenuitemActionPerformed(evt);
            }
        });
        jMenu4.add(addstudentmenuitem);

        searchusermenuitem.setText("Search User");
        searchusermenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchusermenuitemActionPerformed(evt);
            }
        });
        jMenu4.add(searchusermenuitem);

        searchstudentmenuitem.setText("Search Student");
        searchstudentmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstudentmenuitemActionPerformed(evt);
            }
        });
        jMenu4.add(searchstudentmenuitem);
        jMenu4.add(jSeparator2);

        exitmenuitem.setText("Exit");
        jMenu4.add(exitmenuitem);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changemenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changemenuitemActionPerformed
        // TODO add your handling code here:
        new ChangeUsernameAndPassword();
        revalidate();
    }//GEN-LAST:event_changemenuitemActionPerformed

    private void addstudentmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentmenuitemActionPerformed
        // TODO add your handling code here:
         setContentPane(new AddStudent());
        revalidate();
    }//GEN-LAST:event_addstudentmenuitemActionPerformed

    private void addusermenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addusermenuitemActionPerformed
        // TODO add your handling code here:
        setContentPane(new AddUser());
        revalidate();
    }//GEN-LAST:event_addusermenuitemActionPerformed

    private void searchusermenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchusermenuitemActionPerformed
        // TODO add your handling code here:
        setContentPane(new UserSearch());
        revalidate();
    }//GEN-LAST:event_searchusermenuitemActionPerformed

    private void searchstudentmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstudentmenuitemActionPerformed
        // TODO add your handling code here:
        setContentPane(new StudentSearch());
        revalidate();
    }//GEN-LAST:event_searchstudentmenuitemActionPerformed

    private void logoutmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutmenuitemActionPerformed
        // TODO add your handling code here:
        int dialogBttn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?","Warning",dialogBttn);
        if(dialogResult==JOptionPane.YES_OPTION){
            setVisible(false);
            new LoginDialog().setVisible(true);
        }
    }//GEN-LAST:event_logoutmenuitemActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addstudentmenuitem;
    private javax.swing.JMenuItem addusermenuitem;
    private javax.swing.JMenuItem changemenuitem;
    private javax.swing.JMenuItem exitmenuitem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem logoutmenuitem;
    private javax.swing.JMenuItem searchstudentmenuitem;
    private javax.swing.JMenuItem searchusermenuitem;
    // End of variables declaration//GEN-END:variables
}
