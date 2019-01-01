/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.ashma.SIS.DAO;

import com.nccs.ashma.SIS.DTO.StudentDTO;
import com.nccs.ashma.SIS.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dipesh
 */
public class StudentDAO {
    
    Connection con = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public StudentDAO() {
        con = new ConnectionFactory().getConnection();
    }
    public void addStudent(StudentDTO std){
        
        String query = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, std.getStdID());
            pstmt.setString(2, std.getFirstName());
            pstmt.setString(3, std.getMiddleName());
            pstmt.setString(4, std.getLastName());
            pstmt.setString(5, std.getGender());
            pstmt.setString(6, std.getPerAddress());
            pstmt.setString(7, std.getTempAddres());
            pstmt.setString(8, std.getEmail());
            pstmt.setString(9, std.getMobile());
            pstmt.setString(10, std.getProgram());
            pstmt.setString(11, std.getSemester());
            pstmt.setString(12, std.getSection());
           
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record inserted!");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    public DefaultTableModel builtTableModel(ResultSet rs) throws Exception {
        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnName = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnName.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();

            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnName);
    }
    public Vector<String> getColumnNames(ResultSet rs) {
        Vector<String> columnName = new Vector<String>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnName.add(metaData.getColumnName(column));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnName;
    }
    public ResultSet getQueryResult() {
        String query = "Select * from student";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
     public StudentDTO editStudent(JTable table) {
        StudentDTO std = new StudentDTO();

        std.setStdID((Integer) table.getValueAt(table.getSelectedRow(), 0));
        std.setFirstName((String) table.getValueAt(table.getSelectedRow(), 1));
        std.setMiddleName((String) table.getValueAt(table.getSelectedRow(), 2));
        std.setLastName((String) table.getValueAt(table.getSelectedRow(), 3));
        std.setGender((String) table.getValueAt(table.getSelectedRow(), 4));
        std.setPerAddress((String) table.getValueAt(table.getSelectedRow(), 5));
        std.setTempAddres((String) table.getValueAt(table.getSelectedRow(), 6));
        std.setEmail((String) table.getValueAt(table.getSelectedRow(), 7));
        std.setMobile((String) table.getValueAt(table.getSelectedRow(), 8));
        std.setProgram((String) table.getValueAt(table.getSelectedRow(), 9));
        std.setSemester((String) table.getValueAt(table.getSelectedRow(), 10));
        std.setSection((String) table.getValueAt(table.getSelectedRow(), 11));

        return std;
    }
     public void UpdateStudent(StudentDTO std) {
        String query = "UPDATE student set firstname=?,middlename=?,lastname=?,gender=?,peraddress=?,tempaddress=?,email=?,mobile=?,program=?,semester=?,section=? where std_id=?";
        try {

            pstmt = con.prepareStatement(query);

            pstmt.setString(1, std.getFirstName());
            pstmt.setString(2, std.getMiddleName());
            pstmt.setString(3, std.getLastName());            
            pstmt.setString(4, std.getGender());            
            pstmt.setString(5, std.getPerAddress());
            pstmt.setString(6, std.getTempAddres());
            pstmt.setString(7, std.getEmail());
            pstmt.setString(8, std.getMobile());
            pstmt.setString(9, std.getProgram());
            pstmt.setString(10, std.getSemester());
            pstmt.setString(11, std.getSection());
            pstmt.setInt(12, std.getStdID());

            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Record Updated!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void delete(String value) {

        String query = "DELETE FROM Student WHERE std_id=?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(value));
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record delete!!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public ResultSet searchStudent(String name, String value) {
        String query;
        if (name.equalsIgnoreCase("std_id")) {
            query = "Select std_id,firstname,middlename,lastname,gender,peraddress,tempaddress,email,mobile,program,semester,section from student where " + name + "=" + value;
        } else {
            query = "std_id,firstname,middlename,lastname,gender,peraddress,tempaddress,email,mobile,program,semester,section from student where " + name + "='" + value + "'";
        }
        
        try {
            stmt = con.createStatement();
            rs = stmt . executeQuery(query);
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Search not found!");
            }else{
                rs.beforeFirst();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
