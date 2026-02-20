# Chat RMI
## Índice

## Descripción del Proyecto
El proyecto consiste en la creación de un sistema de chat en **Java** usando las 
tecnologias **RMI**. En esta aplicación intervedran dos tipos de objetos: el servidor, el 
cual contendrá toda la lógica del programa y a tráves de **RMI**; y el segundo tipo de objeto sera el cliente, el cliente podrá acceder al chat conectandose y registrandose en el servidor a tráves de una interfaz **Swing**, se podrán conectar varios usuarios a la vez y chatear entre ellos.

## Características Principales
- **Comunicación distribuída mediante RPC**: esta tecnología nos permitira llamar desde el cliente al servidor para obtener sus métodos y configurar la interfaz del chat.
- **Módelo SVC (Servidor_Vista_Controlador)**: este módelo nos permitira separar de forma correcta las funciones de la aplicación, el servidor manejandos los datos y los callbacks a la aplicación, el controlador manejando la lógica de la aplicación y la vista mostrando la interfaz.
- **Integración gráfica**: el programa implementara una interfaz gráfica para que el cliente interactue con esta de manera mas cómoda.

## Manual de Usuario
### Requisitos previos:
- **JDK 17 o superior**
- **Java Swing**
- **IDE de ejecución del programa (Recomendación: Apache Netbeans)**

```
RMIChat
└──src/main/java/com/mycompany/psp/proyectud3
    ├──
    │
