package callcenter;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import admin.settings.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home extends javax.swing.JFrame {

    CardLayout c = new CardLayout();
    boolean shown = true;
    boolean loggedIn=false;
    int userID;
    int h,y,temp;    //Used in panel expanding and collapsing
    Timer settingsT;
    Timer reportsT;
    boolean show_sett_p=false;
    boolean show_reports_p=false;
    GetData gd=new GetData(this);
    
    public Home() {
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);
        ImageChange();
        empInfoT.setAutoResizeMode( empInfoT.AUTO_RESIZE_OFF );
        loggedL.setVisible(false);
        nameL.setVisible(false);
        employeeB.setVisible(false);
        accountP.setVisible(false);
        accountL.setVisible(false);
        settingsP.setVisible(false);
        reportsP.setVisible(false);
        baseP.setLayout(c);
        baseP.add(homeP,"h");
        baseP.add(adminP,"a");
        adminBaseP.setLayout(c);
        adminBaseP.add(employeeInfoP,"e");
        settingsT=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        reportsT=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    public void ImageChange() {
        Timer timer = new Timer(3000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (shown) {
                    imageL.setIcon(new ImageIcon(getClass().getResource("/icons/1.jpg")));
                    shown = false;
                } else {
                    imageL.setIcon(new ImageIcon(getClass().getResource("/icons/2.jpg")));
                    shown = true;
                }
            }
        });

        timer.start();
    }
    
    private void ExpandReportsP(){
        if(!reportsT.isRunning()){
            if(show_sett_p)
                CollapseSettingsP();
            
            h=reportsP.getHeight();
            y=settingsL.getY();
            temp=y;
            show_reports_p=true;
            reportsP.setVisible(true);

            reportsT = new Timer(10, new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                        h=h+10;
                        y=y+10;
                        reportsP.setBounds(0, reportsP.getY(),reportsP.getWidth(), h);
                        settingsL.setBounds(0, y,settingsL.getWidth(), settingsL.getHeight());
                        if(h>=120){
                            reportsT.stop();
                        }
                    }
                });
            
            reportsT.start();
        }
    }
    
    private void CollapseReportsP(){
        if(!reportsT.isRunning()){
            
            h=reportsP.getHeight();
            y=settingsL.getY();
            show_reports_p=false;

            reportsT = new Timer(10, new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                        h=h-10;
                        y=y-10;
                        reportsP.setBounds(0, reportsP.getY(),reportsP.getWidth(), h);
                        settingsL.setBounds(0, y,settingsL.getWidth(), settingsL.getHeight());
                        if(h<=1){
                            reportsP.setVisible(false);
                            settingsL.setBounds(0, temp,settingsL.getWidth(), settingsL.getHeight());
                            reportsT.stop();
                        }
                    }
                });
            
            reportsT.start();
        }
    }
    
    private void ExpandSettingsP(){
        if(!settingsT.isRunning()){
            if(show_reports_p)
                CollapseReportsP();
            
            h=settingsP.getHeight();
            show_sett_p=true;
            settingsP.setVisible(true);

            settingsT = new Timer(10, new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                        h=h+10;
                        settingsP.setBounds(0, settingsP.getY(),settingsP.getWidth(), h);
                        if(h>=220){
                            settingsT.stop();
                        }
                    }
                });
            
            settingsT.start();
        }
    }

    private void CollapseSettingsP(){
        if(!settingsT.isRunning()){

            show_sett_p=false;
            h=settingsP.getHeight();
            
            settingsT = new Timer(10, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    h=h-10;
                    settingsP.setBounds(0, settingsP.getY(),settingsP.getWidth(), h);
                    if(h<=1){
                        settingsT.stop();
                        settingsP.setVisible(false);
                    }
                }
            });
            settingsT.start();
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        homeB = new javax.swing.JButton();
        aboutUsB = new javax.swing.JButton();
        loginB = new javax.swing.JButton();
        employeeB = new javax.swing.JButton();
        nameL = new javax.swing.JLabel();
        loggedL = new javax.swing.JLabel();
        accountL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        accountP = new javax.swing.JPanel();
        myAccL = new javax.swing.JLabel();
        logoutL = new javax.swing.JLabel();
        baseP = new javax.swing.JPanel();
        homeP = new javax.swing.JPanel();
        imageL = new javax.swing.JLabel();
        adminP = new javax.swing.JPanel();
        adminBaseP = new javax.swing.JPanel();
        employeeInfoP = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        empInfoT = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        menu2P = new javax.swing.JPanel();
        settingsL = new javax.swing.JLabel();
        settingsP = new javax.swing.JPanel();
        errorTypeL = new javax.swing.JLabel();
        complexityL = new javax.swing.JLabel();
        callCategoryL = new javax.swing.JLabel();
        callTypeL = new javax.swing.JLabel();
        callStatusL = new javax.swing.JLabel();
        deskL = new javax.swing.JLabel();
        departmentL = new javax.swing.JLabel();
        reportsL = new javax.swing.JLabel();
        reportsP = new javax.swing.JPanel();
        outgoingRL = new javax.swing.JLabel();
        incomingRL = new javax.swing.JLabel();
        individualRL = new javax.swing.JLabel();
        overallRL = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(8000, 8000));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(3000, 3000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 800));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(null);

        menuBar.setBackground(new java.awt.Color(102, 102, 102));
        menuBar.setLayout(null);

        homeB.setBackground(new java.awt.Color(102, 102, 255));
        homeB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        homeB.setForeground(new java.awt.Color(255, 255, 255));
        homeB.setText("Home");
        homeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBActionPerformed(evt);
            }
        });
        menuBar.add(homeB);
        homeB.setBounds(0, 0, 90, 40);

        aboutUsB.setBackground(new java.awt.Color(102, 102, 255));
        aboutUsB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aboutUsB.setForeground(new java.awt.Color(255, 255, 255));
        aboutUsB.setText("About Us");
        aboutUsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsBActionPerformed(evt);
            }
        });
        menuBar.add(aboutUsB);
        aboutUsB.setBounds(90, 0, 110, 40);

        loginB.setBackground(new java.awt.Color(102, 102, 255));
        loginB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginB.setForeground(new java.awt.Color(255, 255, 255));
        loginB.setText("Login");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        menuBar.add(loginB);
        loginB.setBounds(200, 0, 130, 40);

        employeeB.setBackground(new java.awt.Color(102, 102, 255));
        employeeB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        employeeB.setForeground(new java.awt.Color(255, 255, 255));
        employeeB.setText("Employee Info");
        employeeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBActionPerformed(evt);
            }
        });
        menuBar.add(employeeB);
        employeeB.setBounds(200, 0, 130, 40);

        nameL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nameL.setForeground(new java.awt.Color(255, 255, 255));
        menuBar.add(nameL);
        nameL.setBounds(1160, 0, 110, 40);

        loggedL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loggedL.setForeground(new java.awt.Color(255, 255, 255));
        loggedL.setText("Logged In As:");
        menuBar.add(loggedL);
        loggedL.setBounds(1060, 0, 90, 40);

        accountL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account.jpg"))); // NOI18N
        accountL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountLMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountLMousePressed(evt);
            }
        });
        menuBar.add(accountL);
        accountL.setBounds(1320, 0, 40, 40);

        jPanel1.add(menuBar);
        menuBar.setBounds(0, 90, 1370, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Call Center Performance Analysis");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 20, 560, 50);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo2.jpg"))); // NOI18N
        jPanel1.add(icon);
        icon.setBounds(0, 0, 100, 90);

        accountP.setBackground(new java.awt.Color(204, 204, 204));
        accountP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        accountP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountPMouseExited(evt);
            }
        });
        accountP.setLayout(null);

        myAccL.setBackground(new java.awt.Color(204, 204, 204));
        myAccL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        myAccL.setText("    My Account");
        myAccL.setOpaque(true);
        myAccL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myAccLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myAccLMouseExited(evt);
            }
        });
        accountP.add(myAccL);
        myAccL.setBounds(0, 0, 130, 30);

        logoutL.setBackground(new java.awt.Color(204, 204, 204));
        logoutL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutL.setText("    Logout");
        logoutL.setOpaque(true);
        logoutL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutLMousePressed(evt);
            }
        });
        accountP.add(logoutL);
        logoutL.setBounds(0, 30, 130, 30);

        jPanel1.add(accountP);
        accountP.setBounds(1250, 130, 120, 60);

        baseP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basePMouseEntered(evt);
            }
        });
        baseP.setLayout(null);

        homeP.setBackground(new java.awt.Color(255, 255, 255));
        homeP.setLayout(null);

        imageL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1.jpg"))); // NOI18N
        homeP.add(imageL);
        imageL.setBounds(0, 0, 1370, 320);

        baseP.add(homeP);
        homeP.setBounds(0, 0, 1360, 580);

        adminP.setBackground(new java.awt.Color(255, 255, 255));
        adminP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminP.setMaximumSize(new java.awt.Dimension(3000, 3000));
        adminP.setMinimumSize(new java.awt.Dimension(1280, 800));
        adminP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminPMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminPMousePressed(evt);
            }
        });
        adminP.setLayout(null);

        adminBaseP.setBackground(new java.awt.Color(204, 204, 204));
        adminBaseP.setLayout(null);

        employeeInfoP.setBackground(new java.awt.Color(255, 255, 255));
        employeeInfoP.setLayout(null);

        jButton13.setText("Add Employee");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        employeeInfoP.add(jButton13);
        jButton13.setBounds(20, 20, 130, 30);

        jButton12.setText("Search");
        employeeInfoP.add(jButton12);
        jButton12.setBounds(720, 20, 80, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        employeeInfoP.add(jTextField2);
        jTextField2.setBounds(820, 20, 200, 30);

        empInfoT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "First Name", "Last Name", "DOB", "CompanyID", "Address", "City", "State", "Country", "Pin Code", "Email", "CompanyMailID", "Mobile", "DeskID", "DepartmentID", "Date of Koin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empInfoT.setGridColor(new java.awt.Color(0, 0, 0));
        empInfoT.setRowHeight(18);
        empInfoT.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(empInfoT);
        if (empInfoT.getColumnModel().getColumnCount() > 0) {
            empInfoT.getColumnModel().getColumn(0).setPreferredWidth(100);
            empInfoT.getColumnModel().getColumn(1).setPreferredWidth(150);
            empInfoT.getColumnModel().getColumn(2).setPreferredWidth(150);
            empInfoT.getColumnModel().getColumn(3).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(4).setPreferredWidth(100);
            empInfoT.getColumnModel().getColumn(5).setResizable(false);
            empInfoT.getColumnModel().getColumn(5).setPreferredWidth(250);
            empInfoT.getColumnModel().getColumn(6).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(7).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(8).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(10).setPreferredWidth(250);
            empInfoT.getColumnModel().getColumn(11).setPreferredWidth(250);
            empInfoT.getColumnModel().getColumn(12).setPreferredWidth(150);
            empInfoT.getColumnModel().getColumn(13).setPreferredWidth(100);
            empInfoT.getColumnModel().getColumn(14).setPreferredWidth(100);
        }

        employeeInfoP.add(jScrollPane3);
        jScrollPane3.setBounds(20, 70, 1020, 400);

        jButton11.setText("Remove Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        employeeInfoP.add(jButton11);
        jButton11.setBounds(10, 490, 150, 30);

        adminBaseP.add(employeeInfoP);
        employeeInfoP.setBounds(0, 0, 1070, 530);

        adminP.add(adminBaseP);
        adminBaseP.setBounds(200, 20, 1070, 530);

        menu2P.setBackground(new java.awt.Color(102, 102, 102));
        menu2P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu2PMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu2PMousePressed(evt);
            }
        });
        menu2P.setLayout(null);

        settingsL.setBackground(new java.awt.Color(0, 102, 255));
        settingsL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        settingsL.setForeground(new java.awt.Color(255, 255, 255));
        settingsL.setText("   Settings");
        settingsL.setFocusCycleRoot(true);
        settingsL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settingsL.setOpaque(true);
        settingsL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsLMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settingsLMousePressed(evt);
            }
        });
        menu2P.add(settingsL);
        settingsL.setBounds(0, 160, 170, 30);

        settingsP.setBackground(new java.awt.Color(102, 102, 102));
        settingsP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        settingsP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsPMouseExited(evt);
            }
        });
        settingsP.setLayout(null);

        errorTypeL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        errorTypeL.setForeground(new java.awt.Color(255, 255, 255));
        errorTypeL.setText("   Error Types");
        errorTypeL.setFocusCycleRoot(true);
        errorTypeL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        errorTypeL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                errorTypeLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                errorTypeLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                errorTypeLMouseExited(evt);
            }
        });
        settingsP.add(errorTypeL);
        errorTypeL.setBounds(0, 180, 170, 30);

        complexityL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        complexityL.setForeground(new java.awt.Color(255, 255, 255));
        complexityL.setText("   Problem Complexity");
        complexityL.setFocusCycleRoot(true);
        complexityL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        complexityL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                complexityLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                complexityLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                complexityLMouseExited(evt);
            }
        });
        settingsP.add(complexityL);
        complexityL.setBounds(0, 150, 170, 30);

        callCategoryL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        callCategoryL.setForeground(new java.awt.Color(255, 255, 255));
        callCategoryL.setText("   Call Category");
        callCategoryL.setFocusCycleRoot(true);
        callCategoryL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        callCategoryL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                callCategoryLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                callCategoryLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                callCategoryLMouseExited(evt);
            }
        });
        settingsP.add(callCategoryL);
        callCategoryL.setBounds(0, 120, 170, 30);

        callTypeL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        callTypeL.setForeground(new java.awt.Color(255, 255, 255));
        callTypeL.setText("   Call Type");
        callTypeL.setFocusCycleRoot(true);
        callTypeL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        callTypeL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                callTypeLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                callTypeLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                callTypeLMouseExited(evt);
            }
        });
        settingsP.add(callTypeL);
        callTypeL.setBounds(0, 90, 170, 30);

        callStatusL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        callStatusL.setForeground(new java.awt.Color(255, 255, 255));
        callStatusL.setText("   Call Status");
        callStatusL.setFocusCycleRoot(true);
        callStatusL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        callStatusL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                callStatusLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                callStatusLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                callStatusLMouseExited(evt);
            }
        });
        settingsP.add(callStatusL);
        callStatusL.setBounds(0, 60, 170, 30);

        deskL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        deskL.setForeground(new java.awt.Color(255, 255, 255));
        deskL.setText("   Desk");
        deskL.setFocusCycleRoot(true);
        deskL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deskL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deskLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deskLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deskLMousePressed(evt);
            }
        });
        settingsP.add(deskL);
        deskL.setBounds(0, 30, 170, 30);

        departmentL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        departmentL.setForeground(new java.awt.Color(255, 255, 255));
        departmentL.setText("   Department");
        departmentL.setFocusCycleRoot(true);
        departmentL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        departmentL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                departmentLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                departmentLMouseExited(evt);
            }
        });
        settingsP.add(departmentL);
        departmentL.setBounds(0, 0, 170, 30);

        menu2P.add(settingsP);
        settingsP.setBounds(0, 190, 170, 1);

        reportsL.setBackground(new java.awt.Color(0, 102, 255));
        reportsL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        reportsL.setForeground(new java.awt.Color(255, 255, 255));
        reportsL.setText("   Reports");
        reportsL.setFocusCycleRoot(true);
        reportsL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reportsL.setOpaque(true);
        reportsL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsLMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportsLMousePressed(evt);
            }
        });
        menu2P.add(reportsL);
        reportsL.setBounds(0, 110, 170, 30);

        reportsP.setBackground(new java.awt.Color(102, 102, 102));
        reportsP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        reportsP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsPMouseExited(evt);
            }
        });
        reportsP.setLayout(null);

        outgoingRL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        outgoingRL.setForeground(new java.awt.Color(255, 255, 255));
        outgoingRL.setText("   Outgoing Calls");
        outgoingRL.setFocusCycleRoot(true);
        outgoingRL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        outgoingRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outgoingRLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outgoingRLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outgoingRLMouseExited(evt);
            }
        });
        reportsP.add(outgoingRL);
        outgoingRL.setBounds(0, 90, 170, 30);

        incomingRL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        incomingRL.setForeground(new java.awt.Color(255, 255, 255));
        incomingRL.setText("   Incoming Calls");
        incomingRL.setFocusCycleRoot(true);
        incomingRL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        incomingRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incomingRLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                incomingRLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                incomingRLMouseExited(evt);
            }
        });
        reportsP.add(incomingRL);
        incomingRL.setBounds(0, 60, 170, 30);

        individualRL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        individualRL.setForeground(new java.awt.Color(255, 255, 255));
        individualRL.setText("   Individual");
        individualRL.setFocusCycleRoot(true);
        individualRL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        individualRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                individualRLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                individualRLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                individualRLMousePressed(evt);
            }
        });
        reportsP.add(individualRL);
        individualRL.setBounds(0, 30, 170, 30);

        overallRL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        overallRL.setForeground(new java.awt.Color(255, 255, 255));
        overallRL.setText("   Overall Report");
        overallRL.setFocusCycleRoot(true);
        overallRL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        overallRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overallRLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                overallRLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                overallRLMouseExited(evt);
            }
        });
        reportsP.add(overallRL);
        overallRL.setBounds(0, 0, 170, 30);

        menu2P.add(reportsP);
        reportsP.setBounds(0, 140, 170, 1);

        adminP.add(menu2P);
        menu2P.setBounds(0, 0, 170, 580);

        baseP.add(adminP);
        adminP.setBounds(0, 0, 1370, 580);

        jPanel1.add(baseP);
        baseP.setBounds(0, 130, 1370, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBActionPerformed
        c.show(baseP, "h");
    }//GEN-LAST:event_homeBActionPerformed

    private void employeeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBActionPerformed
            c.show(baseP, "a");
    }//GEN-LAST:event_employeeBActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed

        LoginDialog dialog = new LoginDialog(this, true);
       dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        if(dialog.flag==1){
            loggedIn=true;
            c.show(baseP, "a");
            loggedL.setVisible(true);
            nameL.setVisible(true);
            nameL.setText("Manager");
            loginB.setVisible(false);
            accountL.setVisible(true);
            employeeB.setVisible(true);
            gd.createConnection();
            gd.getEmployeeInfo();
        }

    }//GEN-LAST:event_loginBActionPerformed


    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       accountP.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void aboutUsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutUsBActionPerformed

    private void logoutLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLMouseEntered
        logoutL.setBackground(new Color(0,102,204));
        logoutL.setForeground(Color.white);
    }//GEN-LAST:event_logoutLMouseEntered

    private void logoutLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLMouseExited
        logoutL.setBackground(new Color(204,204,204));
        logoutL.setForeground(Color.BLACK);
    }//GEN-LAST:event_logoutLMouseExited

    private void accountPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPMouseEntered
        accountP.setVisible(true);
    }//GEN-LAST:event_accountPMouseEntered

    private void accountPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPMouseExited
        accountP.setVisible(false);
    }//GEN-LAST:event_accountPMouseExited

    private void accountLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountLMouseEntered
        accountP.setVisible(true);
    }//GEN-LAST:event_accountLMouseEntered

    private void accountLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountLMousePressed
        accountP.setVisible(true);
    }//GEN-LAST:event_accountLMousePressed

    private void deskLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deskLMouseEntered
        deskL.setForeground(Color.cyan);
    }//GEN-LAST:event_deskLMouseEntered

    private void deskLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deskLMouseExited
        deskL.setForeground(Color.white);
    }//GEN-LAST:event_deskLMouseExited

    private void deskLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deskLMousePressed
        Desk dialog = new Desk(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_deskLMousePressed

    private void callStatusLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callStatusLMouseClicked
        CallStatus dialog = new CallStatus(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_callStatusLMouseClicked

    private void callStatusLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callStatusLMouseEntered
        callStatusL.setForeground(Color.cyan);
    }//GEN-LAST:event_callStatusLMouseEntered

    private void callStatusLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callStatusLMouseExited
        callStatusL.setForeground(Color.white);
    }//GEN-LAST:event_callStatusLMouseExited

    private void callTypeLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callTypeLMouseClicked
        CallType dialog = new CallType(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_callTypeLMouseClicked

    private void callTypeLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callTypeLMouseEntered
        callTypeL.setForeground(Color.cyan);
    }//GEN-LAST:event_callTypeLMouseEntered

    private void callTypeLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callTypeLMouseExited
        callTypeL.setForeground(Color.white);
    }//GEN-LAST:event_callTypeLMouseExited

    private void callCategoryLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callCategoryLMouseClicked
        CallCategory dialog = new CallCategory(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_callCategoryLMouseClicked

    private void callCategoryLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callCategoryLMouseEntered
        callCategoryL.setForeground(Color.cyan);
    }//GEN-LAST:event_callCategoryLMouseEntered

    private void callCategoryLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callCategoryLMouseExited
        callCategoryL.setForeground(Color.WHITE);
    }//GEN-LAST:event_callCategoryLMouseExited

    private void complexityLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complexityLMouseClicked
        Complexity dialog = new Complexity(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_complexityLMouseClicked

    private void complexityLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complexityLMouseEntered
        complexityL.setForeground(Color.cyan);
    }//GEN-LAST:event_complexityLMouseEntered

    private void complexityLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complexityLMouseExited
        complexityL.setForeground(Color.WHITE);
    }//GEN-LAST:event_complexityLMouseExited

    private void errorTypeLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_errorTypeLMouseClicked
        ErrorDialog dialog = new ErrorDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_errorTypeLMouseClicked

    private void errorTypeLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_errorTypeLMouseEntered
        errorTypeL.setForeground(Color.cyan);
    }//GEN-LAST:event_errorTypeLMouseEntered

    private void errorTypeLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_errorTypeLMouseExited
        errorTypeL.setForeground(Color.white);
    }//GEN-LAST:event_errorTypeLMouseExited

    private void adminPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPMouseEntered
        accountP.setVisible(false);
        //settingsP.setVisible(false);
    }//GEN-LAST:event_adminPMouseEntered

    private void basePMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basePMouseEntered

    }//GEN-LAST:event_basePMouseEntered

    private void myAccLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccLMouseExited
        myAccL.setBackground(new Color(204,204,204));
        myAccL.setForeground(Color.BLACK);
    }//GEN-LAST:event_myAccLMouseExited

    private void myAccLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccLMouseEntered
        myAccL.setBackground(new Color(0,102,204));
        myAccL.setForeground(Color.white);
    }//GEN-LAST:event_myAccLMouseEntered

    private void logoutLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLMousePressed
        accountP.setVisible(false);
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
             loggedIn=false;
            c.show(baseP, "h");
            loggedL.setVisible(false);
            nameL.setVisible(false);
            nameL.setText("");
            loginB.setVisible(true);
            accountL.setVisible(false);
        } 
    }//GEN-LAST:event_logoutLMousePressed

    private void settingsLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLMouseEntered
        //settingsP.setVisible(true);
        //setttingsL.setBackground(new Color(0,51,255));
    }//GEN-LAST:event_settingsLMouseEntered

    private void settingsLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLMousePressed
