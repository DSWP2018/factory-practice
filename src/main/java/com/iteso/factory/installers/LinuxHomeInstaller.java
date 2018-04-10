package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.LinuxInstallerPackage;

public class LinuxHomeInstaller extends Installer {
    public LinuxHomeInstaller(){
        name = "Linux Home Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
