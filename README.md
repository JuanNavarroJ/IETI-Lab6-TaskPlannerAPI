# IETI-Lab6-TaskPlannerAPI

## Despliegue Backend en Azure

http://taskplanner.centralus.azurecontainer.io:8080/users

## Código de Honor

Debes seguir el Código de honor del ingeniero de sistemas para defender el estándar de integridad académica de la ECI:

- Tus respuestas a tareas, cuestionarios y exámenes deben ser tu propio trabajo (excepto para las tareas que permiten explícitamente la colaboración).

- No puedes compartir tus soluciones de tareas, cuestionarios o exámenes con otra persona a menos que el instructor lo permita explícitamente. Esto incluye cualquier cosa escrita por ti, como también cualquier solución oficial proporcionada por el docente o el monitor del curso.

- No puedes participar en otras actividades que mejorarán de manera deshonesta tus resultados o que mejorarán de manera deshonesta o dañarán los resultados de otras personas.

## Desarrollo 

### Parte 2 Container Docker y despliegue azure

Configuración del DockerFile.
![DockerFile](https://user-images.githubusercontent.com/44879884/94372012-25a19780-00c0-11eb-8131-741077dbac97.PNG)

Creación de la imagen.
![DockerBuild](https://user-images.githubusercontent.com/44879884/94372020-26d2c480-00c0-11eb-8501-90a00b61dcd9.PNG)

Verificación de la creación de la imagen.
![DockerImages](https://user-images.githubusercontent.com/44879884/94372013-25a19780-00c0-11eb-959c-027b1bc481aa.PNG)

Ejecución de la imagen creada.
![DockerRun](https://user-images.githubusercontent.com/44879884/94372015-263a2e00-00c0-11eb-8c66-b1bbf70513b3.PNG)

Verificación del container creado con la imagen.
![DockerContainer](https://user-images.githubusercontent.com/44879884/94372011-24706a80-00c0-11eb-93d3-27bba68cd13c.PNG)

Verificación del servicio corriendo localmente (Máquina virtual de Docker) utilizando el puerto 8080.
![Browser](https://user-images.githubusercontent.com/44879884/94372018-26d2c480-00c0-11eb-8afc-78bfdfe766ae.PNG)

Se sube la imagen a la cuenta propia en Docker Hub.
![DockerPush](https://user-images.githubusercontent.com/44879884/94372014-25a19780-00c0-11eb-82a7-27cd5c3b1457.PNG)

Verificación en Docker Hub de la imagen.
![createContainer1](https://user-images.githubusercontent.com/44879884/94372285-e2482880-00c1-11eb-939b-7c545c9631b7.PNG)

Creación del container en Azure.
![imageDockerHub](https://user-images.githubusercontent.com/44879884/94372016-263a2e00-00c0-11eb-89b4-b5dad187a6f4.PNG)

Verificación del servicio corriendo, usando un container de Azure.
![verificacion](https://user-images.githubusercontent.com/44879884/94372017-263a2e00-00c0-11eb-8bfa-300be161f327.PNG)



