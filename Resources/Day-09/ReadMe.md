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

###  ⚡Create an Nginx pod through imperative way 
```bash
# Create a Pod with nginx image
kubectl run my-pod --image=nginx --restart=Never

# Verify Pod
kubectl get pods
```
📸 Example Output:
<img width="873" height="180" alt="image" src="https://github.com/user-attachments/assets/429b9b78-7afe-4cf2-9bc1-666421a8d8a4" />

## 🔹 2. Declarative Way 📜 (Reusable & GitOps Friendly)
You define the Pod in a YAML file and apply it.

### create an nginx pod through  YAML
create a file named pod.yaml

```bash
apiVersion: v1
kind: Pod
metadata:
  name: nginx-pod-1
  labels:
    env: demo
    type: front-end
spec:
  containers:
    - name: nginx-container
      image: nginx
      ports:
        - containerPort: 80
```
Apply it:

```bash
kubectl apply -f pod.yaml
kubectl get pods
```
👉 Best for production & version control (you can store YAML in Git).

<img width="1688" height="255" alt="image" src="https://github.com/user-attachments/assets/48572aa3-89c3-410a-a291-7eed14eb320d" />

🔖 After creating a Pod, you can get deep details about it using:
``` bash
kubectl describe pod <pod-name>
```
<img width="1679" height="707" alt="image" src="https://github.com/user-attachments/assets/7ffa6f33-9e39-4777-b941-6db66629d7bb" />

🔖 To go inside the container
``` bash
kubectl exec -it <pod-name> -- sh
```
<img width="809" height="185" alt="image" src="https://github.com/user-attachments/assets/1f49a6c3-a68f-4601-b3df-11c784cdb4cd" />

🔖 You can write imperative command and then output to YAML.
``` bash 
kubectl run nginx --image=nginx --dry-run=client -o yaml > pod.yaml
 ```
🔖 To get labels of an object like pod
``` bash
 kubectl get pods nginx-pod-1 --show-labels
```
<img width="1059" height="144" alt="image" src="https://github.com/user-attachments/assets/9610951f-e242-4231-bdce-6f2a87d31557" />


---
👨‍💻 Author: Siva Rama Krishna Vissamsetti





