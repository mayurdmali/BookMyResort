# **BookMyResort Application** 🏨  

## **CRUD Operations using Spring Boot & Hibernate**  

### **Overview**  
**BookMyResort** is a **Spring Boot application integrated with Hibernate** that provides a **complete CRUD (Create, Read, Update, Delete) solution** for managing resort bookings. This project follows the **"I to C" (Interface to Class) architecture**, ensuring modularity and scalability.  

### **Key Features**  
✅ **Add a Single Booking** (`addBooking`)  
✅ **Add Multiple Bookings** (`addAllBooking`)  
✅ **Retrieve All Bookings** (`getAllBooking`)  
✅ **Fetch Bookings by Room Type** (`getBookingByRoomType`)  
✅ **Update Booking Details** (`updateBooking`)  
✅ **Delete a Booking** (`deleteBooking`)  
✅ **Follows RESTful API Standards**  
✅ **Uses Hibernate ORM for Efficient Database Operations**  

### **Tech Stack**  
- **Spring Boot** (REST API Development)  
- **Hibernate** (ORM for Database Interaction)  
- **MySQL** (Database)  
- **Spring Data JPA**  
- **Postman** (API Testing)  

### **Project Structure (I to C Architecture)**  
```
📂 BookMyResort
 ┣ 📂 src/main/java/com/bookmyresort
 ┃ ┣ 📂 controller  → Handles API requests
 ┃ ┣ 📂 service  → Business logic layer
 ┃ ┣ 📂 dao  → Database access layer
 ┣ 📂 resources
 ┃ ┗ 📜 application.properties  → Database configuration
 ┣ 📜 pom.xml  → Dependencies (Spring Boot, Hibernate, MySQL)
```

### **API Endpoints**  
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/api/resort/add` | Add a new booking |
| `POST` | `/api/resort/addAll` | Add multiple bookings |
| `GET` | `/api/resort/all` | Get all bookings |
| `GET` | `/api/resort/byRoomType/{roomtype}` | Get bookings by room type |
| `PUT` | `/api/resort/update` | Update booking details |
| `DELETE` | `/api/resort/delete/{id}` | Delete a booking |

### **Setup & Installation**  
1. Clone the repository:  
   ```bash
   https://github.com/mayurdmali/BookMyResort.git
   ```
2. Configure **application.properties** for MySQL connection.  
3. Build & Run the application:  
   ```bash
   mvn spring-boot:run
   ```
4. Test APIs using **Postman**  


