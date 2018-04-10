package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.MacOSPackage;

public class MacOSProfessionalInstaller extends Installer {
    @Override
    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }

    public MacOSProfessionalInstaller() {
        name ="MacOS Professional Installer";
    }
    public String getName(){
        return name;
    }
}
