/*Lance Stott*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class EmployeeManagementGUI extends JFrame {
    private JTabbedPane tabbedPane;
    private JPanel employeePanel, attendancePanel;
    private JTable employeeTable, attendanceTable;
    private DefaultTableModel employeeTableModel, attendanceTableModel;
    private JTextField nameField, roleField, emailField, phoneField, chatField, productivityField, efficiencyField, qualityField;
    private JTextField attendanceIDField, dateField, hoursWorkedField, searchField;
    private List<Employees_info> employeesList = new ArrayList<>();
    private Map<Integer, Double> totalHoursMap = new HashMap<>();
    private JButton recordAttendanceButton, editEmployeeButton, deleteEmployeeButton, saveEmployeeDataButton, loadEmployeeDataButton, searchButton;
    private JButton saveAttendanceButton, loadAttendanceButton, clearButton;

    public EmployeeManagementGUI() {
        setTitle("Employee Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initializeComponents();
        setupEmployeePanel();
        setupAttendancePanel();

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Employee Management", employeePanel);
        tabbedPane.addTab("Attendance Management", attendancePanel);

        add(tabbedPane);

        setVisible(true);
    }

    private void initializeComponents() {
        nameField = new JTextField(20);
        roleField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);
        chatField = new JTextField(20);
        productivityField = new JTextField(10);
        efficiencyField = new JTextField(10);
        qualityField = new JTextField(10);
        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        searchButton.addActionListener(e -> searchEmployee());

        JButton addButton = new JButton("Add Employee");
        addButton.addActionListener(e -> addEmployee());

        editEmployeeButton = new JButton("Edit Employee");
        editEmployeeButton.addActionListener(e -> editEmployee());

        deleteEmployeeButton = new JButton("Delete Employee");
        deleteEmployeeButton.addActionListener(e -> deleteEmployee());

        saveEmployeeDataButton = new JButton("Save Employee Data");
        saveEmployeeDataButton.addActionListener(e -> saveEmployeeDataToFile());

        loadEmployeeDataButton = new JButton("Load Employee Data");
        loadEmployeeDataButton.addActionListener(e -> loadEmployeeDataFromFile());

        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        searchButton.addActionListener(e -> searchEmployee());

        recordAttendanceButton = new JButton("Record Attendance");
        recordAttendanceButton.addActionListener(e -> recordAttendance());

        saveAttendanceButton = new JButton("Save Attendance Data");
        saveAttendanceButton.addActionListener(e -> saveAttendanceDataToFile());

        loadAttendanceButton = new JButton("Load Attendance Data");
        loadAttendanceButton.addActionListener(e -> loadAttendanceDataFromFile());

        clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> confirmClearAttendance());

        employeeTableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Role", "Email", "Phone", "Chat", "Productivity", "Efficiency", "Quality", "Total Hours Worked"}, 0);
        attendanceTableModel = new DefaultTableModel(new Object[]{"Employee ID", "Date", "Hours Worked"}, 0);

        employeeTable = new JTable(employeeTableModel);
        JScrollPane employeeScrollPane = new JScrollPane(employeeTable);

        attendanceTable = new JTable(attendanceTableModel);
        JScrollPane attendanceScrollPane = new JScrollPane(attendanceTable);

        employeePanel = new JPanel(new BorderLayout());
        JPanel employeeInputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        employeeInputPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        employeeInputPanel.add(new JLabel("Role:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(roleField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        employeeInputPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        employeeInputPanel.add(new JLabel("Phone:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        employeeInputPanel.add(new JLabel("Chat:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(chatField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        employeeInputPanel.add(new JLabel("Productivity:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(productivityField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        employeeInputPanel.add(new JLabel("Efficiency:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(efficiencyField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        employeeInputPanel.add(new JLabel("Quality:"), gbc);
        gbc.gridx = 1;
        employeeInputPanel.add(qualityField, gbc);

        
        JPanel employeeButtonsPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        employeeButtonsPanel.add(addButton);
        employeeButtonsPanel.add(editEmployeeButton);
        employeeButtonsPanel.add(deleteEmployeeButton);
        employeeButtonsPanel.add(saveEmployeeDataButton);
        employeeButtonsPanel.add(loadEmployeeDataButton);
        employeeButtonsPanel.add(new JLabel("Search:"));
        employeeButtonsPanel.add(searchField);
        employeeButtonsPanel.add(searchButton);
        
        JPanel employeeButtonsPanel1 = new JPanel(new GridBagLayout());
        GridBagConstraints gbcButtons = new GridBagConstraints();
        gbcButtons.anchor = GridBagConstraints.WEST;
        gbcButtons.insets = new Insets(5, 5, 5, 5);

        gbcButtons.gridx = 0;
        gbcButtons.gridy = 0;
        employeeButtonsPanel1.add(addButton, gbcButtons);

        gbcButtons.gridy++;
        employeeButtonsPanel1.add(editEmployeeButton, gbcButtons);

        gbcButtons.gridy++;
        employeeButtonsPanel1.add(deleteEmployeeButton, gbcButtons);

        gbcButtons.gridy++;
        employeeButtonsPanel1.add(saveEmployeeDataButton, gbcButtons);

        gbcButtons.gridy++;
        employeeButtonsPanel1.add(loadEmployeeDataButton, gbcButtons);

        gbcButtons.gridy++;
        gbcButtons.gridwidth = 2;
        employeeButtonsPanel1.add(new JLabel("Search:"), gbcButtons);

        gbcButtons.gridy++;
        gbcButtons.gridwidth = 1;
        employeeButtonsPanel1.add(searchField, gbcButtons);

        gbcButtons.gridx++;
        employeeButtonsPanel1.add(searchButton, gbcButtons);

        employeePanel.add(employeeInputPanel, BorderLayout.NORTH);
        employeePanel.add(employeeButtonsPanel1, BorderLayout.WEST);
        employeePanel.add(employeeScrollPane, BorderLayout.CENTER);

        
        attendancePanel = new JPanel(new BorderLayout());
        JPanel attendanceInputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.anchor = GridBagConstraints.WEST;
        gbc2.insets = new Insets(5, 5, 5, 5);

        // Attendance Input Fields
        attendanceIDField = new JTextField(10);
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        attendanceInputPanel.add(new JLabel("Employee ID:"), gbc2);
        gbc2.gridx = 1;
        attendanceInputPanel.add(attendanceIDField, gbc2);

        dateField = new JTextField(10);
        gbc2.gridx = 0;
        gbc2.gridy = 1;
        attendanceInputPanel.add(new JLabel("Date (dd-MM-yyyy):"), gbc2);
        gbc2.gridx = 1;
        attendanceInputPanel.add(dateField, gbc2);

        hoursWorkedField = new JTextField(10);
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        attendanceInputPanel.add(new JLabel("Hours Worked:"), gbc2);
        gbc2.gridx = 1;
        attendanceInputPanel.add(hoursWorkedField, gbc2);

        
        JPanel attendanceButtonsPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        attendanceButtonsPanel.add(recordAttendanceButton);
        attendanceButtonsPanel.add(saveAttendanceButton);
        attendanceButtonsPanel.add(loadAttendanceButton);
        attendanceButtonsPanel.add(clearButton);

        attendancePanel.add(attendanceInputPanel, BorderLayout.NORTH);
        attendancePanel.add(attendanceButtonsPanel, BorderLayout.WEST);
        attendancePanel.add(attendanceScrollPane, BorderLayout.CENTER);

        
        employeePanel.setBackground(new Color(244, 255, 249));
        attendancePanel.setBackground(new Color(244, 255, 249));
        employeeInputPanel.setBackground(new Color(244, 255, 249));
        attendanceInputPanel.setBackground(new Color(244, 255, 249));
        employeeButtonsPanel1.setBackground(new Color(244, 255, 249));
        attendanceButtonsPanel.setBackground(new Color(244, 255, 249));

        addButton.setBackground(new Color(144, 238, 144));
        editEmployeeButton.setBackground(new Color(144, 238, 144));
        deleteEmployeeButton.setBackground(new Color(144, 238, 144));
        saveEmployeeDataButton.setBackground(new Color(144, 238, 144));
        loadEmployeeDataButton.setBackground(new Color(144, 238, 144));
        searchButton.setBackground(new Color(173, 216, 230));
        recordAttendanceButton.setBackground(new Color(255, 192, 203));
        saveAttendanceButton.setBackground(new Color(255, 192, 203));
        loadAttendanceButton.setBackground(new Color(255, 192, 203));
        clearButton.setBackground(new Color(255, 192, 203));

        employeeTable.setBackground(new Color(224, 255, 255));
        attendanceTable.setBackground(new Color(224, 255, 255));

        getContentPane().setBackground(new Color(244, 255, 249));
    }

    private void setupEmployeePanel() {
        employeeTableModel.setRowCount(0);
        for (Employees_info employee : employeesList) {
            Object[] rowData = {employee.getID(), employee.getEmployeeName(), employee.getRole(), employee.getEmail(), employee.getPhone(), employee.getChat(), employee.getProductivity(), employee.getEfficiency(), employee.getQuality(), totalHoursMap.getOrDefault(employee.getID(), 0.0)};
            employeeTableModel.addRow(rowData);
        }
    }

    private void setupAttendancePanel() {
        attendanceTableModel.setColumnIdentifiers(new Object[]{"Employee ID", "Date", "Hours Worked"});
    }

    private void addEmployee() {
        String name = nameField.getText();
        String role = roleField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String chat = chatField.getText();
        double productivity = Double.parseDouble(productivityField.getText());
        double efficiency = Double.parseDouble(efficiencyField.getText());
        double quality = Double.parseDouble(qualityField.getText());

        Employees_info employee = new Employees_info(name, role, email, phone, chat, productivity, efficiency, quality);
        employeesList.add(employee);
        setupEmployeePanel();
        clearEmployeeFields();
    }

    private void editEmployee() {
        int selectedRow = employeeTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) employeeTableModel.getValueAt(selectedRow, 0);
            String name = nameField.getText();
            String role = roleField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String chat = chatField.getText();
            double productivity = Double.parseDouble(productivityField.getText());
            double efficiency = Double.parseDouble(efficiencyField.getText());
            double quality = Double.parseDouble(qualityField.getText());

            for (Employees_info employee : employeesList) {
                if (employee.getID() == id) {
                    employee.setEmployeeName(name);
                    employee.setRole(role);
                    employee.setEmail(email);
                    employee.setPhone(phone);
                    employee.setChat(chat);
                    employee.setProductivity(productivity);
                    employee.setEfficiency(efficiency);
                    employee.setQuality(quality);
                    break;
                }
            }
            setupEmployeePanel();
            clearEmployeeFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee to edit.");
        }
    }

    private void deleteEmployee() {
        int selectedRow = employeeTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) employeeTableModel.getValueAt(selectedRow, 0);
            for (Employees_info employee : employeesList) {
                if (employee.getID() == id) {
                    employeesList.remove(employee);
                    totalHoursMap.remove(id);
                    break;
                }
            }
            setupEmployeePanel();
            clearEmployeeFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee to delete.");
        }
    }

    private void saveEmployeeDataToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
                for (Employees_info employee : employeesList) {
                    writer.write(employee.getEmployeeName() + "," + employee.getRole() + "," + employee.getEmail() + "," + employee.getPhone() + "," + employee.getChat() + "," + employee.getProductivity() + "," + employee.getEfficiency() + "," + employee.getQuality() + "\n");
                }
                JOptionPane.showMessageDialog(this, "Employee data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving employee data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void loadEmployeeDataFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                String line;
                employeesList.clear();
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    String name = data[0];
                    String role = data[1];
                    String email = data[2];
                    String phone = data[3];
                    String chat = data[4];
                    double productivity = Double.parseDouble(data[5]);
                    double efficiency = Double.parseDouble(data[6]);
                    double quality = Double.parseDouble(data[7]);
                    employeesList.add(new Employees_info(name, role, email, phone, chat, productivity, efficiency, quality));
                }
                setupEmployeePanel();
                JOptionPane.showMessageDialog(this, "Employee data loaded successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading employee data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void recordAttendance() {
        String attendanceIDText = attendanceIDField.getText().trim();
        String dateString = dateField.getText().trim();
        String hoursWorkedText = hoursWorkedField.getText().trim();

        if (attendanceIDText.isEmpty() || dateString.isEmpty() || hoursWorkedText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter valid attendance data.");
            return;
        }

        try {
            int employeeID = Integer.parseInt(attendanceIDText);
            double hoursWorked = Double.parseDouble(hoursWorkedText);

            Employees_info employee = findEmployeeByID(employeeID);
            if (employee != null) {
                attendanceTableModel.addRow(new Object[]{employeeID, dateString, hoursWorked});
                updateTotalHours(employeeID, hoursWorked);
                clearAttendanceFields();
                setupAttendancePanel();
            } else {
                JOptionPane.showMessageDialog(this, "Employee not found.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Employee ID and Hours Worked.");
        }
    }

    private void updateTotalHours(int employeeID, double hoursWorked) {
        double totalHours = totalHoursMap.getOrDefault(employeeID, 0.0);
        totalHours += hoursWorked;
        totalHoursMap.put(employeeID, totalHours);
        setupEmployeePanel();
    }

    private void clearEmployeeFields() {
        nameField.setText("");
        roleField.setText("");
        emailField.setText("");
        phoneField.setText("");
        chatField.setText("");
        productivityField.setText("");
        efficiencyField.setText("");
        qualityField.setText("");
    }
    private void confirmClearAttendance() {
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear attendance data?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            clearAttendanceTable();
            
        }
    }

    private void clearAttendanceFields() {
            attendanceIDField.setText("");
            dateField.setText("");
            hoursWorkedField.setText("");
    }

    private Employees_info findEmployeeByID(int ID) {
        for (Employees_info employee : employeesList) {
            if (employee.getID() == ID) {
                return employee;
            }
        }
        return null;
    }
    
    private void clearAttendanceTable() {
    	attendanceTableModel.setRowCount(0);
	}
    	
    private void searchEmployee() {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(employeeTableModel);
        employeeTable.setRowSorter(sorter);
        String text = searchField.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }

    private void saveAttendanceDataToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
                for (int i = 0; i < attendanceTableModel.getRowCount(); i++) {
                    int employeeID = (int) attendanceTableModel.getValueAt(i, 0);
                    String date = (String) attendanceTableModel.getValueAt(i, 1);
                    double hoursWorked = (double) attendanceTableModel.getValueAt(i, 2);
                    writer.write(employeeID + "," + date + "," + hoursWorked + "\n");
                }
                JOptionPane.showMessageDialog(this, "Attendance data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving attendance data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    

    private void loadAttendanceDataFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                String line;
                attendanceTableModel.setRowCount(0);
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    int employeeID = Integer.parseInt(data[0]);
                    String date = data[1];
                    double hoursWorked = Double.parseDouble(data[2]);
                    attendanceTableModel.addRow(new Object[]{employeeID, date, hoursWorked});
                    updateTotalHours(employeeID, hoursWorked);
                }
                JOptionPane.showMessageDialog(this, "Attendance data loaded successfully.");
                setupAttendancePanel(); 
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading attendance data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeManagementGUI::new);
    }
}