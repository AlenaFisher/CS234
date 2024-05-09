/*lance stott*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class MembershipGUI extends JFrame {
    private MembershipSys membershipSys;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField healthRecordsField;
    private JTextField emergencyContactsField;
    private JTextField searchField;
    private JTable memberTable;

    public MembershipGUI() {
        membershipSys = new MembershipSys();
        initializeGUI();
    }

    private void initializeGUI() {
        setTitle("Membership System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color mintGreen = new Color(152, 255, 152);
        getContentPane().setBackground(mintGreen);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        JButton createMemberButton = new JButton("Create Member");
        JButton accessInfoButton = new JButton("Access Member Info");
        JButton renewMembershipButton = new JButton("Renew Membership");
        JButton deleteMemberButton = new JButton("Delete Member");

        JButton saveButton = new JButton("Save");
        JButton loadButton = new JButton("Load");

        String[] columnNames = {"ID", "Name", "Address", "Email", "Phone", "Health Records", "Emergency Contacts", "Expiry Date"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        memberTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(memberTable);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel searchPanel = new JPanel(new FlowLayout());
        searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Search:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        mainPanel.add(searchPanel, BorderLayout.NORTH);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.add(createMemberButton);
        buttonPanel.add(accessInfoButton);
        buttonPanel.add(renewMembershipButton);
        buttonPanel.add(deleteMemberButton);

        JPanel saveLoadPanel = new JPanel(new FlowLayout());
        saveLoadPanel.add(saveButton);
        saveLoadPanel.add(loadButton);
        mainPanel.add(saveLoadPanel, BorderLayout.WEST);

        mainPanel.setBackground(mintGreen);
        buttonPanel.setBackground(mintGreen);
        createMemberButton.setBackground(Color.WHITE);
        accessInfoButton.setBackground(Color.WHITE);
        renewMembershipButton.setBackground(Color.WHITE);
        deleteMemberButton.setBackground(Color.WHITE);
        searchPanel.setBackground(mintGreen);
        searchField.setBackground(Color.WHITE);
        searchButton.setBackground(Color.WHITE);
        scrollPane.setBackground(Color.WHITE);
        memberTable.setBackground(Color.WHITE);
        saveLoadPanel.setBackground(mintGreen);
        saveButton.setBackground(Color.WHITE);
        loadButton.setBackground(Color.WHITE);

        createMemberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createMember();
            }
        });

        accessInfoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accessMemberInfo();
            }
        });

        renewMembershipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                renewMembership();
            }
        });

        deleteMemberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteMember();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchTerm = searchField.getText();
                searchMember(searchTerm);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveMemberDataToFile();
            }
        });

        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadMemberDataFromFile();
            }
        });

        add(mainPanel);
        setVisible(true);
    }

    private void createMember() {
        nameField = new JTextField(10);
        addressField = new JTextField(10);
        emailField = new JTextField(10);
        phoneField = new JTextField(10);
        healthRecordsField = new JTextField(10);
        emergencyContactsField = new JTextField(10);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Address:"));
        panel.add(addressField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Phone:"));
        panel.add(phoneField);
        panel.add(new JLabel("Health Records (comma-separated):"));
        panel.add(healthRecordsField);
        panel.add(new JLabel("Emergency Contacts (comma-separated):"));
        panel.add(emergencyContactsField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Create Member",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String address = addressField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String healthRecords = healthRecordsField.getText();
            String emergencyContacts = emergencyContactsField.getText();
            String memberID = "M" + String.format("%03d", membershipSys.getMemberCounterAndIncrement());

            List<String> healthRecordsList = List.of(healthRecords.split(","));
            List<String> emergencyContactsList = List.of(emergencyContacts.split(","));

            membershipSys.createMember(name, address, email, phone, memberID, healthRecordsList, emergencyContactsList);

            DefaultTableModel model = (DefaultTableModel) memberTable.getModel();
            model.addRow(new Object[]{memberID, name, address, email, phone, healthRecords, emergencyContacts, ""});
            JOptionPane.showMessageDialog(null, "Member created successfully with ID: " + memberID);
        }
    }

    private void accessMemberInfo() {
        int selectedRow = memberTable.getSelectedRow();
        if (selectedRow != -1) {
            String memberID = (String) memberTable.getValueAt(selectedRow, 0);
            Member member = membershipSys.getMember(memberID);
            if (member != null) {
                JOptionPane.showMessageDialog(null,
                        "ID: " + member.getMemberID() + "\n" +
                                "Name: " + member.getName() + "\n" +
                                "Address: " + member.getAddress() + "\n" +
                                "Email: " + member.getEmail() + "\n" +
                                "Phone: " + member.getPhone() + "\n" +
                                "Health Records: " + member.getHealthRecords() + "\n" +
                                "Emergency Contacts: " + member.getEmergencyContacts() + "\n" +
                                "Membership Expiry Date: " + member.getMembershipExpiryDate());
            } else {
                JOptionPane.showMessageDialog(null, "Member not found.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a member from the table.");
        }
    }

    private void renewMembership() {
        int selectedRow = memberTable.getSelectedRow();
        if (selectedRow != -1) {
            String memberID = (String) memberTable.getValueAt(selectedRow, 0);
            membershipSys.renewMembership(memberID);
            Date newExpiryDate = membershipSys.getMember(memberID).getMembershipExpiryDate();
            memberTable.setValueAt(newExpiryDate, selectedRow, 7);
            JOptionPane.showMessageDialog(null, "Membership renewed successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a member from the table.");
        }
    }

    private void deleteMember() {
        int selectedRow = memberTable.getSelectedRow();
        if (selectedRow != -1) {
            String memberID = (String) memberTable.getValueAt(selectedRow, 0);
            membershipSys.deleteMember(memberID);
            DefaultTableModel model = (DefaultTableModel) memberTable.getModel();
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Member deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a member from the table.");
        }
    }

    private void searchMember(String searchTerm) {
        DefaultTableModel model = (DefaultTableModel) memberTable.getModel();
        model.setRowCount(0);
        List<Member> members = membershipSys.getMembershipManager().getMembers();
        for (Member member : members) {
            model.addRow(new Object[]{
                    member.getMemberID(), member.getName(), member.getAddress(), member.getEmail(),
                    member.getPhone(), member.getHealthRecords(), member.getEmergencyContacts(),
                    member.getMembershipExpiryDate()
            });
        }
    }

    private void saveMemberDataToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(selectedFile))) {
                outputStream.writeObject(membershipSys.getMembershipManager().getMembers());
                JOptionPane.showMessageDialog(this, "Member data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving member data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void loadMemberDataFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(selectedFile))) {
                List<Member> loadedMembers = (List<Member>) inputStream.readObject();
                membershipSys.getMembershipManager().setMembers(loadedMembers);
                setupMemberPanel();
                JOptionPane.showMessageDialog(this, "Member data loaded successfully.");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading member data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void setupMemberPanel() {
        DefaultTableModel model = (DefaultTableModel) memberTable.getModel();
        model.setRowCount(0);

        List<Member> members = membershipSys.getMembershipManager().getMembers();
        for (Member member : members) {
            Object[] rowData = {member.getMemberID(), member.getName(), member.getAddress(), member.getEmail(),
                    member.getPhone(), member.getHealthRecords(), member.getEmergencyContacts(),
                    member.getMembershipExpiryDate()};
            model.addRow(rowData);
        }
    }

    public static void main(String[] args) {
        new MembershipGUI();
    }
}