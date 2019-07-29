#!/usr/bin/env bash

#start PostgreSQL dbms
kubectl apply -f ../resources/postgres.yml
kubectl apply -f ../../../*/src/deployment/kubernetes/efood-restaurant-service.yml
kubectl apply -f ../../../*/src/deployment/kubernetes/efood-order-service.yml
kubectl apply -f ../resources/ingress.yml