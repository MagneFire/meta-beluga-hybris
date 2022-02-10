require recipes-kernel/linux/linux.inc
inherit gettext

SECTION = "kernel"
SUMMARY = "Android kernel for the Skagen Falster 2"
HOMEPAGE = "https://android.googlesource.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
COMPATIBLE_MACHINE = "beluga"

SRC_URI = " git://android.googlesource.com/kernel/msm;branch=android-msm-beluga-4.9-pie-wear-mr2;protocol=https \
    file://defconfig \
    file://img_info \
    file://0001-scripts-dtc-Remove-redundant-YYLOC-global-declaratio.patch \
    file://0001-Revert-ARM-msm-dts-add-custom-dts-path-arch-arm-boot.patch \
    file://0001-btfm_slim-Fix-compilation.patch \
    file://0001-cpuidle-Fix-compilation.patch \
    file://0001-gpu-Compilation-fix.patch \
    file://0001-vl53l0x-Fix-compilation.patch \
    file://0001-camera_v2-Fix-compilation.patch \
    file://0001-ipa_v2-Fix-compilation.patch \
    file://0001-usb-gadget-Fix-compilation.patch \
    file://0001-soc-qcom-Fix-compilation.patch \
"

SRCREV = "1842042ff3513f2cbb813b82891530d43c62df73"
LINUX_VERSION ?= "3.18"
PV = "${LINUX_VERSION}+oreo"
S = "${WORKDIR}/git"
B = "${S}"

do_install:append() {
    rm -rf ${D}/usr/src/usr/
}

BOOT_PARTITION = "/dev/mmcblk0p29"

inherit mkboot old-kernel-gcc-hdrs
