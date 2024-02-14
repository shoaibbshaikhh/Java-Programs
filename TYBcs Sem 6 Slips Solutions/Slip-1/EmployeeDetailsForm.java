/* Q2) Write a Java program to accept the details of Employee (Eno, EName, Designation,
Salary) from a user and store it into the database. (Use Swing) */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDetailsForm extends JFrame {
    private JTextField txtEno, txtEName, txtDesignation, txtSalary;

    public EmployeeDetailsForm() {
        setTitle("Employee Details Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Employee Number:"));
        txtEno = new JTextField();
        panel.add(txtEno);

        panel.add(new JLabel("Employee Name:"));
        txtEName = new JTextField();
        panel.add(txtEName);

        panel.add(new JLabel("Designation:"));
        txtDesignation = new JTextField();
        panel.add(txtDesignation);

        panel.add(new JLabel("Salary:"));
        txtSalary = new JTextField();
        panel.add(txtSalary);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveEmployeeDetails();
            }
        });
        panel.add(btnSave);

        add(panel);
        setVisible(true);
    }

    private void saveEmployeeDetails() {
        try {
            // Connect to your database (replace with your database credentials)
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

            // Prepare the SQL statement
            String sql = "INSERT INTO EmployeeDetails (Eno, EName, Designation, Salary) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set values from the form
            preparedStatement.setString(1, txtEno.getText());
            preparedStatement.setString(2, txtEName.getText());
            preparedStatement.setString(3, txtDesignation.getText());
            preparedStatement.setString(4, txtSalary.getText());

            // Execute the statement
            preparedStatement.executeUpdate();

            // Close the connection
            connection.close();

            JOptionPane.showMessageDialog(this, "Employee details saved successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving employee details. Please try again.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeDetailsForm();
            }
        });
    }
}

// Watch Full Setup on YouTube @S2CoderZ link in the Bio.
