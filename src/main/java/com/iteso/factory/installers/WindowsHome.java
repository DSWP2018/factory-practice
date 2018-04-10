package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MacOSInstallerPackage;

public class WindowsHome extends Installer {

    public WindowsHome() {
        name = "Windows Home";
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
