# Exercise 2 - Implementing Dependency Injection using Spring XML Configuration

## Objective

The objective of this exercise is to understand how Spring performs **Dependency Injection (DI)** using **XML Configuration** and the **Spring IoC Container**. In this exercise, the `BookRepository` object is injected into the `BookService` object using **Setter Injection**.

---

## Technologies Used

- Java 17
- Spring Framework 6
- Maven
- IntelliJ IDEA Community Edition

---

## Project Structure

```
LibraryManagement-DI
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

## Dependency Injection

The `BookService` class depends on the `BookRepository` class.

Instead of creating the object manually using the `new` keyword, Spring injects the dependency through a setter method.

```java
private BookRepository bookRepository;

public void setBookRepository(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
}
```

---

## XML Configuration

```xml
<bean id="bookRepository"
      class="org.library.repository.BookRepository"/>

<bean id="bookService"
      class="org.library.service.BookService">

    <property name="bookRepository"
              ref="bookRepository"/>

</bean>
```

### Explanation

- `id` → Unique identifier of the bean.
- `class` → Fully qualified class name.
- `property` → Calls the setter method.
- `ref` → Refers to another Spring bean that will be injected.

---

## How the Application Works

1. Maven downloads Spring dependencies.
2. Spring loads `applicationContext.xml`.
3. The IoC Container creates the `BookRepository` bean.
4. The IoC Container creates the `BookService` bean.
5. Spring calls `setBookRepository()` automatically.
6. The dependency is injected.
7. `BookService` uses the injected `BookRepository` object.

---

## Internal Working

```
Application Starts
        │
        ▼
Load applicationContext.xml
        │
        ▼
Create BookRepository Bean
        │
        ▼
Create BookService Bean
        │
        ▼
Call setBookRepository()
        │
        ▼
Inject Dependency
        │
        ▼
Store Beans in IoC Container
        │
        ▼
ApplicationContext.getBean()
        │
        ▼
Execute Methods
```

---

## Console Output

```
BookService is providing library services.
BookRepository is managing book data.
```

---


## Key Concepts Learned

- Spring IoC Container
- Spring Beans
- Dependency Injection
- Setter Injection
- XML Bean Configuration
- Bean References
- ApplicationContext

---

## Advantages of Dependency Injection

- Promotes Loose Coupling
- Improves Code Reusability
- Simplifies Unit Testing
- Makes Applications Easier to Maintain
- Better Separation of Responsibilities

---

## Conclusion

In this exercise, a Spring application was configured to perform **Dependency Injection using XML configuration**. The `BookRepository` bean was injected into the `BookService` bean using **Setter Injection**, demonstrating how the Spring IoC Container manages object creation and dependencies automatically. This approach promotes loose coupling and forms the foundation of enterprise application development with Spring.