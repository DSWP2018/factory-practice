package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.LinuxInstallerPackage;

public class LinuxProfessionalInstaller extends Installer {

    public LinuxProfessionalInstaller() {
        name = "Linux Professional Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
