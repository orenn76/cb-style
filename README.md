## CBStyle - Online Clothing Store 

#### Goal

CBStyle is an online clothing store, it includes multiple items from different categories and departments.
The store supports CRUD & search operations on the store items.

Supported categories are: Shirt, Pant, Shoe, Dress. 
* All categories have: color, size, brand
* Shirts have with buttons or non-buttons
* Pants can be skinny or wide
* Shoes can be elegant or sport
* Dress can be short or tall

## Requirements

* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html) or later
* [Maven 3.0+](http://maven.apache.org/download.cgi)

## Build with Maven

* [Welcome to Apache Maven](https://maven.apache.org/)
* [Building Java Projects with Maven](https://spring.io/guides/gs/maven/)

## Build and run tests with Maven

* cd into project-root-folder using the terminal.

* Run this maven command:
 
``` 
mvn clean test
``` 

## Run the services

* cd into project-root-folder using your terminal.

* Using Maven you can run the application using **mvn spring-boot:run**. 

```
cd cbstyle/item-service/item-service-application
mvn spring-boot:run
```

* Or you can build an executable JAR file with **mvn clean package** and run the JAR by typing:

```
  java -jar target/cbstyle-1.0.0.jar
```

## Test the services

* Run item-service, and visit the following urls using Postman or other API client:

Add Item:
```
POST localhost:8080/cb-style/item/
request body: 
{       
    "category":"Shirt",
    "color": "white",
    "size": 7,
    "brand": "x",
    "style":"buttons"      
}
```

Get Item:
```
GET localhost:8080/cb-style/item/1
```

Update Item:
```
PUT localhost:8080/cb-style/item/1
request body: 
{       
    "category":"Shirt",
    "color": "white",
    "size": 7,
    "brand": "y",
    "style":"buttons"      
}
```

Get All Items:
```
GET localhost:8080/cb-style/item/
```

Get All Items By Category:
```
GET localhost:8080/cb-style/item/?category=Shirt
```

## H2 Console

http://localhost:8080/cb-style/h2-console
```
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:PATH_TO_PROJECT\data\h2db
User Name: sa
Password:
```