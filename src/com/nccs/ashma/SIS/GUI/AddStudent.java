/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.ashma.SIS.GUI;

import com.nccs.ashma.SIS.DAO.StudentDAO;
import com.nccs.ashma.SIS.DTO.StudentDTO;
import javax.swing.ButtonGroup;

/**
 *
 * @author lenovo
 */
public class AddStudent extends javax.swing.JPanel {

    ButtonGroup grp;
    String gender;
    String sem;
    public AddStudent() {
        initComponents();
        grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);
        loadData();
    }
    private void loadData() {
        StudentDAO student = new StudentDAO();

        try {
            studentTable.setModel(student.builtTableModel(student.getQueryResult()));
        } catch (Exception e) {
        }
    }
    
    public void clearField(){
        studentId.setText("");
        fname.setText("");
        mname.setText("");
        lname.setText("");
        semail.setText("");
        mobile.setText("");
        stdperaddress.setText("");
        stdtempaddress.setText("");
        program.setText("");
        semester.setSelectedItem("");
        section.setText("");
        grp.clearSelection();
        
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
        jLabel1 = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        stdperaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        stdtempaddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        semail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        program = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        stdaddbttn = new javax.swing.JButton();
        stdeditbttn = new javax.swing.JButton();
        stddelete = new javax.swing.JButton();
        stdclear = new javax.swing.JButton();
        stdcancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();

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

        jLabel1.setText("Student ID:");

        jLabel2.setText("FirstName:");

        jLabel3.setText("Middle Name:");

        jLabel4.setText("LastName:");

        jLabel5.setText("Gender    :");

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        jLabel6.setText("Permanent Address:");

        jLabel7.setText("Temporary Address:");

        jLabel8.setText("Email:");

        jLabel9.setText("Mobile");

        jLabel10.setText("Program:");

        jLabel11.setText("Semester:");

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "First", "second", "third","fourth","fifth","Sixth","seventh","eighth" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        jLabel12.setText("Section:");

        stdaddbttn.setText("Add");
        stdaddbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdaddbttnActionPerformed(evt);
            }
        });

        stdeditbttn.setText("Edit");
        stdeditbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdeditbttnActionPerformed(evt);
            }
        });

        stddelete.setText("Delete");
        stddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stddeleteActionPerformed(evt);
            }
        });

        stdclear.setText("Clear");

        stdcancel.setText("Cancel");
        stdcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdcancelActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(studentTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(studentId, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(fname))
                            .addComponent(male))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(female)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(stdperaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(stdtempaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stdaddbttn)
                                .addGap(18, 18, 18)
                                .addComponent(stdeditbttn)
                                .addGap(18, 18, 18)
                                .addComponent(stddelete)
                                .addGap(18, 18, 18)
                                .addComponent(stdclear)
                                .addGap(18, 18, 18)
                                .addComponent(stdcancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(stdperaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(stdtempaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdaddbttn)
                    .addComponent(stdeditbttn)
                    .addComponent(stddelete)
                    .addComponent(stdclear)
                    .addComponent(stdcancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stdaddbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdaddbttnActionPerformed
        // TODO add your handling code here:
        StudentDTO student = new StudentDTO();
        student.setStdID(Integer.parseInt(studentId.getText()));
        student.setFirstName(fname.getText());
        student.setMiddleName(mname.getText());
        student.setLastName(lname.getText());
        student.setGender(gender);
        student.setPerAddress(stdperaddress.getText());
        student.setTempAddres(stdtempaddress.getText());
        student.setEmail(semail.getText());
        student.setMobile(mobile.getText());
        student.setProgram(program.getText());
        student.setSemester(sem);
        student.setSection(section.getText());
        
        new StudentDAO().addStudent(student);

        
    }//GEN-LAST:event_stdaddbttnActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender = "male";
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender = "female";
    }//GEN-LAST:event_femaleActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
        sem = semester.getSelectedItem().toString();
    }//GEN-LAST:event_semesterActionPerformed

    private void stdeditbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdeditbttnActionPerformed
        // TODO add your handling code here:
        StudentDTO std = new StudentDTO();
        if (stdeditbttn.getText().equalsIgnoreCase("Edit")) {
            stdeditbttn.setText("Update");
            std = new StudentDAO().editStudent(studentTable);
            studentId.setText(String.valueOf(std.getStdID()));
            studentId.setEditable(false);
            fname.setText(std.getFirstName());
            mname.setText(std.getMiddleName());
            lname.setText(std.getLastName());
            semail.setText(std.getEmail());
            mobile.setText(std.getMobile());
            program.setText(std.getProgram());
            stdperaddress.setText(std.getPerAddress());
            stdtempaddress.setText(std.getTempAddres());
            section.setText(std.getSection());
            if(std.getGender().equalsIgnoreCase("Male")){
                male.setSelected(true);
            }
            else
            {
                female.setSelected(true);
            }
            semester.setSelectedItem(std.getSemester());
        }
        else
        {
            stdeditbttn.setText("Edit");
            std.setStdID(Integer.parseInt(studentId.getText()));
            std.setFirstName(fname.getText());
            std.setMiddleName(mname.getText());
            std.setLastName(lname.getText());
            std.setPerAddress(stdperaddress.getText());
            std.setTempAddres(stdtempaddress.getText());
            std.setEmail(semail.getText());
            std.setMobile(mobile.getText());
            std.setProgram(program.getText());
            std.setSection(section.getText());
            if(male.isSelected()){
                gender = "Male";
            }
            else
            {
                gender = "Female";
            }
            std.setGender(gender);
            sem = semester.getSelectedItem().toString();
            std.setSemester(sem);
            new StudentDAO().UpdateStudent(std);
            loadData();
            clearField();
       }
    }//GEN-LAST:event_stdeditbttnActionPerformed

    private void stddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stddeleteActionPerformed
        // TODO add your handling code here:
        new StudentDAO().delete(String.valueOf(studentTable.getValueAt(studentTable.getSelectedRow(), 0)));
        loadData();
    }//GEN-LAST:event_stddeleteActionPerformed

    private void stdcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdcancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_stdcancelActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField program;
    private javax.swing.JTextField section;
    private javax.swing.JTextField semail;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JButton stdaddbttn;
    private javax.swing.JButton stdcancel;
    private javax.swing.JButton stdclear;
    private javax.swing.JButton stddelete;
    private javax.swing.JButton stdeditbttn;
    private javax.swing.JTextField stdperaddress;
    private javax.swing.JTextField stdtempaddress;
    private javax.swing.JTextField studentId;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}