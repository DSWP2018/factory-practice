package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LinuxInstallerPackage;

public class LinuxFree extends Installer {

    public LinuxFree() {
        name = "Linux Free";
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
