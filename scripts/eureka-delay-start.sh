#!/bin/sh
while ! nc -z sw-config-server 8888 ; do
    echo "Waiting for the Config Server"
    sleep 10
done
java -jar /opt/sw-eureka.jar
