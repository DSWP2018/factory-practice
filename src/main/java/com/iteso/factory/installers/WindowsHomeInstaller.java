package com.iteso.factory.installers;


import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.WindowsInstallerPackage;

public class WindowsHomeInstaller extends Installer{
    public String name = "Windows Home Installer";

    public InstallerPackage getPackage(){
        InstallerPackage WindowsInstaller = new WindowsInstallerPackage();
        return WindowsInstaller;
    }
    public String getName(){
        return name;
    }

}
