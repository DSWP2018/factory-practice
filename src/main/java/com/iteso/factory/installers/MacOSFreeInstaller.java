package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.MacOSInstallerPackage;

public class MacOSFreeInstaller extends Installer {

    public MacOSFreeInstaller() {
        name = "MacOS Free Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
