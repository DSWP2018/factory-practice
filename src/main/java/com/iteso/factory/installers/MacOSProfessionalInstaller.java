package com.iteso.factory.installers;


import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.MacOSInstallerPackage;

public class MacOSProfessionalInstaller extends Installer{
    public String name = "MacOS Professional Installer";

    public InstallerPackage getPackage(){
        InstallerPackage MacOSInstaller = new MacOSInstallerPackage();
        return MacOSInstaller;
    }
    public String getName(){
        return name;
    }

}
