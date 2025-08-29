# 🚀 Multi-Stage Docker Build with Spring Boot

This project demonstrates how to containerize a **Spring Boot application** using **Docker Multi-Stage Builds**.  
Multi-stage builds help reduce image size, improve performance, and enhance security.  

---

## 📌 Steps to Implement

### 🔹 Step 1: Clone the Project
    ```bash
    git clone https://github.com/ramakrishna160222/CKA.git
    cd CKA/Resources/Day-05/DockerDemoAp

### 🔹 Step 2: Move into Project Folder
    bash
    cd DockerDemoApp
    <img width="720" height="96" alt="image" src="https://github.com/user-attachments/assets/42d63081-607d-49b0-8664-383a68d76023" />

    
### 🔹 Step 3: Create a Multi-Stage Dockerfile
Create a file named Dockerfile and add the following content:

bash
Copy code
#### Stage 1: Build the app
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

#### Stage 2: Run the app
FROM gcr.io/distroless/java17-debian11
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

### 🔹 Step 4: Build Docker Image
bash
Copy code
docker build -t krishna160222/multistage:v1 .
<img width="1748" height="861" alt="image" src="https://github.com/user-attachments/assets/9fd6a15e-205a-4d20-b891-4586a863f295" />

### 🔹 Step 5: Verify Image
bash
Copy code
docker images
<img width="1529" height="109" alt="image" src="https://github.com/user-attachments/assets/7d5900bb-de92-44d8-b327-ce5e5318c41e" />

### 🔹 Step 6: Run Locally
bash
Copy code
docker run -d -p 8082:8082 krishna160222/multistage:v1
👉 Visit: http://localhost:8082/hello
<img width="1236" height="99" alt="image" src="https://github.com/user-attachments/assets/b3d28c42-6743-4ed4-961f-4507210d943c" />

<img width="1898" height="353" alt="image" src="https://github.com/user-attachments/assets/b466d8a3-9ad0-4542-8c34-d2b9e7962fb9" />



### 🔹 Step 7: Verify Running Containers
bash
Copy code
docker ps
<img width="1897" height="186" alt="image" src="https://github.com/user-attachments/assets/62073966-cdce-4472-9e9b-a3409f6fb115" />

### 🔹 Step 8: Login & Push
Create a public repo on Docker Hub → krishna160222/multistage
<img width="1910" height="531" alt="image" src="https://github.com/user-attachments/assets/7b36437f-4b6b-4a59-8de5-22ee6a9f8c2e" />

Push the image:

bash
Copy code
docker login
docker push krishna160222/multistage:v1
### 🔹 Step 9: Pull & Run on Another Machine
bash
Copy code
docker pull krishna160222/multistage:v1
docker run -d -p 8080:8080 krishna160222/multistage:v1
🔍 Debugging Commands
bash
Copy code
docker logs <containerId>
docker inspect <containerId>
✅ Benefits of Multi-Stage Builds
⚡ Smaller final image size

🚀 Faster to pull/run

🔒 More secure (only runtime dependencies included)

📘 Reference
👉 Detailed LinkedIn post: K8’s Series 5: Multi-Stage Docker Build
👉 GitHub Repo: CKA/Day-05/DockerDemoApp

👨‍💻 Author: Siva Rama Krishna Vissamsetti
