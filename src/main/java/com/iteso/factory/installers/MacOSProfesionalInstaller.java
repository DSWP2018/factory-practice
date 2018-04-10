package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.MacOSPackage;

public class MacOSProfesionalInstaller extends Installer {
    public MacOSProfesionalInstaller(){
        name = "MacOSStore Profesional Installer";
    }

    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }
}
