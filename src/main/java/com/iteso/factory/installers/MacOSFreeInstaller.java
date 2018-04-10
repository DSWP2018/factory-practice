package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.MacOSPackage;

public class MacOSFreeInstaller extends Installer {
    @Override
    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }
    public MacOSFreeInstaller() {
        name ="MacOS Free Installer";
    }
    public String getName(){
        return name;
    }
}
