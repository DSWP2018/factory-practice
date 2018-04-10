package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.MacOSInstallerPackage;

public class MacOSHomeInstaller extends Installer {

    public MacOSHomeInstaller() {
        name = "MacOS Home Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
