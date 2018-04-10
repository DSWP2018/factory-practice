package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MProfessionalInstaller extends Installer {

    public MProfessionalInstaller() {
        name = "Professional MacOS";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
