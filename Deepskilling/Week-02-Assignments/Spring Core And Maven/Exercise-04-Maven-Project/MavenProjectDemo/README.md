# Exercise 4 - Creating and Configuring a Maven Project

## Objective

The objective of this exercise is to understand how to create and configure a Maven project, manage dependencies using `pom.xml`, and learn the Maven Build Lifecycle (`compile`, `package`, and `install`).

---

## Technologies Used

- Java 17
- Apache Maven
- Spring Framework 6
- IntelliJ IDEA Community Edition

---

## Project Structure

```
MavenProjectDemo
│
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       └── java
│
├── target
│
├── Screenshots
│
└── .gitignore
```

---

## Maven Coordinates

```xml
<groupId>org.library</groupId>
<artifactId>MavenProjectDemo</artifactId>
<version>1.0-SNAPSHOT</version>
```

### Explanation

- **groupId** → Identifies the organization or project group.
- **artifactId** → Name of the project.
- **version** → Current version of the project.

---

## pom.xml

```xml
<properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.2.8</version>
    </dependency>
</dependencies>
```

---

## Why Maven?

Maven is a Build Automation and Dependency Management tool.

It helps developers to:

- Download libraries automatically
- Manage project dependencies
- Compile source code
- Run tests
- Package applications
- Install artifacts into the local repository

---

---

## Maven Build Lifecycle

### 1. Compile

```
mvn compile
```

Compiles Java source files and generates `.class` files inside the `target/classes` directory.

---

### 2. Package

```
mvn package
```

Compiles the project, runs tests, and creates a deployable JAR file.

---

### 3. Install

```
mvn install
```

Installs the generated artifact into the local Maven repository (`.m2`) so that other Maven projects can use it.

---

## Internal Working

```
Developer
      │
      ▼
Edit pom.xml
      │
      ▼
Maven Reads Configuration
      │
      ▼
Download Dependencies
      │
      ▼
Compile Source Code
      │
      ▼
Generate .class Files
      │
      ▼
Create JAR File
      │
      ▼
Install into Local Repository (.m2)
```

---

## Maven Lifecycle Used

- validate
- compile
- package
- install

---


## Key Concepts Learned

- Build Automation
- Dependency Management
- pom.xml
- Maven Coordinates
- Maven Build Lifecycle
- Local Repository
- Project Packaging




## Conclusion

In this exercise, a Maven project was successfully created and configured. The project was compiled, packaged, and installed using the Maven Build Lifecycle. This exercise demonstrated how Maven automates project builds, manages dependencies, and creates deployable artifacts, making Java application development more efficient and maintainable.