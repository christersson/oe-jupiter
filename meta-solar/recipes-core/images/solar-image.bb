DESCRIPTION ?= "Image for Solar Analytics device"

# Packages needed by device
FEATURE_PACKAGES_solar-apps = "\
	packagegroup-solar \
"

# IMAGE_FEATURES 
IMAGE_FEATURES += "solar-apps package-management ssh-server-openssh"

IMAGE_LINGUAS = "en-us"

LICENSE = "MIT"

IMAGE_ROOTFS_SIZE = "100000"

# core-image sets up IMAGE_INSTALL based on IMAGE_FEATURES
inherit core-image

BAD_RECOMMENDATIONS += "busybox-syslog busybox-udhcpc"
 
fakeroot do_image_extra () {
	# Set sane systemd pager (i.e. no pager!)
	install -m 755 -d ${IMAGE_ROOTFS}/etc/profile.d
	echo "export SYSTEMD_PAGER=cat" > ${IMAGE_ROOTFS}/etc/profile.d/systemd.sh
}
ROOTFS_POSTPROCESS_COMMAND += "do_image_extra; "
