package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LinuxHomeInstaller extends Installer{
    public LinuxHomeInstaller() {
        name = "Linux Home Installer";
        System.out.println("Home installer");
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
