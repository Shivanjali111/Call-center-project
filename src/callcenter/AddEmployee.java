package callcenter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class AddEmployee extends javax.swing.JDialog {
    
    int cid;
    boolean added=false;

    public AddEmployee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mobileMsgL.setVisible(false);
        emailMsgL.setVisible(false);
        pinMsgL.setVisible(false);
        cemailMsgL.setVisible(false);
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
        pinCodeT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        userIDT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        compMailT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        deptIDT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        deskIDT = new javax.swing.JTextField();
        submitB = new javax.swing.JButton();
        resetB = new javax.swing.JButton();
        dob = new com.github.lgooddatepicker.components.DatePicker();
        stateCB = new javax.swing.JComboBox<>();
        cityCB = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        mobileT = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        emailT = new javax.swing.JTextField();
        mobileMsgL = new javax.swing.JLabel();
        emailMsgL = new javax.swing.JLabel();
        pinMsgL = new javax.swing.JLabel();
        cemailMsgL = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(681, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setText("First Name");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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

        jLabel17.setText("Address");
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 250, 90, 30);

        addressT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTActionPerformed(evt);
            }
        });
        getContentPane().add(addressT);
        addressT.setBounds(80, 250, 480, 30);

        jLabel13.setText("Country");
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 300, 54, 30);

        jTextField5.setEditable(false);
        jTextField5.setText("India");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(80, 300, 200, 30);

        jLabel7.setText("State");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 300, 66, 30);

        jLabel9.setText("Pin Code");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 350, 55, 30);

        jLabel8.setText("City");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 350, 39, 30);

        pinCodeT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pinCodeTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pinCodeTFocusLost(evt);
            }
        });
        pinCodeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinCodeTActionPerformed(evt);
            }
        });
        pinCodeT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinCodeTKeyPressed(evt);
            }
        });
        getContentPane().add(pinCodeT);
        pinCodeT.setBounds(400, 350, 200, 30);

        jLabel18.setText("User ID");
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(380, 450, 60, 30);

        userIDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userIDTKeyPressed(evt);
            }
        });
        getContentPane().add(userIDT);
        userIDT.setBounds(470, 450, 180, 30);

        jLabel11.setText("Company Mail");
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 450, 90, 30);

        compMailT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                compMailTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                compMailTFocusLost(evt);
            }
        });
        compMailT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                compMailTKeyPressed(evt);
            }
        });
        getContentPane().add(compMailT);
        compMailT.setBounds(120, 450, 210, 30);

        jLabel15.setText("Department ID");
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 500, 94, 30);

        deptIDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptIDTActionPerformed(evt);
            }
        });
        deptIDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deptIDTKeyPressed(evt);
            }
        });
        getContentPane().add(deptIDT);
        deptIDT.setBounds(120, 500, 210, 30);

        jLabel14.setText("Desk ID");
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(380, 500, 68, 30);

        deskIDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deskIDTKeyPressed(evt);
            }
        });
        getContentPane().add(deskIDT);
        deskIDT.setBounds(470, 500, 180, 30);

        submitB.setText("Submit");
        submitB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });
        getContentPane().add(submitB);
        submitB.setBounds(230, 550, 80, 30);

        resetB.setText("Reset");
        resetB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBActionPerformed(evt);
            }
        });
        getContentPane().add(resetB);
        resetB.setBounds(340, 550, 80, 30);
        getContentPane().add(dob);
        dob.setBounds(110, 110, 170, 30);

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Pondicherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengall" }));
        stateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateCBActionPerformed(evt);
            }
        });
        getContentPane().add(stateCB);
        stateCB.setBounds(400, 300, 200, 30);

        cityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        cityCB.setEnabled(false);
        getContentPane().add(cityCB);
        cityCB.setBounds(80, 350, 200, 30);

        jLabel20.setText("Company Details");
        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 400, 150, 30);

        jLabel3.setText("Address Details");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 150, 30);

        jLabel1.setText("Personal Details");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(-10, 430, 330, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 40, 320, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 230, 320, 10);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Mobile No");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 160, 90, 30);

        mobileT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobileTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileTFocusLost(evt);
            }
        });
        mobileT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileTKeyPressed(evt);
            }
        });
        getContentPane().add(mobileT);
        mobileT.setBounds(110, 160, 172, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("E-Mail");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(310, 160, 76, 30);

        emailT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTFocusLost(evt);
            }
        });
        emailT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTKeyPressed(evt);
            }
        });
        getContentPane().add(emailT);
        emailT.setBounds(410, 160, 246, 30);

        mobileMsgL.setForeground(new java.awt.Color(255, 0, 0));
        mobileMsgL.setText("Enter a valid number");
        getContentPane().add(mobileMsgL);
        mobileMsgL.setBounds(130, 190, 140, 14);

        emailMsgL.setText("Please enter a valid email ID");
        emailMsgL.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(emailMsgL);
        emailMsgL.setBounds(430, 190, 210, 14);

        pinMsgL.setText("Enter a valid pincode");
        pinMsgL.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pinMsgL);
        pinMsgL.setBounds(420, 380, 140, 14);

        cemailMsgL.setForeground(new java.awt.Color(255, 0, 0));
        cemailMsgL.setText("Please enter a valid email ID");
        getContentPane().add(cemailMsgL);
        cemailMsgL.setBounds(130, 480, 210, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTActionPerformed

    private void pinCodeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinCodeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinCodeTActionPerformed

    private void deptIDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptIDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptIDTActionPerformed

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

    private void mobileTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileTKeyPressed
        char a=evt.getKeyChar();
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8)
            mobileT.setEditable(true);
        else
            mobileT.setEditable(false);
