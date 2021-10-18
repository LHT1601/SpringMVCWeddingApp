#!/bin/sh
mvn clean package && docker build -t com.lht/WeddingAppSpringMVC .
docker rm -f WeddingAppSpringMVC || true && docker run -d -p 9080:9080 -p 9443:9443 --name WeddingAppSpringMVC com.lht/WeddingAppSpringMVC