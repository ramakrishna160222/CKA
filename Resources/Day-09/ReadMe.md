LinkedIn Post: https://www.linkedin.com/posts/srkv_docker-springboot-containers-activity-7369536170772328448-Ijkb?utm_source=share&utm_medium=member_desktop&rcm=ACoAADAkuYUBj5qk2hWdfyttuAVT5KSWHnwKUqw

# K8’s Series 9: ☸️ POD in Kubernetes 🚀

Pods are the smallest deployable unit 📦.
 They can host one or more containers, sharing the same:
 🔹 Network (IP, Port)
 🔹 Storage Volumes
 🔹 Lifecycle
👉 Think of a Pod as a wrapper around containers, making them easier to manage in a K8s cluster.

In Kubernetes, Pods can be created in two ways:
## 🔹 1. Imperative Way ⚡ (Quick & Direct)
You tell Kubernetes exactly what to do with a kubectl command.
```bash
# Create a Pod with nginx image
kubectl run my-pod --image=nginx --restart=Never

# Verify Pod
kubectl get pods
```
👉 Best for quick testing but not reusable.

### Create an Nginx pod through imperative way 
```bash
# Create a Pod with nginx image
kubectl run my-pod --image=nginx --restart=Never

# Verify Pod
kubectl get pods
```





