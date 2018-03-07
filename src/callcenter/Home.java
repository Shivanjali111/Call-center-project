package callcenter;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
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
    int h,y,sy,dy,cy;    //Used in panel expanding and collapsing
    Timer reportsT;
    boolean show_reports_p=false;
    GetData gd=new GetData(this);
    
    public Home() {
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);
        ImageChange();
        empInfoT.setAutoResizeMode( empInfoT.AUTO_RESIZE_OFF );
        loggedL.setVisible(false);
        nameL.setVisible(false);
        msgL.setVisible(false);
        employeeB.setVisible(false);
        accountP.setVisible(false);
        accountL.setVisible(false);
        reportsP.setVisible(false);
        baseP.setLayout(c);
        baseP.add(homeP,"h");
        baseP.add(adminP,"a");
        baseP.add(employeeP,"emp");
        adminBaseP.setLayout(c);
        adminBaseP.add(employeeInfoP,"e");
        adminBaseP.add(customerP,"c");
        adminBaseP.add(settingsP,"s");
        adminBaseP.add(dictP, "d");
        employeeBaseP.setLayout(c);
        employeeBaseP.add(custEP,"cemp");
        employeeBaseP.add(dictEP,"demp");

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
    
    public void getSettings(){
        gd.getDepartment();
        gd.getCallType(0);
        gd.getCallCategory(0);
        gd.getError(0);
    }
    
    private void ExpandReportsP(){
        if(!reportsT.isRunning()){
            
            h=reportsP.getHeight();
            sy=settingsL.getY();
            dy=editDictL.getY();
            cy=customerDetailsL.getY();
            show_reports_p=true;
            reportsP.setVisible(true);

            reportsT = new Timer(10, new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                        h=h+10;
                        sy=sy+10;
                        dy=dy+10;
                        cy=cy+10;
                        reportsP.setBounds(0, reportsP.getY(),reportsP.getWidth(), h);
                        settingsL.setBounds(0, sy,settingsL.getWidth(), settingsL.getHeight());
                        editDictL.setBounds(0, dy,editDictL.getWidth(), editDictL.getHeight());
                        customerDetailsL.setBounds(0, cy,customerDetailsL.getWidth(), customerDetailsL.getHeight());
                        
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
            sy=settingsL.getY();
            dy=editDictL.getY();
            cy=customerDetailsL.getY();
            show_reports_p=false;

            reportsT = new Timer(10, new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                        h=h-10;
                        sy=sy-10;
                        dy=dy-10;
                        cy=cy-10;
                        reportsP.setBounds(0, reportsP.getY(),reportsP.getWidth(), h);
                        settingsL.setBounds(0, sy,settingsL.getWidth(), settingsL.getHeight());
                        editDictL.setBounds(0, dy,editDictL.getWidth(), editDictL.getHeight());
                        customerDetailsL.setBounds(0, cy,customerDetailsL.getWidth(), customerDetailsL.getHeight());
                        if(h<=1){
                            reportsP.setVisible(false);
                            //settingsL.setBounds(0, temp,settingsL.getWidth(), settingsL.getHeight());
                            reportsT.stop();
                        }
                    }
                });
            
            reportsT.start();
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
        dictP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dictT = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        wordT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        wordTypeCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        scoreT = new javax.swing.JTextField();
        wordSubmitB = new javax.swing.JButton();
        msgL = new javax.swing.JLabel();
        wordResetB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        wordIdT = new javax.swing.JTextField();
        settingsP = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        settingsT = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        settingsCB = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        customerP = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        customerT = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        menu2P = new javax.swing.JPanel();
        settingsL = new javax.swing.JLabel();
        reportsL = new javax.swing.JLabel();
        reportsP = new javax.swing.JPanel();
        outgoingRL = new javax.swing.JLabel();
        incomingRL = new javax.swing.JLabel();
        individualRL = new javax.swing.JLabel();
        overallRL = new javax.swing.JLabel();
        editDictL = new javax.swing.JLabel();
        customerDetailsL = new javax.swing.JLabel();
        employeeP = new javax.swing.JPanel();
        menuEP = new javax.swing.JPanel();
        custEL = new javax.swing.JLabel();
        reportsEL = new javax.swing.JLabel();
        dictEL = new javax.swing.JLabel();
        employeeBaseP = new javax.swing.JPanel();
        dictEP = new javax.swing.JPanel();
        custEP = new javax.swing.JPanel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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
                "UserID", "First Name", "Last Name", "DOB", "CompanyID", "Address", "City", "State", "Country", "Pin Code", "Email", "CompanyMailID", "Mobile", "DeskID", "DepartmentID", "Date of Join"
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
            empInfoT.getColumnModel().getColumn(0).setResizable(false);
            empInfoT.getColumnModel().getColumn(0).setPreferredWidth(100);
            empInfoT.getColumnModel().getColumn(1).setResizable(false);
            empInfoT.getColumnModel().getColumn(1).setPreferredWidth(150);
            empInfoT.getColumnModel().getColumn(2).setResizable(false);
            empInfoT.getColumnModel().getColumn(2).setPreferredWidth(150);
            empInfoT.getColumnModel().getColumn(3).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(3).setHeaderValue("DOB");
            empInfoT.getColumnModel().getColumn(4).setPreferredWidth(100);
            empInfoT.getColumnModel().getColumn(4).setHeaderValue("CompanyID");
            empInfoT.getColumnModel().getColumn(5).setResizable(false);
            empInfoT.getColumnModel().getColumn(5).setPreferredWidth(250);
            empInfoT.getColumnModel().getColumn(5).setHeaderValue("Address");
            empInfoT.getColumnModel().getColumn(6).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(6).setHeaderValue("City");
            empInfoT.getColumnModel().getColumn(7).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(7).setHeaderValue("State");
            empInfoT.getColumnModel().getColumn(8).setPreferredWidth(120);
            empInfoT.getColumnModel().getColumn(8).setHeaderValue("Country");
            empInfoT.getColumnModel().getColumn(9).setHeaderValue("Pin Code");
            empInfoT.getColumnModel().getColumn(10).setPreferredWidth(250);
            empInfoT.getColumnModel().getColumn(10).setHeaderValue("Email");
            empInfoT.getColumnModel().getColumn(11).setPreferredWidth(250);
            empInfoT.getColumnModel().getColumn(11).setHeaderValue("CompanyMailID");
            empInfoT.getColumnModel().getColumn(12).setResizable(false);
            empInfoT.getColumnModel().getColumn(12).setPreferredWidth(150);
            empInfoT.getColumnModel().getColumn(12).setHeaderValue("Mobile");
            empInfoT.getColumnModel().getColumn(13).setPreferredWidth(100);
            empInfoT.getColumnModel().getColumn(13).setHeaderValue("DeskID");
            empInfoT.getColumnModel().getColumn(14).setPreferredWidth(100);
            empInfoT.getColumnModel().getColumn(14).setHeaderValue("DepartmentID");
            empInfoT.getColumnModel().getColumn(15).setHeaderValue("Date of Join");
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

        dictP.setBackground(new java.awt.Color(255, 255, 255));
        dictP.setLayout(null);

        dictT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dictT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Word", "Category", "Score", "Date Added", "Date Modified", "Modified By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dictT);
        if (dictT.getColumnModel().getColumnCount() > 0) {
            dictT.getColumnModel().getColumn(0).setResizable(false);
            dictT.getColumnModel().getColumn(1).setResizable(false);
            dictT.getColumnModel().getColumn(2).setResizable(false);
            dictT.getColumnModel().getColumn(3).setResizable(false);
            dictT.getColumnModel().getColumn(4).setResizable(false);
            dictT.getColumnModel().getColumn(5).setResizable(false);
            dictT.getColumnModel().getColumn(6).setResizable(false);
        }

        dictP.add(jScrollPane1);
        jScrollPane1.setBounds(50, 20, 690, 320);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Word ID");
        dictP.add(jLabel5);
        jLabel5.setBounds(60, 360, 60, 30);

        wordT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                wordTFocusGained(evt);
            }
        });
        wordT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordTActionPerformed(evt);
            }
        });
        dictP.add(wordT);
        wordT.setBounds(130, 410, 140, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Select Type ");
        dictP.add(jLabel2);
        jLabel2.setBounds(300, 360, 80, 30);

        wordTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Positive", "Negative" }));
        dictP.add(wordTypeCB);
        wordTypeCB.setBounds(380, 360, 140, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Score");
        dictP.add(jLabel3);
        jLabel3.setBounds(300, 410, 50, 30);

        scoreT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                scoreTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                scoreTFocusLost(evt);
            }
        });
        scoreT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreTActionPerformed(evt);
            }
        });
        scoreT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scoreTKeyPressed(evt);
            }
        });
        dictP.add(scoreT);
        scoreT.setBounds(380, 410, 140, 30);

        wordSubmitB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        wordSubmitB.setText("Submit");
        wordSubmitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordSubmitBActionPerformed(evt);
            }
        });
        dictP.add(wordSubmitB);
        wordSubmitB.setBounds(180, 480, 120, 30);

        msgL.setForeground(new java.awt.Color(255, 0, 0));
        msgL.setText("Please enter all the feilds");
        dictP.add(msgL);
        msgL.setBounds(240, 450, 150, 20);

        wordResetB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        wordResetB.setText("Reset");
        wordResetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordResetBActionPerformed(evt);
            }
        });
        dictP.add(wordResetB);
        wordResetB.setBounds(340, 480, 120, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Add Word");
        dictP.add(jLabel6);
        jLabel6.setBounds(60, 410, 80, 30);

        wordIdT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                wordIdTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                wordIdTFocusLost(evt);
            }
        });
        wordIdT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordIdTActionPerformed(evt);
            }
        });
        wordIdT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wordIdTKeyPressed(evt);
            }
        });
        dictP.add(wordIdT);
        wordIdT.setBounds(130, 360, 140, 30);

        adminBaseP.add(dictP);
        dictP.setBounds(0, 0, 1070, 530);

        settingsP.setBackground(new java.awt.Color(255, 255, 255));
        settingsP.setLayout(null);

        settingsT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settingsT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ctegory", "Type", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        settingsT.setRowHeight(20);
        jScrollPane2.setViewportView(settingsT);
        if (settingsT.getColumnModel().getColumnCount() > 0) {
            settingsT.getColumnModel().getColumn(0).setResizable(false);
            settingsT.getColumnModel().getColumn(1).setResizable(false);
            settingsT.getColumnModel().getColumn(2).setResizable(false);
        }

        settingsP.add(jScrollPane2);
        jScrollPane2.setBounds(270, 190, 480, 180);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Filter");
        settingsP.add(jLabel4);
        jLabel4.setBounds(280, 130, 50, 30);

        settingsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Department", "Call Type", "Call Category", "Error" }));
        settingsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsCBActionPerformed(evt);
            }
        });
        settingsP.add(settingsCB);
        settingsCB.setBounds(340, 130, 120, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Add Type");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        settingsP.add(jButton2);
        jButton2.setBounds(600, 130, 100, 30);

        adminBaseP.add(settingsP);
        settingsP.setBounds(0, 0, 1070, 530);

        customerP.setBackground(new java.awt.Color(255, 255, 255));
        customerP.setLayout(null);

        jButton14.setText("Add Customer");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        customerP.add(jButton14);
        jButton14.setBounds(20, 20, 130, 30);

        customerT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "E-mail", "Mobile", "Product/Service", "Warranty Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerT.setGridColor(new java.awt.Color(0, 0, 0));
        customerT.setRowHeight(18);
        customerT.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(customerT);
        if (customerT.getColumnModel().getColumnCount() > 0) {
            customerT.getColumnModel().getColumn(0).setResizable(false);
            customerT.getColumnModel().getColumn(0).setPreferredWidth(100);
            customerT.getColumnModel().getColumn(1).setResizable(false);
            customerT.getColumnModel().getColumn(1).setPreferredWidth(150);
            customerT.getColumnModel().getColumn(2).setResizable(false);
            customerT.getColumnModel().getColumn(2).setPreferredWidth(150);
            customerT.getColumnModel().getColumn(3).setResizable(false);
            customerT.getColumnModel().getColumn(4).setResizable(false);
            customerT.getColumnModel().getColumn(5).setResizable(false);
            customerT.getColumnModel().getColumn(6).setResizable(false);
        }

        customerP.add(jScrollPane5);
        jScrollPane5.setBounds(20, 70, 1020, 400);

        jButton15.setText("Search");
        customerP.add(jButton15);
        jButton15.setBounds(720, 20, 80, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        customerP.add(jTextField3);
        jTextField3.setBounds(820, 20, 200, 30);

        jButton16.setText("Remove Customer");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        customerP.add(jButton16);
        jButton16.setBounds(10, 490, 150, 30);

        adminBaseP.add(customerP);
        customerP.setBounds(0, 0, 1070, 530);

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

        editDictL.setBackground(new java.awt.Color(0, 102, 255));
        editDictL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        editDictL.setForeground(new java.awt.Color(255, 255, 255));
        editDictL.setText("   Edit Dictionary");
        editDictL.setFocusCycleRoot(true);
        editDictL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editDictL.setOpaque(true);
        editDictL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editDictLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editDictLMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editDictLMousePressed(evt);
            }
        });
        menu2P.add(editDictL);
        editDictL.setBounds(0, 210, 170, 30);

        customerDetailsL.setBackground(new java.awt.Color(0, 102, 255));
        customerDetailsL.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        customerDetailsL.setForeground(new java.awt.Color(255, 255, 255));
        customerDetailsL.setText("   Customer Details");
        customerDetailsL.setFocusCycleRoot(true);
        customerDetailsL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customerDetailsL.setOpaque(true);
        customerDetailsL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerDetailsLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerDetailsLMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerDetailsLMousePressed(evt);
            }
        });
        menu2P.add(customerDetailsL);
        customerDetailsL.setBounds(0, 260, 170, 30);

        adminP.add(menu2P);
        menu2P.setBounds(0, 0, 170, 580);

        baseP.add(adminP);
        adminP.setBounds(0, 0, 1370, 580);

        employeeP.setBackground(new java.awt.Color(255, 255, 255));
        employeeP.setLayout(null);

        menuEP.setBackground(new java.awt.Color(102, 102, 102));
        menuEP.setLayout(null);

        custEL.setBackground(new java.awt.Color(0, 102, 255));
        custEL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        custEL.setForeground(new java.awt.Color(255, 255, 255));
        custEL.setText("Customer Details");
        custEL.setOpaque(true);
        menuEP.add(custEL);
        custEL.setBounds(0, 190, 200, 40);

        reportsEL.setBackground(new java.awt.Color(0, 102, 255));
        reportsEL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reportsEL.setForeground(new java.awt.Color(255, 255, 255));
        reportsEL.setText(" Reports");
        reportsEL.setOpaque(true);
        menuEP.add(reportsEL);
        reportsEL.setBounds(0, 50, 200, 40);

        dictEL.setBackground(new java.awt.Color(0, 102, 255));
        dictEL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dictEL.setForeground(new java.awt.Color(255, 255, 255));
        dictEL.setText("Dictionary");
        dictEL.setOpaque(true);
        dictEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dictELMouseClicked(evt);
            }
        });
        menuEP.add(dictEL);
        dictEL.setBounds(0, 120, 200, 40);

        employeeP.add(menuEP);
        menuEP.setBounds(0, 0, 200, 580);

        employeeBaseP.setLayout(null);

        dictEP.setLayout(null);
        employeeBaseP.add(dictEP);
        dictEP.setBounds(0, 0, 1160, 580);

        custEP.setLayout(null);
        employeeBaseP.add(custEP);
        custEP.setBounds(0, 0, 1160, 580);

        employeeP.add(employeeBaseP);
        employeeBaseP.setBounds(200, 0, 1160, 580);

        baseP.add(employeeP);
        employeeP.setBounds(0, 0, 1360, 580);

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
            c.show(adminBaseP, "e");
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
            c.show(adminBaseP, "e");
            gd.createConnection();
            gd.getEmployeeInfo();
            gd.getDictionary();
            gd.getCustomer();
            getSettings();
        }
        else if(dialog.flag==2){
            loggedIn=true;
            c.show(baseP,"emp");
            loggedL.setVisible(true);
            nameL.setVisible(true);
            nameL.setText("Employee");
            loginB.setVisible(true);
            accountL.setVisible(true);
            c.show(employeeBaseP, "emp");

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

        c.show(adminBaseP, "s");

    }//GEN-LAST:event_settingsLMousePressed

    private void menu2PMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2PMouseEntered
         //settingsP.setVisible(false);
    }//GEN-LAST:event_menu2PMouseEntered

    private void menu2PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2PMousePressed
        if(show_reports_p)
           CollapseReportsP();
    }//GEN-LAST:event_menu2PMousePressed

    private void adminPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPMousePressed
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
            String fn="<html><b>"+dialog.firstNameT.getText()+"</b></html>";
            String ln="<html><b>"+dialog.lastNameT.getText()+"</b></html>";
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
                JOptionPane.showMessageDialog(this,"Employee "+dialog.firstNameT.getText()+" "+dialog.lastNameT.getText()+
                        " Added Successfully !\nYour Company ID: "+dialog.cid,"",JOptionPane.PLAIN_MESSAGE);
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

    private void editDictLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDictLMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editDictLMouseEntered

    private void editDictLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDictLMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_editDictLMousePressed

    private void wordTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordTActionPerformed

    private void scoreTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreTActionPerformed

    private void wordSubmitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordSubmitBActionPerformed
         if("".equals(wordT.getText()) || "".equals(scoreT.getText()) || wordTypeCB.getSelectedIndex()==0 || "".equals(wordIdT.getText()))
            msgL.setVisible(true);
         else{
             String dateJoin= new SimpleDateFormat("yyyy-MM-dd").format(new Date());
             String q="insert into word_dictionary values("+wordIdT.getText()+",'"+wordT.getText()+"','"+wordTypeCB.getSelectedItem()+
                     "',"+scoreT.getText()+","+101+",'"+dateJoin+"','"+dateJoin+"','"+dateJoin+"')";
             
             Connection connection=gd.getConnection();
            
            try {
                Statement st=connection.createStatement();
                st.execute("alter session set NLS_DATE_FORMAT= \"YYYY-MM-DD\"");
                st.execute(q);
                st.execute("commit");
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            gd.getDictionary();
         }
    }//GEN-LAST:event_wordSubmitBActionPerformed

    private void editDictLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDictLMouseClicked
        c.show(adminBaseP, "d");
    }//GEN-LAST:event_editDictLMouseClicked

    private void scoreTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreTKeyPressed
        char a=evt.getKeyChar();
        System.out.println(a+"  "+evt.getKeyCode());
        if ((a >= '0' && a <= '9') || evt.getKeyCode()==8 || a=='+' || a=='-')
            scoreT.setEditable(true);
        else
            scoreT.setEditable(false);
    }//GEN-LAST:event_scoreTKeyPressed

    private void scoreTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scoreTFocusLost
        scoreT.setEditable(true);
    }//GEN-LAST:event_scoreTFocusLost

    private void customerDetailsLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_customerDetailsLMouseClicked

    private void customerDetailsLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsLMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_customerDetailsLMouseEntered

    private void customerDetailsLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsLMousePressed
        c.show(adminBaseP, "c");
    }//GEN-LAST:event_customerDetailsLMousePressed

    private void settingsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsCBActionPerformed
        int k=settingsCB.getSelectedIndex();
        switch(k){
            case 0: getSettings();
                    break;
            case 1: gd.getDepartment();
                    break;
            case 2: gd.getCallType(1);
                    break;
            case 3: gd.getCallCategory(1);
                    break;
            case 4: gd.getError(1);
                    break;
        }
    }//GEN-LAST:event_settingsCBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddSettings dialog= new AddSettings(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        
        if(dialog.added){
            String query=" ";
            int k=dialog.settingsCB.getSelectedIndex();
            
            switch(k){
                case 1: query="insert into department values("+dialog.idT.getText()+",'"+dialog.typeT.getText()+"')";
                        break;
                case 2: query="insert into call_type values("+dialog.idT.getText()+",'"+dialog.typeT.getText()+"')";
                        break;
                case 3: query="insert into category values("+dialog.idT.getText()+",'"+dialog.typeT.getText()+"')";
                        break;
                case 4: query="insert into error_type values("+dialog.idT.getText()+",'"+dialog.typeT.getText()+"')";
                        break;
            }
            
            Connection connection=gd.getConnection();
            
            try {
                Statement st=connection.createStatement();
                st.execute(query);
                st.execute("commit");
                JOptionPane.showMessageDialog(this,"Successfully Added!","",JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            getSettings();
            settingsCB.setSelectedItem("All");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void wordResetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordResetBActionPerformed
            wordT.setText("");
            scoreT.setText("");
            wordIdT.setText("");
            wordTypeCB.setSelectedIndex(0);
    }//GEN-LAST:event_wordResetBActionPerformed

    private void wordIdTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wordIdTFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_wordIdTFocusLost

    private void wordIdTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordIdTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordIdTActionPerformed

    private void wordIdTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordIdTKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordIdTKeyPressed

    private void wordIdTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wordIdTFocusGained
        msgL.setVisible(false);
    }//GEN-LAST:event_wordIdTFocusGained

    private void wordTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wordTFocusGained
        msgL.setVisible(false);
    }//GEN-LAST:event_wordTFocusGained

    private void scoreTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scoreTFocusGained
        msgL.setVisible(false);
    }//GEN-LAST:event_scoreTFocusGained

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       AddCustomer dialog=new AddCustomer(this, shown);
       dialog.setLocationRelativeTo(this);
       dialog.setVisible(true);
       
       if(dialog.added=true){
           String query="insert into customer values("+dialog.customerIdT.getText()+",'"+dialog.customerFN.getText()+"','"+
                   dialog.customerLNT.getText()+"','"+dialog.customerEmailT.getText()+"',"+dialog.customerMobT.getText()
                   +",'"+"','Yes','"+dialog.warrantyD.getDateStringOrEmptyString()+"')";
            Connection connection=gd.getConnection();
            
            try {
                Statement st=connection.createStatement();
                st.execute("alter session set NLS_DATE_FORMAT= \"YYYY-MM-DD\"");
                st.execute(query);
                st.execute("commit");
                JOptionPane.showMessageDialog(this,"Added Successfully","",JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            gd.getCustomer();
       }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        RemoveCustomer dialog= new RemoveCustomer(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void dictELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dictELMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dictELMouseClicked

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
    private javax.swing.JLabel custEL;
    private javax.swing.JPanel custEP;
    private javax.swing.JLabel customerDetailsL;
    private javax.swing.JPanel customerP;
    public javax.swing.JTable customerT;
    private javax.swing.JLabel dictEL;
    private javax.swing.JPanel dictEP;
    private javax.swing.JPanel dictP;
    public javax.swing.JTable dictT;
    private javax.swing.JLabel editDictL;
    public javax.swing.JTable empInfoT;
    private javax.swing.JButton employeeB;
    private javax.swing.JPanel employeeBaseP;
    private javax.swing.JPanel employeeInfoP;
    private javax.swing.JPanel employeeP;
    private javax.swing.JButton homeB;
    private javax.swing.JPanel homeP;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel imageL;
    private javax.swing.JLabel incomingRL;
    private javax.swing.JLabel individualRL;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel loggedL;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel logoutL;
    private javax.swing.JPanel menu2P;
    private javax.swing.JPanel menuBar;
    private javax.swing.JPanel menuEP;
    private javax.swing.JLabel msgL;
    private javax.swing.JLabel myAccL;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel outgoingRL;
    private javax.swing.JLabel overallRL;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel reportsEL;
    private javax.swing.JLabel reportsL;
    private javax.swing.JPanel reportsP;
    private javax.swing.JTextField scoreT;
    private javax.swing.JComboBox<String> settingsCB;
    private javax.swing.JLabel settingsL;
    private javax.swing.JPanel settingsP;
    public javax.swing.JTable settingsT;
    private javax.swing.JTextField wordIdT;
    private javax.swing.JButton wordResetB;
    private javax.swing.JButton wordSubmitB;
    private javax.swing.JTextField wordT;
    private javax.swing.JComboBox<String> wordTypeCB;
    // End of variables declaration//GEN-END:variables
}
