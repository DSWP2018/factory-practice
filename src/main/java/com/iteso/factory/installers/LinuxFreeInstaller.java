package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LinuxFreeInstaller extends Installer{
    public LinuxFreeInstaller() {
        name = "Linux Free Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
