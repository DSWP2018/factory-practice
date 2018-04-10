package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LinuxInstallerPackage;

public class LinuxHome extends Installer {

    public LinuxHome() {
        name = "Linux Home";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }

}
