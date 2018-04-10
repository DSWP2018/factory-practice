package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.LinuxPackage;

public class LinuxProfessional extends Installer {
    public LinuxProfessional(){
        name = "LinuxProfessional";
    }
    @Override
    public InstallerPackage getPackage() {

        return new LinuxPackage();
    }
}