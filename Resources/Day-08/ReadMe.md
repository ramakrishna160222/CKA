LinkedIn Post: https://www.linkedin.com/posts/srkv_docker-springboot-containers-activity-7369189847262986240-C_yn?utm_source=share&utm_medium=member_desktop&rcm=ACoAADAkuYUBj5qk2hWdfyttuAVT5KSWHnwKUqw

# K8’s Series 8: ☸️ Install Kubernetes KIND (Kubernetes IN Docker) on Local Machine 🖥️

Want to try Kubernetes locally without heavy setup?
👉 Use KIND (Kubernetes IN Docker) — it runs your cluster inside Docker containers! 🐳

## 🔹 Step 1: Prerequisites

✅ Install Docker (make sure docker ps works)
✅ Install kubectl → CLI to interact with Kubernetes
✅ Install Go (optional, only if building KIND from source)

## 🔹 Step 2: Install KIND
Mac / Linux 🐧
```bash
    curl -Lo ./kind https://kind.sigs.k8s.io/dl/latest/kind-linux-amd64
    chmod +x ./kind
    sudo mv ./kind /usr/local/bin/kind
```
Windows 🪟 (PowerShell):
```bash
    curl.exe -Lo kind.exe https://kind.sigs.k8s.io/dl/latest/kind-windows-amd64
    Move-Item kind.exe $env:USERPROFILE\bin
```
Verify:
```bash
    kind version
```

## 🔹 Step 3: Create a Cluster 🚀
```bash
    kind create cluster --name my-cluster
```

## 🔹 Step 4: Verify Cluster
  ```bash
      kubectl cluster-info
      kubectl get nodes
```
👉 You’ll see a Kubernetes cluster running inside Docker 🎉

## 🔹 Step 5: Delete Cluster (Optional)
```bash
    kind delete cluster --name my-cluster
```

  ---
  👨‍💻 Author: Siva Rama Krishna Vissamsetti






