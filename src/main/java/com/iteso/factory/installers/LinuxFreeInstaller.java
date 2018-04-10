package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.LinuxPackage;

public class LinuxFreeInstaller extends Installer {
    public LinuxFreeInstaller(){
        name = "LinuxStore Free Installer";
    }

    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
