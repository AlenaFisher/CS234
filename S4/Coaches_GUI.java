/**
 * @author  Alena Fisher
 * 5/7/2024
 */

// Importing all necessary classes
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Coaches_GUI extends javax.swing.JFrame {
    /**
     * This is the main entry point of this class file
     * This file allows for the creation, updating, display, and removal of coaches at the sports club
     */
    
    // Delcaring varibles
    static String fileLocation = "coaches.dat";
    private CoachDirectory directory;

    public Coaches_GUI() {
        /**
         * This constructor initializes all components for the file and the directory for the coaches at the club
         */
        initComponents();
        directory = new CoachDirectory();
        
        Coach cronin = new Coach("Greg Cronin", "Head Coach - Anaheim Ducks", "Athletics", "100", "(714) 672-9834", "Greg.Cronin@nhl.com");
        directory.addCoach(cronin);

        Coach RBA = new Coach("Rod Brind'Amour", "Head Coach - Carolina Hurricanes", "Athetics", "102", "(919) 763-1470", "Rod.BrindAmour@nhl.com");
        directory.addCoach(RBA);

        Coach tortorella = new Coach("John Tortorella", "Head Coach - Philadelphia Flyers", "Althetics", "104", "(215) 876-3004", "John.Tortorella@nhl.com");
        directory.addCoach(tortorella);

        Coach sullivan = new Coach("Mike Sullivan", "Head Coach - Pittsburgh Penguins", "Athletics", "106", "(412) 979-3482", "Mike.Sullivan@nhl.com");
        directory.addCoach(sullivan);

        Coach quinn = new Coach("David Quinn", "Head Coach - San Jose Sharks", "Athletics", "108", "(408) 213-9064", "David.Quinn@nhl.com");
        directory.addCoach(quinn);

        Coach hakstol = new Coach("Dave Hakstol", "Head Coach - Seattle Kraken", "Athletics", "110", "(206) 866-7743", "Dave.Hakstol@nhl.com");
        directory.addCoach(hakstol);
    }

    public Coaches_GUI(Club aClub) {
        /**
         * This constructor receives 'aClub' as an explicit parameter and creates an object for the window to be opened
         */
        this();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddCoach = new javax.swing.JButton();
        btnClearFields = new javax.swing.JButton();
        txtCoachEmail = new javax.swing.JTextField();
        txtCoachNumber = new javax.swing.JTextField();
        txtCoachOffice = new javax.swing.JTextField();
        txtCoachDepartment = new javax.swing.JTextField();
        txtCoachTitle = new javax.swing.JTextField();
        txtCoachName = new javax.swing.JTextField();
        lblCoachEmail = new javax.swing.JLabel();
        lblCoachNumber = new javax.swing.JLabel();
        lblCoachOffice = new javax.swing.JLabel();
        lblCoachDepartment = new javax.swing.JLabel();
        lblCoachTitle = new javax.swing.JLabel();
        lblCoachName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCoachDirectory = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCoachSearch = new javax.swing.JTextField();
        btnCoachSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        lblNewCoachTitle = new javax.swing.JLabel();
        lblNewCoachNumber = new javax.swing.JLabel();
        lblNewCoachDepartment = new javax.swing.JLabel();
        lblNewCoachOffice = new javax.swing.JLabel();
        txtNewCoachName = new javax.swing.JTextField();
        txtNewCoachDepartment = new javax.swing.JTextField();
        txtNewCoachOffice = new javax.swing.JTextField();
        txtNewCoachNumber = new javax.swing.JTextField();
        txtNewCoachEmail = new javax.swing.JTextField();
        txtNewCoachTitle = new javax.swing.JTextField();
        btnUpdateCoach = new javax.swing.JButton();
        lblNewCoachEmail = new javax.swing.JLabel();
        lblNewCoachName = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRemoveCoaches = new javax.swing.JTable();
        txtCoachRemove = new javax.swing.JTextField();
        btnRemoveCoach = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setTitle("Coaches");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setOpaque(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddCoach.setText("Add Coach");
        btnAddCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCoachActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        btnClearFields.setText("Clear Fields");
        btnClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFieldsActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));
        jPanel1.add(txtCoachEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, -1));
        jPanel1.add(txtCoachNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, -1));
        jPanel1.add(txtCoachOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, -1));
        jPanel1.add(txtCoachDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, -1));
        jPanel1.add(txtCoachTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));
        jPanel1.add(txtCoachName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, -1));

        lblCoachEmail.setText("Enter coach's email:");
        jPanel1.add(lblCoachEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblCoachNumber.setText("Enter phone number (no spaces):");
        jPanel1.add(lblCoachNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblCoachOffice.setText("Enter coach's office location:");
        jPanel1.add(lblCoachOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblCoachDepartment.setText("Enter coach's department:");
        jPanel1.add(lblCoachDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblCoachTitle.setText("Enter coach's title:");
        jPanel1.add(lblCoachTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lblCoachName.setText("Enter coach's name:");
        jPanel1.add(lblCoachName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 330));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        jTabbedPane1.addTab("Add Coach", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCoachDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Title", "Department", "Office", "Phone #", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCoachDirectory);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 370));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        jTabbedPane1.addTab("Display Coach", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Enter coach to search:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel3.add(txtCoachSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        btnCoachSearch.setText("Search");
        btnCoachSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoachSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnCoachSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 120));

        lblNewCoachTitle.setText("Enter new coach title:");
        jPanel3.add(lblNewCoachTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        lblNewCoachNumber.setText("Enter new phone number:");
        jPanel3.add(lblNewCoachNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        lblNewCoachDepartment.setText("Enter new coach department:");
        jPanel3.add(lblNewCoachDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        lblNewCoachOffice.setText("Enter new coach office:");
        jPanel3.add(lblNewCoachOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));
        jPanel3.add(txtNewCoachName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 130, -1));
        jPanel3.add(txtNewCoachDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 130, -1));
        jPanel3.add(txtNewCoachOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 130, -1));
        jPanel3.add(txtNewCoachNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, -1));
        jPanel3.add(txtNewCoachEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 130, -1));
        jPanel3.add(txtNewCoachTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 130, -1));

        btnUpdateCoach.setText("Update");
        btnUpdateCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCoachActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdateCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        lblNewCoachEmail.setText("Enter new coach email:");
        jPanel3.add(lblNewCoachEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        lblNewCoachName.setText("Enter new coach name:");
        jPanel3.add(lblNewCoachName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jPanel3.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 270, 330));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));
        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Modify Coach", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRemoveCoaches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Title", "Department", "Office", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblRemoveCoaches);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 10, 410, 380));
        jPanel5.add(txtCoachRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, -1));

        btnRemoveCoach.setText("Remove");
        btnRemoveCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCoachActionPerformed(evt);
            }
        });
        jPanel5.add(btnRemoveCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setText("Enter coach name to remove:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jPanel5.add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));
        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTabbedPane1.addTab("Remove Coach", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 600, 430));

        setSize(new java.awt.Dimension(621, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCoachActionPerformed
        /**
         * This method collects the information from the user and creates a profile for a coach that is stored
         * in the coach directory
         */
        
        // Gathering the input from the user entered into the text fields
        String name = txtCoachName.getText();
        String title = txtCoachTitle.getText();
        String department = txtCoachDepartment.getText();
        String office = txtCoachOffice.getText();
        String phoneNumber = txtCoachNumber.getText();
        String email = txtCoachEmail.getText();
        
        // Creating the coach profile and adding it into the coach directory
        Coach coach = new Coach(name, title, department, office, phoneNumber, email);
        directory.addCoach(coach);
        
        // Testing if any of the text fields are left empty by the user
        if(txtCoachName.getText().isEmpty() || txtCoachTitle.getText().isEmpty() || txtCoachDepartment.getText().isEmpty() || txtCoachOffice.getText().isEmpty() || txtCoachNumber.getText().isEmpty() || txtCoachEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter all fields");
            }
       
            // If all the fields are filled out, the information is gathered and placed into a row in the tables
            else {
                String[] row = {txtCoachName.getText(), txtCoachTitle.getText(), txtCoachDepartment.getText(), txtCoachOffice.getText(), txtCoachNumber.getText(), txtCoachEmail.getText()};
                // Table to display all coach information 
                DefaultTableModel model = (DefaultTableModel)tblCoachDirectory.getModel();
                // Table to display all coaches for the purpose of removal
                DefaultTableModel table = (DefaultTableModel)tblRemoveCoaches.getModel();
                // Information is added to both tables
                model.addRow(row);
                table.addRow(row);
            
                // Message to the user after the coach is added successfully
                JOptionPane.showMessageDialog(this, "Coach added");
            }  
    }//GEN-LAST:event_btnAddCoachActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Table to display the appointments
        DefaultTableModel model = (DefaultTableModel)tblCoachDirectory.getModel();
        // Array list to store the information from the table
        ArrayList<String> tableData = new ArrayList<>();

        // For loop to gather the information from the table row by row and store it in the array list
        for(int i = 0; i < model.getRowCount(); i++) {
            String name = model.getValueAt(i, 0).toString();
            String title = model.getValueAt(i, 1).toString();
            String department = model.getValueAt(i, 2).toString();
            String office = model.getValueAt(i, 3).toString();
            String phone = model.getValueAt(i, 4).toString();
            String email = model.getValueAt(i, 5).toString();
            
            // Data is compiled and added to the array list
            String row = name + "," + title + "," + department + "," + office + "," + phone + "," + email;
            tableData.add(row);
            
            // try-catch to attempt storing the information in the dat file
            try {
                // Opening the file
                FileOutputStream file = new FileOutputStream("coaches.dat");
                ObjectOutputStream output = new ObjectOutputStream(file);
                
                // Storing the information in the file
                output.writeObject(tableData);
                
                // Closing the files
                output.close();
                file.close();
            }
            // If storing the information is unsuccessful, it catches the error
            catch(Exception e) {
                e.printStackTrace();
            }
        }      
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /**
         * When the window is first opened, the labels and text fields used for gathering information for updating a coach's information are not visible to the user
         * They are only made visible if the user searches for an coach and they is found in the system
         */
        lblNewCoachName.setVisible(false);
        lblNewCoachTitle.setVisible(false);
        lblNewCoachDepartment.setVisible(false);
        lblNewCoachOffice.setVisible(false);
        lblNewCoachNumber.setVisible(false);
        lblNewCoachEmail.setVisible(false);
        
        txtNewCoachName.setVisible(false);
        txtNewCoachTitle.setVisible(false);
        txtNewCoachDepartment.setVisible(false);
        txtNewCoachOffice.setVisible(false);
        txtNewCoachNumber.setVisible(false);
        txtNewCoachEmail.setVisible(false); 
        
        // try-catch to place the information stored in the file into the tables
        try {     
            // Opening the file
            FileInputStream file = new FileInputStream("coaches.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            // Adding the information to the array list
            ArrayList<String> tableData = (ArrayList<String>)input.readObject();
        
            // Closing the files
            input.close();
            file.close();
        
            // Table for displaying coach information
            DefaultTableModel model = (DefaultTableModel)tblCoachDirectory.getModel();
            // Table for displaying coach information for the purpose of removal
            DefaultTableModel table = (DefaultTableModel)tblRemoveCoaches.getModel();
            
            // Adding the information to the first table
            for(int i = 0; i < tableData.size(); i++) {
                String[] row = tableData.get(i).split(",");
                model.addRow(row);
            }
            
            // Adding the information to the second table
            for(int i = 0; i < tableData.size(); i++) {
                String[] row = tableData.get(i).split(",");
                table.addRow(row);
            }
        }
        // If placing the information is unsuccessful, it catches the error
        catch(Exception e) {
            e.printStackTrace();
        }      
        
    }//GEN-LAST:event_formWindowOpened

    private void btnCoachSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoachSearchActionPerformed
        /**
         * This method receives a name from the user to be searched in the system
         * If found, the text fields and labels are made visible for gathering the updated information
         */
        // Name received from the user
        String coach = txtCoachSearch.getText();
        // Uses the method 'coachExists' to find if the coach exists in the system
        boolean found = directory.coachExists(coach);
        
        // If found, all labels and text fields are made visible to the user 
        if(found) {
            lblNewCoachName.setVisible(true);
            lblNewCoachTitle.setVisible(true);
            lblNewCoachDepartment.setVisible(true);
            lblNewCoachOffice.setVisible(true);
            lblNewCoachNumber.setVisible(true);
            lblNewCoachEmail.setVisible(true);
        
            txtNewCoachName.setVisible(true);
            txtNewCoachTitle.setVisible(true);
            txtNewCoachDepartment.setVisible(true);
            txtNewCoachOffice.setVisible(true);
            txtNewCoachNumber.setVisible(true);
            txtNewCoachEmail.setVisible(true); 
        }
        
        // If the coach is not found, a message is printed to the user
        else {
            JOptionPane.showMessageDialog(this, "Coach not found");
        } 
    }//GEN-LAST:event_btnCoachSearchActionPerformed

    private void btnUpdateCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCoachActionPerformed
        /**
         * This method receives the coach's name, updated title, department, office, phone number, and email address and updates it in the directory
         */
        
        // Gathering updated information from the user
        String newName = txtNewCoachName.getText();
        String newTitle = txtNewCoachTitle.getText();
        String newDepartment = txtNewCoachDepartment.getText();
        String newOffice = txtNewCoachOffice.getText();
        String newNumber = txtNewCoachNumber.getText();
        String newEmail = txtNewCoachEmail.getText();
        
        // If any of the text fields are left empty by the user, a message is printed
        if (newName.isEmpty() || newTitle.isEmpty() || newDepartment.isEmpty() || newOffice.isEmpty() || newNumber.isEmpty() || newEmail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all fields");
        } 
        
        // If all text fields are filled out by the user:
        else {
            // Updating the coach information in the directory
            directory.updateCoachInfo(newName, newTitle, newDepartment, newOffice, newNumber, newEmail);
            // Updating corresponding row in the table
            DefaultTableModel model = (DefaultTableModel) tblCoachDirectory.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 0).equals(newName)) { // Check if name matches
                    model.setValueAt(newTitle, i, 1); // Update title
                    model.setValueAt(newDepartment, i, 2); // Update department
                    model.setValueAt(newOffice, i, 3); // Update office
                    model.setValueAt(newNumber, i, 4); // Update phone number
                    model.setValueAt(newEmail, i, 5); // Update email address
                    break;
                }
            }
            // Message to user after the information is updated successfully
            JOptionPane.showMessageDialog(this, "Coach information updated");
        }
    }//GEN-LAST:event_btnUpdateCoachActionPerformed

    private void btnRemoveCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCoachActionPerformed
        /**
         * This method receives a coach's name and searches for them in the directory
         * If the appointment is found, the appointment is cancelled
         */
        
        // Receving the name from the user
        String coachSearch = txtCoachRemove.getText();
        boolean found = directory.coachExists(coachSearch);
        // Removing the coach from the directory
        directory.removeCoach(coachSearch);
        
        // If the coach is found in the system:
        if(found) {
            // Getting the table models to remove the coach from
            DefaultTableModel model = (DefaultTableModel) tblRemoveCoaches.getModel();
            DefaultTableModel table = (DefaultTableModel) tblCoachDirectory.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                // If the name matches, the coach and their information is removed from the system
                if (model.getValueAt(i, 0).equals(coachSearch)) {
                    model.removeRow(i);
                    table.removeRow(i);
                    break;
                }
            }
            // Message to the user after the coach has been removed
            JOptionPane.showMessageDialog(this, "Coach removed");
        }   
    }//GEN-LAST:event_btnRemoveCoachActionPerformed

    private void btnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldsActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearFieldsActionPerformed

    
    public void clearFields() {
        /**
         * This method sets all text fields to be empty so the user can schedule another game if they wish 
         */
        txtCoachName.setText("");
        txtCoachTitle.setText("");
        txtCoachDepartment.setText("");
        txtCoachOffice.setText("");
        txtCoachNumber.setText("");
        txtCoachEmail.setText("");
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Coaches_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coaches_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coaches_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coaches_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coaches_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCoach;
    private javax.swing.JButton btnClearFields;
    private javax.swing.JButton btnCoachSearch;
    private javax.swing.JButton btnRemoveCoach;
    private javax.swing.JButton btnUpdateCoach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel lblCoachDepartment;
    private javax.swing.JLabel lblCoachEmail;
    private javax.swing.JLabel lblCoachName;
    private javax.swing.JLabel lblCoachNumber;
    private javax.swing.JLabel lblCoachOffice;
    private javax.swing.JLabel lblCoachTitle;
    private javax.swing.JLabel lblNewCoachDepartment;
    private javax.swing.JLabel lblNewCoachEmail;
    private javax.swing.JLabel lblNewCoachName;
    private javax.swing.JLabel lblNewCoachNumber;
    private javax.swing.JLabel lblNewCoachOffice;
    private javax.swing.JLabel lblNewCoachTitle;
    private javax.swing.JTable tblCoachDirectory;
    private javax.swing.JTable tblRemoveCoaches;
    private javax.swing.JTextField txtCoachDepartment;
    private javax.swing.JTextField txtCoachEmail;
    private javax.swing.JTextField txtCoachName;
    private javax.swing.JTextField txtCoachNumber;
    private javax.swing.JTextField txtCoachOffice;
    private javax.swing.JTextField txtCoachRemove;
    private javax.swing.JTextField txtCoachSearch;
    private javax.swing.JTextField txtCoachTitle;
    private javax.swing.JTextField txtNewCoachDepartment;
    private javax.swing.JTextField txtNewCoachEmail;
    private javax.swing.JTextField txtNewCoachName;
    private javax.swing.JTextField txtNewCoachNumber;
    private javax.swing.JTextField txtNewCoachOffice;
    private javax.swing.JTextField txtNewCoachTitle;
    // End of variables declaration//GEN-END:variables
}
