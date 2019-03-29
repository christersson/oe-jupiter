DESCRIPTION = "Development image for Solar Analytics"

# Additional packages that are useful to have for development but aren't
# necessarily desired on the production image
# NOTES:
#   * connman-tests and ofono-tests have a python dependency which inflates
#     images by many MB
FEATURE_PACKAGES_solar-dev-addons = "\
	packagegroup-solar-devextras \
"

IMAGE_FEATURES += "debug-tweaks solar-dev-addons"

require solar-image.bb
