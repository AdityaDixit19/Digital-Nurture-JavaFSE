# Exercise 6 - Configuring Beans with Annotations

## Objective

The objective of this exercise is to configure Spring Beans using **Annotations** instead of XML bean definitions. The exercise demonstrates how Spring automatically detects and manages beans using **Component Scanning** along with the `@Service` and `@Repository` annotations.

---
# Spring Dependency

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.2.8</version>
</dependency>
```

---

# Bean Configuration using Annotations

## Repository Layer

```java
@Repository
public class BookRepository {

    public void displayRepository() {
        System.out.println("Book Repository is managing library data.");
    }
}
```

---

## Service Layer

```java
@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public void displayService() {

        System.out.println("Book Service is providing library services.");

        repository.displayRepository();
    }
}
```

---

# Component Scanning

Instead of defining beans manually using XML, Spring automatically scans the package specified in `applicationContext.xml`.

```xml
<context:component-scan base-package="org.library"/>
```

This instructs Spring to search the `org.library` package and all its sub-packages for classes annotated with Spring stereotype annotations.

---

# Internal Working

```
Application Starts
        │
        ▼
Load applicationContext.xml
        │
        ▼
Component Scan Begins
        │
        ▼
@Repository Found
        │
        ▼
Create BookRepository Bean
        │
        ▼
@Service Found
        │
        ▼
Create BookService Bean
        │
        ▼
@Autowired Found
        │
        ▼
Inject BookRepository
        │
        ▼
Store Beans in IoC Container
        │
        ▼
Application Ready
```

---

# Annotation Hierarchy

```
                @Component
                     │
      ┌──────────────┼──────────────┐
      │              │              │
 @Service      @Repository     @Controller
```

All three annotations are specialized forms of `@Component`.

---

# XML Configuration vs Annotation Configuration

| XML Configuration | Annotation Configuration |
|-------------------|--------------------------|
| Bean declared in XML | Bean declared using annotations |
| More configuration | Less configuration |
| Larger XML files | Cleaner code |
| Manual bean declaration | Automatic bean discovery |
| Suitable for legacy projects | Preferred for modern Spring applications |

---

# Key Concepts Learned

- Annotation Configuration
- Component Scanning
- @Service
- @Repository
- @Autowired
- Spring IoC Container
- Automatic Bean Creation
- Automatic Dependency Injection

---

# Advantages of Annotation Configuration

- Less XML configuration
- Cleaner and more readable code
- Easier maintenance
- Faster development
- Automatic bean discovery
- Preferred in Spring Boot projects


# Best Practices

- Use `@Controller` for presentation layer classes.
- Use `@Service` for business logic.
- Use `@Repository` for data access classes.
- Use `@Component` for helper or utility classes.
- Keep component scanning limited to the required base package.
- Follow a layered architecture for better maintainability.

---

# Conclusion

In this exercise, Spring Bean configuration was implemented using annotations. Instead of manually defining beans in XML, Spring automatically discovered and managed the `BookService` and `BookRepository` classes through Component Scanning. Dependency Injection was performed using `@Autowired`, demonstrating the modern approach used in enterprise Spring and Spring Boot applications.