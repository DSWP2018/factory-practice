package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MacOSInstallerPackage;

public class MacosHome extends Installer {

    public MacosHome() {
        name = "MacOS Home";
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
