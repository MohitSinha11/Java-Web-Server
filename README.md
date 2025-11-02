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

1. **Clone the repository:**
   ```bash
   git clone https://github.com/MohitSinha11/Java-Web-Server.git
   cd Java-Web-Server
2.	Open the project in your preferred IDE — VS Code, IntelliJ, or Eclipse.
3.	Compile all Java files:
   javac *.java
4.Run the Server and Client in separate terminals:
   java Server
  	java Client
5.	The server will start listening for client requests.
   Once the client connects, it will send a request and display the response received from the server.

   

