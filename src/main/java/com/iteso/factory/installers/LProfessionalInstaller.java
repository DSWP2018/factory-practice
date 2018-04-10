package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LProfessionalInstaller extends Installer {

    public LProfessionalInstaller() {
        name = "Professional Linux";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
