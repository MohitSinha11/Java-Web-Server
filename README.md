# 🌐 Java Web Server

This repository contains a simple yet powerful **Web Server implementation in Java**, built in **two versions** —  
**Single Threaded** and **Multi Threaded**.  
It demonstrates how concurrency improves server performance and responsiveness.

---

## 🚀 Features

### 🧩 1. Single Threaded Web Server
- Handles one client request at a time.
- Easy to understand and best for learning socket programming.
- Blocks when multiple clients connect simultaneously.

### ⚙️ 2. Multi Threaded Web Server
- Spawns a **new thread for each client connection**.
- Handles multiple clients concurrently.
- Improves performance compared to the single-threaded version.

---

## 🧠 Concepts Covered
- Java Networking (`ServerSocket`, `Socket`)
- Multithreading using the `Thread` class
- Basic HTTP request handling
- Client-server communication model

---

---

## ⚡ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/MohitSinha11/Java-Web-Server.git
2.	Open the folder in your IDE (VS Code / IntelliJ / Eclipse).
3.	Compile and run any of the main server files:
   javac <filename>.java
   java <MainClassName>
