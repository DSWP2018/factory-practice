package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LinuxInstallerPackage;

public class LinuxProfessional extends Installer {

    public LinuxProfessional() {
        name = "Linux Professional";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }

}
