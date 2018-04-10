package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LinuxProfessionalInstaller extends Installer {
    public LinuxProfessionalInstaller(){
        name = "Linux Professional Installer";

        System.out.println("This is the Linux Professional installer");


    }

    public InstallerPackage getPackage() {
        return null;
    }
}