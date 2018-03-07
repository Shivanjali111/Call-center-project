/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callcenter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class AddCustomer extends javax.swing.JDialog {

  int cid;
    boolean added=false;

    public AddCustomer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mobileMsgL.setVisible(false);
        emailMsgL.setVisible(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        customerIdT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        customerLNT = new javax.swing.JTextField();
        submitB = new javax.swing.JButton();
        resetB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        customerMobT = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        customerEmailT = new javax.swing.JTextField();
        mobileMsgL = new javax.swing.JLabel();
        emailMsgL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerFN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        warrantyD = new com.github.lgooddatepicker.components.DatePicker();
        serviceC = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Details");
        setMinimumSize(new java.awt.Dimension(685, 535));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setText("Customer ID");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 250, 100, 30);
        getContentPane().add(customerIdT);
        customerIdT.setBounds(130, 250, 150, 30);

        jLabel21.setText("Last Name");
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(320, 60, 76, 30);
        getContentPane().add(customerLNT);
        customerLNT.setBounds(420, 60, 246, 30);

        submitB.setText("Submit");
        submitB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });
        getContentPane().add(submitB);
        submitB.setBounds(230, 490, 80, 30);

        resetB.setText("Reset");
        resetB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBActionPerformed(evt);
            }
        });
        getContentPane().add(resetB);
        resetB.setBounds(340, 490, 80, 30);

        jLabel3.setText("Service Details");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 150, 30);

        jLabel1.setText("Personal Details");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 40, 680, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 210, 680, 10);

        jLabel5.setText("Mobile No");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 110, 90, 30);

        customerMobT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customerMobTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerMobTFocusLost(evt);
            }
        });
        customerMobT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerMobTKeyPressed(evt);
            }
        });
        getContentPane().add(customerMobT);
        customerMobT.setBounds(120, 110, 172, 30);

        jLabel22.setText("E-Mail");
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(320, 110, 76, 30);

        customerEmailT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customerEmailTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerEmailTFocusLost(evt);
            }
        });
        customerEmailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerEmailTActionPerformed(evt);
            }
        });
        customerEmailT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerEmailTKeyPressed(evt);
            }
        });
        getContentPane().add(customerEmailT);
        customerEmailT.setBounds(420, 110, 246, 30);

        mobileMsgL.setText("Enter a valid number");
        mobileMsgL.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(mobileMsgL);
        mobileMsgL.setBounds(120, 150, 140, 20);

        emailMsgL.setText("Please enter a valid email ID");
        emailMsgL.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(emailMsgL);
        emailMsgL.setBounds(400, 150, 210, 20);

        jLabel6.setText("First Name");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 60, 90, 30);
        getContentPane().add(customerFN);
        customerFN.setBounds(120, 60, 172, 30);

        jLabel7.setText("Date of purchase");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 310, 110, 30);

        jLabel9.setText("Product");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 310, 100, 30);
        getContentPane().add(warrantyD);
        warrantyD.setBounds(130, 310, 170, 30);

        serviceC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Product Validity", "Product Purchase ", "Product Reissue", "Customer Query", "Product Problem" }));
        serviceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceCActionPerformed(evt);
            }
        });
        getContentPane().add(serviceC);
        serviceC.setBounds(420, 250, 220, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Service");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 250, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        if(customerEmailT.getText()=="" || customerFN.getText()=="" || customerIdT.getText()=="" || customerMobT.getText()=="" ||
                serviceC.gett()=="" || warrantyD.getDate()==null ){
           JOptionPane.showMessageDialog(this,"Please enter all the fields","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            added=true;
            cid=(int)(Math.random()*9000)+1000;
           // JOptionPane.showMessageDialog(this,"employee "+userIDT.getText()+"added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_submitBActionPerformed

    private void resetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBActionPerformed
        customerIdT.setText("");
        customerLNT.setText("");

        customerMobT.setText("");
        customerEmailT.setText("");

    }//GEN-LAST:event_resetBActionPerformed

    private void customerMobTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerMobTFocusGained
        mobileMsgL.setVisible(false);
    }//GEN-LAST:event_customerMobTFocusGained

    private void customerMobTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerMobTFocusLost
        Pattern reg = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = reg.matcher(customerMobT.getText());
        if (!matcher.matches())
        mobileMsgL.setVisible(true);
    }//GEN-LAST:event_customerMobTFocusLost

    private void customerMobTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerMobTKeyPressed
        char a=evt.getKeyChar();
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8)
        customerMobT.setEditable(true);
        else
        customerMobT.setEditable(false);
        //            int key = evt.getKeyCode();
        //
        //            if((key>=96 && key<=105)||key==8)
        //                 mobileT.setEditable(true);
        //            else
        //                mobileT.setEditable(false);
    }//GEN-LAST:event_customerMobTKeyPressed

    private void customerEmailTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerEmailTFocusGained
        emailMsgL.setVisible(false);
    }//GEN-LAST:event_customerEmailTFocusGained

    private void customerEmailTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerEmailTFocusLost
        Pattern reg=Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher matcher=reg.matcher(customerEmailT.getText());
        if(!matcher.matches())
        emailMsgL.setVisible(true);
    }//GEN-LAST:event_customerEmailTFocusLost

    private void customerEmailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerEmailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerEmailTActionPerformed

    private void customerEmailTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerEmailTKeyPressed
        customerEmailT.setText(customerEmailT.getText().toLowerCase());
    }//GEN-LAST:event_customerEmailTKeyPressed

    private void serviceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceCActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCustomer dialog = new AddCustomer(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField customerEmailT;
    public javax.swing.JTextField customerFN;
    public javax.swing.JTextField customerIdT;
    public javax.swing.JTextField customerLNT;
    public javax.swing.JTextField customerMobT;
    private javax.swing.JLabel emailMsgL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mobileMsgL;
    private javax.swing.JButton resetB;
    private javax.swing.JComboBox<String> serviceC;
    private javax.swing.JButton submitB;
    public com.github.lgooddatepicker.components.DatePicker warrantyD;
    // End of variables declaration//GEN-END:variables
}
