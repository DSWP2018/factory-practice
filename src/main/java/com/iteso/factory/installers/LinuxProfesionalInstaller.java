package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.LinuxPackage;

public class LinuxProfesionalInstaller extends Installer {
    public LinuxProfesionalInstaller(){
        name = "LinuxStore Profesional Installer";
    }

    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
