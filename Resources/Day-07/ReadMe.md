# K8’s Series 7: ☸️ Kubernetes Architecture Explained
Let’s break down Kubernetes in simple terms 👨‍💻

<img width="1593" height="614" alt="image" src="https://github.com/user-attachments/assets/76e35429-46fe-446d-90f3-908d3f9f1dac" />

## 🔹 Control Plane, Master Node & Worker Nodes  
- **Control Plane (Master Node 🧠)** → The brain of the cluster, responsible for managing the overall state.  
- **Worker Nodes (💪)** → The servers/VMs where actual applications (Pods) run.  
- Master Node makes decisions, Worker Nodes execute them.  

![Control Plane vs Worker Nodes](https://kubernetes.io/images/docs/components-of-kubernetes.png)

---

## 🔹 Pods & Containers  
- **Container 🐳** → A lightweight, runnable unit of software (your app + dependencies).  
- **Pod 📦** → The smallest deployable unit in Kubernetes.  
   - A Pod can have one or multiple containers.  
   - Containers inside a Pod share network & storage.  

![Pods vs Containers](https://d33wubrfki0l68.cloudfront.net/2f7cb9ff9f84d9e5fbbd81e57c8b0d834f8f20d0/2b3f8/docs/concepts/workloads/pods/pod-overview.svg)

---

## 🔹 Control Plane Components  
- **API Server 📩** → Entry point of the cluster.  
- **ETCD 🗂️** → Key-value store for cluster state.  
- **Scheduler 📌** → Assigns Pods to worker nodes.  
- **Controller Manager 👀** → Ensures actual state = desired state.  
- **Kubelet 🤝** → Agent on worker node to run Pods.  
- **Kube-Proxy 🌐** → Handles networking & load balancing.  

![Control Plane Components](https://d33wubrfki0l68.cloudfront.net/42efef044ab84b28e8e40e5551db4bc0dfbda8ee/8e2c0/docs/tutorials/kubernetes-basics/public/images/module_04_cluster.svg)

---

## 🔹 What happens when a user sends a request via `kubectl`?  
1. User runs `kubectl apply` → Request goes to **API Server 📩**.  
2. **API Server** updates the desired state in **ETCD 🗂️**.  
3. **Scheduler 📌** assigns the Pod to a worker node.  
4. **Kubelet 🤝** runs the Pod on the node.  
5. **Kube-Proxy 🌐** sets up networking.  
✅ The app is running 🚀  

![Kubectl Workflow](https://miro.medium.com/v2/resize:fit:1400/format:webp/1*mM-9E5nlXsgZb8ah43mRrQ.png)

---

## 🔹 How Control Plane Components Interact  
- **API Server** = communication hub.  
- **ETCD** = source of truth.  
- **Scheduler** & **Controller Manager** = manage workloads.  
- **Kubelet** = executes Pods.  
- **Kube-Proxy** = networking.  
Together → Kubernetes provides scalability, self-healing & automation ⚡  

![Kubernetes Interaction](https://phoenixnap.com/kb/wp-content/uploads/2021/04/kubernetes-cluster-architecture.png)

---

