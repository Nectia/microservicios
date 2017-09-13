## Crear contenedor de docker

docker build . --tag=config-server:latest --rm=true

## Iniciar contenedor

docker run --name=config-server -p=8888:8888 config-server:latest