FILESEXTRAPATHS:prepend:beluga := "${THISDIR}/${PN}:"
COMPATIBLE_MACHINE:beluga = "beluga"

RDEPENDS:${PN}:append:beluga += "msm-fb-refresher"

FILESEXTRAPATHS:prepend:firefish := "${THISDIR}/${PN}:"
COMPATIBLE_MACHINE:firefish = "firefish"

RDEPENDS:${PN}:append:firefish += "msm-fb-refresher"
