package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LinuxFreeInstaller extends Installer {
    public LinuxFreeInstaller(){
        name = "Linux Installer";

        System.out.println("This is the Linux Free installer");


    }

    public InstallerPackage getPackage() {
        return null;
    }
}