//        settingsP.setVisible(true);
//        int w=settingsP.getWidth();
//        h=settingsP.getHeight();
//        
//        int i=0;
//        while(h<220){
//            h=h+10;
//            settingsP.setBounds(0, 150, w, h);
//            try {
//                sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        if(show_sett_p)
            CollapseSettingsP();
        else
           ExpandSettingsP();
        

    }//GEN-LAST:event_settingsLMousePressed

    private void settingsPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPMouseEntered
        settingsP.setVisible(true);
    }//GEN-LAST:event_settingsPMouseEntered

    private void settingsPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsPMouseExited

    private void menu2PMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2PMouseEntered
         //settingsP.setVisible(false);
    }//GEN-LAST:event_menu2PMouseEntered

    private void menu2PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2PMousePressed
        if(show_sett_p)
            CollapseSettingsP();
        if(show_reports_p)
           CollapseReportsP();
    }//GEN-LAST:event_menu2PMousePressed

    private void adminPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPMousePressed
        if(show_sett_p)
            CollapseSettingsP();
        if(show_reports_p)
           CollapseReportsP();
    }//GEN-LAST:event_adminPMousePressed

    private void reportsLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsLMouseEntered

    private void reportsLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLMousePressed
        if(show_reports_p)
           CollapseReportsP();
        else
           ExpandReportsP();
    }//GEN-LAST:event_reportsLMousePressed

    private void outgoingRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outgoingRLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_outgoingRLMouseClicked

    private void outgoingRLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outgoingRLMouseEntered
        outgoingRL.setForeground(Color.cyan);
    }//GEN-LAST:event_outgoingRLMouseEntered

    private void outgoingRLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outgoingRLMouseExited
        outgoingRL.setForeground(Color.white);
    }//GEN-LAST:event_outgoingRLMouseExited

    private void incomingRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomingRLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_incomingRLMouseClicked

    private void incomingRLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomingRLMouseEntered
        incomingRL.setForeground(Color.cyan);
    }//GEN-LAST:event_incomingRLMouseEntered

    private void incomingRLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomingRLMouseExited
        incomingRL.setForeground(Color.white);
    }//GEN-LAST:event_incomingRLMouseExited

    private void individualRLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualRLMouseEntered
        individualRL.setForeground(Color.cyan);
    }//GEN-LAST:event_individualRLMouseEntered

    private void individualRLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualRLMouseExited
        individualRL.setForeground(Color.white);
    }//GEN-LAST:event_individualRLMouseExited

    private void individualRLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualRLMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_individualRLMousePressed

    private void overallRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overallRLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_overallRLMouseClicked

    private void overallRLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overallRLMouseEntered
        overallRL.setForeground(Color.cyan);
    }//GEN-LAST:event_overallRLMouseEntered

    private void overallRLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overallRLMouseExited
        overallRL.setForeground(Color.white);
    }//GEN-LAST:event_overallRLMouseExited

    private void reportsPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsPMouseEntered

    private void reportsPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsPMouseExited

    private void departmentLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentLMouseExited
        departmentL.setForeground(Color.white);
    }//GEN-LAST:event_departmentLMouseExited

    private void departmentLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentLMouseEntered
        departmentL.setForeground(Color.cyan);
    }//GEN-LAST:event_departmentLMouseEntered

    private void departmentLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentLMouseClicked
        Department dialog = new Department(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_departmentLMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        AddEmployee dialog= new AddEmployee(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        
        if(dialog.added==true){
            int eid=Integer.parseInt(dialog.userIDT.getText());
            int deptId=Integer.parseInt(dialog.deptIDT.getText());
            int deskId=Integer.parseInt(dialog.deskIDT.getText());
            long mobile=Long.parseLong(dialog.mobileT.getText());
            String city=(String) dialog.cityCB.getSelectedItem();
            String state=(String) dialog.stateCB.getSelectedItem();
            int pin=Integer.parseInt(dialog.pinCodeT.getText());
            String dateJoin= new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            //String d=dialog.dob.getDate();
//            java.util.Date myDate = new java.util.Date(dateJoin);
//            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
//            java.util.Date myDate2 = new java.util.Date(dialog.dob.getDateStringOrEmptyString());
//            java.sql.Date sqlDate2 = new java.sql.Date(myDate2.getTime());
            String query="insert into employee2 values("+eid+",'"+dialog.firstNameT.getText()+"','"+dialog.lastNameT.getText()+"','"+
                            dialog.dob.getDateStringOrEmptyString()+"',"+dialog.cid+",'"+dialog.addressT.getText()+"','"+city+"','"+
                             state+"','India',"+pin+",'"+dialog.emailT.getText()+"','"+dialog.compMailT.getText()+"',"+mobile+","+deskId+","+
                               deptId+",'"+dateJoin+"','',"+10+")";
            Connection connection=gd.getConnection();
            
            try {
                Statement st=connection.createStatement();
                st.execute("alter session set NLS_DATE_FORMAT= \"YYYY-MM-DD\"");
                st.execute(query);
                st.execute("commit");
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            gd.getEmployeeInfo();
            //System.out.println("Success");
        }
    }//GEN-LAST:event_jButton13ActionPerformed
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        RemoveEmployee dialog= new RemoveEmployee(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
            }
            }
            } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
