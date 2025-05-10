# Propuesta diseño

### Justificación del proyecto y revisión bibliográfica

### Descripción y síntesis del problema

No se cuenta con un sistema electrónico que permita analizar el comportamiento humano de las emociones frente a las experiencias vividas dentro de una sala de cines. El análisis de emociones resulta un insumo muy valioso para tomar decisiones en las experiencias de entretenemiento, donde los usuarios cada día tienen espectativas más altas en el área del entretenimiento. 

La empresa contratista necesita el diseño de un sistema embebido que se pueda integrar dentro de una sala de cine para evaluar las emociones de las personas ante un estímulo visual determinado in situ, y no depender de técnicas clásicas como entrevistas que tratan de evaluar lo mismo, pero que presentan una serie de problemas al no realizarse justo en el momento que suceden los estímulos visuales, auditivos o incluso, físicos: percepción alterada de lo vivido, magnificar o minimizar al ser consultados de forma oral, sesgo por la propia entrevista, etc. 


### Gestión de los requerimientos


| ID      | Tipo         | Descripción                                                                                                                        | Justificación                                                                                         | Prioridad |
|---------|--------------|------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|-----------|
| REQ-01  | Funcional    | El sistema debe detectar y clasificar emociones en tiempo real a partir de imágenes capturadas.                                   | Permite analizar la respuesta emocional inmediata ante estímulos visuales.                            | Alta      |
| REQ-02  | Funcional    | El sistema debe identificar al menos seis emociones: enojo, disgusto, miedo, felicidad, tristeza y sorpresa.                      | Son las emociones especificadas en el instructivo.                                                     | Alta      |
| REQ-03  | Funcional    | La captura de imágenes debe realizarse de forma automática, sin intervención del usuario.                                          | Garantiza que la experiencia del espectador no se vea alterada ni sesgada.                            | Alta      |
| REQ-04  | Funcional    | El procesamiento y clasificación de emociones debe realizarse localmente en los Raspberry Pi (Edge computing).                    | Reduce latencia y evita sobrecarga en redes o servidores centrales.                                   | Alta      |
| REQ-05  | Técnica      | El sistema debe integrar OpenCV y TensorFlow Lite para visión por computador y aprendizaje automático.                            | Permite una implementación eficiente en hardware limitado.                                             | Alta      |
| REQ-06  | No funcional | Los nodos deben estar camuflados en los asientos del cine y no interferir con la proyección.                                      | Asegura que el sistema no altere la naturalidad del entorno ni del comportamiento del espectador.     | Media     |
| REQ-07  | Técnica      | Se debe sintetizar una imagen de Linux personalizada con Yocto Project que incluya todas las dependencias requeridas.             | Facilita el despliegue del sistema en Raspberry Pi de forma controlada y reproducible.                | Alta      |
| REQ-08  | Técnico    | El sistema debe tener una manera de acceder a su configuración remotamente.                                                         | Permite establecer una conexión remota y transferir resultados para el posterior análisis.            | Alta      |

Requerimientos de hardware específicos: 

Unidad de procesamiento: contar con una Raspberry Pi con suficiente poder computacional para realizar la inferencia dadas las imagenes o video, lo suficientemente rápido sin demasiada latencia y así poder realizar un buen análisis de los estimulos dentro del cine. 

Cámara: contar con una cámara de tamaño reducido para cumplir con el requerimiento REQ-06. Debe contar con técnología infrarroja para un ambiente de baja luz, como lo suelen ser las salas de cine. 

Alimentación: raspberry Pi 27W USB-C Power Supply (oficial).

Disipación de calor: es necesario verificar la temperatura de sistema durante funcionamiento, en caso de requerirlo, implementar un disipador de calor. 

### Vista operacional del sistema

### Vista funcional del sistema

### Arquitectura del sistema propuesto

![image](./images/Arquitectura.jpeg)

### Análisis de dependencias

A nivel del entorno de trabajo Yocto Proyect, se tiene las siguientes dependencias: 

Meta-layers principales:

--Meta-raspberry pi: anñade los drives y dependencias necesarias para correr la imagen en dicho dispositivo.

--Meta-poky: proporcionan el sistema base de Linux, incluyen herramientas esenciales del sistema y bibliotecas base, además de que proveen el framework BitBake para la construcción de imágenes.

--Meta-tensorflow-light: paquete para usar tensor flow light. 

--Meta-openembedded ---> meta-openembedded/meta-oe, meta-openembedded/meta-python, meta-openembedded/meta-multimedia: incluye dependencias generales para multimedia e IA y ofrece bibliotecas de utilidad necesarias para procesamiento de imagen. Así coo herramientas específicas para python como open cv.

--Meta-networking: dispone de servicios de conexión.
  - Conexión ssh o envío de datos wifi.

--Meta-personalizada: aplicación específica que procesa las clasificaciones, ya sea almacenarlas localemtne o enviarlas a un sever remoto. 
  - Aplicación de uso específico (python, por ejemplo). 
  
A nivel de archivo local.config, es necesario llamar las dependencias necesarias relacionadas a python, como python3-opencv. 


### Estrategia de integración de la solución

![image](./images/Arquitectura_integracion.png)

Fase de desarrollo

1. Desarrollo de la imagen base:
   
Se  integran la lista de dependencias en el flujo de trabajo de Yocto Proyect para la construcción de la imagen a la medida para la Raspberry Pi 5, contemplando las meta-layers, modificaciones en el archivo local.conf así como las dependencias necesarias para tener los drivers para la cámara.

3. Desarrollo de la aplicación:
   
Con los resultados del modelo de clasificación, los resultados deben ser procesados y almacenados local o remotamente. Debe existir un layer personalizada para este caso.

4. Building de la imagen:
   
Se construye la imagen y se solucionan los errores de construcción.

5. Verificación del modelo y aplicación:
   
Verifcar y validar la correcta clasficación de emociones para un video de prueba cargado localemnte en la imagen. Si existen errores, regresar a punto 1 o 2. 

6. Cargado de la imagen y conexiones físicas:
   
Se carga la imagen en la rasberry Pi 5. Además se hace la conexión de la cámara y se prueba con la fuente de alimentación. 

8. Validar que la imagen se cargue correctamente sobre la Raspberry Pi 5 y detecte correctamente el periférico de la cámara.

9. Comprobar que el modelo siga clasificando correctamente, esta vez, con la fuente de video de la cámara y validar la aplicación. Si existen errores iterar a los puntos 2,3 y 5, para repetir la prueba de este punto 7. 


### Planeamiento de la ejecución

### Conclusiones o aspectos a resaltar de la propuesta presentada.
