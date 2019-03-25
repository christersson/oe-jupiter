SUMMARY = "Standard packages for Solar Analytics"
LICENSE = "MIT"

inherit packagegroup

PV = "1.0"

PROVIDES = "${PACKAGES}"
PACKAGES = "\
	packagegroup-solar \
	packagegroup-solar-devextras \
"

# Packages required by base product
RDEPENDS_packagegroup-solar = "\
	util-linux \
	connman \
	ofono \
"

# Additional packages for development purposes
RDEPENDS_packagegroup-solar-devextras = "\
	i2c-tools \
"
