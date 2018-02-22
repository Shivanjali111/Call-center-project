
package callcenter;


public class AddSettings extends javax.swing.JDialog {

    boolean added=false;
    
    public AddSettings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        msgL.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typeT = new javax.swing.JTextField();
        idT = new javax.swing.JTextField();
        submitB = new javax.swing.JButton();
        resetB = new javax.swing.JButton();
        msgL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(307, 307));
        setPreferredSize(new java.awt.Dimension(307, 307));
        setResizable(false);
        getContentPane().setLayout(null);

        settingsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Department", "Call Type", "Call Category", "Error" }));
        settingsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsCBActionPerformed(evt);
            }
        });
        getContentPane().add(settingsCB);
        settingsCB.setBounds(20, 20, 120, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 90, 80, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 140, 80, 30);

        typeT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                typeTFocusGained(evt);
            }
        });
        getContentPane().add(typeT);
        typeT.setBounds(90, 140, 160, 30);

        idT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTFocusGained(evt);
            }
        });
        idT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTActionPerformed(evt);
            }
        });
        idT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idTKeyPressed(evt);
            }
        });
        getContentPane().add(idT);
        idT.setBounds(90, 90, 160, 30);

        submitB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitB.setText("Submit");
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });
        getContentPane().add(submitB);
        submitB.setBounds(70, 210, 77, 25);

        resetB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetB.setText("Reset");
        resetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBActionPerformed(evt);
            }
        });
        getContentPane().add(resetB);
        resetB.setBounds(160, 210, 80, 25);

        msgL.setForeground(new java.awt.Color(255, 0, 0));
        msgL.setText("Please enter all the feilds");
        getContentPane().add(msgL);
        msgL.setBounds(90, 180, 150, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsCBActionPerformed

    }//GEN-LAST:event_settingsCBActionPerformed

    private void idTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTActionPerformed

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        if("".equals(idT.getText()) || "".equals(typeT.getText()) || settingsCB.getSelectedIndex()==0)
            msgL.setVisible(true);
        else{
            added=true;
            dispose();
        }
    }//GEN-LAST:event_submitBActionPerformed

    private void resetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBActionPerformed
        idT.setText("");
        typeT.setText("");
    }//GEN-LAST:event_resetBActionPerformed

    private void idTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTKeyPressed
        char a=evt.getKeyChar();
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8)
            idT.setEditable(true);
        else
            idT.setEditable(false);
    }//GEN-LAST:event_idTKeyPressed

    private void idTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTFocusGained
        msgL.setVisible(false);
    }//GEN-LAST:event_idTFocusGained

    private void typeTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeTFocusGained
        msgL.setVisible(false);
    }//GEN-LAST:event_typeTFocusGained

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
            java.util.logging.Logger.getLogger(AddSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddSettings dialog = new AddSettings(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField idT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel msgL;
    private javax.swing.JButton resetB;
    public javax.swing.JComboBox<String> settingsCB;
    private javax.swing.JButton submitB;
    public javax.swing.JTextField typeT;
    // End of variables declaration//GEN-END:variables
}
