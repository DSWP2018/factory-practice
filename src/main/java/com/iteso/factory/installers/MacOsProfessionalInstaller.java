package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.MacOSInstallerPackage;

public class MacOsProfessionalInstaller extends Installer {
    public MacOsProfessionalInstaller(){
        name = "MacOS Professional Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
