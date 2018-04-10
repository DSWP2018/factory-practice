package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MacOSInstallerPackage;

public class MacosProfessional extends Installer {

    public MacosProfessional() {
        name = "MacOS Professional";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
