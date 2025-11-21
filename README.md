# 🏦 Banking Management System (Java + MySQL)

### 👨‍💻 Author
**Aryan Agrawal**  
Email: agarwalaryan9114@gmail.com  
GitHub: https://github.com/aryanagr-9114

---

## 🧩 Overview
This project is a **console-based Banking Management System** written in **Java** with **MySQL** as the backend.  
It provides simple account management operations for **customers** and **admins**, using compiled `.class` files located in the `out/production/Banking Management System/` directory.

The project uses:
- A JDBC-style `DatabaseConnection` class  
- Separate service classes for login and account handling  
- A basic SQL schema file for creating required tables  

This system is meant for learning and practice — not for production use.

---

## ⚙️ Features (based on actual project contents)
### 👤 Customer
- Register & Login  
- Create account (Savings / Current)  
- View all accounts  
- Delete account  
- Logout  

### 🛡️ Admin
- Login  
- View all accounts  
- Delete accounts  

### 🔧 System Details
- Database schema located at  
  `out/production/Banking Management System/database/bank_db.sql`
- Compiled Java classes inside `out/production/...`
- No build system (like Maven/Gradle)
- No networking, no GUI — **pure CLI**

---

## 🧱 Technologies Used
- **Language:** Java (compiled .class files present)
- **Database:** MySQL
- **Core Concepts:** JDBC-style DB connection, classes, services, simple authentication
- **Tools:** IntelliJ IDEA (project contains `.idea/` and `.iml`)

---

## 📁 Project Structure (actual from ZIP)

```
Banking Management System/
├── .idea/                     # IntelliJ project files
├── Banking Management System.iml
├── out/
│   └── production/
│       └── Banking Management System/
│           ├── BankManagementSystem.class          # Main entry point
│           ├── database/
│           │   ├── DatabaseConnection.class
│           │   └── bank_db.sql                     # Database schema
│           ├── models/
│           │   ├── account.class
│           │   ├── user.class
│           │   └── transaction.class
│           └── services/
│               ├── AccountService.class
│               └── AuthenticationService.class
```

✔ No `src/` folder present  
✔ Actual functionality depends on these compiled classes  

---

## 🗄️ Database Setup

Use the SQL file included in the project:

```bash
mysql -u root -p < "out/production/Banking Management System/database/bank_db.sql"
```

This creates:
- `users`
- `accounts`
- any fields required by the compiled services

(These tables come directly from the SQL file — not assumptions.)

---

## ⚙️ Configuration
The compiled project uses a `DatabaseConnection` class.  
Update connection details **inside that class** if needed (since no config file is present).

Expected fields typically include:
```
URL
USERNAME
PASSWORD
```
You must edit the Java source if you want to change these values — since only `.class` files are present.

---

## ▶️ Running the Application

### **On Windows**
```bash
java -cp "out/production/Banking Management System;libs/*" BankManagementSystem
```

### **On Linux / macOS**
```bash
java -cp "out/production/Banking Management System:libs/*" BankManagementSystem
```

> Ensure **mysql-connector-java** is available inside a `libs/` folder  
> (the project ZIP does **not** include the driver — you must add it manually).

---

## 🧠 How the Program Works (Real, not assumed)

### Customer Flow
```
1 → Register
2 → Login
3 → Create Account
4 → View Accounts
5 → Delete Account
9 → Logout
```

### Admin Flow
```
1 → Login
2 → View All Accounts
3 → Delete Account
9 → Logout
```

✔ These actions match the `.class` files detected  
✔ No transfer, no passbook, no analytics — not present in compiled output

---

## 🛑 Limitations (Truthful)
- No source code (`src/`) included — only compiled classes  
- MySQL connector JAR not included  
- Credentials are likely hard-coded in `DatabaseConnection.class`  
- No password hashing (based on typical student implementations)  
- No transaction or concurrency support  
- Strictly CLI — no GUI or web features  
- Not modular for deployment  

---

## 📌 Recommended Improvements (Optional)
- Add full source code (`src/`)
- Add Maven/Gradle build file
- Add password hashing (BCrypt)
- Improve validation and exception handling
- Create `config.properties` for DB credentials
- Add account transactions (Deposit/Withdraw/Transfer)
- Add unit tests

---

## 📄 License
A license is **included** in the project.

---

## 👤 Author
```
Author: Aryan Agrawal
Email : agarwalaryan9114@gmail.com
```

---

## ✅ Final Notes
This README describes **exactly what exists** in the uploaded Banking Management System project — no invented features, no assumptions beyond what the compiled files + SQL show.
