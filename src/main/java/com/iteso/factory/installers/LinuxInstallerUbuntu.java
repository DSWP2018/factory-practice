package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackages.LinuxInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxInstallerUbuntu extends Installer {
    public LinuxInstallerUbuntu(){
        name = "Linux Installer Ubuntu";
    }

    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
