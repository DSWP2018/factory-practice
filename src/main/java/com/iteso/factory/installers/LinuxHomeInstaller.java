package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.LinuxPackage;

public class LinuxHomeInstaller extends Installer {
    public LinuxHomeInstaller(){
        name = "LinuxStore Home Installer";
    }

    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
