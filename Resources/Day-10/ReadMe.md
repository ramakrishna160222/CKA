LinkedIn Post: https://www.linkedin.com/posts/srkv_docker-springboot-containers-activity-7369960014934994944-PcRW?utm_source=share&utm_medium=member_desktop&rcm=ACoAADAkuYUBj5qk2hWdfyttuAVT5KSWHnwKUqw
# K8’s Series 10: ☸️ ReplicaSets in Kubernetes


Pods are great… but what if your Pod crashes? Or you need multiple replicas running for scaling and reliability? 🤔

That’s where ReplicaSets come in! 💪

## 🔹 What is a ReplicaSet?

A ReplicaSet (RS) ensures a specified number of Pod replicas are running at any given time.

If a Pod dies → RS creates a new one.

If too many Pods exist → RS removes the extras.

Scaling → just change the replica count! ⚡

## 🔹 Imperative Way (Quick Command)
```bash
  kubectl create rs nginx-rs \
  --image=nginx \
  --replicas=3
```
## 🔹 Declarative Way (YAML)
Create a file replicaset.yaml

```bash
apiVersion: apps/v1
kind: ReplicaSet
metadata: 
  name: nginx-rs
  labels:
    env: demo
spec:
  replicas: 3
  selector:
    matchLabels:
      env: demo
  template:
    metadata:
      labels:
        env: demo
      name: nginx
    spec:
      containers:
        - image: nginx
          name: nginx
```
### Apply it:

```bash
kubectl apply -f replicaset.yaml
```

<img width="674" height="88" alt="image" src="https://github.com/user-attachments/assets/58432c35-2e23-4d26-9ac4-38ec978b40da" />

### 🔹 Verify ReplicaSet
```bash
kubectl get rs
kubectl get pods
```

<img width="670" height="120" alt="image" src="https://github.com/user-attachments/assets/39509ad8-1ba6-4b98-acf9-7ff2e7e98e72" />

<img width="445" height="127" alt="image" src="https://github.com/user-attachments/assets/2bf1135d-49dd-4934-bf96-1892c0850849" />

---
✍️ Author: Vissamsetti Siva Rama Krishna




