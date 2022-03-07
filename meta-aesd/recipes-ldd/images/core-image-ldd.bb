inherit core-image
IMAGE_INSTALL_append = " ldd"
inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P root root;"
