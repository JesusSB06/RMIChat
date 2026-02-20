# Chat RMI
## Índice
- [Descripción del Proyecto](descripción-del-proyecto)
- [Características Principales](características-principales)
- [Manual de Usuario](manual-de-usuario)
  - [Requisitos previos](requisitos-previos)
  - [Descripción del proyecto](descripción-del-proyecto)
  - [Iniciar aplicación](iniciar-aplicación)
- [Autor](autor)        
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
### Descripción del proyecto
```
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            └── com
                └── mycompany
                    └── psp
                        └── proyectud3
                            ├── ClientRunnable.java
                            ├── Server.java
                            ├── client
                            │   ├── Client.java
                            │   ├── ClientCallback.java
                            │   ├── ClientImpl.java
                            │   └── IClient.java
                            ├── controller
                            │   ├── FrontController.java
                            │   └── UserController.java
                            └── view
                                ├── MainFrame.form
                                ├── MainFrame.java
                                ├── UserDialog.form
                                └── UserDialog.java
```
### Iniciar aplicación
Para iniciar la aplicación solo se tendra que abrir en el IDE de ejecucción previamente seleccionado y haremos click derecho en el archivo ``Server.java`` y escogeremos la opción *Run file*, con esto, ya tendriamos el servidor funcionando si es que no hubo una incidencia en la ejecución.
Por otro lado, para iniciar el cliente, haremos el mismo proceso con ``ClientRunnable.java``, cabe recalcar que se puede hacer varias veces para generar distintos clientes y comprobrar el funcionamiento óptimo de la aplicación.

Por último, al surgir la interfaz nos solicitara registrarnos o iniciar sesión, en este caso esta funciones solo cumplirian su cometido siempre y cuando el servidor no se apague ya que no hay **persistencia de datos**.

## Autor
- **Jesús Santos Baquero**
