### Bitácora Líder Técnico

#### 9 de mayo

- Se hizo la documentación respectiva sobre los puntos que me correspondían sobre la propuesta de diseño. Específicamente se hizo: 

- Descripción y síntesis del problema, gestión de los requerimientos, arquitectuea del sistema propuesto, análisis de dependencias y estrategia de integración de la solución.


#### Lunes 19 de mayo 

- Se cocinó una imagen base para raspberry pi 5. 

#### Martes 20 de mayo 

- Se verificó el funcionamineto de la cámara en la raspberry pi. Se hicieron ajustes en el archivo local config para permitir la conexión ssh y el redirecionamiento por sl servidor x11. Se hizo la prueba con el video de la cámara.

#### Miércoles 21 de mayo y jueves 22 de mayo

- Se hicieron pruebas con el modelo proporcionado, sin embargo, el interprete de python que trae poky era el 3.12.9 (scarthap 5.0) y el interprete de meta tensorflow fue compilado para la versión de pyhton 3.11, por lo que no fue posible correr el modelo. 

#### Sábado 24 de mayo

- Se hizo el cambio a la versión Kirstone.
#### Domingo 25 de mayo 

- Se hizo la meta-layer personalizada.
- Se intentó mejorar el modeo, pues el entregado por la compañera solo funciona con imagenes de caras, se debe usar un modelo que detecta caras y recorte la imagen de la cara y la reescale a 48x48 para usar ahora sí, dicho modelo. 
  
