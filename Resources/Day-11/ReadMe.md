LinkedIn Post: https://www.linkedin.com/posts/srkv_docker-springboot-containers-activity-7370342573514571776-dJWa?utm_source=share&utm_medium=member_desktop&rcm=ACoAADAkuYUBj5qk2hWdfyttuAVT5KSWHnwKUqw

# K8’s Series 11: ☸️ Deployments in Kubernetes
We’ve seen Pods and ReplicaSets, but in the real world… you don’t usually create those directly.
Instead, you use a Deployment — the higher-level abstraction that manages ReplicaSets for you. 🙌

## 🔹 What is a Deployment?

Manages Pods + ReplicaSets automatically 🛠️

Provides rolling updates (zero downtime!) 🔄

Supports rollbacks in case of failure ⏪

Makes scaling super easy ⚡

### 🔹 Imperative Way (Quick Command)
```bash
# Create a deployment with 3 replicas of Nginx
kubectl create deployment nginx-deploy --image=nginx --replicas=3
```

## 🔹 Declarative Way (YAML)

Create a file deployment.yaml

```bash
apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-deploy
  labels:
    app: nginx
spec:
  replicas: 3
  selector:
    matchLabels:
      app: nginx
  template:
    metadata:
      labels:
        app: nginx
    spec:
      containers:
      - name: nginx
        image: nginx:latest
        ports:
        - containerPort: 80
```

Apply it:

```bash
kubectl apply -f deployment.yaml
```

<img width="804" height="75" alt="image" src="https://github.com/user-attachments/assets/69464800-c461-43ad-aab2-b4b018b827bc" />

🎈 To verify if the deployment is created
```bash
 kubectl get deployments
```
<img width="798" height="118" alt="image" src="https://github.com/user-attachments/assets/95a321dd-d43f-4baa-b08d-ac848263d679" />

🎈 To verify pods and replicasets
```bash
kubectl get pods
kubectl get rs
```

<img width="1128" height="299" alt="image" src="https://github.com/user-attachments/assets/890c5702-73d4-4584-9adf-dfcf1a9083c3" />

🎈 To update the image of live deployment without yaml
``` bash
  kubectl set image deployment nginx-deploy nginx=nginx:1.9.1
```
<img width="1110" height="67" alt="image" src="https://github.com/user-attachments/assets/bdbde978-31fa-490d-8852-17693bde6f2d" />

All our Nginx images are updated to 1.9.1.

🎈 To check rollout history
  ``` bash
      kubectl rollout history deploy nginx-deploy
```

<img width="919" height="172" alt="image" src="https://github.com/user-attachments/assets/4426bcbb-5269-4055-ae2d-7abcea0c10e3" />


🎈 To roll back to Previous Version
  ```bash
  kubectl rollout undo deploy nginx-deploy
```

<img width="865" height="103" alt="image" src="https://github.com/user-attachments/assets/4d37cdb7-5ede-4254-8972-6374d23ce4cd" />


--- 
✍️ Author: Vissamsetti Siva Rama Krishna



