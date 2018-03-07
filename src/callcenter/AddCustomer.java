package callcenter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class AddCustomer extends javax.swing.JDialog {

    int cid;
    boolean added;
    
    public AddCustomer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mobileMsgL.setVisible(false);
        emailMsgL.setVisible(false);       
        added=false;
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
        prodServiceT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        warrantyD = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(685, 500));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(685, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setText("Customer ID");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 250, 100, 30);
        getContentPane().add(customerIdT);
        customerIdT.setBounds(110, 250, 150, 30);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Last Name");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(310, 60, 76, 30);
        getContentPane().add(customerLNT);
        customerLNT.setBounds(410, 60, 246, 30);

        submitB.setText("Submit");
        submitB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });
        getContentPane().add(submitB);
        submitB.setBounds(220, 370, 80, 30);

        resetB.setText("Reset");
        resetB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBActionPerformed(evt);
            }
        });
        getContentPane().add(resetB);
        resetB.setBounds(320, 370, 80, 30);

        jLabel3.setText("Service Details");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 150, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Personal Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 40, 320, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 210, 320, 10);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Mobile No");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 90, 30);

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
        customerMobT.setBounds(110, 110, 172, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("E-Mail");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(310, 110, 76, 30);

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
        customerEmailT.setBounds(410, 110, 246, 30);

        mobileMsgL.setForeground(new java.awt.Color(255, 0, 0));
        mobileMsgL.setText("Enter a valid number");
        getContentPane().add(mobileMsgL);
        mobileMsgL.setBounds(110, 150, 140, 14);

        emailMsgL.setForeground(new java.awt.Color(255, 0, 0));
        emailMsgL.setText("Please enter a valid email ID");
        getContentPane().add(emailMsgL);
        emailMsgL.setBounds(390, 150, 210, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("First Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 60, 90, 30);
        getContentPane().add(customerFN);
        customerFN.setBounds(110, 60, 172, 30);

        prodServiceT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodServiceTActionPerformed(evt);
            }
        });
        getContentPane().add(prodServiceT);
        prodServiceT.setBounds(420, 250, 220, 30);

        jLabel7.setText("Warranty Date");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 310, 100, 30);

        jLabel9.setText("Service/Product");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 250, 100, 30);
        getContentPane().add(warrantyD);
        warrantyD.setBounds(110, 310, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        if(customerEmailT.getText()=="" || customerFN.getText()=="" || customerIdT.getText()=="" || customerMobT.getText()=="" ||
                prodServiceT.getText()=="" || warrantyD.getText()=="" ){
           JOptionPane.showMessageDialog(this,"Please enter all the feilds","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            added=true;
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

    private void prodServiceTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodServiceTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodServiceTActionPerformed

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
    public javax.swing.JTextField prodServiceT;
    private javax.swing.JButton resetB;
    private javax.swing.JButton submitB;
    public com.github.lgooddatepicker.components.DatePicker warrantyD;
    // End of variables declaration//GEN-END:variables
}
