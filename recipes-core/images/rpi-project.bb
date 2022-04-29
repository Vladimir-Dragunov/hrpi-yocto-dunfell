include recipes-core/images/core-image-base.bb

IMAGE_INSTALL_append += " \
	bash \
	nginx \
	python3-fail2ban \
	rauc \
	connman \
	connman-client \
	packagegroup-core-boot \
	python3-homeassistant \
	python3-appdaemon \
	firewalld \
"

RDEPENDS_remove += "iptables"

LICENSE = "MIT"

IMAGE_ROOTFS_EXTRA_SPACE = "102400"

DISTRO_FEATURES += "wifi"

CORE_IMAGE_EXTRA_INSTALL += " \
	neofetch \
	tmux \
	man-db \
	man-pages \
	nftables \
"
