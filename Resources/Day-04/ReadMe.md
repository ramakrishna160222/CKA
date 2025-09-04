#### LinkedIn Post: https://www.linkedin.com/posts/srkv_docker-springboot-dockerhub-activity-7366812648388198402-DsIg?utm_source=share&utm_medium=member_desktop&rcm=ACoAADAkuYUBj5qk2hWdfyttuAVT5KSWHnwKUqw

Ever wondered how to put your Spring Boot app inside a Docker container? Let’s do it step by step 👨‍💻
## 🔹 Step 1: Clone the project
```bash
git clone https://lnkd.in/d5vNNPJN
cd CKA/Resources/Day-04/DockerDemoApp
```

##🔹 Step 2: Verify Dockerfile following content 👇
```bash
FROM eclipse-temurin:17-jdk
WORKDIR /app
# Copies the built jar (any name) as app.jar
COPY target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]
```

💡 Make sure you’ve built the JAR first (e.g. mvn -q -DskipTests clean package).
## 🔹 Step 3: Build the Docker image 🏗️
```bash
docker build -t dockerdemoapp:latest .
```

<img width="1178" height="204" alt="image" src="https://github.com/user-attachments/assets/7389eea7-5f98-4925-a90c-b90c1eac02bb" />


## 🔹 Step 4: Run locally 🚀
```bash
docker run -d -p 8082:8082 --name docker-demo dockerdemoapp:latest
docker ps
```
<img width="1514" height="63" alt="image" src="https://github.com/user-attachments/assets/f9ffce8a-3413-4429-b8bc-7d63869b1dd9" />

##### verify in browser:
###### http://localhost:8082/hello
## 🔹 Step 5: Push to Docker Hub 📦
Create a public repo on Docker Hub (e.g. krishna160222/dockerDemoApp), then:
```bash
docker login
docker tag dockerDemoApp:latest krishna160222/dockerDemoApp:latest
docker push krishna160222/dockerDemoApp:latest
```

## 🔹 Step 6: Pull & run on another machine ⬇️
```bash
docker pull krishna160222/dockerDemoApp:latest
docker run -d -p 8082:8082 --name docker-demo krishna160222/dockerDemoApp:latest
```
🔹 Helpful commands 🔧

 enter a container shell
```bash
docker exec -it docker-demo sh
```

view logs (live)
```bash
docker logs -f docker-demo
```

# list local images
```bash
docker images
```
✅ You’ll see dockerDemoApp:latest stored locally and running as a container.


  ---
  👨‍💻 Author: Siva Rama Krishna Vissamsetti
