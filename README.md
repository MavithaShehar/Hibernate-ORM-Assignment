
**Hibernate ORM Assignment**
This Java project shows how to manage one-to-one, one-to-many, and many-to-many relationships between 
the entities Author and Book using Hibernate ORM (Object-Relational Mapping). 
In order to save, update, remove, and exist authors and books from a MySQL database, 
the project  use maven.

**Part 1: CRUD Operations on a Single Entity (Book)**
Description In this part of the assignment, you will implement CRUD (Create, Read, Update, Delete) operations for 
the Book entity. The application allows you to create new books, retrieve books by their ID, update existing book 
attributes, and delete books from the database.

🖋 Ensure you have Java JDK 11 installed.

🖋 Clone this repository to your working directory.

🖋 Configure MySQL Database:

🖋 Make sure you have MySQL 8.0.33 installed and running.

🖋 Create a new database in your mysql useing as a "book.

🖋 and coment the delete crud operration

🖋 Make sure you have hibernate version 6.2.6 or 6.2.7 installed and Configure.

🖋 The application will perform CRUD operations on the Book entity and display the results in the console.

## **Part 2: Relationships between Entities (Book and Author)**

Description In this part of the assignment, you will work with two entities: Book and Author. 
You will implement one-to-one, one-to-many, and many-to-many relationships between these entities 
using Hibernate annotations.

🖋 Ensure you have Java JDK 11 installed.

🖋 Clone this repository to your working directory.

🖋 Configure MySQL Database:

🖋 Make sure you have MySQL 8.0.33 installed and running.

🖋 Make sure you have hibernate version 6.2.6 or 6.2.7 installed and Configure.

🖋 Create a new database for this run application as 'book'.

🖋 The application will demonstrate one-to-one, one-to-many, and many-to-many relationships between Book and Author 
    entities and display the results in the console.

maven repository

<properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>

        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.2.6.Final</version>
        </dependency>

    </dependencies>