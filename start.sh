#!/bin/bash

# Stop all containers
docker stop $(docker ps -aq)

# Remove all containers
docker rm $(docker ps -aq)

# Remove all images
docker rmi $(docker images -q)

# Assemble modules
for f in $(ls modules); do gradle clean -p modules/$f && gradle assemble -p modules/$f ; done

# Run microservices
docker-compose up

