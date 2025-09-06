# K8’s Series 10: ☸️ ReplicaSets in Kubernetes


Pods are great… but what if your Pod crashes? Or you need multiple replicas running for scaling and reliability? 🤔

That’s where ReplicaSets come in! 💪



## 🔹 What is a ReplicaSet?

A ReplicaSet (RS) ensures a specified number of Pod replicas are running at any given time.

If a Pod dies → RS creates a new one.

If too many Pods exist → RS removes the extras.

Scaling → just change the replica count! ⚡

