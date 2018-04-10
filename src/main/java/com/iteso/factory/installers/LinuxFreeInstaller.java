package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.LinuxInstallerPackage;

public class LinuxFreeInstaller extends Installer {
    public LinuxFreeInstaller(){
        name = "Linux Free Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
