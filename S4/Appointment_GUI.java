/**
 * @author  Alena Fisher
 * 5/7/2024
 */

// Importing all necessary classes
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// ADD DUMMY INFORMATION    
public class Appointment_GUI extends javax.swing.JFrame {
    /**
     * This is the main entry point of this class file
     * This file allows for the creation, updating, display, and removal of appointments at the sports club
     */
    
    // Declaring the variables
    private Schedule schedule;
    static String fileLocation = "Appointments.dat";
    // Creating the lists to store the appointments
    private LinkedList<Appointment> appointments = new LinkedList<Appointment>();
    private LinkedList<Appointment> appointment = new LinkedList<Appointment>();

    public Appointment_GUI() {
        /**
         * This constructor initializes the components and the schedule for the appointments
         */
        initComponents();
        schedule = new Schedule();
        
        Appointment gusterApp = new Appointment("Burton Guster", "4/15/2024", "13:00", "861516", "Hockey Lessons", "Ice Rink");
        schedule.addAppointment(gusterApp);
        Appointment spencerApp = new Appointment("Shawn Spencer", "4/21/2024", "14:00", "861970", "Baseball Lessons", "Baseball Field");
        schedule.addAppointment(spencerApp);
        Appointment rogersApp = new Appointment("Kristine Rogers", "4/19/2024", "08:00", "861113", "Softball Lessons", "Softball Field");
        schedule.addAppointment(rogersApp);
        Appointment gardnerApp = new Appointment("Louis Gardener", "4/15/2024", "13:00", "861743", "Hockey Lessons", "Ice Rink");
        schedule.addAppointment(gardnerApp);
        Appointment oharaApp = new Appointment("Juliet O'Hara", "4/19/2024", "08:00", "861876", "Gym Training Session", "Gym");
        schedule.addAppointment(oharaApp);
    }
    
