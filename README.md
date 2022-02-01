![header](doc/header.png)

# Universidad Nacional de Colombia -- Ciclos de programación I - II -- 2021

En este repositorio se encontrarán los diferentes retos propuestos por la Universidad Nacional para los ciclos I - II en el marco del programa MisionTic 2022. El ciclo I estuvo enfocado en el lenguaje de programación python. Por otro lado, el ciclo II encaró el estudio del lenguaje de programación JAVA.

De los retos resueltos, se hace especial mención al reto 5 del ciclo II donde se desarrolló una aplicación de escritorio, tal y como se indica a continuación.

### Desarrollo de una aplicación tipo escritorio empleando el lenguaje de programación Java y el Modelo Vista Controlador (MVC - _Model View Controller_).

Se ejecutaron los métodos **CRUD** (del inglés **_Create, Read, Update and Delete_**) sobre la tabla **Pelicula** (tomada del reto 4) de la base de datos FantasiPlus.
Las consultas fueron ejecutadas en lenguaje SQL (del inglés **_Structured Query Language_**).

### Organización del proyecto

El proyecto se encuentra conformado por la siguiente estructura de directorios y archivos (los más relevantes a la aplicación):

```bash
tp-Java
    │
    ├── src
    │   ├── FantasiPlus                            # Directorio de la aplicación
    │       ├── src                                # Directorio que contiene la estructura del proyecto
    │           ├── Main                           # Directorio de ejecucion de la aplicacion
    │           │   └── Main.java                  # Archivo donde se ejecuta el proyecto
    │           ├── acces                          # Directorio de consultas
    │           │   └── Fdao.java		   # Archivo que las consultas en lenguaje SQL
    │           ├── controller		           # Directorio del controlador
    │           │   └── Fcontroller.java           # Archivo que contiene las funciones del controlador
    │           ├── model                          # Directorio con el modelo de la aplicación
    │           │   └── Fmodel.java		   # Archivo que contiene los getters y setters de la clase Fmodel
    │           ├── utils			   # Directorio que contiene credenciales -- Se muestra  aquí a fines educativos
    │           │   └── ConnectionDB.java          # Archivo que contiene la parametrización para la conexión a la base de datos
    │           │   └── db_credentials.json        # Archivo con las credenciales del usuario
    │           └── view			   # Directorio que contiene la vista del proyecto
    │               └── ControlPanel.form          # Archivo que muestra la interfaz del proyecto
    │               └── ControlPanel.java          # Archivo que contiene la configuración de la interfaz gráfica
    └── doc                                	   # Documentación general del proyecto.
```

## Authors

FS - Nelson Salamanca

## License

Este proyecto se encuentra publicado bajo la licencia MIT. En [este enlace](https://opensource.org/licenses/MIT) podrá encontrar más información sobre la misma.
![footer](doc/footer.png)
