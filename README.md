Project Overview
Title: Babloom's Birthday Party Services
Description
Babloom's Birthday Party Services is a comprehensive web application designed to streamline the planning and organization of children's birthday parties. The application is built on a microservices architecture, ensuring scalability, maintainability, and ease of deployment. It features a robust backend developed in Java using Spring Boot, and a responsive frontend created with React. This project simplifies the user experience by providing a seamless interaction between various services such as user account management, product catalog browsing, and order processing.

Key Features
Backend
Microservices Architecture: Each service (User, Catalog, Orders) is independently deployable, scalable, and revolves around a specific business capability.
User Service: Manages user accounts, authentication, and ensures data security and privacy.
Catalog Service: Provides a dynamic and up-to-date list of party supplies and services available for order.
Order Service: Handles the creation, update, and tracking of customer orders.
Frontend
Interactive User Interface: Built with React, the UI offers an engaging and intuitive user experience.
Catalog Browsing: Users can view and select from a range of birthday party supplies and services.
Order Management: Users can create and manage their orders, customizing them according to their preferences.
Technology Stack
Backend: Java, Spring Boot, Spring Data JPA, Docker
Frontend: React, HTML, CSS, JavaScript
Database: MariaDB
Messaging and Events: Kafka
Service Discovery: Eureka
Security
Secure handling of user data.
Authentication and authorization to ensure that users can only access and modify their own data.
Testing
Unit tests for backend services.
Integration tests for inter-service communication.
Frontend testing with React Testing Library.
Deployment
Dockerized services for easy deployment and scaling.
Microservices can be independently scaled based on demand.