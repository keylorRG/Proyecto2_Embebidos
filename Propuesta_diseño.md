# Propuesta diseño

### Justificación del proyecto y revisión bibliográfica

### Descripción y síntesis del problema

No se cuenta con un sistema electrónico que permita analizar el comportamiento humano de las emociones frente a las experiencias vividas dentro de una sala de cines. El análisis de emociones resulta un insumo muy valioso para tomar decisiones en las experiencias de entretenemiento, donde los usuarios cada día tinen espectativas más altas en el área del entretenimiento. 

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

Contar con una Raspberry Pi con suficiente poder computacional para realizar la inferencia dadas las imagenes o video, lo suficientemente rápido sin demasiada latencia y así poder realizar un buen análisis de los estimulos dentro del cine. 
Cámara: contar con una cámara de tamaño reducido para cumplir con el requerimiento REQ-06. Debe contar con técnología infrarroja para un ambiente de baja luz, como lo suelen ser las salas de cine. 
### Vista operacional del sistema

### Vista funcional del sistema

### Arquitectura del sistema propuesto

keylor ...

### Análisis de dependencias

keylor ...

### Estrategia de integración de la solución
keylor ...

### Planeamiento de la ejecución

### Conclusiones o aspectos a resaltar de la propuesta presentada.
