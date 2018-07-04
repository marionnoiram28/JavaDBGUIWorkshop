package com.marion.HCI;

import java.io.IOException;
import java.sql.SQLException;

import com.marion.entities.MouseAndActionManagement;

/* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author 28010-34-08
*/
public class SignInDataBaseChoice extends javax.swing.JFrame {

   /**
    * Creates new form SignInDataBaseChoice
 * @throws IOException 
 * @throws SQLException 
 * @throws ClassNotFoundException 
 * @throws IllegalAccessException 
 * @throws InstantiationException 
    */
   public SignInDataBaseChoice() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
     /*MAJ MARION EXCeptionSQL*/
	   initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
 * @throws IOException 
 * @throws SQLException 
 * @throws ClassNotFoundException 
 * @throws IllegalAccessException 
 * @throws InstantiationException 
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
/*MAJ Marion ajout des exceptions sql*/
       lblWelcome = new javax.swing.JLabel();
       btnConfirm = new javax.swing.JButton();
       txtLogin = new javax.swing.JTextField();
       txtPassword = new javax.swing.JTextField();
       txtDataBase = new javax.swing.JTextField();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       setTitle("Welcome");

       lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       lblWelcome.setText("Welcome to QueryPlus");
       lblWelcome.setPreferredSize(new java.awt.Dimension(200, 20));
       
       btnConfirm.setText("Confirm");
       btnConfirm.setPreferredSize(new java.awt.Dimension(80, 40));
       MouseAndActionManagement evt1= new MouseAndActionManagement();
       btnConfirm.addActionListener(evt1);
//       btnConfirm.addActionListener(new java.awt.event.ActionListener() {
//           public void actionPerformed(java.awt.event.ActionEvent evt) {
//               btnConfirmActionPerformed(evt);
//           }
//       });

       txtLogin.setForeground(new java.awt.Color(204, 204, 204));
       txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
       txtLogin.setText("\"Please enter your login\"");
       txtLogin.setPreferredSize(new java.awt.Dimension(200, 40));
//       txtLogin.addActionListener(new java.awt.event.ActionListener() {
//           public void actionPerformed(java.awt.event.ActionEvent evt) {
//               txtLoginActionPerformed(evt);
//           }
//       });

       txtPassword.setForeground(new java.awt.Color(204, 204, 204));
       txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
       txtPassword.setText("\"Please enter your password\"");
       txtPassword.setPreferredSize(new java.awt.Dimension(200, 40));
//       txtPassword.addActionListener(new java.awt.event.ActionListener() {
//           public void actionPerformed(java.awt.event.ActionEvent evt) {
//               txtPasswordActionPerformed(evt);
//           }
//       });

       txtDataBase.setForeground(new java.awt.Color(204, 204, 204));
       txtDataBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
       txtDataBase.setText("\"Please select data base\"");
       txtDataBase.setPreferredSize(new java.awt.Dimension(200, 40));
//       txtDataBase.addActionListener(new java.awt.event.ActionListener() {
//           public void actionPerformed(java.awt.event.ActionEvent evt) {
//               txtDataBaseActionPerformed(evt);
//           }
//       });

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(300, 300, 300)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                               .addComponent(txtDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                       .addGroup(layout.createSequentialGroup()
                           .addGap(366, 366, 366)
                           .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                   .addContainerGap(300, Short.MAX_VALUE))
           );
           layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                   .addGap(80, 80, 80)
                   .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(70, 70, 70)
                   .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(70, 70, 70)
                   .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(70, 70, 70)
                   .addComponent(txtDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(70, 70, 70)
                   .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addContainerGap(60, Short.MAX_VALUE))
           );

           pack();
       }// </editor-fold>//GEN-END:initComponents
//
//       private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
//           // TODO add your handling code here:
//       }//GEN-LAST:event_txtLoginActionPerformed
//
//       private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
//           // TODO add your handling code here:
//       }//GEN-LAST:event_txtPasswordActionPerformed
//
//       private void txtDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataBaseActionPerformed
//           // TODO add your handling code here:
//       }//GEN-LAST:event_txtDataBaseActionPerformed
//
//       private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
//           // TODO add your handling code here:
//       }//GEN-LAST:event_btnConfirmActionPerformed
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
               java.util.logging.Logger.getLogger(SignInDataBaseChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(SignInDataBaseChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(SignInDataBaseChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(SignInDataBaseChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           }
           //</editor-fold>

           /* Create and display the form */
           java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                   try {
					new SignInDataBaseChoice().setVisible(true);
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                   /*MAJ MARION try catch*/
               }
           });
       }
//__________________________________________________________________________________________________________________________________
       //get/setters
       
       public javax.swing.JButton getBtnConfirm() {
   		return btnConfirm;
   	}

   	public void setBtnConfirm(javax.swing.JButton btnConfirm) {
   		this.btnConfirm = btnConfirm;
   	}
       
       
       
//____________________________________________________________________________________________________________________________________
       // Variables declaration - do not modify//GEN-BEGIN:variables
       private javax.swing.JButton btnConfirm;
      





	private javax.swing.JLabel lblWelcome;
       private javax.swing.JTextField txtDataBase;
       private javax.swing.JTextField txtLogin;
       private javax.swing.JTextField txtPassword;
       // End of variables declaration//GEN-END:variables
   }