//         try {   
//            javax.swing.UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUsB;
    private javax.swing.JLabel accountL;
    private javax.swing.JPanel accountP;
    private javax.swing.JPanel adminBaseP;
    private javax.swing.JPanel adminP;
    private javax.swing.JPanel baseP;
    private javax.swing.JLabel callCategoryL;
    private javax.swing.JLabel callStatusL;
    private javax.swing.JLabel callTypeL;
    private javax.swing.JLabel complexityL;
    private javax.swing.JLabel departmentL;
    private javax.swing.JLabel deskL;
    public javax.swing.JTable empInfoT;
    private javax.swing.JButton employeeB;
    private javax.swing.JPanel employeeInfoP;
    private javax.swing.JLabel errorTypeL;
    private javax.swing.JButton homeB;
    private javax.swing.JPanel homeP;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel imageL;
    private javax.swing.JLabel incomingRL;
    private javax.swing.JLabel individualRL;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel loggedL;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel logoutL;
    private javax.swing.JPanel menu2P;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel myAccL;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel outgoingRL;
    private javax.swing.JLabel overallRL;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel reportsL;
    private javax.swing.JPanel reportsP;
    private javax.swing.JLabel settingsL;
    private javax.swing.JPanel settingsP;
    // End of variables declaration//GEN-END:variables
}
