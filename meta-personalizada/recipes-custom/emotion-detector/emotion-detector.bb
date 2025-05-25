SUMMARY = "Detector de emociones con TensorFlow Lite"
LICENSE = "CLOSED"

SRC_URI = "file://emotion_modelo.tflite \
           file://detector_csv.py"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}/emotion_detector
    install -m 0755 ${WORKDIR}/detector_csv.py ${D}${bindir}/emotion_detector
    install -m 0644 ${WORKDIR}/emotion_modelo.tflite ${D}${datadir}/emotion_detector/
}

FILES:${PN} += "${datadir}/emotion_detector"
