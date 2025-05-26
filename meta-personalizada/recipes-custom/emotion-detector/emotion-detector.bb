SUMMARY = "Detector de emociones con TensorFlow Lite"
LICENSE = "CLOSED"

SRC_URI = "file://emotion_app"

S = "${WORKDIR}"

do_install() {
    # Solo crear el directorio que realmente usas
    install -d ${D}${datadir}/emotion_detector
    
    # Copiar toda la carpeta emotion_app
    cp -r ${WORKDIR}/emotion_app/* ${D}${datadir}/emotion_detector/
    
    # Hacer ejecutable el script principal
    chmod +x ${D}${datadir}/emotion_detector/modelo_optimo.py
}

FILES:${PN} += "${datadir}/emotion_detector"
