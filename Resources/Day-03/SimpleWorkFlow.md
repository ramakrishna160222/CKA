#### LinkedIn Post: https://www.linkedin.com/posts/srkv_k8s-series-3-docker-simple-work-flow-so-activity-7366790417784147968-e13i?utm_source=share&utm_medium=member_desktop&rcm=ACoAADAkuYUBj5qk2hWdfyttuAVT5KSWHnwKUqw

# Creates a Docker image from your source code + Dockerfile.

2️⃣ Store Image Locally 📂

List images on your system:
```dockerfile
docker images
```


✅ The built image is stored in your local Docker image cache.

3️⃣ Push Image to Registry 📦

Tag your image:
```bash
docker tag myapp username/myapp:v1
```

Push it to Docker Hub (or private registry):
```bash
docker push username/myapp:v1
```


✅ Makes the image available to others or for deployment.

4️⃣ Pull Image from Registry ⬇️

On another machine/server:
```bash
docker pull username/myapp:v1
```

✅ Downloads the image from the registry.

5️⃣ Run a Container 🚀

Start a container from the pulled image:
```bash
docker run -p 8080:8080 username/myapp:v1
```

✅ Runs your application inside a container.

📌 Simple Workflow Summary

Build → Store (local) → Push → Pull → Run
