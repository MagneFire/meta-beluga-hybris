FILESEXTRAPATHS:prepend:beluga := "${THISDIR}/sensorfw:"
SRC_URI:append:beluga = " file://sensorfwd.service"

DEPENDS:append:beluga = " libhybris "

FILESEXTRAPATHS:prepend:firefish := "${THISDIR}/sensorfw:"
SRC_URI:append:firefish = " file://sensorfwd.service"

DEPENDS:append:firefish = " libhybris "