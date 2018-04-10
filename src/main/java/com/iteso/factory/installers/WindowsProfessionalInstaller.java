package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.WindowsInstallerPackage;

public class WindowsProfessionalInstaller extends Installer {

    public WindowsProfessionalInstaller() {
        name = "Windows Professional Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
