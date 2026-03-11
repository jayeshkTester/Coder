package Library_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LibraryGUI extends JFrame {
    // Database connection variables
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;

    // GUI components
    private JButton addBookBtn, addMemberBtn, issueBookBtn, returnBookBtn, searchBookBtn;
    private JTextArea displayArea;

    public LibraryGUI() {
        // Frame setup
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Buttons panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 5));
        addBookBtn = new JButton("Add Book");
        addMemberBtn = new JButton("Add Member");
        issueBookBtn = new JButton("Issue Book");
        returnBookBtn = new JButton("Return Book");
        searchBookBtn = new JButton("Search Book");

        buttonPanel.add(addBookBtn);
        buttonPanel.add(addMemberBtn);
        buttonPanel.add(issueBookBtn);
        buttonPanel.add(returnBookBtn);
        buttonPanel.add(searchBookBtn);

        // Display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Event listeners
        addBookBtn.addActionListener(e -> addBook());
        addMemberBtn.addActionListener(e -> addMember());
        issueBookBtn.addActionListener(e -> issueBook());
        returnBookBtn.addActionListener(e -> returnBook());
        searchBookBtn.addActionListener(e -> searchBook());

        // Connect to database
        connectDB();
    }

    private void connectDB() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "password");
            displayArea.append("Connected to database successfully!\n");
        } catch (Exception ex) {
            displayArea.append("Database connection failed: " + ex.getMessage() + "\n");
        }
    }

    private void addBook() {
        String title = JOptionPane.showInputDialog(this, "Enter Book Title:");
        String author = JOptionPane.showInputDialog(this, "Enter Author:");
        try {
            pst = conn.prepareStatement("INSERT INTO books(title, author) VALUES(?, ?)");
            pst.setString(1, title);
            pst.setString(2, author);
            pst.executeUpdate();
            displayArea.append("Book added: " + title + " by " + author + "\n");
        } catch (Exception ex) {
            displayArea.append("Error adding book: " + ex.getMessage() + "\n");
        }
    }

    private void addMember() {
        String name = JOptionPane.showInputDialog(this, "Enter Member Name:");
        try {
            pst = conn.prepareStatement("INSERT INTO members(name) VALUES(?)");
            pst.setString(1, name);
            pst.executeUpdate();
            displayArea.append("Member added: " + name + "\n");
        } catch (Exception ex) {
            displayArea.append("Error adding member: " + ex.getMessage() + "\n");
        }
    }

    private void issueBook() {
        String bookId = JOptionPane.showInputDialog(this, "Enter Book ID:");
        String memberId = JOptionPane.showInputDialog(this, "Enter Member ID:");
        try {
            pst = conn.prepareStatement("INSERT INTO transactions(book_id, member_id, issue_date) VALUES(?, ?, NOW())");
            pst.setInt(1, Integer.parseInt(bookId));
            pst.setInt(2, Integer.parseInt(memberId));
            pst.executeUpdate();
            displayArea.append("Book issued to member ID: " + memberId + "\n");
        } catch (Exception ex) {
            displayArea.append("Error issuing book: " + ex.getMessage() + "\n");
        }
    }

    private void returnBook() {
        String transId = JOptionPane.showInputDialog(this, "Enter Transaction ID:");
        try {
            pst = conn.prepareStatement("UPDATE transactions SET return_date = NOW() WHERE id = ?");
            pst.setInt(1, Integer.parseInt(transId));
            pst.executeUpdate();
            displayArea.append("Book returned for transaction ID: " + transId + "\n");
        } catch (Exception ex) {
            displayArea.append("Error returning book: " + ex.getMessage() + "\n");
        }
    }

    private void searchBook() {
        String keyword = JOptionPane.showInputDialog(this, "Enter Book Title/Author:");
        try {
            pst = conn.prepareStatement("SELECT * FROM books WHERE title LIKE ? OR author LIKE ?");
            pst.setString(1, "%" + keyword + "%");
            pst.setString(2, "%" + keyword + "%");
            rs = pst.executeQuery();
            displayArea.append("Search results:\n");
            while (rs.next()) {
                displayArea.append("ID: " + rs.getInt("id") + ", Title: " + rs.getString("title") + ", Author: " + rs.getString("author") + "\n");
            }
        } catch (Exception ex) {
            displayArea.append("Error searching book: " + ex.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryGUI().setVisible(true));
    }
}