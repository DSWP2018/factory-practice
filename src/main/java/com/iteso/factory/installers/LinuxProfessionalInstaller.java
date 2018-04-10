package com.iteso.factory.installers;


import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.LinuxInstallerPackage;

public class LinuxProfessionalInstaller extends Installer{
    public String name = "Linux Professional Installer";

    public InstallerPackage getPackage(){
        InstallerPackage LinuxInstaller = new LinuxInstallerPackage();
        return LinuxInstaller;
    }
    public String getName(){
        return name;
    }

}
