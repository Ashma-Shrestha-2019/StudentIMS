/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.ashma.SIS.main;

import com.nccs.ashma.SIS.GUI.LoginDialog;
import javax.swing.*;
/**
 *
 * @author dipesh
 */
public class StudentInformationSystem {
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginDialog ld = new LoginDialog();
        ld.setSize(350, 200);
        ld.setLocationRelativeTo(null);
        ld.setVisible(true);
    }
}
