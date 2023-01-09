# Exercise 7

## Instructions

The main goal of this exercise is to learn about databases in Java. Before you start, make sure you only open **lesson_7 folder in VS Code**.
- To have Docker installed

### `Exercise` Install Docker

1. Follow instructions on https://www.docker.com/

2. Take screenshot of running `docker --version`

### `Exercise` Install Maven

1. Follow instruction how to install , if you install with brew on MacOS check FEP.md.

2. Run mvn --version and take a screenshot

    ```bash
    mvn --version
    ```

3. Also make sure you have the VS Code plugin `Maven for Java` installed.

### `Exercise` Plain Java Database usage

1. Setup a database server, it's recommended to use a docker image. The database we will use is MySQL, which is [here on Docker Hub](https://hub.docker.com/_/mysql). Read the instructions on there for how to define how to choose database name, username and password and for what command to run to start Docker.

2. In `src/main/java/*` folders you will find a class called `JDBCUtils.java` with the package `se.nackademin.jdbc`. You'll also find a `Main.java`.
   1. Read through the `Main.java` code and understand how the `JDBCUtils.java` is used
   2. Read through the `JDBCUtils.java`, the code contains some flaws and limitations, that we will later fix. For now its enough to understand the code.
      1. Notice the instance field `username` and `password` is it needed at all? Can you improve it somehow?
      2. The instance method `createDatabase` will create a database for you, but it will not setup any tables.
      3. The instance method `getConnection` builds a connection string, but it doesn't specify a database name in the JDBC url, read more about the format [https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html]

3. Before we can test the code we need to ensure we have a needed *dependency* to the project: a JDBC connector (driver) for MySQL. This dependency is already defined in the `pom.xml` file which describes the project using the **Maven** packaging framework.
   1. In VS Code Explorer tab, go to the bottom to find the Maven pane. Confirm that it shows a dependency called `com.mysql:mysql-connector-j:8.0.31`.
   2. Under Lifecycle, run the install command to install all dependencies.

4. Run the project (or main function in Main.java). When it works, it should output `Connected to db`. But not everything is setup correctly from start, so you will need to check JDBCUtils.java file and the MySQL Docker page to ensure that the database is correctly found and connected to.

5. You can manually create a table with mysql tooling with for example [mysql workbench](https://www.mysql.com/products/workbench/) or write code that does it with `createDatabase`. Scroll down to the header [Creating Tables with JDBC API](https://docs.oracle.com/javase/tutorial/jdbc/basics/tables.html#create)

6. Now when you know the database works and you can inspect it manually with a CLI or MySQL workbench. Add `CRUD` methods to your `JDBCUtils` you are recommended to use [prepared statements](https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html#create_ps). You decide yourself what your application and database will do.
   - Create (A method that can create a row of data `INSERT INTO`)
   - Read (A method that can read all or a single row `SELECT`)
   - Update (A method that can update a row `UPDATE`)
   - Delete (A method that can `DELETE` a row)

7. Write code in `Main` that calls your CRUD methods in `JDBCUtils`.

### `Exercise` [EXTRA] Spring boot database usage with a ORM

This is an extra exercise, it's not mandatory. Follow the guide [accessing data mysql](https://spring.io/guides/gs/accessing-data-mysql/)

1. Create a new repository where you can package up the downloaded file in the following step
2. Follow the guide from spring.io. [accessing data mysql](https://spring.io/guides/gs/accessing-data-mysql/)

    ```text
    # If you use the spring initializr at <https://start.spring.io/>
    1. Select Project `Maven project`
    2. Select Language `Java`
    3. Add `Spring Web`, `Spring Data JPA`, `MySQL Driver`
    ```

3. [optional] Hand in, give me access to your repository

## Hand in instructions

### General hand in instructions

- Create a branch with name `YOURUSERNAME_lesson_5`

Hand in your exercise in a `Pull Request` that contains screenshot[s] and file[s]. You can also use the feature `attach a file` for screenshots in your `Pull Request`

### What to hand in

Hand in files:

- Added files & modified files
- Provide a screenshot of the maven and Docker version
- Provide a screenshot of the database table
- Provide a screenshot of the java console output from a queried database row.
