# Exercise 1 - Configuring a Basic Spring Application

## Objective

The objective of this exercise is to configure a basic Spring application using XML configuration, understand the Spring IoC Container, and learn how Spring manages objects (Beans).

---

## Technologies Used

- Java 17
- Spring Framework 6
- Maven
- IntelliJ IDEA Community Edition

---

## Project Structure

```
LibraryManagement
│
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org.library
│   │   │       ├── repository
│   │   │       │   └── BookRepository.java
│   │   │       ├── service
│   │   │       │   └── BookService.java
│   │   │       └── LibraryManagementApplication.java
│   │   │
│   │   └── resources
│   │       └── applicationContext.xml
│   │
│   └── test
│
└── Screenshots
```

---

## Spring Dependency

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.2.8</version>
</dependency>
```

---

## XML Bean Configuration

```xml
<bean id="bookRepository"
      class="org.library.repository.BookRepository"/>

<bean id="bookService"
      class="org.library.service.BookService"/>
```

---

## How the Application Works

1. Maven downloads Spring Framework dependencies.
2. Spring reads `applicationContext.xml`.
3. The IoC Container creates the configured beans.
4. `ApplicationContext` manages the beans.
5. The application retrieves the beans using `getBean()`.
6. Bean methods are executed.

---

## Internal Working

```
Application Starts
        │
        ▼
Read applicationContext.xml
        │
        ▼
Create BookRepository Bean
        │
        ▼
Create BookService Bean
        │
        ▼
Store Beans in IoC Container
        │
        ▼
ApplicationContext.getBean()
        │
        ▼
Return Managed Bean
```

---

## Output

```
BookRepository Bean Created
BookService Bean Created
BookRepository is managing book data.
BookService is providing library services.
```


## Key Concepts Learned

- Spring Framework Basics
- Maven Dependency Management
- Spring IoC Container
- Bean Configuration using XML
- ApplicationContext
- Bean Creation
- Bean Retrieval

---

## Conclusion

In this exercise, a basic Spring application was successfully configured using XML configuration. Spring created and managed the application objects through the IoC Container, demonstrating the fundamental concepts of Inversion of Control (IoC) and Bean Management.