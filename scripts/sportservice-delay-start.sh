#!/bin/sh
while ! nc -z sw-config-server 8888 ; do
    echo "Waiting for the Config Server"
    sleep 10
done
while ! nc -z sw-eureka-peer1 8761 ; do
    echo "Waiting for Eureka server..."
    sleep 10
done
while ! nc -z sw-eureka-peer2 8762 ; do
    echo "Waiting for Eureka Peer2"
    sleep 10
done
java -jar /opt/sw-sportservice.jar
