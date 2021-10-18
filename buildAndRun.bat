@echo off
call mvn clean package
call docker build -t com.lht/WeddingAppSpringMVC .
call docker rm -f WeddingAppSpringMVC
call docker run -d -p 9080:9080 -p 9443:9443 --name WeddingAppSpringMVC com.lht/WeddingAppSpringMVC