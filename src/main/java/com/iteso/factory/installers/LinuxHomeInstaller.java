package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.LinuxPackage;

public class LinuxHomeInstaller extends Installer{

    public LinuxHomeInstaller() {
        name ="Linux Home Installer";
    }
    public String getName(){
        return name;
    }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
