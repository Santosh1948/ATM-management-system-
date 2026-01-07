# 🏧 ATM Management System  
> A Java & MySQL based desktop application that simulates real-world ATM operations 💳

An **interactive ATM Management System** built using **Java (Swing & AWT)** and **MySQL**.  
This project provides a real ATM-like experience where users can securely log in and perform common banking transactions through an intuitive graphical interface.

---

## 🌟 Why this Project?
- Beginner-friendly Java project
- Real-world banking use case
- Strong practice of **JDBC + GUI + Database**
- Perfect for **college submission & GitHub portfolio**

---

## 🚀 Key Features

✨ Secure login using Card Number & PIN  
💸 Fast Cash withdrawal options  
💰 Deposit money into account  
📊 Balance enquiry in real time  
📄 Mini statement for transactions  
🔁 PIN change functionality  
🖥️ Clean and interactive ATM-style UI  
🚪 Safe logout option  

---

## 🛠 Tech Stack

| Technology | Description |
|----------|-------------|
| Java | Core Java, Swing, AWT |
| MySQL | Database management |
| JDBC | Database connectivity |
| IntelliJ IDEA | Development IDE |
| JCalendar | Date handling |

---

## 📂 Project Structure

ATM-Management-System/
│
├── src/
│ └── bank/management/system/
│ ├── Login.java
│ ├── SignupOne.java
│ ├── SignupTwo.java
│ ├── SignupThree.java
│ ├── Transactions.java
│ ├── Deposit.java
│ ├── FastCash.java
│ ├── Withdrawl.java
│ ├── MiniStatement.java
│ ├── BalanceEnquiry.java
│ ├── PinChange.java
│ └── Conn.java
│
├── icons/
│ └── ATM images and icons
│
├── README.md
└── database.sql



---

## 🗄 Database Design
```sql

CREATE DATABASE atm_management_system;
USE atm_management_system;

-- -------------------------------
-- Login Table
-- -------------------------------
CREATE TABLE login (
    cardnumber VARCHAR(20) PRIMARY KEY,
    pin VARCHAR(10) NOT NULL
);

-- -------------------------------
-- Account Table (Optional but Good Practice)
-- -------------------------------
CREATE TABLE account (
    cardnumber VARCHAR(20),
    pin VARCHAR(10),
    name VARCHAR(50),
    balance INT DEFAULT 0
);

-- -------------------------------
-- Transaction Table (IMPORTANT)
-- -------------------------------
CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pin VARCHAR(10),
    transaction_date VARCHAR(50),
    transaction_type VARCHAR(20),
    amount INT
);

▶️ How to Run

1️⃣ Clone the repository

git clone https://github.com/Santosh1948/ATM-Management-System.git

2️⃣ Open the project in IntelliJ IDEA

3️⃣ Add required libraries

MySQL Connector (mysql-connector-j)

JCalendar

4️⃣ Configure database credentials in Conn.java

5️⃣ Run Login.java and enjoy the ATM experience 🏧

📚 What I Learned

✔ Java Swing GUI development
✔ Event handling in Java
✔ JDBC & MySQL integration
✔ Exception handling
✔ Object-oriented programming

🔮 Future Scope

PIN encryption for better security

Admin dashboard

Improved UI/UX design

Transaction filtering & search

Multi-user account support

👨‍💻 Author

Santosh
Engineering Student 👨‍🎓
🔗 GitHub: https://github.com/Santosh1948
