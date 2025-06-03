# Bitácora de Trabajo – Rol: Investigador

**Nombre:** Paula Inés Vargas Soto 
**Rol:** Investigador  
**Proyecto:** Proyecto 2  – Sistema embebido para el reconocimiento y clasificación de expresiones faciales  
**Equipo:** Keylor Josué Rivera Gamboa/ Paula Inés Vargas Soto
**Curso**: EL5841-Sistemas Embebidos
**Profesor** PhD Ing Johan Carvajal Godínez

---

## Actividades Realizadas

| Fecha           | Actividad                                                             | Producto generado                             | Problemas encontrados            | Solución / Referencias consultadas        |
|-----------------|-----------------------------------------------------------------------|----------------------------------------------|----------------------------------|--------------------------------------------|
| 18-abr-2025     | Búsqueda y análisis de modelos para reconocimiento facial y expresión emocional basados en Intel DL Streamer | Informe de modelos potenciales                | Selección del modelo óptimo       | Documentación Intel DL Streamer y OpenVINO |
| 19-abr-2025     | Pruebas del modelo `emotions-recognition-retail-0003` en Jupyter Notebook con DL Streamer y GStreamer | Resultados preliminares de pruebas            | Ajuste de parámetros iniciales    | Tutoriales y ejemplos de DL Streamer       |
| 19-abr-2025     | Desarrollo de versión TensorFlow Lite del modelo                      | Modelo optimizado para dispositivos embebidos | Compatibilidad con hardware       | Documentación TensorFlow Lite               |
| 19-abr a 21-abr-2025 | Pruebas de precisión (accuracy) y cálculo de porcentaje de error del modelo TFLite | Reporte de accuracy y error                    | Variabilidad en resultados        | Análisis estadístico y ajuste de hiperparámetros |
| 6-may-2025      | Investigación bibliográfica sobre Edge AI, emociones y visión por computadora | Lista de 10 referencias relevantes            | Dificultad para acceder a algunas fuentes | Se usaron bases de datos académicas como IEEE, Scopus y Google Scholar |
| 7-may-2025      | Revisión de modelos de detección de emociones compatibles con TensorFlow Lite | Selección de `emotions-recognition-retail-0003` | -                                | Documentación de OpenVINO y DL Streamer            |
| 8-may-2025      | Revisión de herramientas de visión por computadora                    | Documentación de OpenCV y TensorFlow Lite     | -                                | Sitios oficiales de OpenCV y TensorFlow               |
| 10-may-2025     | Apoyo en definición funcional del sistema y su modularización        | Esbozo funcional y listado de módulos         | Definir separación lógica entre módulos | Revisión de arquitectura de sistemas similares        |
| 11-may-2025     | Redacción de la sección de justificación y revisión bibliográfica     | Sección 1 del documento preliminar             | -                                | -                                                   |
| 01-may a 01-jun-2025 | Diseño y desarrollo de interfaz gráfica para control y visualización de resultados, integrando video y CSV de Raspberry Pi | Interfaz funcional con video y datos CSV      | Sincronización de datos y video  | Protocolos de comunicación y librerías Python GUI     |
| 01-jun-2025     | Implementación del protocolo de comunicación estable entre Raspberry Pi e interfaz | Mecanismo de sincronización y control         | Latencia y pérdida de datos       | Documentación del protocolo y pruebas iterativas       |
| 01-jun-2025     | Pruebas funcionales de integración entre video, datos CSV y controles en la interfaz | Informe de pruebas funcionales                  | Errores de sincronización         | Debugging y optimización del código                     |
| 01-jun-2025     | Documentación de procesos, pruebas y resultados para la memoria       | Documentación técnica completa                  | Revisión y consolidación          | Estándares académicos y formateo adecuado                |
| 19-abr-2025     | Auditoría de implementación y arquitectura del modelo original y versión TensorFlow Lite | Reporte de auditoría técnica                    | Identificación de inconsistencias | Revisión de código y pruebas en Jupyter                 |
| 01-may a 01-jun-2025 | Supervisión y validación de integración DL Streamer, interfaz y protocolos | Informe de supervisión y validación            | Problemas de estabilidad          | Ajustes basados en pruebas y revisiones                   |
| 01-jun-2025     | Validación de mecanismos para finalizar procesos con comandos específicos | Confirmación de funcionamiento correcto        | Manejo incorrecto de procesos     | Uso de comandos kill PID en lugar de pkill               |
| 01-jun-2025     | Revisión de documentación técnica y resultados para asegurar calidad y cumplimiento | Informe de revisión documental                  | Inconsistencias o falta de claridad | Retroalimentación para mejoras                            |
| 02-jun-2025     | Defensa del proyecto 
---

## Observaciones generales

- Se identificaron fuentes sólidas para justificar el uso de procesamiento en el borde (EdgeAI) en ambientes sensibles como salas de cine.
- Se recomendó el uso de modelos optimizados para hardware limitado, como Raspberry Pi.
- Se logró una exhaustiva revisión bibliográfica y técnica, asegurando una base sólida para el desarrollo del modelo y su integración.
- La versión TensorFlow Lite desarrollada permitió optimizar el modelo para dispositivos embebidos, facilitando su implementación en la Raspberry Pi.
- Las pruebas de accuracy y error se realizaron rigurosamente, garantizando la calidad del modelo final.
- La integración de la interfaz con video y datos CSV fue compleja, pero se implementó un protocolo robusto para asegurar la sincronización y confiabilidad.
- El manejo de datos en tiempo real y la comunicación entre dispositivos representaron un reto que se superó con ajustes en el protocolo y pruebas iterativas.
- La documentación fue completa y clara, facilitando la comprensión del proceso y resultados.
