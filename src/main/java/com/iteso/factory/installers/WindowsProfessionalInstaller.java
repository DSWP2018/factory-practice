package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class WindowsProfessionalInstaller extends Installer {

    public WindowsProfessionalInstaller() {
        name = "Windows Professional Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
