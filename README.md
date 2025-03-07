# Task Tracker & Bank Management System - Backend

---

## Task Tracker System

## 📌 Project Overview

The Task Tracker System helps users manage their tasks easily. Users can add, update, delete, and search for tasks. It keeps tasks organized and easy to track.

## 🚀 Features
<p>-✅<b> Manage Tasks:</b> Add, update, delete, and Display all tasks ..</p>
<p>-✅<b> Track Task Status:</b> Change tasks as done or not done.</p>
<p>-✅<b> Search for Tasks:</b> Find tasks using their title.</p>

## 🔧 Technologies Used
<b>-Java</b>: Core programming language for backend development.

<b>-Spring Boot:</b>Framework for building Java-based applications.

<b>-ArrayList:</b> Stores data in memory instead of using a database.

<b>-Spring Web:</b>Helps create RESTful web applications using controllers.

<b>-Lombok:</b> Saves time by automatically creating getters, setters, and constructors.


<b>-RESTful API:</b> API  for managing tasks.

<b>-Postman: </b>Used for testing API requests.

## Key Annotations Used :

- `@RestController`  → Marks a class as a REST API controller, allowing it to handle HTTP requests.

- `@RequestMapping`  → Sets the base URL for API endpoints in the controller.

- `@Data`  (Lombok) → Automatically creates  methods.

- `@AllArgsConstructor`  (Lombok) → Creates a constructor that includes all fields in the class.

## API  `/api/v1/task` 

|         | Endpoint                  | Description              |
|---------|---------------------------|--------------------------|
| GET     | `/get`                   | Display all tasks      |
| POST    | `/add`                   | Create a new task       |
| PUT     | `/update/{index}`               | Update a task          |
| DELETE  | `/delete/{index}`               | Delete a task          |
| GET     | `/change-task/{index}`   | Search for a task by title |

-----
## Bank Management System

## 📌 Project Overview
The Bank Management System helps users manage customers and handle banking transactions like depositing and withdrawing money safely.

## 🚀 Features
<p>-✅<b>Customer Management:</b>  Add, update, delete, and Display all the customers .</p>
<p>-✅<b>Account Transactions:</b> Deposit and withdraw money.

## 🔧 Technologies Used

<b>-Java</b>: Core programming language for backend development.

<b>-Spring Boot:</b>Framework for building Java-based applications.

<b>-ArrayList:</b> Stores data in memory instead of using a database.

<b>-Spring Web:</b>Helps create RESTful web applications using controllers.

<b>-Lombok:</b> Saves time by automatically creating getters, setters, and constructors.

<b>-RESTful API:</b> API  for managing tasks.

<b>-Postman: </b>Used for testing API requests.


## Key Annotations Used :

- `@RestController`  → Marks a class as a REST API controller, allowing it to handle HTTP requests.

- `@RequestMapping`  → Sets the base URL for API endpoints in the controller.

- `@Data`  (Lombok) → Automatically creates  methods.

- `@AllArgsConstructor`  (Lombok) → Creates a constructor that includes all fields in the class.

## API  - `/api/v1/bank` 

|       | Endpoint                     | Description                          |
|---------|------------------------------|--------------------------------------|
| GET     | `/get`                  | Get all customers                   |
| POST    | `/add`                  | Add a new customer                   |
| PUT     | `/delete/{id}"`              | Update customer details              |
| DELETE  | `/customers/{id}`              | Delete a customer                    |
| Patch    | `/deposit/{id}/{amount}}`      | Deposit money to a customer account  |
| Patch    | `/withdraw/{id}/{amount}`     | Withdraw money from a customer account |


