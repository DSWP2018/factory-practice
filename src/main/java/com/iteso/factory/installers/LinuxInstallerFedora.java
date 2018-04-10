package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxInstallerFedora extends Installer {
    public LinuxInstallerFedora(){
        name = "Linux Installer Fedora";
    }

    public InstallerPackage getPackage() {
        return null;
    }
}