    public Appointment_GUI(Club aClub) {
        /**
         * This constructor receives 'aClub' as an explicit parameter and creates an object for the window to be opened
         */
        this();
    }
    
    
    public void addAppointment() {
        /**
         * This method collects the information from the user and creates an appointment that is stored
         * in the appointment schedule
         */
        
        // Gathering the input from the user entered into the text fields
        String memberID = txtMemberID.getText();
        String memberName = txtMemberName.getText();
        String appDate = txtAppDate.getText();
        String appTime = txtAppTime.getText();
        String appType = txtAppType.getText();
        String appLocation = txtAppLocation.getText();
        
        // Creating the appointment and adding it to the appointment schedule
        Appointment app = new Appointment(memberName, appDate, appTime, memberID, appType, appLocation);
        schedule.addAppointment(app);
        
        // Testing if any of the text fields are left empty by the user
        if(txtMemberID.getText().isEmpty() || txtMemberName.getText().isEmpty() || txtAppDate.getText().isEmpty() || txtAppTime.getText().isEmpty() || txtAppType.getText().isEmpty() || txtAppLocation.getText().isEmpty()) {
                // Message to the user if any of the text fields were not filled out
                JOptionPane.showMessageDialog(this, "Enter all fields");
            }
       
            // If all the fields are filled out, the information is gathered and placed into a row in the tables
            else {
                
                String[] row = {txtMemberID.getText(), txtMemberName.getText(), txtAppDate.getText(), txtAppTime.getText(), txtAppType.getText(), txtAppLocation.getText()};
                // Table to display the appointments to the user
                DefaultTableModel model = (DefaultTableModel)tblDisplayApps.getModel();
                // Table to display the appointments for removal
                DefaultTableModel table = (DefaultTableModel)tblRemoveApp.getModel();
                // Information is added to the tables
                model.addRow(row);
                table.addRow(row);
            
                // Message to the user that the appointment scheduling was successful
                JOptionPane.showMessageDialog(this, "Appointment added");
            }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabRemoveAppointment = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAppLocation = new javax.swing.JTextField();
        txtAppType = new javax.swing.JTextField();
        txtAppTime = new javax.swing.JTextField();
        txtAppDate = new javax.swing.JTextField();
        txtMemberName = new javax.swing.JTextField();
        txtMemberID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAddAppointment = new javax.swing.JButton();
        btnClearFields = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tabDisplayApps = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisplayApps = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAppSearch = new javax.swing.JButton();
        txtAppSearch = new javax.swing.JTextField();
        txtMemberName1 = new javax.swing.JTextField();
        txtAppTime1 = new javax.swing.JTextField();
        txtAppType1 = new javax.swing.JTextField();
        txtAppLocation1 = new javax.swing.JTextField();
        txtMemberID1 = new javax.swing.JTextField();
        btnUpdateApp = new javax.swing.JButton();
        lblAppLocation = new javax.swing.JLabel();
        lblAppDate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMemberID = new javax.swing.JLabel();
        lblAppTime = new javax.swing.JLabel();
        lblAppType = new javax.swing.JLabel();
        txtAppDate1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtextfield1 = new javax.swing.JTextArea();
        lblMemberName = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnRemoveApp = new javax.swing.JButton();
        txtRemoveApp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRemoveApp = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setTitle("Appointment");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter Member ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setText("Enter Member's Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Enter Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("Enter Time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setText("Enter Appointment Type:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel7.setText("Enter Location:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jPanel1.add(txtAppLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, -1));
        jPanel1.add(txtAppType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, -1));
        jPanel1.add(txtAppTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, -1));
        jPanel1.add(txtAppDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));
        jPanel1.add(txtMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, -1));
        jPanel1.add(txtMemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 370));

        btnAddAppointment.setText("Add Appointment");
        btnAddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppointmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        btnClearFields.setText("Clear Fields");
        btnClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFieldsActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 390));

        tabRemoveAppointment.addTab("Add Appointment", jPanel1);

        tabDisplayApps.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDisplayApps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Name", "Date", "Time", "Type", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDisplayApps);

        tabDisplayApps.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 390));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        tabDisplayApps.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 628, 420));

        tabRemoveAppointment.addTab("Display Appointment", tabDisplayApps);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAppSearch.setText("Search");
        btnAppSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnAppSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtAppSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppSearchActionPerformed(evt);
            }
        });
        jPanel3.add(txtAppSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));
        jPanel3.add(txtMemberName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 160, -1));
        jPanel3.add(txtAppTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, -1));
        jPanel3.add(txtAppType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 160, -1));
        jPanel3.add(txtAppLocation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 160, -1));
        jPanel3.add(txtMemberID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 160, -1));

        btnUpdateApp.setText("Update");
        btnUpdateApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdateApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        lblAppLocation.setText("Enter Location:");
        jPanel3.add(lblAppLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        lblAppDate.setText("Enter Date:");
        jPanel3.add(lblAppDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel10.setText("Enter Member ID to search:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblMemberID.setText("Enter Member ID:");
        jPanel3.add(lblMemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        lblAppTime.setText("Enter Time:");
        jPanel3.add(lblAppTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        lblAppType.setText("Enter Appointment Type:");
        jPanel3.add(lblAppType, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));
        jPanel3.add(txtAppDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 160, -1));

        jtextfield1.setColumns(20);
        jtextfield1.setRows(5);
        jScrollPane3.setViewportView(jtextfield1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 120));

        lblMemberName.setText("Enter Member's Name:");
        jPanel3.add(lblMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 10, 290, 350));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        tabRemoveAppointment.addTab("Modify Appointment", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemoveApp.setText("Remove");
        btnRemoveApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAppActionPerformed(evt);
            }
        });
        jPanel4.add(btnRemoveApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        jPanel4.add(txtRemoveApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, -1));

        jLabel12.setText("Enter ID to cancel appointment:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 130));

        tblRemoveApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date", "Time", "Type", "Location"
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
        jScrollPane5.setViewportView(tblRemoveApp);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 380, 380));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        tabRemoveAppointment.addTab("Remove Appointment", jPanel4);

        getContentPane().add(tabRemoveAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        setSize(new java.awt.Dimension(645, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Table to display the appointments
        DefaultTableModel model = (DefaultTableModel)tblDisplayApps.getModel();
        // Array list to store the data from the table
        ArrayList<String> tableData = new ArrayList<>();
        
        // For loop to gather the information from the table row by row and store it in the array list
        for(int i = 0; i < model.getRowCount(); i++) {
            String memberID = model.getValueAt(i, 0).toString();
            String memberName = model.getValueAt(i, 1).toString();
            String appDate = model.getValueAt(i, 2).toString();
            String appTime = model.getValueAt(i, 3).toString();
            String appType = model.getValueAt(i, 4).toString();
            String appLocation = model.getValueAt(i, 5).toString();
            
            // Data is compiled and added to the array list
            String row = memberID + "," + memberName + "," + appDate + "," + appTime + "," + appType + "," + appLocation;
            tableData.add(row);
            
            // try-catch to attempt storing the information in the dat file
            try {
                // Opening the file
                FileOutputStream file = new FileOutputStream("Appointments.dat");
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
         * When the window is first opened, the labels and text fields used for gathering information for updating an appointment are not visible to the user
         * They are only made visible if the user searches for an appointment and it is found in the system
         */
        lblMemberID.setVisible(false);
        lblMemberName.setVisible(false);
        lblAppDate.setVisible(false);
        lblAppTime.setVisible(false);
        lblAppType.setVisible(false);
        lblAppLocation.setVisible(false);
        
        txtMemberID1.setVisible(false);
        txtMemberName1.setVisible(false);
        txtAppDate1.setVisible(false);
        txtAppTime1.setVisible(false);
        txtAppType1.setVisible(false);
        txtAppLocation1.setVisible(false);
        
        // try-catch to place the information stored in the file into the tables
        try {        
            // Opening the file
            FileInputStream file = new FileInputStream("Appointments.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            // Adding the information to the array list
            ArrayList<String> tableData = (ArrayList<String>)input.readObject();
        
            // Closing the files
            input.close();
            file.close();
        
            // Table for displaying appointment information
            DefaultTableModel model = (DefaultTableModel)tblDisplayApps.getModel();
            // Table for displaying the information for the purpose of removal
            DefaultTableModel table = (DefaultTableModel)tblRemoveApp.getModel();
            
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

    private void btnAddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAppointmentActionPerformed
        /**
         * This method is linked to the 'Add Appointment' button, and calls the addAppointment() method to add an appointment to the schedule
         */
        addAppointment();
    }//GEN-LAST:event_btnAddAppointmentActionPerformed

    private void btnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldsActionPerformed
        /**
         * This method calls the 'clearFields' method to clear the text fields after the user is finished adding an appointment
         */
        clearFields();
    }//GEN-LAST:event_btnClearFieldsActionPerformed

    private void txtAppSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppSearchActionPerformed

    }//GEN-LAST:event_txtAppSearchActionPerformed

    private void btnAppSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppSearchActionPerformed
        /**
         * This method receives a member ID from the user to be searched in the system
         * If found, the text fields and labels are made visible for gathering the updated information
         */
        
        // Member ID received from the user
        String memberID = txtAppSearch.getText();
        // Uses the method to find if the appointment exists in the system
        boolean found = schedule.appExists(memberID);
        
        if(found) {
            // If the appointment is found, all labels and text fields are made visible
            lblMemberID.setVisible(true);
            lblMemberName.setVisible(true);
            lblAppDate.setVisible(true);
            lblAppTime.setVisible(true);
            lblAppType.setVisible(true);
            lblAppLocation.setVisible(true);
        
            txtMemberID1.setVisible(true);
            txtMemberName1.setVisible(true);
            txtAppDate1.setVisible(true);
            txtAppTime1.setVisible(true);
            txtAppType1.setVisible(true);
            txtAppLocation1.setVisible(true); 
        }
        // If the appointment is not found in the system
        else {
            JOptionPane.showMessageDialog(this, "Appointment not found");
        } 
        
    }//GEN-LAST:event_btnAppSearchActionPerformed

    private void btnUpdateAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppActionPerformed
        /**
         * This method receives the memberID, updated name, date, time, type, and location for the appointment and updates it in the schedule
         */
        
        // Gathering updated information from the user
        String memberID = txtMemberID1.getText();
        String newName = txtMemberName1.getText();
        String newDate = txtAppDate1.getText();
        String newTime = txtAppTime1.getText();
        String newType = txtAppType1.getText();
        String newLocation = txtAppLocation1.getText();
        
        // Checking if any of the text fields have been left empty by the user
        if (memberID.isEmpty() || newName.isEmpty() || newDate.isEmpty() || newTime.isEmpty() || newType.isEmpty() || newLocation.isEmpty()) {
            // Message to the user if any text fields were not filled out
            JOptionPane.showMessageDialog(this, "Enter all fields");
        } 
        
        // If all of the text fields are filled out:
        else {
            // Updating appointment information in the schedule
            schedule.updateAppInfo(newName, newDate, newTime, memberID, newType, newLocation);
            // Updating corresponding row in the table
            DefaultTableModel model = (DefaultTableModel) tblDisplayApps.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 0).equals(memberID)) { // Check if memberID matches
                    model.setValueAt(newName, i, 1); // Update name
                    model.setValueAt(newDate, i, 2); // Update date
                    model.setValueAt(newTime, i, 3); // Update time
                    model.setValueAt(newType, i, 4); // Update type
                    model.setValueAt(newLocation, i, 5); // Update location
                    break;
                }
            }
            // Message to the user after the information has been updated
            JOptionPane.showMessageDialog(this, "Appointment updated");
        }
       
    }//GEN-LAST:event_btnUpdateAppActionPerformed

    private void btnRemoveAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAppActionPerformed
        /**
         * This method receives a member's ID and searches for their appointment in the schedule
         * If the appointment is found, the appointment is cancelled
         */
        
        // Receving the ID from the user
        String IDsearch = txtRemoveApp.getText();
        // Checking if the appointment exists
        boolean found = schedule.appExists(IDsearch);
        
        if(found) {
            // Removing the appointment from schedule if it is found 
            schedule.removeAppointment(IDsearch);
            // Getting the table models to remove the appointment from 
            DefaultTableModel model = (DefaultTableModel) tblRemoveApp.getModel();
            DefaultTableModel table = (DefaultTableModel) tblDisplayApps.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 0).equals(IDsearch)) { // Check if memberID matches
                    model.removeRow(i); // Removing appointment from the first table
                    table.removeRow(i); // Removing appointment from the second table
                    break;
                }
            }
            // Message to the user after the appointment is removed
            JOptionPane.showMessageDialog(this, "Appointment removed");
        }
    }//GEN-LAST:event_btnRemoveAppActionPerformed

    
    public void clearFields() {
        /**
         * This method sets all text fields to be empty so the user can schedule another appointment if they wish 
         */
        txtMemberID.setText("");
        txtMemberName.setText("");
        txtAppDate.setText("");
        txtAppTime.setText("");
        txtAppType.setText("");
        txtAppLocation.setText("");
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
            java.util.logging.Logger.getLogger(Appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAppointment;
    private javax.swing.JButton btnAppSearch;
    private javax.swing.JButton btnClearFields;
    private javax.swing.JButton btnRemoveApp;
    private javax.swing.JButton btnUpdateApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JTextArea jtextfield1;
    private javax.swing.JLabel lblAppDate;
    private javax.swing.JLabel lblAppLocation;
    private javax.swing.JLabel lblAppTime;
    private javax.swing.JLabel lblAppType;
    private javax.swing.JLabel lblMemberID;
    private javax.swing.JLabel lblMemberName;
    private javax.swing.JPanel tabDisplayApps;
    private javax.swing.JTabbedPane tabRemoveAppointment;
    private javax.swing.JTable tblDisplayApps;
    private javax.swing.JTable tblRemoveApp;
    private javax.swing.JTextField txtAppDate;
    private javax.swing.JTextField txtAppDate1;
    private javax.swing.JTextField txtAppLocation;
    private javax.swing.JTextField txtAppLocation1;
    private javax.swing.JTextField txtAppSearch;
    private javax.swing.JTextField txtAppTime;
    private javax.swing.JTextField txtAppTime1;
    private javax.swing.JTextField txtAppType;
    private javax.swing.JTextField txtAppType1;
    private javax.swing.JTextField txtMemberID;
    private javax.swing.JTextField txtMemberID1;
    private javax.swing.JTextField txtMemberName;
    private javax.swing.JTextField txtMemberName1;
    private javax.swing.JTextField txtRemoveApp;
    // End of variables declaration//GEN-END:variables
}
