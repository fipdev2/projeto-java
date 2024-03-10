# Spring Boot API - Student Certification Grade Calculator

Welcome to the Spring Boot API repository! This project aims to calculate a grade for a student's certification based on their correct answers to a test. Additionally, it includes a validation mechanism to ensure that a student cannot have the same certification twice.
## App modeling
<img src="./WhatsApp Image 2024-02-08 at 18.34.58.jpeg">

## Requirements
- Java JDK (It could be a VSCode Extension to Run Java)
- Maven
- Docker

## Running the app
First things first, clone the repo
```
git clone https://github.com/fipdev2/projeto-java.git
```
Go to the project directory
```
cd projeto-java
```

Initialize data base container
```
docker-compose up -d
```
If you're using Windows, open your Docker Desktop before initializing the Database container

Inside src/main/java/com/rocketseat/certification_nlw/modules/seed 
You'll find yourself the CreateSeed.java, run it to seed the database creating questions and alternatives for a certain certification
![image](https://github.com/fipdev2/projeto-java/assets/112737869/25cc5c29-73b9-45b8-b635-9ed43a4e66e3)
This will run the queries located in resources/create.sql
Feel free to add more queries as you please
![image](https://github.com/fipdev2/projeto-java/assets/112737869/9c5fb0aa-6b70-4a59-9cd2-505bdf3bf42f)

And then you can finally run the application typing:
```
`mvn spring-boot:run
```
## Usage

To use the Student Certification Grade Calculator:

App has 4 main routes endpoints
- GET http://localhost:8081/questions/technology/{technologyName}
- POST http://localhost:8081/students/verifyIfHasCertification
<br>Json request body:
  ```
  {
  	"email":"Example@gmail.com",
  	"technology":"Java",
  	"questionAnswers":[
  		{	"questionID":"a4ca54d1-3491-4382-8a78-129f3170b9b6",
  			"alternativeID":"36bc63d6-95fd-49c4-92ed-dbb18df1b42a"},
  		{
  			"questionID":"29f74178-e7c5-450c-baea-a707a5d5d309",
  			"alternativeID":"0d53008a-10f6-49e5-b0a0-57eb83e6826a"
  		},
  		{
  			"questionID":"a4ca54d1-3491-4382-8a78-129f3170b9b6",
  			"alternativeID":"36bc63d6-95fd-49c4-92ed-dbb18df1b42a"
  		},
  		{
  			"questionID":"5dcaad09-b9d2-45c3-9107-84d2227d21dc",
  			"alternativeID":"0e5a7e6e-73ae-4027-b3b1-844cdb9eeec1"}
  	]
  }
  ```

- POST http://localhost:8081/students/certification/answer
<br>Json request body:
```
  {
	"email":"example@gmail.com",
	"technology":"Java"
  }
```

- GET http://localhost:8081/ranking/top10



