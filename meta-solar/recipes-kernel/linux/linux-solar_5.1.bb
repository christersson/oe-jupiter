#
SECTION = "kernel"
DESCRIPTION = "Linux kernel for Solar Analytics" 
SUMMARY = "Linux kernel for Solar Analytics"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
inherit kernel
inherit kernel-fitimage

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI = "\
	git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git \
	file://defconfig \
"

LINUX_VERSION = "5.1.0"
PV = "${LINUX_VERSION}+git${SRCPV}"
SRCREV = "15ade5d2e7775667cf191cf2f94327a4889f8b9d"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(imx6ull|solarevk)"

#KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} O=${B} imx_v6_v7_defconfig"