//            int key = evt.getKeyCode();
//
//            if((key>=96 && key<=105)||key==8)
//                 mobileT.setEditable(true);
//            else
//                mobileT.setEditable(false);
    }//GEN-LAST:event_mobileTKeyPressed

    private void mobileTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileTFocusLost
        Pattern reg = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = reg.matcher(mobileT.getText());
        if (!matcher.matches())
            mobileMsgL.setVisible(true);
    }//GEN-LAST:event_mobileTFocusLost

    private void mobileTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileTFocusGained
        mobileMsgL.setVisible(false);
    }//GEN-LAST:event_mobileTFocusGained

    private void emailTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTFocusLost
        Pattern reg=Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher matcher=reg.matcher(emailT.getText());
        if(!matcher.matches())
            emailMsgL.setVisible(true);
    }//GEN-LAST:event_emailTFocusLost

    private void emailTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTFocusGained
        emailMsgL.setVisible(false);
    }//GEN-LAST:event_emailTFocusGained

    private void emailTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTKeyPressed
        emailT.setText(emailT.getText().toLowerCase());
    }//GEN-LAST:event_emailTKeyPressed

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        if(firstNameT.getText()==""||lastNameT.getText()==""||dob.getDate()==null||genderCB.getSelectedIndex()==0||
                mobileT.getText()==""||emailT.getText()==""||addressT.getText()==""||stateCB.getSelectedIndex()==0||cityCB.getSelectedIndex()==0
                ||pinCodeT.getText()==""||compMailT.getText()==""||userIDT.getText()==""||deptIDT.getText()==""||deskIDT.getText()==""){
            JOptionPane.showMessageDialog(this,"Please enter all the feilds","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            added=true;
            cid=(int)(Math.random()*9000)+1000;
            dispose();
        }

    }//GEN-LAST:event_submitBActionPerformed

    private void resetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBActionPerformed
        firstNameT.setText("");  
        lastNameT.setText("");
        dob.setDate(null);
        genderCB.setSelectedIndex(0);
        mobileT.setText("");
        emailT.setText("");
        addressT.setText("");
        stateCB.setSelectedIndex(0);
        cityCB.setSelectedIndex(0);
        pinCodeT.setText("");
        compMailT.setText("");
        userIDT.setText("");
        deptIDT.setText("");
        deskIDT.setText("");
    }//GEN-LAST:event_resetBActionPerformed

    private void pinCodeTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinCodeTFocusLost
        Pattern reg = Pattern.compile("^[0-9]{6}$");
        Matcher matcher = reg.matcher(pinCodeT.getText());
        if (!matcher.matches())
            pinMsgL.setVisible(true);
    }//GEN-LAST:event_pinCodeTFocusLost

    private void pinCodeTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinCodeTFocusGained
        pinMsgL.setVisible(false);
    }//GEN-LAST:event_pinCodeTFocusGained

    private void pinCodeTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinCodeTKeyPressed
        char a=evt.getKeyChar();
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8)
            mobileT.setEditable(true);
        else
            mobileT.setEditable(false);
    }//GEN-LAST:event_pinCodeTKeyPressed

    private void userIDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userIDTKeyPressed
        char a=evt.getKeyChar();
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8)
            mobileT.setEditable(true);
        else
            mobileT.setEditable(false);
    }//GEN-LAST:event_userIDTKeyPressed

    private void deptIDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deptIDTKeyPressed
        char a=evt.getKeyChar();
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8)
            mobileT.setEditable(true);
        else
            mobileT.setEditable(false);
    }//GEN-LAST:event_deptIDTKeyPressed

    private void deskIDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deskIDTKeyPressed
        char a=evt.getKeyChar();
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8)
            mobileT.setEditable(true);
        else
            mobileT.setEditable(false);
    }//GEN-LAST:event_deskIDTKeyPressed

    private void compMailTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compMailTKeyPressed
        compMailT.setText(compMailT.getText().toLowerCase());
    }//GEN-LAST:event_compMailTKeyPressed

    private void compMailTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_compMailTFocusGained
        cemailMsgL.setVisible(false);
    }//GEN-LAST:event_compMailTFocusGained

    private void compMailTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_compMailTFocusLost
        Pattern reg=Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher matcher=reg.matcher(compMailT.getText());
        if(!matcher.matches())
            cemailMsgL.setVisible(true);
    }//GEN-LAST:event_compMailTFocusLost


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
    public javax.swing.JTextField addressT;
    private javax.swing.JLabel cemailMsgL;
    public javax.swing.JComboBox<String> cityCB;
    public javax.swing.JTextField compMailT;
    public javax.swing.JTextField deptIDT;
    public javax.swing.JTextField deskIDT;
    public com.github.lgooddatepicker.components.DatePicker dob;
    private javax.swing.JLabel emailMsgL;
    public javax.swing.JTextField emailT;
    public javax.swing.JTextField firstNameT;
    public javax.swing.JComboBox<String> genderCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTextField lastNameT;
    private javax.swing.JLabel mobileMsgL;
    public javax.swing.JTextField mobileT;
    public javax.swing.JTextField pinCodeT;
    private javax.swing.JLabel pinMsgL;
    private javax.swing.JButton resetB;
    public javax.swing.JComboBox<String> stateCB;
    private javax.swing.JButton submitB;
    public javax.swing.JTextField userIDT;
    // End of variables declaration//GEN-END:variables
}
