# AQA Test Task

This repository contains solutions for all 4 parts of the AQA test task.

## Project Structure

**docs/** - documentation files  
**duplicate-string-counter/** - Part 3 Java module  
**src/main/java/com/qa/config/** - AppConfig  
**src/main/java/com/qa/driver/** - DriverManager  
**src/main/java/com/qa/pages/** - Page Objects  
**src/main/java/com/qa/utils/** - Utilities  
**src/main/resources/** - config.properties  
**src/test/java/com/qa/tests/** - test classes  
**src/test/resources/** - testng.xml, navigation.json

## Parts

### Part 1: Test Decomposition for Elevator
Test decomposition table with functions, tasks and transactions.
See [docs/test-decomposition-for-elevator.md](docs/test-decomposition-for-elevator.md)

---

### Part 2: AQA Framework
Automation framework built with Selenide and Page Object Model.

Automates navigation to Unix page on TutorialsPoint: Home → Categories → DevOps → Unix.

**How to run:**
```bash
mvn clean test
```

**Tech stack:** Java 17, Selenide, TestNG, Maven

**Framework components:**
1. **DriverManager** — sets up and closes the browser
2. **AppConfig** — reads settings from `config.properties`
3. **HomePage** — opens homepage and clicks Categories
4. **CategoriesModal** — selects DevOps category
5. **DevOpsPage** — selects Unix tutorial
6. **UnixPage** — verifies successful navigation
7. **JsonDataReader** — loads test data from `navigation.json`

**Verifications on Unix page:**
1. URL contains `unix`
2. Page title contains `Unix`
3. Page heading is visible
4. Sidebar with lessons is present
5. Breadcrumb is visible

**Test setup** (`src/main/resources/config.properties`) :
1. `browser=chrome`
2. `headless=false`
3. `base.url=https://www.tutorialspoint.com`
4. `timeout.ms=12000`

---

### Part 3: Duplicate String Counter
Java function that finds duplicate strings in a list.
See [duplicate-string-counter/README.md](duplicate-string-counter/README.md)

**How to run:**
```bash
cd duplicate-string-counter
mvn test
```

---

### Part 4 — Linux Commands
Documentation of 15 essential Linux commands with examples and screenshots.
See [docs/linux-commands.md](docs/linux-commands.md)