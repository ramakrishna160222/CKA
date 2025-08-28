LinkedIn Post:  https://www.linkedin.com/posts/srkv_k8s-series-1-docker-architecture-ever-activity-7365803635290648579-vwX3?utm_source=share&utm_medium=member_desktop&rcm=ACoAADAkuYUBj5qk2hWdfyttuAVT5KSWHnwKUqw

# 🐳 Docker Architecture

Docker follows a **client-server architecture** consisting of 3 main components:  

---

## 1️⃣ Docker Client
- The **entry point** for users.  
- You run commands like `docker build`, `docker run`, etc.  
- Client communicates with the Docker Daemon via **REST API** (over UNIX socket or TCP).  

---

## 2️⃣ Docker Daemon (dockerd)
- The **engine** of Docker, running in the background.  
- Responsibilities:  
  - Build images  
  - Run & manage containers  
  - Handle networking and storage  
- Listens to API requests from the client.  

---

## 3️⃣ Docker Objects
Docker works with the following key objects:  

- **Images** 📦  
  - Read-only templates (blueprints) for containers.  
  - Example: `openjdk:17`, `nginx`, `mysql:8`.  

- **Containers** 🚀  
  - Running instances of images.  
  - Lightweight, isolated, and portable.  
  - Commands:  
    - `docker run <image>` → Start container  
    - `docker ps` → List running containers  

- **Volumes** 💾  
  - For persistent data storage beyond container lifecycle.  

- **Networks** 🌐  
  - Enable communication between containers.  

---

## 🖼️ High-Level Flow

1. Developer executes a command from the **Client**.  
2. The **Daemon** receives and processes the request.  
3. Images are pulled from **Docker Hub / Registry**.  
4. Containers are created and run.  

---

## 📌 Summary

- **Client** → Sends commands  
- **Daemon** → Executes commands, manages containers  
- **Images & Containers** → App packaging & execution  

👉 *Docker Architecture ensures applications are lightweight, portable, and consistent across environments.*  



