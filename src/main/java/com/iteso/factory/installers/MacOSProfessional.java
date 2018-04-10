package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.MacOSPackage;

public class MacOSProfessional extends Installer {
    public MacOSProfessional(){
        name = "MacOSProfessional";
    }
    @Override
    public InstallerPackage getPackage() {

        return new MacOSPackage();
    }
}