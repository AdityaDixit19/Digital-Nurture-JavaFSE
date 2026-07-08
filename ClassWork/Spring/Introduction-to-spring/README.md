# 01 - Introduction to Spring Framework

## Overview

Spring Framework is an open-source Java framework that simplifies enterprise application development. It provides features such as **Inversion of Control (IoC)**, **Dependency Injection (DI)**, transaction management, and modular architecture, making applications more maintainable, scalable, and easier to test.

---


## Problems Before Spring

Traditional Java applications suffered from:

* Manual object creation using `new`
* Tight coupling between classes
* Difficult maintenance
* Poor scalability
* Hard-to-write unit tests
* Repetitive boilerplate code

---

## Why Spring Was Created

Spring was introduced to solve the limitations of traditional Java development by:

* Automating object creation
* Reducing coupling between classes
* Improving maintainability
* Simplifying testing
* Supporting enterprise-scale applications

---

## What is Spring Framework?

Spring Framework is an **open-source Java framework** that provides infrastructure for building enterprise applications. It manages objects, dependencies, and application components, allowing developers to focus on business logic instead of infrastructure code.

---

## Framework vs Library

| Framework                                  | Library                                       |
| ------------------------------------------ | --------------------------------------------- |
| Controls the application's execution flow. | Called directly by the developer when needed. |
| Calls your code.                           | You call the library code.                    |
| Example: Spring Framework                  | Example: JDBC, Jackson                        |

---

## Spring Architecture

Spring is built using a modular architecture.

```text
Spring Framework
│
├── Core Container
├── AOP
├── Data Access
├── Web
├── MVC
└── Test
```

Each module has a specific responsibility, allowing developers to include only the modules required for their application.

---

## Spring Core Modules

### Core Container

* Core
* Beans
* Context
* Spring Expression Language (SpEL)

### Other Modules

* AOP
* Data Access
* Web
* Spring MVC
* Test
* Messaging
* Instrumentation

---

## Inversion of Control (IoC)

IoC is a design principle where the responsibility of creating and managing objects is transferred from the developer to the Spring Framework.

Instead of manually creating objects, the **Spring IoC Container** manages them throughout their lifecycle.

```text
Developer
      ↓
Spring IoC Container
      ↓
Creates & Manages Objects
```

---

## Dependency Injection (DI)

Dependency Injection is the technique Spring uses to implement IoC.

Instead of creating dependencies inside a class, Spring injects them from outside.

### Types of Dependency Injection

* Constructor Injection ✅ (Recommended)
* Setter Injection
* Field Injection

---

## IoC vs DI

| Inversion of Control (IoC)                         | Dependency Injection (DI)                  |
| -------------------------------------------------- | ------------------------------------------ |
| Design principle                                   | Technique                                  |
| Transfers object creation control to the framework | Injects required dependencies into objects |
| Implemented by Spring                              | One implementation of IoC                  |

---

## Advantages of Spring

* Loose coupling
* Better maintainability
* Easier unit testing
* Modular architecture
* Reusable components
* Improved scalability
* Large ecosystem and community support

---

## Why Enterprises Use Spring

Spring is widely used because it:

* Reduces development time
* Simplifies maintenance
* Supports enterprise-scale applications
* Provides excellent testing support
* Integrates easily with databases and web technologies
* Enables clean and modular application design

---

## Architecture Diagrams

### Without Spring

```text
Developer
    ↓
Creates Objects
    ↓
Application Runs
```

### With Spring

```text
Developer
    ↓
Spring IoC Container
    ↓
Creates Beans
    ↓
Injects Dependencies
    ↓
Application Runs
```

### High-Level Spring Architecture

```text
Spring Framework
│
├── Core Container
├── AOP
├── Data Access
├── Web
├── MVC
└── Test
```

---


## Common Mistakes

* Confusing Spring Framework with Spring Boot.
* Assuming IoC and DI are the same concept.
* Using `new` inside Spring-managed classes.
* Believing Spring manages every Java object.
* Learning annotations without understanding IoC.

---

## Summary

In this module, we learned the fundamentals of Spring Framework, including why it was created, its modular architecture, the concepts of Inversion of Control and Dependency Injection, and why Spring has become the standard framework for enterprise Java development. These concepts form the foundation for understanding the Spring IoC Container, Bean Configuration, and Spring Boot in the upcoming modules.

