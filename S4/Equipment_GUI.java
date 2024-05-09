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

public class Equipment_GUI extends javax.swing.JFrame {
    /**
     * This is the main entry point of this class file
     * This file allows for the creation, updating, display, and removal of equipment and its quantity at the sports club
     */
    
    // Declaring the variables
    private Club SportsClub;
    private static String fileLocation = "Equipment.dat";

    public Equipment_GUI() {
        /**
         * This constructor initializes the components in the file and the club for the information to be stored
         */
        initComponents();
        SportsClub = new Club();
        
        Equipment hockeyPucks = new Equipment("Hockey Pucks", 100);
        SportsClub.addEquipment(hockeyPucks);
        Equipment softballs = new Equipment("Softballs", 50);
        SportsClub.addEquipment(softballs);
        Equipment baseballs = new Equipment("Baseballs", 150);
        SportsClub.addEquipment(baseballs);
        Equipment basketballs = new Equipment("Basketballs", 79);
        SportsClub.addEquipment(basketballs);
        Equipment hockeySkates = new Equipment("Hockey Skates", 25);
        SportsClub.addEquipment(hockeySkates);
        Equipment figureSkates = new Equipment("Figure Skates", 27);
        SportsClub.addEquipment(figureSkates);
        Equipment hockeySticks = new Equipment("Hockey Sticks", 64);
        SportsClub.addEquipment(hockeySticks);
        Equipment benches = new Equipment("Benches", 4);
        SportsClub.addEquipment(benches);
        Equipment treadmills = new Equipment("Treadmills", 11);
        SportsClub.addEquipment(treadmills);
        Equipment softballGloves = new Equipment("Softball Gloves", 15);
        SportsClub.addEquipment(softballGloves);
        Equipment baseballGloves = new Equipment("Baseball Gloves", 17);
        SportsClub.addEquipment(baseballGloves);
        Equipment baseballBats = new Equipment("Baseball Bats", 8);
        SportsClub.addEquipment(baseballBats);
    }
    
