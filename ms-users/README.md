## Compilar

./mvnw clean package

## Crear contenedor de docker

docker build . -t ms-users:latest -t ms-users:0.1.1 --rm=true

## Iniciar contenedor

docker run ms-users:latest


docker tag ms-users:latest 755477124082.dkr.ecr.us-west-1.amazonaws.com/ms-users:latest

docker push 755477124082.dkr.ecr.us-west-1.amazonaws.com/ms-users:latest