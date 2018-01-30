package callcenter;

public class AddEmployee extends javax.swing.JDialog {

    public AddEmployee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstNameT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        genderCB = new javax.swing.JComboBox<>();
        lastNameT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        addressT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dob = new com.github.lgooddatepicker.components.DatePicker();
        stateCB = new javax.swing.JComboBox<>();
        cityCB = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(733, 700));
        setMinimumSize(new java.awt.Dimension(681, 700));
        setPreferredSize(new java.awt.Dimension(681, 700));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 90, 30);

        jLabel10.setText("DOB");
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 110, 90, 30);
        getContentPane().add(firstNameT);
        firstNameT.setBounds(110, 60, 172, 30);

        jLabel21.setText("Last Name");
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(310, 60, 76, 30);

        jLabel12.setText("Gender");
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 110, 76, 30);

        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Male", "Female" }));
        getContentPane().add(genderCB);
        genderCB.setBounds(410, 110, 90, 30);
        getContentPane().add(lastNameT);
        lastNameT.setBounds(410, 60, 246, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Address");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 210, 90, 30);

        addressT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTActionPerformed(evt);
            }
        });
        getContentPane().add(addressT);
        addressT.setBounds(80, 210, 480, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Country");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 260, 54, 30);

        jTextField5.setText("India");
        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(80, 260, 200, 30);

        jLabel7.setText("State");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 260, 66, 30);

        jLabel9.setText("Pin Code");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 310, 55, 30);

        jLabel8.setText("City");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 310, 39, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(400, 310, 200, 30);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(120, 410, 210, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 410, 58, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Manager ID");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(350, 410, 89, 30);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(470, 410, 180, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Company Mail");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 450, 90, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(120, 450, 300, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Department ID");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 490, 94, 30);

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField15);
        jTextField15.setBounds(120, 490, 210, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Desk ID");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 490, 68, 30);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(470, 490, 180, 30);

        jLabel19.setText("Confirm Password");
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(350, 540, 112, 30);
        getContentPane().add(jTextField17);
        jTextField17.setBounds(470, 540, 180, 30);

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16);
        jTextField16.setBounds(120, 540, 210, 30);

        jLabel16.setText("Password");
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 540, 56, 30);

        jButton1.setText("Submit");
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 590, 80, 30);

        jButton2.setText("Reset");
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 590, 80, 30);
        getContentPane().add(dob);
        dob.setBounds(110, 110, 170, 30);

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Pondicherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengall" }));
        stateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateCBActionPerformed(evt);
            }
        });
        getContentPane().add(stateCB);
        stateCB.setBounds(400, 260, 200, 30);

        cityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        cityCB.setEnabled(false);
        getContentPane().add(cityCB);
        cityCB.setBounds(80, 310, 200, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 255));
        jLabel20.setText("Company Details");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 360, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Address Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 150, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Personal Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 390, 310, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 40, 310, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 190, 310, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void stateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateCBActionPerformed
        cityCB.removeAllItems();
        cityCB.addItem("--Select--");
        
        int state=stateCB.getSelectedIndex();
        
        switch(state){
            case 0:
                cityCB.setEnabled(false);
                break;
            case 1: 
                for (String w :Cities.andhraPradesh)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 2:
                for (String w :Cities.arunachalPradesh)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 3:
                for (String w :Cities.assam)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 4:
                for (String w :Cities.bihar)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 5:
                for (String w :Cities.chandigarh)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 6:
                for (String w :Cities.chhattisgarh)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 7:
                for (String w :Cities.dadarNagar)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 8:
                for (String w :Cities.damanDiu)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 9:
                for (String w :Cities.delhi)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 10:
                for (String w :Cities.goa)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 11:
                for (String w :Cities.gujrat)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 12:
                for (String w :Cities.haryana)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 13:
                for (String w :Cities.himachalPradesh)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 14:
                for (String w :Cities.jammuKashmir)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 15:
                for (String w :Cities.jharkhand)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 16:
                for (String w :Cities.karnataka)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 17:
                for (String w :Cities.kerla)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 18:
                for (String w :Cities.madhyaPradesh)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 19:
                for (String w :Cities.maharashtra)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 20:
                for (String w :Cities.manipur)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 21:
                for (String w :Cities.meghalaya)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 22:
                for (String w :Cities.mizoram)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 23:
                for (String w :Cities.nagaland)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 24:
                for (String w :Cities.orissa)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 25:
                for (String w :Cities.pondicherry)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 26:
                for (String w :Cities.punjab)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 27:
                for (String w :Cities.rajasthan)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 28:
                for (String w :Cities.sikkim)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 29:
                for (String w :Cities.tamilNadu)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 30:
                for (String w :Cities.tripura)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 31:
                for (String w :Cities.uttarPradesh)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 32:
                for (String w :Cities.uttarakhand)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            case 33:
                for (String w :Cities.westBengal)
                    cityCB.addItem(w);
                cityCB.setEnabled(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_stateCBActionPerformed


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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEmployee dialog = new AddEmployee(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField addressT;
    private javax.swing.JComboBox<String> cityCB;
    private com.github.lgooddatepicker.components.DatePicker dob;
    private javax.swing.JTextField firstNameT;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField lastNameT;
    private javax.swing.JComboBox<String> stateCB;
    // End of variables declaration//GEN-END:variables
}
