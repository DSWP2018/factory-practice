package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.MacOSPackage;

public class MacOSFreeInstaller extends Installer {
    public MacOSFreeInstaller(){
        name = "MacOSStore Free Installer";
    }

    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }
}
