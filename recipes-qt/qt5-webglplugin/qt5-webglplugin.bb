DESCRIPTION = "qt5 webgl qpa plugin"

PN = "qtwebglplugin"

PV = "5.10.1"
MAJ_VERSION = "5.10"

S = "${WORKDIR}/qtwebglplugin-everywhere-src-${PV}"

LICENSE = "GFDL-1.3 & BSD & ( GPL-3.0 & The-Qt-Company-GPL-Exception-1.0 | The-Qt-Company-Commercial ) & ( GPL-2.0+ | LGPL-3.0 | The-Qt-Company-Commercial )"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

require recipes-qt/qt5/qt5.inc

DEPENDS += "qtdeclarative qtwebsockets"

SRC_URI = "http://download.qt.io/official_releases/qt/${MAJ_VERSION}/${PV}/submodules/qtwebglplugin-everywhere-src-${PV}.tar.xz"
SRC_URI[md5sum] = "fa483d2a9bdbd77f0199437e28f1ffc1"
SRC_URI[sha256sum] = "5479208173fa954933770509a61aa6624b57b012e34362e753c695a878f5bfc1"

