## Compilar

./mvnw clean package

## Crear contenedor de docker

docker build . --tag=eureka-server:latest --rm=true

## Iniciar contenedor

docker run -d --name=eureka-server -p=8761:8761 eureka-server:latest

## Push aws

docker tag config-server:latest 755477124082.dkr.ecr.us-west-1.amazonaws.com/config-server:latest

docker push 755477124082.dkr.ecr.us-west-1.amazonaws.com/eureka-server:latest

db.system.version.insert({ "_id" : "authSchema", "currentVersion" : 5 })