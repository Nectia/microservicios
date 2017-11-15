## Compilar

./mvnw clean package

## Crear contenedor de docker

docker build . --tag=zuul-server:latest --rm=true

## Iniciar contenedor

docker run -d --name=zuul-server -p=8080:8080 zuul-server:latest

## Push aws

docker tag zuul-server:latest 755477124082.dkr.ecr.us-west-1.amazonaws.com/zuul-server:latest

docker push 755477124082.dkr.ecr.us-west-1.amazonaws.com/zuul-server:latest