    public Equipment_GUI(Club aClub) {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddEquipment = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        txtAddEquipment = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisplayEquip = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEquipSearch = new javax.swing.JButton();
        txtEquipSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSearchEquip = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtEquipmentSearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnUpdateEquip = new javax.swing.JButton();
        txtNewQuantity = new javax.swing.JTextField();
        txtNewEquip = new javax.swing.JTextField();
        lblNewQuantity = new javax.swing.JLabel();
        lblNewEquip = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblRemoveEquip = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtRemoveEquip = new javax.swing.JTextField();
        btnRemoveEquip = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtRemoveQuantity = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Equipment");
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

        btnAddEquipment.setText("Add");
        btnAddEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEquipmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 130, -1));
        jPanel1.add(txtAddEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 130, -1));

        jLabel2.setText("Enter equipment to add:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setText("Enter quantity:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 280));

        tblDisplayEquip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipment", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDisplayEquip);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 290, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        jTabbedPane1.addTab("Add Equipment", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEquipSearch.setText("Search");
        btnEquipSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnEquipSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        jPanel2.add(txtEquipSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 170, -1));

        jLabel5.setText("Enter equipment to search:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        txtSearchEquip.setColumns(20);
        txtSearchEquip.setRows(5);
        jScrollPane4.setViewportView(txtSearchEquip);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 180));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 180));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        jTabbedPane1.addTab("Search Equipment", jPanel2);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txtEquipmentSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, -1));

        jLabel7.setText("Enter equipment:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel5.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        btnUpdateEquip.setText("Update");
        btnUpdateEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEquipActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdateEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));
        jPanel5.add(txtNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 160, -1));
        jPanel5.add(txtNewEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 160, -1));

        lblNewQuantity.setText("Enter new quantity:");
        jPanel5.add(lblNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        lblNewEquip.setText("Enter equipment:");
        jPanel5.add(lblNewEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 110, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane6.setViewportView(jTextArea4);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 270, 220));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        jTabbedPane1.addTab("Update Equipment", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRemoveEquip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipment", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblRemoveEquip);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 10, 330, 400));

        jLabel9.setText("Enter equipment to remove:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel6.add(txtRemoveEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, -1));

        btnRemoveEquip.setText("Remove");
        btnRemoveEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEquipActionPerformed(evt);
            }
        });
        jPanel6.add(btnRemoveEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel10.setText("Enter quantity to remove:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel6.add(txtRemoveQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane8.setViewportView(jTextArea5);

        jPanel6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 150));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/StageIVMain.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        jTabbedPane1.addTab("Delete Equipment", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 460));

        setSize(new java.awt.Dimension(648, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEquipmentActionPerformed
        /**
         * This method collects the information from the user and creates an appointment that is stored
         * in the appointment schedule
         */
        
        // Gathering the input from the user entered into the text fields
        String equipment = txtAddEquipment.getText();
        String quantity = txtQuantity.getText().toString();
        
        // Creating the equipment and adding it to the equipment log
        Equipment equip = new Equipment(equipment, Integer.parseInt(quantity));
        SportsClub.addEquipment(equip);
        
        // Testing if any of the text fields are left empty by the user
        if(equipment.isEmpty() || quantity.isEmpty()) {
            // Message to the user if any of the text fields were not filled out
            JOptionPane.showMessageDialog(this, "Enter all fields");
        }
        
        else {
            // If all the fields are filled out, the information is gathered and placed into a row in the tables
            String[] row = {txtAddEquipment.getText(), txtQuantity.getText().toString()};
            // Table to display the games to the user
            DefaultTableModel model = (DefaultTableModel)tblDisplayEquip.getModel();
            // Table to display the games for the purpose of removal
            DefaultTableModel table = (DefaultTableModel)tblRemoveEquip.getModel();
            // Adding the information to the tables
            model.addRow(row);
            table.addRow(row);
            
            // Message to user after the equipment has been successfully added
            JOptionPane.showMessageDialog(this, "Equipment added");
        }
        
    }//GEN-LAST:event_btnAddEquipmentActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Table to display the equipment
        DefaultTableModel model = (DefaultTableModel)tblDisplayEquip.getModel();
        // Array list to store the data from the table
        ArrayList<String> tableData = new ArrayList<>();
        
        // For loop to gather the information from the table row by row and store it in the array list
        for(int i = 0; i < model.getRowCount(); i++) {
            // Data is compiled and added to the array list
            String equipment = model.getValueAt(i, 0).toString();
            String quantity = model.getValueAt(i, 1).toString();
            
            String row = equipment + "," + quantity;
            tableData.add(row);
            
            // try-catch to attempt storing the information in the dat file
            try {
                // Opening the file
                FileOutputStream file = new FileOutputStream("Equipment.dat");
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
         * When the window is first opened, the labels and text fields used for gathering information for updating a game are not visible to the user
         * They are only made visible if the user searches for a game and it is found in the system
         */
        lblNewEquip.setVisible(false);
        lblNewQuantity.setVisible(false);
            
        txtNewEquip.setVisible(false);
        txtNewQuantity.setVisible(false);
        
         // try-catch to place the information stored in the file into the tables
        try {      
            // Opening the file
            FileInputStream file = new FileInputStream("Equipment.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            // Adding the information to the array list
            ArrayList<String> tableData = (ArrayList<String>)input.readObject();
        
            // Closing the files
            input.close();
            file.close();
        
            // Table for displaying equipment information
            DefaultTableModel model = (DefaultTableModel)tblDisplayEquip.getModel();
            // Table for displaying the information for the purpose of removal
            DefaultTableModel table = (DefaultTableModel)tblRemoveEquip.getModel();
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

    private void btnEquipSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipSearchActionPerformed
        /**
         * This method receives an equipment from the user to be searched in the system
         * If found, the information is printed
         */
        
        // Equipment received from the user
        String equipment = txtEquipSearch.getText();
        boolean found = SportsClub.equipmentExists(equipment);
        
        // If found, the information is printed out
        if(found) {
            String s = "";
            
            s += "\n\n\n\n" + "Equipment: " + txtAddEquipment.getText() + "\nQuantity:" + txtQuantity.getText();
            txtSearchEquip.setText(s);
        }
        
    }//GEN-LAST:event_btnEquipSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        /**
         * This method receives an equipment from the user to be searched in the system
         * If found, the text fields and labels are made visible to the user
         */
        
        // Equipment received from the user
        String search = txtEquipmentSearch.getText();
        boolean found = SportsClub.equipmentExists(search);
        
        // If found, the text fields and labels are visible
        if(found) {
            lblNewEquip.setVisible(true);
            lblNewQuantity.setVisible(true);
            
            txtNewEquip.setVisible(true);
            txtNewQuantity.setVisible(true);
        }
        
        // If not found, a message is printed to the user
        else {
            JOptionPane.showMessageDialog(this, "Equipment not found");
        } 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEquipActionPerformed
        /**
         * This method receives an equipment from the user to be searched in the system
         * If found, the text fields and labels are made visible for gathering the updated information
         */
        
        // Equipment received from the user
        String newEquipment = txtNewEquip.getText();
        String newQuantity = txtNewQuantity.getText().toString();
        
        // Checking if any of the text fields have been left empty by the user
        if (newEquipment.isEmpty() || newQuantity.isEmpty()) {
            // Message to the user if any text fields were not filled out
            JOptionPane.showMessageDialog(this, "Enter all fields");
        } 
        // If all of the text fields are filled out:
        else {
            // Updating equipment information in the log
            SportsClub.updateInformation(newEquipment, Integer.parseInt(newQuantity));
            // Updating corresponding row in the table
            DefaultTableModel model = (DefaultTableModel) tblDisplayEquip.getModel();
            
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 0).equals(newEquipment)) { // Check if equipment matches
                    model.setValueAt(newQuantity, i, 1); // Update quantity
                    break;
                }
            }
            // Message to the user after the equipment has been updated
            JOptionPane.showMessageDialog(this, "Appointment updated");
        }
    }//GEN-LAST:event_btnUpdateEquipActionPerformed

    private void btnRemoveEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEquipActionPerformed
        /**
         * This method receives an equipment and its quantity and searches for it in the log
         * If the equipment is found,it is removed from the log
         */
        
        // Receving the equipment and the quantity from the user
        String equipment = txtRemoveEquip.getText();
        String quantity = txtRemoveQuantity.getText();
        boolean found = SportsClub.equipmentExists(equipment);
        // Removing equipment from the log
        SportsClub.removeEquipment(equipment, Integer.parseInt(quantity));
        
        // If the equipment is found, it is removed from the system
        if(found) {
            // Getting the table models to remove the equipment from 
            DefaultTableModel model = (DefaultTableModel) tblDisplayEquip.getModel();
            DefaultTableModel table = (DefaultTableModel) tblRemoveEquip.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 0).equals(equipment)) { // Check if equipment matches
                    model.removeRow(i); // Removing from table 1
                    table.removeRow(i); // Removing from table 2
                    break;
                }
            }
            // Message to user after equipment has been successfully removed
            JOptionPane.showMessageDialog(this, "Equipment removed");
        }
    }//GEN-LAST:event_btnRemoveEquipActionPerformed

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
            java.util.logging.Logger.getLogger(Equipment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipment_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipment;
    private javax.swing.JButton btnEquipSearch;
    private javax.swing.JButton btnRemoveEquip;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateEquip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel lblNewEquip;
    private javax.swing.JLabel lblNewQuantity;
    private javax.swing.JTable tblDisplayEquip;
    private javax.swing.JTable tblRemoveEquip;
    private javax.swing.JTextField txtAddEquipment;
    private javax.swing.JTextField txtEquipSearch;
    private javax.swing.JTextField txtEquipmentSearch;
    private javax.swing.JTextField txtNewEquip;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRemoveEquip;
    private javax.swing.JTextField txtRemoveQuantity;
    private javax.swing.JTextArea txtSearchEquip;
    // End of variables declaration//GEN-END:variables
}