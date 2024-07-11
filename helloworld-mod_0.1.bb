SUMMARY = "Recipe for  build an external helloworld Linux kernel module"
SECTION = "PETALINUX/modules"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit module

INHIBIT_PACKAGE_STRIP = "1"

SRCREV = "f84f3c3e12dfd03d2a899dbd30328611d0e4820f"
SRC_URI = "git://github.com/embedig/${BPN}.git;branch=main;protocol=https"

S = "${WORKDIR}/git"

KERNEL_MODULE_AUTOLOAD += "${MODULE_NAME}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

#RPROVIDES:${PN} += "kernel-module-${MODULE_NAME}"
