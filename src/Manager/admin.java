/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import com.employee.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import login.home;

/**
 *
 * @author just
 */
public class admin extends javax.swing.JFrame {
 Connection con= null;
    Statement stmt =null;
    ResultSet rs = null;
    /**
     * Creates new form SearchAndEdit
     */
    public admin() {
        initComponents();
        con= db.dbnnection();
    }
     public void reset(){
          name1.setText("");
      email1.setText("");
      phone1.setText("");       
      uname1.setText("");
      pass.setText(""); 
      ID.setText("");
      position.setText("");
      IDSERCH.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        IDSERCH = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        email1 = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();
        uname1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Admin Management");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));
        getContentPane().add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 250, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("position");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 70, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, 140, 40));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 140, 40));

        jToggleButton1.setText("SEARCH");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, 90, 30));
        getContentPane().add(IDSERCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 210, 30));

        ID.setBackground(new java.awt.Color(204, 204, 204));
        ID.setOpaque(true);
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 250, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, -1));
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 250, 30));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 140, 40));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 140, 40));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 250, 30));

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 140, 40));
        getContentPane().add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 250, 30));
        getContentPane().add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 250, 30));

        uname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname1ActionPerformed(evt);
            }
        });
        getContentPane().add(uname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 250, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("User name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{

            stmt = con.createStatement();

            
            
            
            String NAME =name1.getText();
            String EMAIL =email1.getText();
            String PHONE =phone1.getText();
            String positione = position.getText();
            String UNAME = uname1.getText();
            String PASS= pass.getText();
                  
         
           
             
     
           
       
           
            
           if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email1.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
            
            if(!NAME.isEmpty()){
            if(!EMAIL.isEmpty()){
                if(!PHONE.isEmpty()){
                    if(!positione.isEmpty()){
                        if(!UNAME.isEmpty()){
                            if(!PASS.isEmpty()){
                               
                                       
            
            
            
            String query = "INSERT INTO ancel_employee.admin(admin_id,name,email,phone,possition,uname,password) VALUES (0,?,?,?,?,?,?)";

            PreparedStatement preparedStmt =con.prepareStatement(query);

            preparedStmt.setString(1,NAME);
            preparedStmt.setString(2,EMAIL);
            preparedStmt.setString(3,PHONE);
            preparedStmt.setString(4,positione);
            preparedStmt.setString(5,UNAME);
            preparedStmt.setString(6,PASS);

            preparedStmt.execute();
            JOptionPane.showMessageDialog(null,"Successfully Inserted !");
            reset();
            
                                                     }else{
                                                    JOptionPane.showMessageDialog(null, "PLEASE ENTER  password", "  password", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }else{
                                                    JOptionPane.showMessageDialog(null, "PLEASE ENTER   user name", " user  ", JOptionPane.ERROR_MESSAGE);
                                                }
                                       
                            }else{
                                JOptionPane.showMessageDialog(null, "PLEASE ENTER  position", "  position", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "PLEASE ENTER phone number", "phone", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "PLEASE ENTER email", "email", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER name", "name", JOptionPane.ERROR_MESSAGE);
                }
            }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
     try {
         stmt=con.createStatement();
         
          int EID= Integer.parseInt(IDSERCH.getText());
          
          String query = "SELECT * FROM ancel_employee.admin";
          rs=stmt.executeQuery(query);
          
          while(rs.next()){
              if(EID==rs.getInt("admin_id")){
               ID.setText( rs.getString("admin_id")); 
                 name1.setText( rs.getString("name"));  
                email1.setText( rs.getString("email"));
                phone1.setText(rs.getString("phone"));
                position.setText(rs.getString("possition"));
                uname1.setText(rs.getString("uname"));
                pass.setText(rs.getString("password"));
                  
                  
              }
              
              
          }
          
         
         
     } catch (SQLException ex) {
         Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
     }
        
       
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{

            stmt = con.createStatement();

           
            String NAME =name1.getText();
            String EMAIL =email1.getText();
            String PHONE =phone1.getText();
            String positione = position.getText();
            String UNAME = uname1.getText();
            String PASS= pass.getText();
             int EID= Integer.parseInt(IDSERCH.getText());
            String query = " UPDATE ancel_employee.admin SET name=?,email=?,phone=?,possition=?,uname=?,password=? WHERE admin_id=? ";

            PreparedStatement preparedStmt =con.prepareStatement(query);
            
           preparedStmt.setString(1,NAME);
            preparedStmt.setString(2,EMAIL);
            preparedStmt.setString(3,PHONE);
            preparedStmt.setString(4,positione);
            preparedStmt.setString(5,UNAME);
            preparedStmt.setString(6,PASS);
           preparedStmt.setInt(7,EID);
             preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Update !");
            reset();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
        
     try {
         stmt = con.createStatement();
         
           int EID= Integer.parseInt(IDSERCH.getText());
         
         String query="DELETE FROM ancel_employee.admins WHERE EMP_ID='"+EID+"'";
         
          stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully Update !");
            reset();  
         
     } catch (SQLException ex) {
         Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
     }
  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void uname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uname1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
  home sda = new home();
                sda.setVisible(true);
                this.setVisible(false);        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JTextField IDSERCH;
    private javax.swing.JTextField email1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField position;
    private javax.swing.JTextField uname1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
