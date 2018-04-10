package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.MacOSInstallerPackage;

public class MacOSProfessionalInstaller extends Installer {

    public MacOSProfessionalInstaller() {
        name = "MacOS Professional Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
