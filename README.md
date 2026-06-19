# 📚 Library Management System

A desktop-based **Library Management System** developed using **Java Swing**, **JDBC**, and **MySQL**. The system simplifies library operations by automating book management, user authentication, borrowing and return approval workflows, and administrative reporting.

---

## 📖 Overview

The Library Management System is designed to improve the efficiency of library operations by replacing manual processes with a secure and automated desktop application.

The system provides separate interfaces for **Administrators** and **Users**, ensuring secure access and role-based functionality. It includes approval workflows for borrowing and returning books, inventory management, authentication, validation, and real-time statistics.

---

## 🎯 Objectives

- Automate daily library operations.
- Improve accuracy of book inventory management.
- Prevent unauthorized borrowing and returning.
- Provide secure authentication and user management.
- Reduce manual paperwork.
- Deliver a user-friendly desktop application.

---

# ✨ Features

## 👤 User Features

- User Login
- Secure Authentication
- View Available Books
- Search Books
- Request Book Issue
- Request Book Return
- Prevent Duplicate Requests
- View Personal Borrowing Activities

---

## 👨‍💼 Administrator Features

- Secure Admin Login
- Add New Books
- Update Book Information
- Delete Books
- Search Books
- Manage Users
- Approve Book Issue Requests
- Decline Book Issue Requests
- Approve Return Requests
- Decline Return Requests
- Automatic Book Quantity Management
- Dashboard Statistics
- Search Requests by User ID

---

# 🔒 Security Features

- Session-Based Authentication
- Role-Based Access Control
- Username Validation
- Password Validation
- Logged-in User Verification
- Duplicate Request Prevention
- Invalid Book Validation
- Exception Handling
- Database Integrity Checks

---

# 📊 Dashboard Statistics

The Statistics Dashboard provides administrators with real-time information including:

- Total Books
- Total Registered Users
- Issued Books
- Pending Issue Requests
- Pending Return Requests
- Overdue Books

---

# 🔄 System Workflow

### Book Issue Process

```
User Login
      │
      ▼
Search Book
      │
      ▼
Issue Request
      │
      ▼
Admin Approval
      │
      ├──────────► Decline
      │
      ▼
Book Issued
      │
Quantity Updated
```

---

### Book Return Process

```
User Sends Return Request
            │
            ▼
      Admin Reviews
      │          │
      ▼          ▼
Approve      Decline
      │
      ▼
Book Returned
      │
Quantity Restored
```

---

# 🗄 Database Design

The system uses **MySQL** as its database.

### Tables

### users

Stores:

- User ID
- Username
- Password
- Role (Admin/User)

---

### books

Stores:

- Book ID
- Title
- Author
- Category
- Quantity

---

### issue_requests

Stores pending borrowing requests before admin approval.

---

### issued_books

Stores approved borrowed books.

Includes:

- User ID
- Book ID
- Issue Date
- Borrowing Duration

---

### return_requests

Stores return requests waiting for administrator approval.

---

# 🛠 Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- XAMPP
- NetBeans IDE

---

# 📁 Project Structure

```
LibraryManagementSystem/
│
├── database/
│      DBConnection.java
│
├── model/
│      Session.java
│
├── gui/
│      LoginForm.java
│      UserDashboard.java
│      AdminDashboard.java
│      AddBook.java
│      ViewBooks.java
│      IssueBook.java
│      ReturnBook.java
│      ApprovalForm.java
│      ReturnApprovalForm.java
│      StatisticsForm.java
│
└── README.md
```

---

# 💡 Validation Implemented

✔ Empty Username Check

✔ Empty Password Check

✔ Invalid Username Detection

✔ Incorrect Password Detection

✔ Book Availability Verification

✔ Duplicate Borrow Prevention

✔ Duplicate Return Prevention

✔ Logged-in User Verification

✔ Search Validation

✔ Database Exception Handling

---

# 🚀 Future Improvements

- Fine Calculation System
- Barcode Scanner Integration
- QR Code Support
- Email Notifications
- PDF Report Export
- Excel Report Export
- Book Reservation
- Graphical Analytics Dashboard
- Multi-Admin Support
- Online Version

---

# 🌟 What Makes This System Different?

Unlike many beginner library management systems, this project includes:

- Approval-based borrowing workflow
- Approval-based return workflow
- Session management
- Role-based authentication
- Automatic inventory synchronization
- Duplicate request prevention
- Logged-in user validation
- Dashboard statistics
- Search by User ID
- Strong input validation
- Professional workflow management

---

# 🎓 Educational Value

This project demonstrates practical knowledge of:

- Object-Oriented Programming (OOP)
- Java Swing GUI Development
- JDBC Database Connectivity
- SQL Queries
- Authentication Systems
- Session Management
- CRUD Operations
- Desktop Application Development
- Exception Handling
- Software Design Principles

---

# 👨‍💻 Author

**Yeabsira Tilahun**

Third-Year Information Technology Student

Dire Dawa University

GitHub: https://github.com/yeabsira19

Email: tilahunyeabsira934@gmail.com

---

# 📄 License

This project was developed for educational purposes as part of an undergraduate Information Technology program.

