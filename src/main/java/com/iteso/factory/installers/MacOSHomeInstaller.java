package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.MacOSPackage;

public class MacOSHomeInstaller extends Installer {
    public MacOSHomeInstaller(){
        name = "MacOSStore Home Installer";
    }

    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }
}
