FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "file://main.conf"

do_install_append() {
	install -m 0755 -d ${D}${sysconfdir}/connman
	install -m 0644 ${WORKDIR}/main.conf ${D}${sysconfdir}/connman
}
