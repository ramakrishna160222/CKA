# 🚀 Multi-Stage Docker Build with Spring Boot

This project demonstrates how to containerize a **Spring Boot application** using **Docker Multi-Stage Builds**.  
Multi-stage builds help reduce image size, improve performance, and enhance security.  

---

## 📌 Steps to Implement

### 🔹 Step 1: Clone the Project
    bash
    git clone https://github.com/ramakrishna160222/CKA.git
    cd CKA/Resources/Day-05/DockerDemoAp

🔹 Step 2: Move into Project Folder
    bash
    cd DockerDemoApp
    <img width="720" height="96" alt="image" src="https://github.com/user-attachments/assets/42d63081-607d-49b0-8664-383a68d76023" />

    
🔹 Step 3: Create a Multi-Stage Dockerfile
Create a file named Dockerfile and add the following content:

Copy code
# Stage 1: Build the app
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM gcr.io/distroless/java17-debian11
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

🔹 Step 4: Build Docker Image
bash
Copy code
docker build -t krishna160222/multistage:v1 .
🔹 Step 5: Verify Image
bash
Copy code
docker images
🔹 Step 6: Run Locally
bash
Copy code
docker run -d -p 8082:8082 krishna160222/multistage:v1
👉 Visit: http://localhost:8082/hello

🔹 Step 7: Verify Running Containers
bash
Copy code
docker ps
📦 Push to Docker Hub
🔹 Step 8: Login & Push
Create a public repo on Docker Hub → krishna160222/multistage

Push the image:

bash
Copy code
docker login
docker push krishna160222/multistage:v1
🔹 Step 9: Pull & Run on Another Machine
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
