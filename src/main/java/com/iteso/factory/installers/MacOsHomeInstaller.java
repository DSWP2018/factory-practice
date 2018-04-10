package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.MacOSInstallerPackage;

public class MacOsHomeInstaller extends Installer {
    public MacOsHomeInstaller(){
        name = "MacOS Home Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
